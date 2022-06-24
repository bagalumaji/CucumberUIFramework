package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "steps",
features = {"src/test/resources/features/AddToCartFeature.feature"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
