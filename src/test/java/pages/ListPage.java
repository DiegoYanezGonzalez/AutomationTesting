package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ListPage  extends BasePage{

    private String searchField = "//body/form[1]/input[1]";
    private String searchResults = "name";

    public ListPage(){
        super(driver);
    }

    public void navigateListPage(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteria() throws InterruptedException{
        try{
            Thread.sleep(600);
            write(searchField,"Washington");
        }catch(NoSuchElementException e ){
            System.out.println("The Element Search Field couldnt be found");
            e.printStackTrace();
        }
        
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList = new ArrayList<String>();
        for(WebElement e : list){
            stringFromList.add(e.getText());
        }

        return stringFromList;
        
    }

}
