package co.com.reto.stepdefinitions;

import co.com.reto.questions.Carritoquestion;
import co.com.reto.questions.Filtrarquestions;
import co.com.reto.task.Carritotask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class CarritoStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("nicolas");

    }

    @When("^we select the products$")
    public void weSelectTheProducts() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Carritotask.informacion());
    }

    @Then("^We enter the shopping cart to see the products$")
    public void weEnterTheShoppingCartToSeeTheProducts() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Carritoquestion.descripcioncarrito(),
                Matchers.is(Matchers.equalTo("DESCRIPTION"))


        ));



    }

}
