package opencartesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/opencart.feature",
        tags = "@story",
        glue = "opencartesting.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class opercartRunner {

}