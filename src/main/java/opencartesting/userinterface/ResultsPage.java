package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {

    public static final Target BUTTON_CHECKBOX = Target.the("BUTTON VIEW").located(By.xpath("//td/input[@value='16646']"));
    public static final Target BUTTON_PRINT = Target.the("").located(By.id("button-invoice"));

}
