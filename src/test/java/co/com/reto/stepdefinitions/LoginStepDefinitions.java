package co.com.reto.stepdefinitions;

import co.com.reto.models.Loginmodels;
import co.com.reto.task.Logintask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("nicolas");
    }

    @Given("^I as a user need to enter the page$")
    public void iAsAUserNeedToEnterThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^I enter the data$")
    public void iEnterTheData( List<Loginmodels> loginmodelsList) {
        Loginmodels loginmodels;
        loginmodels = loginmodelsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Logintask.Informacion(loginmodels));

    }

    @Then("^successful entry$")
    public void successfulEntry() {

    }

}
