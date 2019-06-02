package io.kinoplan.scalajs.react.material.ui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait TypeActionPartial extends js.Object {
  def active: js.UndefOr[String] = js.native
  def hover: js.UndefOr[String] = js.native
  def hoverOpacity: js.UndefOr[Double] = js.native
  def selected: js.UndefOr[String] = js.native
  def disabled: js.UndefOr[String] = js.native
  def disabledBackground: js.UndefOr[String] = js.native
}

object TypeActionPartial {
  def apply(
    active: Option[String] = None,
    hover: Option[String] = None,
    hoverOpacity: Option[Double] = None,
    selected: Option[String] = None,
    disabled: Option[String] = None,
    disabledBackground: Option[String] = None
  ) = {
    val o: Map[String, Any] = Seq(
      active.map("active" -> _),
      hover.map("hover" -> _),
      hoverOpacity.map("hoverOpacity" -> _),
      selected.map("selected" -> _),
      disabled.map("disabled" -> _),
      disabledBackground.map("disabledBackground" -> _)
    ).flatten.toMap
    o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[TypeActionPartial]
  }
}
