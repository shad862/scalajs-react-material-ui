package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiCollapse extends ReactBridgeComponent with MuiCollapseExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "Collapse")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: js.UndefOr[Map[ClassKey.Value, String]] =js.undefined,
    collapsedHeight: js.UndefOr[String] = js.undefined,
    component: OptComponentPropType = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Int | Timeout.Value] = js.undefined,
    onEnter: Handler1[html.Element] = js.undefined,
    onEntering: Handler1[html.Element] = js.undefined,
    onEntered: Handler1[html.Element] = js.undefined,
    onExit: Handler1[html.Element] = js.undefined,
    onExiting: Handler1[html.Element] = js.undefined,
    onExited: Handler1[html.Element] = js.undefined
  ): WithProps = auto
}

trait MuiCollapseExtensions {
  object Timeout extends Enumeration {
    type Value = String

    val auto = "auto"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val container = "container"
    val entered = "entered"
    val wrapper = "wrapper"
    val wrapperInner = "wrapperInner"
  }
}
