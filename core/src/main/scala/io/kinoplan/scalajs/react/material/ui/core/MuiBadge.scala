package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiBadge extends ReactBridgeComponent with MuiBadgeExtensions with JsWriterImplicits {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Badge")
  @js.native
  object RawComponent extends js.Function

  def apply(
    badgeContent: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[Map[ClassKey.Value, String]] =js.undefined,
    color: js.UndefOr[Color.Value] = js.undefined,
    component: OptComponentPropType = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Int] = js.undefined,
    showZero: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant.Value] = js.undefined
  ): WithProps = auto
}

trait MuiBadgeExtensions {
  object Color extends Enumeration {
    type Value = String

    val default = "default"
    val primary = "primary"
    val secondary = "secondary"
    val error = "error"
  }

  object Variant extends Enumeration {
    type Value = String

    val standard = "standard"
    val dot = "dot"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val badge = "badge"
    val colorPrimary = "colorPrimary"
    val colorSecondary = "colorSecondary"
    val colorError = "colorError"
    val invisible = "invisible"
    val dot = "dot"
  }
}
