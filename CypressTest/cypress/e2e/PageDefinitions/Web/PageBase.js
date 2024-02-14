export default class PageBase {
    constructor() {
    }
    
    navigateToHomePage() {
        cy.get("https://www.demoblaze.com/").visit();
    }

}