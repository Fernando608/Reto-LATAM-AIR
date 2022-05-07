package opencartesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import opencartesting.model.GiftData;
import opencartesting.questions.ResultsMessageGift;
import opencartesting.tasks.SalesGift;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddGiftStepDefinitions {
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }
    @When("^add new gift voucher$")
    public void addNewGiftVoucher(List<GiftData>giftData) {
        theActorInTheSpotlight().attemptsTo(SalesGift.SGP(giftData));
    }

    @Then("^view to message (.*)$")
    public void viewToMessageWarningYouDoNotHavePermissionToModifyVouchers(String message) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultsMessageGift.RSG(message)));
    }
}
