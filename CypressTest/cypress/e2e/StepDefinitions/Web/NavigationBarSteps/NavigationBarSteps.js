import { Given, When } from "cypress-cucumber-preprocessor/steps";
import NavigationBarPage from "../../../PageDefinitions/Web/NavigationBarPage/NavigationBarPage";

const navigationBarPage = new NavigationBarPage();

Given("the user navigates to the home page", () => {
    navigationBarPage.navigateToHomePage();
});

When("the user clicks on the login button", () => {
    navigationBarPage.clickLoginButton();
});

And("the user navigates to the cart", () => {
    navigationBarPage.navigateToCart();
});