package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.SalesPage;


public class ResultsShow implements Question <Boolean> {
    private String question;
    public ResultsShow(String question) {
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

    public static ResultsShow RS(String question) {return new ResultsShow(question);}
}
