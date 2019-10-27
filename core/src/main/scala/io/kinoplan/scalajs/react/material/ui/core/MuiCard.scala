package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithPropsNoChildren}
import io.kinoplan.scalajs.react.material.ui.core.internal.PaperClassKey

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiCard extends ReactBridgeComponent with MuiCardExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Card")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    component: OptComponentPropType = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): WithPropsNoChildren = autoNoChildren
}

trait MuiCardExtensions {
  object ClassKey extends Enumeration with PaperClassKey {
    type Value = String
  }
}
