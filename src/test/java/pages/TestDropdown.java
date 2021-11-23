package pages;


public class TestDropdown extends BasePage {

    private String categoryDropdown = "//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/select[1]";

    public TestDropdown() {
        super(driver);
        
    }

    public void navigateToDropdownPage(){
        
        navigateTo("https://tellotec.cl/opticos/2-optico_l200_2015_mitsubishi.html");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown,category);
    }
    
}
