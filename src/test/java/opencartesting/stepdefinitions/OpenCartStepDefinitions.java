package opencartesting.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenCartStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }


    @Given("^I want to search for orders by customer$")
    public void iWantToSearchForOrdersByCustomer() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I filter by customer name$")
    public void iFilterByCustomerName() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^displays the orders in your name$")
    public void displaysTheOrdersInYourName() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I want to search for orders by date added$")
    public void iWantToSearchForOrdersByDateAdded() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^filtering by date added$")
    public void filteringByDateAdded() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^displays the orders by the date added$")
    public void displaysTheOrdersByTheDateAdded() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I want to search for orders by Id$")
    public void iWantToSearchForOrdersById() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^filtering by order Id$")
    public void filteringByOrderId() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^displays the orders by order Id$")
    public void displaysTheOrdersByOrderId() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
