package aerocivil.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/aerocivil.feature",
        tags = "@stories",
        glue = "aerocivil.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}