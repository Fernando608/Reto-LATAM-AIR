package opencartesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import opencartesting.model.LoginData;


import java.util.List;

import static opencartesting.userinterface.LongInPage.*;


public class LongIn implements Task {

    private static List<LoginData> ld;
    public LongIn (List<LoginData> ld) { this.ld = ld; }



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(ld.get(0).getUsername()).into(INPUT_USERNAME),
                Enter.theValue(ld.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGGIN)
        );
    }


    public static LongIn LGD(List<LoginData> ld) {
        return Tasks.instrumented(LongIn.class, ld);
    }

}
