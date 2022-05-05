package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.FiltersData;
import opencartesting.utils.Wait;

import java.util.List;

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
                Click.on(CLIC_FILTER)
        );
        Wait.Time(4000);
    }

    public static Sales SPP(List<FiltersData> pn) {
      return Tasks.instrumented(Sales.class, pn);
    }
}
