package opencartesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import opencartesting.userinterface.ReviewsPage;

public class ResultsReviews implements Question <Boolean> {
    private String result_Product;
    public ResultsReviews(String result_Product) {this.result_Product = result_Product; }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean res;
        String data_text = ReviewsPage.VALIDATE_PRODUCT.resolveFor(actor).getText();
        if (data_text.contains(result_Product)){
            res=true;
        }else {
            res=false;
        }
        return res;
    }

    public static ResultsReviews RRV(String result_Product){return new ResultsReviews(result_Product);}
}
