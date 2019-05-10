package io.kinoplan.demo.router

import io.kinoplan.demo.components.Layout
import io.kinoplan.demo.pages.SimpleTablePage
import japgolly.scalajs.react.extra.router._

object AppRouter {
  sealed trait Page
  case object TypographyRoute extends Page

  val routerConfig = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._

    (
      staticRoute("/", TypographyRoute) ~> renderR(SimpleTablePage(_))
    ).notFound(redirectToPage(TypographyRoute)(Redirect.Replace))
  }.renderWith(layout)


  def layout(c: RouterCtl[Page], r: Resolution[Page]) = Layout(c, r)

  val baseUrl = BaseUrl.fromWindowOrigin

  val router = Router(baseUrl, routerConfig)
}
