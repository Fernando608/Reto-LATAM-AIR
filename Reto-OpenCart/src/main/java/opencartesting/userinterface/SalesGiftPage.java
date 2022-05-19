package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SalesGiftPage {

    public static final Target SELECT_SALES = Target.the("select sales section").located(By.id("menu-sale"));
    public static final Target SELECT_ORDERS = Target.the("select  orders section").located(By.xpath("//li[@id='menu-sale']/ul/li[1]"));
    public static final Target BUTTON_GIFT_VOUCHER = Target.the("select  orders section").located(By.xpath("//li[@id='menu-sale']/ul/li[4]"));
    public static final Target BUTTON_GIFT_VOUCHER_TWO = Target.the("Go  orders section").located(By.xpath("//li[@id='menu-sale']/ul/li[4]//ul/li[1]"));
    public static final Target BUTTON_ADD = Target.the("BUTTON_ADD GIFT_VOUCHER").located(By.xpath("//div[@class='pull-right']//a"));

    public static final Target INPUT_CODE = Target.the("INPUT CODE").located(By.id("input-code"));
    public static final Target INPUT_FROM_NAME = Target.the("INPUT FROM NAME").located(By.id("input-from-name"));
    public static final Target INPUT_FROM_EMAIL = Target.the("INPUT FROM EMAIL").located(By.id("input-from-email"));
    public static final Target INPUT_TO_NAME = Target.the("INPUT TO NAME").located(By.id("input-to-name"));
    public static final Target INPUT_TO_EMAIL = Target.the("INPUT TO EMAIL").located(By.id("input-to-email"));
    public static final Target INPUT_TO_AMOUNT = Target.the("INPUT AMOUNT").located(By.id("input-amount"));
    public static final Target BUTTON_SAVE = Target.the("BUTTON SAVE").located(By.xpath("//button[@type='submit']"));
    public static final Target CONFIRM_MESSAGE = Target.the("MESSAGE").located(By.xpath(" //div[@class='alert alert-danger alert-dismissible']"));

}
