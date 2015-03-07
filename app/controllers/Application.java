package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Chrome;
import views.html.Firefox;
import views.html.Index;
import views.html.InternetExplorer;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {

    return ok(Index.render());
  }

  /**
   * Returns the Internet Explorer page.
   *
   * @return The resulting Internet Explorer page.
   */
  public static Result internetExplorer() {

    return ok(InternetExplorer.render());
  }

  /**
   * Returns the Firefox page.
   *
   * @return The resulting Firefox page.
   */
  public static Result firefox() {

    return ok(Firefox.render());
  }

  /**
   * Returns the Chrome page.
   *
   * @return The resulting Chrome page.
   */
  public static Result chrome() {

    return ok(Chrome.render());
  }

}
