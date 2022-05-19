package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.LongInPage;

public class ResultsUserSession implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return LongInPage.VALIDATE_USER.resolveFor(actor).getText();
    }
    public static Question<String> value(){return new ResultsUserSession();}
}
