package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.GiftData;
import opencartesting.utils.Wait;

import java.util.List;

import static opencartesting.userinterface.SalesGiftPage.*;

public class SalesGift implements Task {
    private static List<GiftData> sg;
    public SalesGift(List<GiftData> sg){ this.sg = sg;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_SALES),
                Click.on(SELECT_ORDERS),
                Click.on(BUTTON_GIFT_VOUCHER),
                Click.on(BUTTON_GIFT_VOUCHER_TWO),
                Click.on(BUTTON_ADD),
                Enter.theValue(sg.get(0).getCode()).into(INPUT_CODE),
                Enter.theValue(sg.get(0).getFrom_name()).into(INPUT_FROM_NAME),
                Enter.theValue(sg.get(0).getFrom_email()).into(INPUT_FROM_EMAIL),
                Enter.theValue(sg.get(0).getTo_name()).into(INPUT_TO_NAME),
                Enter.theValue(sg.get(0).getTo_email()).into(INPUT_TO_EMAIL),
                Enter.theValue(sg.get(0).getAmount()).into(INPUT_TO_AMOUNT),
                Click.on(BUTTON_SAVE)
        );
        Wait.Time(2000);
    }

    public static SalesGift SGP(List<GiftData> sg) {
      return Tasks.instrumented(SalesGift.class, sg);
    }
}
