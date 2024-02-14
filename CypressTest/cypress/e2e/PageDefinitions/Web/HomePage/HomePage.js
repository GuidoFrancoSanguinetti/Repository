import PageBase from "../PageBase";

export default class CartPage extends PageBase {
    clickFirstItem() {
        cy.get(':nth-child(1) > .card > :nth-child(1)').click()
    }
}