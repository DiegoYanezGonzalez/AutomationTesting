package steps;

import cucumber.api.java.en.*;
import pages.TestDropdown;

public class DropdownSteps {
    
 TestDropdown testDropdown = new TestDropdown();

    @Given("^I navigate to the dropdown page$")
            public void navigateToDropdownSite(){
                testDropdown.navigateToDropdownPage();
                    
        }

    @And("^select a value from the dropdown$")
    public void selectState(){
      testDropdown.selectCategory("2");
}
}
