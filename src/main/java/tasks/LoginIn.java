package tasks;

import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginIn implements Task {

    private Login url;
    private List<Map<String, String>> user;

    public LoginIn(List<Map<String, String>> user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(url));
        actor.attemptsTo(Enter.theValue(user.get(0).get("email")).into(Login.USER),
                Enter.theValue(user.get(0).get("password")).into(Login.PASS),
                Click.on(Login.BUTTON_LOGIN));
    }

    public static LoginIn Page(List<Map<String, String>> user) {
        return instrumented(LoginIn.class, user);
    }
}