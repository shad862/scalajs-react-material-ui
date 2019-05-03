package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object IconButton extends ReactBridgeComponent with IconButtonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "IconButton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    color: Color.Value = Color.default,
    disabled: Boolean = false,
    disableRipple: Option[Boolean] = None
  ): WithProps = auto
}

trait IconButtonExtensions {
  object Color extends Enumeration {
    val default = Value("default")
    val inherit = Value("inherit")
    val primary = Value("primary")
    val secondary = Value("secondary")
  }
}
