package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.FiltersData;
import opencartesting.utils.Wait;

import java.util.List;

import static opencartesting.userinterface.SalesDatePage.*;

public class SalesDate implements Task {
    private static List<FiltersData> sd;
    public SalesDate(List<FiltersData> sd){ this.sd = sd;}


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(INPUT_DATE_ADDED));
        Wait.Time(1000);
        actor.attemptsTo(
                Enter.theValue(sd.get(0).getDate_added()).into(INPUT_DATE_ADDED),
                Click.on(CLIC_FILTER)
        );
        Wait.Time(1000);
    }

    public static SalesDate SDP(List<FiltersData> sd) {
      return Tasks.instrumented(SalesDate.class, sd);
    }
}
