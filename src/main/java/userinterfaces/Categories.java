package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Categories {

    public static final Target ADD = Target.the("button to add categories")
            .locatedBy("//button/i[@class='glyphicon glyphicon-plus-sign']");
    public static final Target CATEGORY_NAME = Target.the("field for the name of the category according to your country")
            .locatedBy("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[1]/div/input");
    public static final Target NAME_VIETNAMESE = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[vi][name]']");
    public static final Target NAME_RUSSIAN = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[ru][name]']");
    public static final Target NAME_ARABIC = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[ar][name]']");
    public static final Target NAME_FARSI = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[fa][name]']");
    public static final Target NAME_TURKIS = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[tr][name]']");
    public static final Target NAME_FRENCH = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[fr][name]']");
    public static final Target NAME_SPANISH = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[es][name]']");
    public static final Target NAME_GERMAN = Target.the("field for the name of the category according to your country")
            .locatedBy("//div/input[@name='translated[de][name]']");
    public static final Target ADD_CATEGORIES = Target.the("button to add categories")
            .locatedBy("//button[@type='submit']");
}