package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ReplyExceptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Compare;
import tasks.CreateNew;
import tasks.LoginIn;
import tasks.New;
import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddCategoryStepDefinitions {


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Open chrome browser$")
    public void openChromeBrowser(List<Map<String,String>> user) {
        OnStage.theActorCalled("Camilo").attemptsTo(LoginIn.Page(user));
    }

    @When("^a new category is added to the blog$")
    public void aNewCategoryIsAddedToTheBlog(List<Map<String,String>> categories) {
        OnStage.theActorInTheSpotlight().attemptsTo(New.Category(categories));
    }

    @Then("^a post is created and it is validated that it is created correctly$")
    public void aPostIsCreatedAndItIsValidatedThatItIsCreatedCorrectly(List<Map<String,String>> post) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNew.Post(post));
        OnStage.theActorInTheSpotlight().should(seeThat(Compare.String(post.get(0).get("name"))));
    }
}
