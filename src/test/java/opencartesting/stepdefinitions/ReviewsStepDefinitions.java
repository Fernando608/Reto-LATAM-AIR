package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.ReviewData;
import opencartesting.questions.ResultsReviews;
import opencartesting.tasks.LongIn;
import opencartesting.tasks.Reviews;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReviewsStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @When("^filter reviews by product$")
    public void filterReviewsByProduct(List<ReviewData>reviewData) {
        theActorInTheSpotlight().attemptsTo(Reviews.RV(reviewData));
    }

    @Then("^the (.*) product reviews are displayed$")
    public void theImacProductReviewsAreDisplayed(String result_Product) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultsReviews.RRV(result_Product)));
    }


}
