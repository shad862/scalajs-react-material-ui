package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiFilledInput extends ReactBridgeComponent with MuiFilledInputExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "FilledInput")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    disableUnderline: js.UndefOr[Boolean] = js.undefined,
    endAdornment: js.UndefOr[VdomNode] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    inputComponent: OptComponentPropType = js.undefined,
    inputProps: js.UndefOr[js.Object] = js.undefined,
    inputRef: OptComponentRefType = js.undefined,
    margin: js.UndefOr[Margin.Value] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[String | Int] = js.undefined,
    rowsMax: js.UndefOr[String | Int] = js.undefined,
    startAdornment: js.UndefOr[VdomNode] = js.undefined,
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiFilledInputExtensions {
  object Margin extends Enumeration {
    type Value = String

    val dense = "dense"
    val none = "none"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val underline = "underline"
    val focused = "focused"
    val disabled = "disabled"
    val adornedStart = "adornedStart"
    val adornedEnd = "adornedEnd"
    val error = "error"
    val multiline = "multiline"
    val input = "input"
    val inputMarginDense = "inputMarginDense"
    val inputMultiline = "inputMultiline"
    val inputAdornedStart = "inputAdornedStart"
    val inputAdornedEnd = "inputAdornedEnd"
    val formControl = "formControl"
    val marginDense = "marginDense"
    val fullWidth = "fullWidth"
    val inputType = "inputType"
    val inputTypeSearch = "inputTypeSearch"
  }
}
