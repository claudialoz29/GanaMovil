package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//h5[normalize-space()='GanaMóvil'])[1]")
    public WebElement ganamovil;

    @FindBy(xpath = "//h4[@class='mb-2 font-bold text-lg md:text-xl text-center dark:text-gray-200 text-secondary-500']/following::div[@class='text-sm md:text-base text-gray-900 dark:text-slate-200 ']/child::a")
    public List<WebElement> list;
}
