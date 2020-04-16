package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginDefinitions {

    @Given("^User is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    	System.out.println("given");
    }

    @When("^User logging in using (.+) and (.+)$")
    public void user_logging_in_using_and(String username, String password) throws Throwable {
    	System.out.println("when");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("then");
    }

    @And("^\"([^\"]*)\" is displayed on the top$")
    public void something_is_displayed_on_the_top(String username) throws Throwable {
    	System.out.println(username);
    	System.out.println("\"([^\"]*)\"");
    }
    
    @But("^password is not$")
    public void password_is_not() throws Throwable {
    	System.out.println("but");
    }

    @Given("^Tagging is on$")
    public void tagging_is_on() throws Throwable {
    	System.out.println("tagging_is_on given");
    }

    @When("^Tags are applied$")
    public void tags_are_applied() throws Throwable {
    	System.out.println("tagging_is_on when");
    }

    @Then("^Only tagged scenario are run$")
    public void only_tagged_scenario_are_run() throws Throwable {
    	System.out.println("tagging_is_on then");
    }
}