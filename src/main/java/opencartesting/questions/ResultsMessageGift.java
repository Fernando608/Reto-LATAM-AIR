package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.SalesGiftPage;

public class ResultsMessageGift implements Question <Boolean> {
    private String message;
    public ResultsMessageGift(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String text = (SalesGiftPage.CONFIRM_MESSAGE.resolveFor(actor).getText());
        System.out.println("MENSAJE: "+SalesGiftPage.CONFIRM_MESSAGE);
        if (text.contains(message)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }

    public static ResultsMessageGift RSG(String message) {return new ResultsMessageGift(message);}
}
