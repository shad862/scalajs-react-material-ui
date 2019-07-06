package io.kinoplan.demo.components.demos.SelectionControls

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.SelectionControls.{DefaultCustomControlStyle, CustomControlStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.MuiRadio
import io.kinoplan.scalajs.react.material.ui.icons.{MuiRadioButtonCheckedIcon, MuiRadioButtonUncheckedIcon}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ReactEventFromInput, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object RadioButtons extends ScalaCssReactImplicits {
  case class Props(style: CustomControlStyle)

  case class State(selectedValue: String = "a") {
    val isA = selectedValue == "a"
    val isB = selectedValue == "b"
    val isC = selectedValue == "c"
    val isD = selectedValue == "d"
    val isE = selectedValue == "e"

    def handleChange(value: String) = copy(selectedValue = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange(e: ReactEventFromInput) = {
      val value = e.target.value

      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val controlClasses = Map(
        MuiRadio.ClassKey.root -> styleAToClassName(css.root),
        MuiRadio.ClassKey.checked -> styleAToClassName(css.checked)
      )

      div(
        ComponentContainer("Standalone Radio Buttons")(
          div(
            MuiRadio(checked = Some(state.isA))(
              onChange ==> handleChange,
              value := "a",
              name := "radio-button-demo",
              aria.label := "A"
            ),
            MuiRadio(checked = Some(state.isB))(
              onChange ==> handleChange,
              value := "b",
              name := "radio-button-demo",
              aria.label := "B"
            ),
            MuiRadio(checked = Some(state.isC), classes = controlClasses)(
              onChange ==> handleChange,
              value := "c",
              name := "radio-button-demo",
              aria.label := "C",
            ),
            MuiRadio(checked = Some(state.isD), color = MuiRadio.Color.default)(
              onChange ==> handleChange,
              value := "d",
              name := "radio-button-demo",
              aria.label := "D",
            ),
            MuiRadio(
              checked = Some(state.isE),
              color = MuiRadio.Color.default,
              icon = Some(MuiRadioButtonUncheckedIcon(fontSize = MuiRadioButtonUncheckedIcon.FontSize.small).rawNode),
              checkedIcon = Some(MuiRadioButtonCheckedIcon(fontSize = MuiRadioButtonCheckedIcon.FontSize.small).rawNode)
            )(
              onChange ==> handleChange,
              value := "e",
              name := "radio-button-demo",
              aria.label := "E",
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("RadioButtons")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: CustomControlStyle = DefaultCustomControlStyle) = component(Props(style))
}