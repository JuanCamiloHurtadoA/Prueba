package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Categories;
import userinterfaces.HomePage;
import userinterfaces.Posts;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class New implements Task {

    private List<Map<String, String>> categories;

    public New(List<Map<String, String>> categories) {
        this.categories = categories;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BLOG),
                Click.on(HomePage.BLOG_CATEGORIES),
                Click.on(Categories.ADD),
                Enter.theValue(categories.get(0).get("name")).into(Categories.CATEGORY_NAME),
                Enter.theValue(categories.get(0).get("vietnamese")).into(Categories.NAME_VIETNAMESE),
                Enter.theValue(categories.get(0).get("russian")).into(Categories.NAME_RUSSIAN),
                Enter.theValue(categories.get(0).get("arabic")).into(Categories.NAME_ARABIC),
                Enter.theValue(categories.get(0).get("farsi")).into(Categories.NAME_FARSI),
                Enter.theValue(categories.get(0).get("turkish")).into(Categories.NAME_TURKIS),
                Enter.theValue(categories.get(0).get("french")).into(Categories.NAME_FRENCH),
                Enter.theValue(categories.get(0).get("spanish")).into(Categories.NAME_SPANISH),
                Enter.theValue(categories.get(0).get("german")).into(Categories.NAME_GERMAN),
                Click.on(Categories.ADD_CATEGORIES));
    }

    public static New Category(List<Map<String, String>> categories) {
        return instrumented(New.class, categories);
    }
}
