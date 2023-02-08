package pearlymarket.pages.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pearlymarket.utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Sign In'])[2]")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[.='Sign Out'])[1]")
    public WebElement signOut;




}
