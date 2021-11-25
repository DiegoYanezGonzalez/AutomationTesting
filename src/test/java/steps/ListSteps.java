package steps;

import java.util.List;

import cucumber.api.java.en.*;
import pages.ListPage;

public class ListSteps {
    
    ListPage list = new ListPage();

    @Given("^I navigate to the list page$")
public void navigateToListPage() {
    list.navigateListPage();
}

@When("^I search the list$")
public void searchTheList() throws InterruptedException {
    list.enterSearchCriteria();
}

@Then("^I can find the text in the list$")
public void theTableIsThere() {
    List <String> lista = list.getAllSearchResults();
    boolean textIsThere = lista.contains("Seattle, Washington");

    if(textIsThere){
        System.out.println("The text is on the list : PASSES.");

    }else{
        throw new Error("The text is not on the list : FAILED!");
    }
}


    
}
