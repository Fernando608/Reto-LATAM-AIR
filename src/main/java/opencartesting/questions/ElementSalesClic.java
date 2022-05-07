package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.SalesPage;

public class ElementSalesClic implements Question <Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean validate;
        if (SalesPage.SELECT_SALES.resolveFor(actor).isClickable()){
            validate=true;
        }else {
            validate=false;
        }
        return validate;
    }

    public static ElementSalesClic isClickeable(){return new ElementSalesClic();}
}
