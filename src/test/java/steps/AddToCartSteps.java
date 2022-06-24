package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {
    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        WebDriver webDriver = WebDriverManager.chromedriver().create();
        webDriver.get("https:/askomdch.com/store");
        webDriver.manage().window().maximize();

    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String arg0) {
        
    }

    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(int arg0, String arg1) {
    }
}
