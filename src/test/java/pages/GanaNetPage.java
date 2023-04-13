package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class GanaNetPage {
    public GanaNetPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);

    }
    @FindBy(xpath = "(//a[@class='px-4 py-2 w-44 break-normal text-center inline-flex justify-center align-middle m-0 font-normal items-center border-2 text-sm md:text-base rounded-full shadow outline-none focus:outline-none ease-linear transition-all duration-100 bg-transparent dark:border-gray-200 md:dark:text-gray-900 md:dark:border-gray-900 border-gray-900 hover:text-white dark:hover:text-white hover:border-secondary-500 hover:bg-secondary-500 ease-in-out duration-300'][normalize-space()='Banca por Internet'])[2]")
    public WebElement gananet;

    @FindBy(xpath = "//html[@lang='es']/body/app-root/seguridad-login/div/div/div/div/div/div/following::div/div/following::select/option")
    public WebElement alias;

    @FindBy(xpath = "//span[@class='light-logo mt-10']")
    public WebElement box;

    @FindBy(xpath = "//html[@lang='es']/body/app-root/seguridad-login/div/div/div/div/div/div/following::div/div/following::select/option[1]")
    public WebElement aliasselect;

    @FindBy(xpath = "//html[@lang='es']/body/app-root/seguridad-login/div/div/div/div/div/div/following::div/div/div/span/i/following::input[1]")
    public WebElement input;

    @FindBy(xpath = "//iframe[@id='iframe_Browser']")
    public WebElement frame;

    @FindBy(xpath = "//h2[normalize-space()='¡Bienvenido a GanaNet!']")
    public WebElement name;

    @FindBy(xpath = " //html[1]/body[1]/app-root[1]/seguridad-login[1]/div[2]/div[1]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/button[1]")
    public WebElement verificar;

    @FindBy(xpath = "//html[@lang='es']/body/app-root/seguridad-login/div/div/div/div/div/div/following::div/div/following::select/option[2]")
    public WebElement usuario2;

    @FindBy(xpath = "//html/body/div[3]/div/div/div/div/following::span/following::div/div/following::div/following::div/following::div/following::div/button[text()='OK']")
    public WebElement mensage;

    @FindBy(xpath = "/html/body/div[2]/div/following::div/div/following::div/div/following::div[@class='swal2-content']/div[@id='swal2-content']")
    public WebElement mensage1;

    @FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
    public WebElement ok;

}
