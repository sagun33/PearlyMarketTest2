package pearlymarket.pages.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class MyAccount {
    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//*[@name='username'])[1]")
    public WebElement userName;
    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//*[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;
}
