import PageBase from "../PageBase";

export default class NavigationBarPage extends PageBase {

    clickLoginButton() {
        cy.get("#login2").click();
    }

    clickLogoutButton() {
        cy.get("#logout2").should("be.visible").click();
    }

    navigateToCart(){
        cy.get(':nth-child(4) > .nav-link').click()
    }
}