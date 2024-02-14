import PageBase from "../PageBase";

export default class CartPage extends PageBase {
    deleteFirstItem() {
        cy.get('.success > :nth-child(4) > a').click()
    }

    verifyCartIsEmpty(){
        cy.get('.table-responsive').then($body => {
            if ($body.find('.table-responsive > :nth-child(2)').length === 0) {
              assert.isTrue(true, 'Element does not exist, test passes');
            } else {
              assert.isTrue(false, 'Element exists, test fails');
            }
          });
    }

    clickOnThePlaceOrderButton(){
        cy.get('.col-lg-1 > .btn').click()
    }

    fillPurchaseForm(name, country, city, card, month, year){
        cy.get('#name').invoke("val", name)
        cy.get('#country').invoke("val", country)
        cy.get('#city').invoke("val", city)
        cy.get('#card').invoke("val", card)
        cy.get('#month').invoke("val", month)
        cy.get('#year').invoke("val", year)
    }

    clickOnThePlaceOrderButton(){
        cy.get('#orderModal > .modal-dialog > .modal-content > .modal-footer > .btn-primary').click()
    }

    clickOnPurchaseButton(){
        cy.get('#orderModal > .modal-dialog > .modal-content > .modal-footer > .btn-primary').click()
    }

    clickOnOkButtonPurchaseConfirmation(){
        cy.get('.confirm').click()
    }
}