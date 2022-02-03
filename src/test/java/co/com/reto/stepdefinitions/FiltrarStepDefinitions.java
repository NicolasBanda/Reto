package co.com.reto.stepdefinitions;

import co.com.reto.questions.Filtrarquestions;
import co.com.reto.task.Filtrartask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class FiltrarStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("nicolas");
    }

    @When("^select the filter option$")
    public void selectTheFilterOption() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Filtrartask.informacion());

    }

    @Then("^we select largest to smallest$")
    public void weSelectLargestToSmallest() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Filtrarquestions.compararfiltro(),
                Matchers.is(Matchers.equalTo("$49.99"))

        ));


    }

}
