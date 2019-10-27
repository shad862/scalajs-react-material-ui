package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEventFromInput
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.vdom.html_<^.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiSelect extends ReactBridgeComponent with MuiSelectExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Select")
  @js.native
  object RawComponent extends js.Function

  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    displayEmpty: js.UndefOr[Boolean] = js.undefined,
    IconComponent: OptComponentPropType = js.undefined,
    input: js.UndefOr[React.Element] = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    MenuProps: js.UndefOr[js.Object] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClose: ReactHandler1[ReactEventFromInput] = js.undefined,
    onOpen: ReactHandler1[ReactEventFromInput] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    renderValue: OptRenderValueType = js.undefined,
    SelectDisplayProps: js.UndefOr[js.Object] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined,
    disableUnderline: js.UndefOr[Boolean] = js.undefined,
    endAdornment: js.UndefOr[VdomNode] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    inputComponent: OptComponentPropType = js.undefined,
    inputRef: OptComponentRefType = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    rowsMax: js.UndefOr[String | Int] = js.undefined,
    startAdornment: js.UndefOr[VdomNode] = js.undefined
  ): WithProps = auto
}

trait MuiSelectExtensions {
  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val outlined = "outlined"
    val filled = "filled"
  }

  object Margin extends Enumeration {
    type Value = String

    val dense = "dense"
    val none = "none"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val select = "select"
    val filled = "filled"
    val outlined = "outlined"
    val selectMenu = "selectMenu"
    val disabled = "disabled"
    val icon = "icon"
    val formControl = "formControl"
    val focused = "focused"
    val underline = "underline"
    val error = "error"
    val multiline = "multiline"
    val fullWidth = "fullWidth"
    val input = "input"
    val inputMarginDense = "inputMarginDense"
    val inputMultiline = "inputMultiline"
    val inputType = "inputType"
    val inputTypeSearch = "inputTypeSearch"
    val adornedStart = "adornedStart"
    val adornedEnd = "adornedEnd"
    val marginDense = "marginDense"
    val inputAdornedStart = "inputAdornedStart"
    val inputAdornedEnd = "inputAdornedEnd"
  }
}
