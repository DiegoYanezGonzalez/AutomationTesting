package steps;

import cucumber.api.java.en.*;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage(){
        grid.navigateToGrid();
            
    }

    @Then("^I can return the value I wanted$")
    public void returnValue(){
        String value = grid.getValueFromGrid(1,1);

        System.out.println(value);
    }
    
}
