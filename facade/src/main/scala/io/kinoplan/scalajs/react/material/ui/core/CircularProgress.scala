package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object CircularProgress extends ReactBridgeComponent with CircularProgressExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "CircularProgress")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.Object = js.Object(),
    color: Color.Value = Color.primary,
    disableShrink: Boolean = false,
    size: Option[Int | String] = Some(40),
    thickness: Double = 3.6,
    value: Int = 0,
    variant: Variant.Value = Variant.indeterminate
  ): WithProps = auto
}

trait CircularProgressExtensions {
  object Color extends Enumeration {
    val primary = Value("primary")
    val secondary = Value("secondary")
    val inherit = Value("inherit")
  }

  object Variant extends Enumeration {
    val determinate = Value("determinate")
    val indeterminate = Value("indeterminate")
    val static = Value("static")
  }
}
