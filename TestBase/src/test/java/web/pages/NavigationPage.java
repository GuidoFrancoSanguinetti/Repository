package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.helpers.WebDriverFactory;

import java.time.Duration;
import java.util.Locale;

public class NavigationPage {

    WebDriverFactory webDriverFactory = new WebDriverFactory();
    private WebDriver driver;

    public void openWithGivenSiteAndBrowser(String website, String browser) {
        driver = webDriverFactory.initializeDriver(browser);
        switch (website.toLowerCase(Locale.ROOT)) {
            case "google":
                driver.get("http://www.google.com");
                break;
            case "spotify":
                driver.get("http://www.google.com");
                break;
            case "youtube":
                driver.get("http://www.google.com");
                break;
            default:
                throw new IllegalArgumentException("Unsupported website: \"" + website + "\"");
        }
        acceptCookies();
    }

    private void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Accept all']"))).click();
    }
}