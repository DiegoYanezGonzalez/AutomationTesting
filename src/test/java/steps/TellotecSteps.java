package steps;


import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.TellotecPage;


public class TellotecSteps {

    TellotecPage tellotec = new TellotecPage();
    
    @Given("^I am on the Google search page$")
        public void navigateToGoogle(){
            tellotec.navigateToGoogle();
            
            
    }

    @When("^I enter a search criteria$")
        public void enterSearchCriteria(){
            tellotec.enterSearchCriteria("Foco");
    }

    @And("^click on the search button$")
        public void clickSearchButton(){
            tellotec.clickTellotecSearch();
    }

    @Then("^the results match the criteria$")
        public void validateResults(){
            Assert.assertEquals("Texto que esperamos",tellotec.firstResult());

    }

}
