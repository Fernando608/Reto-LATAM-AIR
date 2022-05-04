package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.LoginData;
import opencartesting.tasks.LongIn;
import opencartesting.tasks.OpenUp;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenCartStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^I want to log in to the opencart site$")
    public void iWantToLogInToTheOpencartSite()   {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @Then("^I enter my credentials$")
    public void iEnterMyCredentials(List<LoginData> loginData)  {
        theActorInTheSpotlight().attemptsTo(LongIn.LGD(loginData));
    }


    @Given("^I want to search for orders by customer$")
    public void iWantToSearchForOrdersByCustomer()   {

    }

    @When("^I filter by customer name$")
    public void iFilterByCustomerName() {

    }

    @Then("^displays the orders in your name$")
    public void displaysTheOrdersInYourName()   {

    }

    @Given("^I want to search for orders by date added$")
    public void iWantToSearchForOrdersByDateAdded()   {

    }

    @When("^filtering by date added$")
    public void filteringByDateAdded()   {

    }

    @Then("^displays the orders by the date added$")
    public void displaysTheOrdersByTheDateAdded()   {

    }

    @Given("^I want to search for orders by Id$")
    public void iWantToSearchForOrdersById()  {

    }

    @When("^filtering by order Id$")
    public void filteringByOrderId()  {

    }

    @Then("^displays the orders by order Id$")
    public void displaysTheOrdersByOrderId() {

    }
}
