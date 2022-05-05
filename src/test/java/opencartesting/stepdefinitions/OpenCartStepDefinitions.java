package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.*;
import opencartesting.questions.resultsShow;
import opencartesting.tasks.LongIn;
import opencartesting.tasks.OpenUp;
import opencartesting.tasks.Sales;
import opencartesting.tasks.SalesDate;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenCartStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^I want to log in to the opencart site$")
    public void i_want_to_log_in_to_the_opencart_site() throws Exception {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @When("^I enter my credentials$")
    public void i_enter_my_credentials(List<LoginData>loginData )  {
        theActorInTheSpotlight().attemptsTo(LongIn.LGD(loginData));
    }

    @And("^filter orders by customer$")
    public void filter_orders_by_customer(List<FiltersData>filtersData) {
        theActorInTheSpotlight().attemptsTo(Sales.SPP(filtersData));
    }

    @And("^filtering by date added$")
    public void filtering_by_date_added(List<FiltersData>filtersData) {
        theActorInTheSpotlight().attemptsTo(SalesDate.SDP(filtersData));
    }

    @Then("^filtered sales orders are displayed$")
    public void filtered_sales_orders_are_displayed() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(resultsShow.info()));
    }
}
