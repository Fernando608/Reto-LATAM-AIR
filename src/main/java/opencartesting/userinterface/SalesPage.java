package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SalesPage {

    public static final Target  SELECT_SALES = Target.the("select sales section").located(By.id("menu-sale"));
    public static final Target  SELECT_ORDERS = Target.the("select  orders section").located(By.xpath("//li[@id='menu-sale']/ul/li[1]"));
    public static final Target  INPUT_NAME_CUSTOMER = Target.the("Write customer name").located(By.id("input-customer"));
    public static final Target  CLIC_FILTER = Target.the("Clic filter button").located(By.id("button-filter"));
}
