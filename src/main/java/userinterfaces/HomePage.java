package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BLOG = Target.the("blog field")
            .locatedBy("//a[@href='#Blog']");
    public static final Target BLOG_CATEGORIES = Target.the("categories field")
            .locatedBy("//a[@href='https://www.phptravels.net/admin/blog/category']");
    public static final Target BLOG_POSTS = Target.the("categories field")
            .locatedBy("//a[@href='https://www.phptravels.net/admin/blog']");

}