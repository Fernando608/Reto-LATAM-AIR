package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SalesPage {

    public static final Target  SELECT_SALES = Target.the("select sales section").located(By.id("menu-sale"));
    public static final Target  SELECT_ORDERS = Target.the("select  orders section").located(By.xpath("//li[@id='menu-sale']/ul/li[1]"));
    public static final Target  INPUT_NAME_CUSTOMER = Target.the("Write customer name").located(By.id("input-customer"));
    public static final Target  INPUT_DATE_ADDED = Target.the("Write customer name").located(By.id("input-date-added"));
    public static final Target BUTTON_VIEW = Target.the("").located(By.xpath("//div[@class='btn-group']//a[@data-original-title='View']"));
    public static final Target CONFIRM_NAME_CUSTOMER = Target.the("").located(By.xpath("//div[@id='content']//div[2]//div//div[2]//table//tbody//tr[1]//td[2]//a"));

}
