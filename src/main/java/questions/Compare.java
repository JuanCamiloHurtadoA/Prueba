package questions;

import userinterfaces.Posts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Compare implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Posts.VALIDATE).viewedBy(actor).asString();
    }
    public static Compare String(String name) {
        return new Compare();
    }
}
