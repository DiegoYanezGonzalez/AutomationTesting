package pages;

public class TellotecPage extends BasePage {

    private String searchButton = "//header/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2]";
    private String searchTextField = "//header/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/input[2]";

    public TellotecPage(){
        super(driver);
    }

    public void navigateToGoogle(){
        
        navigateTo("https://www.tellotec.cl");
    }

    public void clickTellotecSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField,criteria);
    }

}
