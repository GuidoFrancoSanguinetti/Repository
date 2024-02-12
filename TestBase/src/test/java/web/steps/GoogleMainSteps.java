package web.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.GoogleMainPage;

public class GoogleMainSteps {

    GoogleMainPage googleMainPage = new GoogleMainPage();
    @When("the user enters \"([^\"]*)\" in the search field")
        public void theUserEntersInTheSearchField(String searchValue) {
            googleMainPage.enterSearchValue(searchValue);
    }

    @Then("the user should see the search results page")
    public void theUserShouldSeeTheSearchResultsPage() {
        googleMainPage.checkSearchResultsPage();
    }
}
