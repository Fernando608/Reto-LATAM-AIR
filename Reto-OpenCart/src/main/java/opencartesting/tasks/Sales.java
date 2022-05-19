package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.FiltersData;
import opencartesting.utils.WaitTime;

import java.util.List;


import static opencartesting.interactions.Clicks.CLIC_FILTER;
import static opencartesting.userinterface.SalesPage.*;

public class Sales implements Task {
    private static List<FiltersData> pn;
    public Sales (List<FiltersData> pn){ this.pn = pn;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_SALES),
                Click.on(SELECT_ORDERS),
                Enter.theValue(pn.get(0).getCustomer()).into(INPUT_NAME_CUSTOMER),
                Click.on(INPUT_DATE_ADDED),
                Enter.theValue(pn.get(0).getDate_added()).into(INPUT_DATE_ADDED),
                Click.on(CLIC_FILTER),
                Click.on(BUTTON_VIEW)
        );
        WaitTime.Time(2000);
    }

    public static Sales SPP(List<FiltersData> pn) {
      return Tasks.instrumented(Sales.class, pn);
    }
}
