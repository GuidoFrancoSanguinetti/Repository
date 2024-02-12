package Hooks;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import web.helpers.WebDriverFactory;

import java.util.Set;

public class hooks {

    WebDriverFactory webDriverFactory = new WebDriverFactory();

//    @Before
//    public void initializeWebDriver(Scenario scenario) {
//        String browserType = getBrowserTypeFromTags(scenario);
//        webDriverFactory.initializeDriver(browserType);
//    }
//
//    private String getBrowserTypeFromTags(Scenario scenario) {
//        Set<String> tags = (Set<String>) scenario.getSourceTagNames();
//        if (tags.contains("@Chrome")) {
//            return "Chrome";
//        } else if (tags.contains("@Firefox")) {
//            return "Firefox";
//        } else if (tags.contains("@Edge")) {
//            return "Edge";
//        }
//        return "defaultBrowser"; // Default browser if no tag is matched
//    }

    @After
    public void tearDown() {
        WebDriverFactory.closeDriver();
    }
}
