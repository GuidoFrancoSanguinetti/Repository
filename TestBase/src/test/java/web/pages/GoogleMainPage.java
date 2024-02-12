package web.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleMainPage extends PageBase {

    @FindBy(xpath = "//*[@title='Search']")
    List<WebElement> searchField;
    @FindBy(xpath = "//*[@id='result-stats']")
    List<WebElement> resultsLabel;

    public GoogleMainPage() {
        super(); // WebDriver is initialized in PageBase
    }

    public void enterSearchValue(String searchValue) {
        checkElementExists(searchField);
        searchField.get(0).sendKeys(searchValue);
    }

    public void checkSearchResultsPage() {
        checkElementExists(resultsLabel);
    }
}
