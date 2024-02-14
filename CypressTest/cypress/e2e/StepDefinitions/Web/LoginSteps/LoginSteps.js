import { Given, When, Then, And } from "cypress-cucumber-preprocessor/steps";
import LoginPage from "../../../PageDefinitions/Web/LoginPage/LoginPage";

const LoginPage = new LoginPage();

And("the user enters {string} and {string} as username and password", (username, password) => {
    LoginPage.insertUsername(username);
    LoginPage.insertPassword(password);
});