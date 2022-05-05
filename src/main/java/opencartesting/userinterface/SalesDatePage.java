package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SalesDatePage {

    public static final Target  INPUT_DATE_ADDED = Target.the("Write customer name").located(By.id("input-date-added"));
    public static final Target  CLIC_FILTER = Target.the("Clic filter button").located(By.id("button-filter"));

}
