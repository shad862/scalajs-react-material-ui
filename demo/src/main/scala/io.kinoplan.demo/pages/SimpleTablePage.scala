package io.kinoplan.demo.pages

import io.kinoplan.demo.CssSettings._
import io.kinoplan.demo.models.TableItem
import io.kinoplan.demo.router.AppRouter.Page
import io.kinoplan.scalajs.react.material.ui.core._
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.Attr
import japgolly.scalajs.react.vdom.all._
import scalacss.ScalaCssReact._

object SimpleTablePage {
  class SimpleTableStyle extends StyleSheet.Inline {
    import dsl._

    val tableContainer = style(
      height(320.px)
    )

    val root = style(
      width(100.%%),
      overflowX.auto
    )

    val table = style(
      minWidth(700.px)
    )
  }

  object DefaultSimpleTableStyle extends SimpleTableStyle

  case class Props(router: RouterCtl[Page], style: SimpleTableStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style
      val tableItems = TableItem.default

      div(
        Typography(variant = Typography.Variant.h4, gutterBottom = true, component = Some("h2"))(
          "Products"
        ),
        div(css.tableContainer,
          Paper()(css.root,
            Table()(css.table,
              TableHead()(
                TableRow()(
                  TableCell()("Dessert (100g serving)"),
                  TableCell(align = TableCell.Alignment.right)("Calories"),
                  TableCell(align = TableCell.Alignment.right)("Fat (g)"),
                  TableCell(align = TableCell.Alignment.right)("Carbs (g)"),
                  TableCell(align = TableCell.Alignment.right)("Protein (g)")
                )
              ),
              TableBody()(
                tableItems.toVdomArray(tableItem => {
                  TableRow()(Attr("key") := tableItem.idx.toString,
                    TableCell(component = Some("th"), scope = Some("row"))(tableItem.name),
                    TableCell(align = TableCell.Alignment.right)(tableItem.calories),
                    TableCell(align = TableCell.Alignment.right)(tableItem.fat),
                    TableCell(align = TableCell.Alignment.right)(tableItem.carbs),
                    TableCell(align = TableCell.Alignment.right)(tableItem.protein)
                  )
                })
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleTablePage")
    .renderBackend[Backend]
    .build

  def apply(
    router: RouterCtl[Page],
    style: SimpleTableStyle = DefaultSimpleTableStyle
  ) = component(Props(router, style))
}