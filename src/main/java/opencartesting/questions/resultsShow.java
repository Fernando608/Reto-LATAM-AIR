package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.SalesPage;


public class resultsShow implements Question <Boolean> {
    private String question;
    public resultsShow(String question) {
        this.question = question;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String text = (SalesPage.CONFIRM_NAME_CUSTOMER.resolveFor(actor).getText());
        if (text.contains(question)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }

    public static resultsShow RS(String question) {return new resultsShow(question);}
}
