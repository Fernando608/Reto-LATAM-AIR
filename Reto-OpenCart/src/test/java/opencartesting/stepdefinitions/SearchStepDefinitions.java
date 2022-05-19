package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.FiltersData;
import opencartesting.questions.ResultsShow;
import opencartesting.tasks.Sales;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @When("^filter orders by customer and date added$")
    public void filterOrdersByCustomerAndDateAdded(List<FiltersData> filtersData) {
        theActorInTheSpotlight().attemptsTo(Sales.SPP(filtersData));
    }

    @Then("^filtered sales orders are displayed (.*)$")
    public void filteredSalesOrdersAreDisplayed(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultsShow.RS(question)));
    }
}
