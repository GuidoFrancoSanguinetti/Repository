import { Given, When, Then, And } from "cypress-cucumber-preprocessor/steps";
import CartPage from "../../../PageDefinitions/Web/CartPage/CartPage";

const cartPage = new CartPage();

Then(`the user deletes the item from the cart`, () => {
    cartPage.deleteFirstItem();
});

Then(`the item should be removed from the cart`, () => {
    cartPage.verifyCartIsEmpty();
});

And(`the user clicks on the Place Order button`, () => {
    cartPage.clickOnThePlaceOrderButton();
});

And(`the user fills in the purchase form with the following details: {string}, {string}, {string}, {string}, {string}, {string}, {string}`, (name, country, city, card, month, year) => {
    cartPage.fillPurchaseForm(name, country, city, card, month, year);
});

And(`the user clicks on the Purchase button`, () => {
    cartPage.clickOnThePlaceOrderButton();
});

And(`the user clicks on the Purchase button`, () => {
    cartPage.clickOnPurchaseButton();
});

Then(`the user clicks on the confirm button for the purchase`, () => {
    cartPage.clickOnOkButtonPurchaseConfirmation();
});