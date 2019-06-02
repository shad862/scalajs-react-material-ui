package io.kinoplan.demo.components.demos.AppBar

import io.kinoplan.demo.styles.{CommonStyle, DefaultCommonStyle}
import io.kinoplan.scalajs.react.material.ui.core.{MuiAppBar, MuiToolbar, MuiTypography}
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReact._

object SimpleAppBar {
  case class Props(style: CommonStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        div(css.componentTitleFont, css.componentTitlePadding,
          MuiTypography(variant = MuiTypography.Variant.h4, gutterBottom = true, component = Some("h2"))(
            "Simple App Bar"
          )
        ),
        div(css.componentContainer,
          div(css.flexGrowOne,
            MuiAppBar(position = MuiAppBar.Position.static, color = MuiAppBar.Color.default)(
              MuiToolbar()(
                MuiTypography(variant = MuiTypography.Variant.h6, color = MuiTypography.Color.inherit)(
                  "Photos"
                )
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleAppBar")
    .renderBackend[Backend]
    .build

  def apply(style: CommonStyle = DefaultCommonStyle) = component(Props(style))
}
