describe('Login template spec', () => {
    it('Login wrong username', () => {
      cy.visit('https://www.demoblaze.com')
      cy.get(':nth-child(1) > .card > :nth-child(1)').click()
      cy.get('.col-sm-12 > .btn').should("be.visible").click()
      cy.get(':nth-child(4) > .nav-link').click()
      cy.get('.success > :nth-child(4) > a').click()
      cy.get('.table-responsive').then($body => {
        if ($body.find('.table-responsive > :nth-child(2)').length === 0) {
          assert.isTrue(true, 'Element does not exist, test passes');
        } else {
          assert.isTrue(false, 'Element exists, test fails');
        }
      });
    })
  })