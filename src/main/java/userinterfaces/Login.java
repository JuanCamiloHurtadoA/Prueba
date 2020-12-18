package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/admin")
public class Login extends PageObject {

    public static final Target USER = Target.the("field for already registered user")
            .locatedBy("//input[@type='text']");
    public static final Target PASS = Target.the("field for password")
            .locatedBy("//input[@type='password']");
    public static final Target BUTTON_LOGIN = Target.the("button to access the page as a user")
            .locatedBy("//button[@data-wow-delay]");

}