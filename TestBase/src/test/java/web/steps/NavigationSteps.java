package web.steps;

import io.cucumber.java.en.*;
import web.helpers.WebDriverFactory;
import web.pages.NavigationPage;

public class NavigationSteps {
    NavigationPage navigationPage = new NavigationPage();

    @Given("the user opens the {string} main page on {string}")
    public void theUserOpensTheMainPageOn(String website, String browser) {
        navigationPage.openWithGivenSiteAndBrowser(website, browser);
    }
}
