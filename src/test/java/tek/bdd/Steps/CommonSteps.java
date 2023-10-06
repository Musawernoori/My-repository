package tek.bdd.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.Utitlity.SeleniumUtility;

public class CommonSteps  extends SeleniumUtility {
    @Given("Open Browser and Navigate")
    public void openBrowserAndnavigate() {
        openBrowser();
    }

    @Then("Application title should be {string}")
    public void appTitle(String expectedTitle) {
        String actualTitle = "Tek Insurance App";
        Assert.assertEquals( "Application title validation", expectedTitle , actualTitle );

    }

    @Then("Close the browser")
    public void closeBrowser() {

        driverQuit();    }




    }

