package pearlymarket.test.salih;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.HomePage;
import pearlymarket.pages.salih.MyAccount;
import pearlymarket.pages.salih.StoreManager;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class US16 {


    @Test
    public void testSimpleProductDefaultOlarakGelmeli() {
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
        actions.moveToElement(storeManager.productButton);
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        assert storeManager.simpleProduct.isDisplayed();
        
        Select select1=new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");
        





        }

    @Test
    public void testVirtualAndDownloadableSeçilebilmeli() {

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
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.virtualRadioButton.click();
        storeManager.downloadableRadioButton.click();

    }

    @Test
    public void testpriceBoxunaDegerlerGirilebilmeli() {
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
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.priceBox.sendKeys("10");


    }
    @Test
    public void testSalePriceBoxunaDegerlerGirilebilmeli() {
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
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.salePriceBox.sendKeys("100");

    }

    @Test
    public void testUserStory14() {
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
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);


        //Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı
        Select select1=new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Grouped Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("External/Affiliate Product");

        ReusableMethods.waitFor(3);

        //Ürün fotoğrafı eklenebilmeli
        storeManager.picture.click();
        assert storeManager.chooseImage.isDisplayed();


    }
}

