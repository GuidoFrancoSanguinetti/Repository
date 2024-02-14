import { Given, When, Then, And } from "cypress-cucumber-preprocessor/steps";
import HomePage from "../../../PageDefinitions/Web/HomePage/HomePage";

const homePage = new HomePage();

When(`the user clicks on the first item`, () => {
    homePage.clickFirstItem();
});