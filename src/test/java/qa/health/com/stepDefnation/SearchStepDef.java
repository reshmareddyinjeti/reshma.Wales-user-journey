package qa.health.com.stepDefnation;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import qa.health.com.driver.DriverFactory;
import qa.health.com.pageObject.Search;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef extends DriverFactory {
    Search search = new Search();

    @Given("^I am a person from Wales$")
    public void iAmAPersonFromWales() {
        search.setSearchMethod();

    }

    @When("^I put my circumstances into the Checker tool$")
    public void iPutMyCircumstancesIntoTheCheckerTool() {
        search.selectOptions();
    }

    @Then("^I should get a result of whether i will get help or not$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot() {
        String actual = search.headerMethodForValidation();
        System.out.println(actual);
        assertThat("you got some different message . ", actual, Matchers.endsWith("You get help with NHS costs"));
        //Assert.assertEquals(true,actual.contains("Based on what you've told us You get help with NHS costs"));
    }


}