# Selenium Java Cucumber

_Automation testing framework project with java, selenium, cucumber, junit, page object models, html report_


# 

_Esperas en Selenium_

Instanciar webDriverWait que utiliza dos argumentos, el web driver y un int que seran los segundos de espera
Una espera explicita espera al elemento buscado un hasta un tiempo estimado, si lo encuentra antes sigue si no espera el tiempo limite y da el response de error o exito.
Se usan cuando se tarda un poco la respuesta de algun servicio

private WebElement Find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }



Esperas implicita son las que se hacen globales entre cada accion 

 static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver =  new ChromeDriver(chromeOptions); 
        wait = new WebDriverWait(driver,20);
    }

    public BasePage(WebDriver driver){  
    BasePage.driver = driver;
    wait = new WebDriverWait(driver,10);
    }

_El comando SLEEP_

Esta espera no deberia hacerse y se ocupa algunas veces con el argumento de debugguear, viendo algun error. No deberia estar en el codigo final. sleep hace que se duerma todo y se esperen los segundos correspondientes.

_iFromes y Popups_

Son anuncios o fragmentos de comunmente videos o imagenes.


_Assertions_


En la clase Base Page se genera un metodo en la base page que devuelve el text de un elemento, 

public String textFromElement(String locator){
        return Find(locator).getText();
    }

para ocuparlo en la clase page donde se conecta con elemento que sera donde se extraiga el text,

 private String firtsResult = "";
 public String firstResult(){
        return textFromElement(firtsResult);
    }


 del cual finalmente en la clase de Steps con un metodo de validacion del resultado,  

 @Then("^the results match the criteria$")
        public void validateResults(){
            Assert.assertEquals("Texto que esperamos",tellotec.firstResult());

    }


_AsserEquals_

Prueba que algo es igual a otra.

 @Then("^I can validate the table is displayed$")
public void theTableIsThere() {
   Assert.assertTrue("ERROR", grid.cellStatus());
}