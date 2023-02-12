package pearlymarket.pages.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class ChooseImage {
    public ChooseImage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='menu-item-upload']")
    public WebElement uploadFilesButton;

    @FindBy(id="__wp-uploader-id-1")
    public WebElement selectFilesButton;

    @FindBy(xpath = "(//*[@type='button'])[88]")
    public WebElement selectButton;
}
