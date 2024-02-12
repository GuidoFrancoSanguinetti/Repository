package web.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import web.helpers.WebDriverFactory;
import web.pages.PageBase;

public class StepsBase {

    WebDriverFactory webDriverFactory = new WebDriverFactory();
    private WebDriver driver;
    PageBase pageBase = new PageBase();
    @Then("^the user presses the Intro key$")
    public void theUserPressesTheIntroKey() {
        pageBase.pressEnterKey();
    }
}
