package opencartesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LongInPage {

    public static final Target INPUT_USERNAME = Target.the("Email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("passwd"));
    public static final Target BUTTON_LOGGIN = Target.the("Password").located(By.id("SubmitLogin"));



}
