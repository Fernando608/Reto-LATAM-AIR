package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.*;
import opencartesting.questions.ElementSalesClic;
import opencartesting.tasks.LongIn;
import opencartesting.tasks.OpenUp;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenCartStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Exception {

        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @And("^I submit username and password$")
    public void iSubmitUsernameAndPassword(List<LoginData>loginData )  {
        theActorInTheSpotlight().attemptsTo(LongIn.LGD(loginData));
    }


    @Then("^this element Sales is clikeable$")
    public void thisElementSalesIsClikeable() {
        theActorInTheSpotlight().should(seeThat(ElementSalesClic.isClickeable()));
    }
}
