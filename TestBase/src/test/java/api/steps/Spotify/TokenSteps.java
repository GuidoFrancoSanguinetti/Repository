package api.steps.Spotify;

import api.pages.Spotify.GetTokenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TokenSteps {

    GetTokenPage getTokenPage = new GetTokenPage();

    @Given("that the user initiates the Get Token request")
    public void thatTheUserInitiatesTheGetTokenRequest() {
        getTokenPage.getToken();
    }

    @And("the last response is {string}")
    public void theLastResponseIs(String code) {
        getTokenPage.checkLastResponseCode(code);
    }
}
