package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps(){
        page = new HomePage();
    }
    @Given("Abro el url")
    public void abroElUrl() {
        BrowserUtils.getDriver();

    }


    @When("Verifico que ingrese al portal {string}")
    public void verificoQueIngreseAlPortal(String url) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), url);
    }

    @Then("Ingreso al menu {string}")
    public void ingresoAlMenu(String ganamovil) {
        BrowserUtils.waitForPageLoad();
        BrowserUtils.click(page.ganamovil);
    }

    @Then("Obtengo un listado de las funcionalidades de GanaMovil")
    public void obtengoUnListadoDeLasFuncionalidadesDeGanaMovil() {
        for(WebElement each: page.list){
            BrowserUtils.isDisplayed(each);
            System.out.println(each.getText());
        }
    }



    @When("Obtengo un listado de las funcionalidades de forma dinamica")
    public void obtengoUnListadoDeLasFuncionalidadesDeFormaDinamica(List<String> list) {
        WebElement nameMovil = BrowserUtils.getDriver().findElement(By.xpath("(//a[contains(@class,'hover:text-secondary-500 hover:underline')][normalize-space()='Apertura de Cuenta'])[1]"));
        BrowserUtils.waitForPageLoad();
        for(String name : list){
            if(name.equals("Apertura de Cuenta")){
                BrowserUtils.click(nameMovil);
            } else{
                BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, name))));
            }

        }
    }

}
