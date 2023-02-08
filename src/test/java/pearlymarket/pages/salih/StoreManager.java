package pearlymarket.pages.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class StoreManager {
    public StoreManager(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement productButton;

    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/store-manager/products-manage/'])[1]")
    public WebElement addNew1;

    @FindBy(xpath = "//*[@value='simple']")
    public WebElement simpleProduct;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualRadioButton;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadableRadioButton;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement productType;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement priceBox;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePriceBox;

    @FindBy(xpath = "//*[i@d='featured_img_display']")
    public WebElement picture;

    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement selectFiles;

    @FindBy(xpath = "(//*[.='Choose Image'])[3]")
    public WebElement chooseImage;





}
