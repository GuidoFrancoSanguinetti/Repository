package web.pages;

import dev.failsafe.RetryPolicy;
import net.jodah.failsafe.Failsafe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import web.helpers.WebDriverFactory;

import java.time.Duration;
import java.util.List;

public class PageBase {

    protected WebDriver driver;

    public PageBase() {
        this.driver = WebDriverFactory.getDriver();
    }

    public void pressEnterKey() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void checkElementExists(List<WebElement> element) {
        //Requires: retryPolicy
        if (element.size() == 0) {
            throw new IllegalArgumentException("Element \"" + element + "\" does not exist");
        }
    }
}
