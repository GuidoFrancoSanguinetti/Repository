describe('Login tests', () => {
  it('Log in + Log out', () => {
    cy.visit('https://www.demoblaze.com')
    cy.get('#login2').click()
    cy.get('#loginusername').invoke("val", "TestUser#123")
    cy.get('#loginpassword').invoke("val", "TestPassword#123")
    cy.get('#logInModal > .modal-dialog > .modal-content > .modal-footer > .btn-primary').click()
    cy.get('#logout2').should("be.visible").click()
  })
})