package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class Switch implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String ventana : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(ventana);
        }
    }
    public static Switch timeSheetWindow() {
        return new Switch();
    }
}