package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import opencartesting.utils.Wait;

import static opencartesting.userinterface.ResultsPage.*;

public class resultsShow implements Question{
    public static resultsShow info() {
        return new resultsShow();
    }
    @Override
    public Object answeredBy(Actor actor){
        actor.attemptsTo(
                Click.on(BUTTON_CHECKBOX),
                Click.on(BUTTON_PRINT)
        );
        Wait.Time(3000);
        return true;
    }
}
