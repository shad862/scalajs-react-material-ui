package io.kinoplan.scalajs.react.material.ui.core.styles

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSImport}
import scala.scalajs.js.|

object MuiThemeProvider extends ReactBridgeComponent {
  override protected lazy val componentValue: js.Object = RawComponent

  @JSImport("@material-ui/core/styles/MuiThemeProvider", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  def apply(
    disableStylesGeneration: Option[Boolean] = None,
    sheetsManager: Option[JSMap[StylesCreator, JSMap[Theme, SheetManagerTheme]]] = None,
    theme: js.Object | js.Function
  ): WithProps = auto
}


@js.native
@JSGlobal("Map")
class JSMap[K, V] extends js.Object {
  def size: Int = js.native

  def clear(): Unit = js.native

  def has(key: K): Boolean = js.native

  def get(key: K): js.UndefOr[V] = js.native

  def set(key: K, value: V): this.type = js.native

  def delete(key: K): Boolean = js.native
}