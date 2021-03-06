package io.kinoplan.scalajs.react.material.ui.lab

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent
import japgolly.scalajs.react.raw.React

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiSlider extends ReactBridgeComponent with MuiSliderExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "Slider")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    component: OptComponentPropType = js.undefined,
    max: js.UndefOr[Int] = js.undefined,
    min: js.UndefOr[Int] = js.undefined,
    step: js.UndefOr[Int] = js.undefined,
    thumb: js.UndefOr[React.Element] = js.undefined,
    vertical: js.UndefOr[Boolean] = false,
    onChange: ReactHandler2[ReactEvent, Double] = js.undefined
  ): WithProps = auto
}

trait MuiSliderExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val container = "container"
    val track = "track"
    val trackBefore = "trackBefore"
    val trackAfter	= "trackAfter"
    val thumbWrapper = "thumbWrapper"
    val thumb = "thumb"
    val thumbIconWrapper = "thumbIconWrapper"
    val thumbIcon = "thumbIcon"
    val disabled = "disabled"
    val jumped = "jumped"
    val focused = "focused"
    val activated = "activated"
    val vertical = "vertical"
  }
}
