package pearlymarket.test.salih;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.HomePage;
import pearlymarket.pages.salih.MyAccount;
import pearlymarket.pages.salih.Product;
import pearlymarket.pages.salih.StoreManager;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US18_US14_US15 {
    @Test
    public void externalAffiliateProductSeçilebilmeli(){

        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
//        storeManager.addNew1.click();
//        ReusableMethods.waitFor(3);
//        Select select=new Select(storeManager.productType);
//        select.selectByVisibleText("External/Affiliate Product ");
//        Driver.closeDriver();

    }
    @Test
    public void uRLButtonTextPriceSalePriceYazılabilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
       externalAffiliateProductSeçilebilmeli();
       storeManager.urlBox.sendKeys("www.deneme.com");
       storeManager.buttonTextBox.sendKeys("deneme");
       storeManager.priceBox.sendKeys("deneme200");
       storeManager.salePriceBox2.sendKeys("deneme250");
       Driver.closeDriver();


    }

    @Test
    public void urününEklendiğiniProductKısmındaGörebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        Product product=new Product();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        storeManager.productButton.click();
        assert product.urunKontrolAraba.isDisplayed();
        Driver.closeDriver();

    }



}
