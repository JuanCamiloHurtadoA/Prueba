package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToIframe implements Interaction {
    private String[] xpaths;
    public SwitchToIframe(String[] xpaths) {
        this.xpaths = xpaths;
    }

    public SwitchToIframe() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (xpaths == null) {
            BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
        } else {
            for (String string : xpaths) {
                WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                actor.attemptsTo(
                        Switch.toFrame((WebElement) driver.findElement(By.xpath(string))));
            }
        }
    }

    public static SwitchToIframe withXpaths(String... xpaths) {
        return new SwitchToIframe(xpaths);
    }
}