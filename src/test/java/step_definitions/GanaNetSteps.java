package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.GanaNetPage;
import utils.BrowserUtils;
import utils.ConfigReader;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class GanaNetSteps implements CommonPage {
    GanaNetPage page;
    WebDriverWait wait;
    static Map<String, String> variables;

    public GanaNetSteps() {
        page = new GanaNetPage();
    }

    @Then("Hago click en Banca por Internet")
    public void hagoClickEnBancaPorInternet() {
        BrowserUtils.waitForPageLoad();
        BrowserUtils.click(page.gananet);
        BrowserUtils.switchToNewWindow();
    }


    @When("Cuando seleciono el tipo de usuario Alias")
    public void cuandoSelecionoElTipoDeUsuarioAlias() {
        WebElement m = BrowserUtils.getDriver().findElement(By.xpath("//div[@id='Site_Browser']/iframe[@id='iframe_Browser']"));
        BrowserUtils.waitForPageLoad();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // BrowserUtils.selectByVisibleText(page.alias, "Alias ");
            throw new RuntimeException(e);
        }
        BrowserUtils.getDriver().switchTo().frame(m);

        BrowserUtils.click(page.alias);
        BrowserUtils.click(page.aliasselect);
    }


    @Then("Ingreso el usuario {string}")
    public void ingresoElUsuario(String name) {
        //WebElement m = BrowserUtils.getDriver().findElement(By.xpath("//div[@id='Site_Browser']/iframe[@id='iframe_Browser']"));
        BrowserUtils.waitForPageLoad();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        //BrowserUtils.getDriver().switchTo().frame(m);
      // System.out.println(page.alias.getAttribute("value"));
       BrowserUtils.sendKeys(page.input, name);
        //variables = new HashMap<>();
        //variables.put("Alias", name);

    }

    @Then("Hago click en verificar")
    public void hagoClickEnVerificar() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        JavascriptExecutor js = (JavascriptExecutor) BrowserUtils.getDriver();
        js.executeScript("arguments[0].click()", page.verificar);
        //BrowserUtils.click(page.verificar);



    }



    @And("Obtengo mensaje restrictivo")
    public void obtengoMensajeRestrictivo() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        BrowserUtils.waitForPageLoad();

        BrowserUtils.getDriver().switchTo().defaultContent();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        BrowserUtils.getDriver().switchTo().frame(0);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        WebElement mensaje = BrowserUtils.getDriver().findElement(By.xpath("//div[@id='swal2-content']"));
        String mens = variables.get("Alias").toString();
        String mens1 = variables.get("Código de persona").toString();
        if (mens.equalsIgnoreCase("Alias")) {
            System.out.println(mensaje.getText() + " " + " password incorrecto, vuelva a intentar: " + mens);
        } else {
            System.out.println(mensaje.getText() + " " + " password incorrecto, vuelva a intentar: " + mens1);
        }
    }






        @When("Cuando selecciono {string} and {string}")
    public void cuandoSeleccionoAnd(String usuario, String value) {
        WebElement m = BrowserUtils.getDriver().findElement(By.xpath("//div[@id='Site_Browser']/iframe[@id='iframe_Browser']"));
        BrowserUtils.waitForPageLoad();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            // BrowserUtils.selectByVisibleText(page.alias, "Alias ");
            throw new RuntimeException(e);
        }

        BrowserUtils.getDriver().switchTo().frame(m);
        switch (usuario){
            case "Alias":
                BrowserUtils.click(page.alias);
                BrowserUtils.click(page.aliasselect);
                BrowserUtils.sendKeys(page.input, value);
                break;
            case "Código de persona"  :
                BrowserUtils.click(page.alias);
                BrowserUtils.click(page.usuario2);
                BrowserUtils.click(page.usuario2);
                BrowserUtils.sendKeys(page.input, value);

        }
        System.out.println(usuario);
        System.out.println(value);
        variables = new HashMap<>();
        variables.put("Alias", value);
        variables.put("Código de persona", value);
    }
}
