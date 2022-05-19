package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReviewsPage {

    public static final Target MENU_CATALOG = Target.the("MENU CATALOG").located(By.id("menu-catalog"));
    public static final Target OPCION_REVIEWS = Target.the("OPCION REVIEWS").located(By.xpath("//li[@id='menu-catalog']/ul/li[9]"));
    public static final Target INPUT_PRODUCT = Target.the("Enter product").located(By.id("input-product"));
    public static final Target VALIDATE_PRODUCT = Target.the("Verify product").located(By.xpath("//form//tbody/tr/td[2]"));

}
