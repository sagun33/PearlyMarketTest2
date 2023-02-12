package pearlymarket.pages.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class Product {
    public Product(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='wcfm_product_title'])[1]")
    public WebElement urunKontrolAraba;
}
