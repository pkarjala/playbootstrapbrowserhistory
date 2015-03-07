package test;

import org.junit.Test;
import play.twirl.api.Content;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest {

  /**
   * Tests that 1+1 equals 2.
   */
  @Test
  public void simpleCheck() {
    int a = 1 + 1;
    assertThat(a).isEqualTo(2);
  }

  /**
   * Tests that all templates render correctly.
   */
  @Test
  public void renderTemplate() {
    Content html = views.html.Index.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("history");
    html = views.html.InternetExplorer.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Mosaic");
    html = views.html.Firefox.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Mozilla");
    html = views.html.Chrome.render("Welcome to the home page.");
    assertThat(contentType(html)).isEqualTo("text/html");
    assertThat(contentAsString(html)).contains("Eric Schmidt");
  }


}
