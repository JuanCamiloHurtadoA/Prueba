package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Posts {

    public static final Target ADD = Target.the("button to add posts")
            .locatedBy("//button/i[@class='glyphicon glyphicon-plus-sign']");
    public static final Target POST_TITLE = Target.the("field for the post title")
            .locatedBy("//input[@name='title']");
    public static final Target PERMALINK = Target.the("permanent link for the category")
            .locatedBy("//input[@name='slug']");
    public static final Target CATEGORY = Target.the(" choose previously created category")
            .locatedBy("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select/option[6]");
    public static final Target KEYWORDS = Target.the("post keyword")
            .locatedBy("//input[@name='keywords']");
    public static final Target DESCRIPTION = Target.the("field for the description of the post")
            .locatedBy("//input[@name='metadesc']");
    public static final Target RELATED_POST = Target.the("permanent link for the category")
            .locatedBy("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[3]/div/select/option[10]");
    public static final Target SUBMIT = Target.the("button to submit posts")
            .locatedBy("//*[@id=\"content\"]/form/div[1]/div/div[2]/button");
    public static final Target VALIDATE = Target.the("the created field is validated")
            .locatedBy("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]/a");
    public static final Target TEXT_ARGUMENTS = Target.the("the created field is validated")
     .locatedBy("/html/body/p");
}