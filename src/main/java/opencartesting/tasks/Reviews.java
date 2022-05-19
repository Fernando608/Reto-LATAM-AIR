package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.ReviewData;
import opencartesting.utils.WaitTime;

import java.util.List;

import static opencartesting.interactions.Clicks.CLIC_FILTER;
import static opencartesting.userinterface.ReviewsPage.*;

public class Reviews implements Task {
    private static List<ReviewData> rv;
    public Reviews (List<ReviewData> rv){ this.rv = rv; }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_CATALOG),
                Click.on(OPCION_REVIEWS),
                Enter.theValue(rv.get(0).getProduct()).into(INPUT_PRODUCT),
                Click.on(CLIC_FILTER)
        );
        WaitTime.Time(2000);
    }

    public static Reviews RV(List<ReviewData> rv) {
        return Tasks.instrumented(Reviews.class, rv);
    }
}
