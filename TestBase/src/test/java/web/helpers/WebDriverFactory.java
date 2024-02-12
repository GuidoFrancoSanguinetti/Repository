package web.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverFactory {

    private static Properties properties = new Properties();

    private static WebDriver driver;

    public WebDriver initializeDriver(String browserType) {
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        switch (browserType.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                chromeOptions.setCapability("acceptInsecureCerts", true);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addPreference("network.websocket.allowInsecureFromHTTPS", true); // Similar to --remote-allow-origins=* in Chrome
                firefoxOptions.setAcceptInsecureCerts(true);
                driver = new FirefoxDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\Webdrivers\\msedgedriver.exe");
                EdgeOptions options = new EdgeOptions();
                options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                options.addArguments("--remote-allow-origins=*");
                options.setCapability("ignore-certificate-errors", true);
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserType);
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}