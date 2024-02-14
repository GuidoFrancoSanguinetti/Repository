import PageBase from "../PageBase";

export default class LoginPage extends PageBase {
    insertLoginUsername(username) {
        cy.get('#loginusername').invoke("val", username);
    }

    insertLoginPassword(password) {
        cy.get('#loginpassword').invoke("val", password);
    }

    clickLoginButton() {
        cy.get('#logInModal > .modal-dialog > .modal-content > .modal-footer > .btn-primary').click();
    }
}