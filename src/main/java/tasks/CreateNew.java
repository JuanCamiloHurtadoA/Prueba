package tasks;

import interactions.SwitchToIframe;
import javafx.geometry.Pos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterfaces.HomePage;
import userinterfaces.Posts;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CreateNew implements Task {

    private List<Map<String, String>> post;

    public CreateNew(List<Map<String, String>> post) {
        this.post = post;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePage.BLOG),
                Click.on(HomePage.BLOG_POSTS),
                Click.on(Posts.ADD),
                Enter.theValue(post.get(0).get("name")).into(Posts.POST_TITLE),
                Enter.theValue(post.get(0).get("name")).into(Posts.PERMALINK),
                Click.on(Posts.CATEGORY),
                Click.on(Posts.RELATED_POST));
                WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                driver.switchTo().frame(0);
                driver.findElement(By.xpath(Posts.TEXT_ARGUMENTS.getCssOrXPathSelector())).sendKeys("Colores");
                driver.switchTo().defaultContent();
                actor.attemptsTo(Enter.theValue(post.get(0).get("keywords")).into(Posts.KEYWORDS),
                Enter.theValue(post.get(0).get("description")).into(Posts.DESCRIPTION),
                Click.on(Posts.SUBMIT));
    }

    public static CreateNew Post(List<Map<String, String>> post) {
        return instrumented(CreateNew.class, post);
    }
}
