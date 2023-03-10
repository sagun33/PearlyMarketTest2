package pearlymarket.test.salih;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.*;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;

public class US17_US14_US15 {
    @Test
    public void US17_TC01VendorOlarakVariableProductEklenebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
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
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        Select select=new Select(storeManager.productType);
        select.selectByVisibleText("Variable Product");
        Driver.closeDriver();


    }
    @Test
    public void US17_TC02UruneGöreAttributesColorVeSizeSeçilebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
        Product product=new Product();
        US17_TC01VendorOlarakVariableProductEklenebilmeli();
        storeManager.productTitle.sendKeys("bilgisayar");
        storeManager.attributes.click();//tiklayamadim
        storeManager.colorRadioButton.click();
        storeManager.colorBox.sendKeys("sari");
        storeManager.sizeRadioButton.click();
        storeManager.sizeBox.sendKeys("50x50");

        Driver.closeDriver();



    }
    @Test
    public void US17_TC03YniColorEklenebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
        Product product=new Product();
        US17_TC01VendorOlarakVariableProductEklenebilmeli();
        storeManager.productTitle.sendKeys("bilgisayar");
        storeManager.attributes.click();//tiklayamadim ???????
        storeManager.colorRadioButton.click();
        storeManager.colorAddNew.click();
        Driver.getDriver().switchTo().alert().sendKeys("tablet");
        Driver.getDriver().switchTo().alert().accept();
        Driver.closeDriver();


    }
    @Test
    public void US17_TC04YeniSizeEklenebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
        Product product=new Product();
        US17_TC01VendorOlarakVariableProductEklenebilmeli();
        storeManager.productTitle.sendKeys("bilgisayar");
        storeManager.attributes.click();//tiklayamadim ???????
        storeManager.sizeRadioButton.click();
        storeManager.sizeAddNew.click();
        Driver.getDriver().switchTo().alert().sendKeys("50x30");
        Driver.getDriver().switchTo().alert().accept();

        Driver.closeDriver();

    }

    @Test
    public void US17_TC05VariationsaTıklanarakEklenenAtributesGörülebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
        Product product=new Product();
        US17_TC01VendorOlarakVariableProductEklenebilmeli();
        storeManager.productTitle.sendKeys("bilgisayar");
        storeManager.variations.click();   //????????

        Driver.closeDriver();

    }

    @Test
    public void US17_TC06EklenenAtributesaGöreUrünBilgileriSeilipUrünOzellikleriDoldurulabilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
        Product product=new Product();
        US17_TC01VendorOlarakVariableProductEklenebilmeli();
        storeManager.productTitle.sendKeys("bilgisayar");
        storeManager.variations.click(); //??????

        Driver.closeDriver();

    }
    @Test
    public void US17_TC07UrününEklendiğiniProductKısmındaGörebilmeli(){
        HomePage homePage=new HomePage();
        MyAccount myAccount=new MyAccount();
        StoreManager storeManager=new StoreManager();
        ChooseImage chooseImage=new ChooseImage();
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
