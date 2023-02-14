package pearlymarket.test.salih;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pearlymarket.pages.salih.*;
import pearlymarket.utilities.ConfigReader;
import pearlymarket.utilities.Driver;
import pearlymarket.utilities.ReusableMethods;
import org.openqa.selenium.interactions.Actions;

public class US16_US14_US15 {


    @Test
    public void testSimpleProductDefaultOlarakGelmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton);
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        assert storeManager.simpleProduct.isDisplayed();

        Select select1 = new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");

        Driver.closeDriver();


    }

    @Test
    public void testVirtualAndDownloadableSeçilebilmeli() {

        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.virtualRadioButton.click();
        storeManager.downloadableRadioButton.click();
        Driver.closeDriver();

    }

    @Test
    public void testpriceBoxunaDegerlerGirilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.priceBox.sendKeys("10");
        Driver.closeDriver();

    }

    @Test
    public void testSalePriceBoxunaDegerlerGirilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.salePriceBox.sendKeys("100");
        Driver.closeDriver();
    }
/* US14
    1.Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı
    2. Ürün fotoğrafı eklenebilmeli
    3. Product Title, Short Description ve Description yazılabilmeli
    4.Categories seçilebilmeli
    5.Yeni Categories eklenebilmeli
    6.Product brands seçilebilmeli
    7.Yeni Product brands eklenebilmeli
    8.Tags eklenebilmeli
    9.Catalog visibility; Shop and search results, Shop only, Search results only, Hidden olarak seçilebilmeli

    US15
    1.Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced menüleri görülebilmeli
    2.Inventory işlemleri yapılabilmeli (SKU, Manage Stock, Stock status, Sold Individually)
    3.Shipping işlemleri yapılabilmeli (Weight, Dimensions, Shipping class, Processing Time)
    4.Attributes işlemleri yapılabilmeli (Color, Size)
    5.Linked işlemleri yapılabilmeli (Up-sells, Cross-sells)
    6.Seo işlemleri yapılabilmeli (Enter a focus keyword, Meta description)
    7.Toptan Ürün Gösterme Ayarları işlemleri yapılabilmeli (Piece Type, Units Per Piece, Min Order Quantity)
    8.Advanced işlemleri yapılabilmeli (Menu Order, Purchase Note)





 */


    @Test
    public void us14_SimpleProductVariableProductGroupeProductExternalAffiliatProductSeçenekleriOlmalı() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);

        Select select1 = new Select(storeManager.productType);
        select1.selectByVisibleText("Simple Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Variable Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("Grouped Product");
        ReusableMethods.waitFor(3);
        select1.selectByVisibleText("External/Affiliate Product");
        ReusableMethods.waitFor(3);
    }

    @Test
    public void us14_UrünFotoğrafıEklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        storeManager.chooseImg.click();
        ReusableMethods.waitFor(3);
        String dosyaYolu = System.getProperty("user.home") + "/Desktop/logo.jpeg";
        chooseImage.uploadFilesButton.click();
        chooseImage.selectFilesButton.click();
        ReusableMethods.waitFor(3);
        chooseImage.selectFilesButton.sendKeys(dosyaYolu);
        ReusableMethods.waitFor(6);
        chooseImage.selectButton.click();

        Driver.closeDriver();



    }

    @Test
    public void us14_ProductTitleShortDescriptionVeDescriptionYazılabilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        storeManager.productTitle.sendKeys("salih");

        Driver.getDriver().switchTo().frame(storeManager.shortDescription);//????
        storeManager.shortDescription.sendKeys("hshshshs"); //????
    }

    @Test
    public void US14_CategoriesSeçilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.categories.click();

    }

    @Test
    public void us14YeniCategoriesEklenebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.addNewCategory.click();
        ReusableMethods.waitFor(3);
        storeManager.categoryName.sendKeys("gunay");
        ReusableMethods.waitFor(3);
        Select select=new Select(storeManager.parentCategory);
        ReusableMethods.waitFor(3);
        select.selectByVisibleText("Besin Takviyeleri");
        ReusableMethods.waitFor(3);
        storeManager.add1.click();
        Driver.closeDriver();


    }

    @Test
    public void us14_ProductBrandsSeçilebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.productBrands.click();
    }

    @Test
    public void us14_YeniProductBrandsEklenebilmeli () {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.addNewProductsBrands.click();
        ReusableMethods.waitFor(3);

        storeManager.productBrandsName.sendKeys("lkjöoj");
        Select select=new Select(storeManager.parentProductBrand);
        select.selectByVisibleText("Elegant Auto Group");
        ReusableMethods.waitFor(3);
        storeManager.add2.click();

    }

    @Test
    public void us14_TagsEklenebilmeli () {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager.productButton).perform();
        ReusableMethods.waitFor(3);
        storeManager.addNew1.click();
        ReusableMethods.waitFor(3);
        storeManager.tags.click();
        ReusableMethods.waitFor(3);
        storeManager.tagsYazi.click();
    }

    @Test
    public void urunEklendigiProductKismindaGorulebilmeli() {
        HomePage homePage = new HomePage();
        MyAccount myAccount = new MyAccount();
        StoreManager storeManager = new StoreManager();
        ChooseImage chooseImage = new ChooseImage();
        Product product = new Product();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage.signInButton.click();
        myAccount.userName.sendKeys("salihgunay");
        myAccount.password.sendKeys("Salihguenay5390.");
        myAccount.signInButton2.click();
        homePage.signOut.click();
        myAccount.storeManagerButton.click();
        storeManager.productButton.click();
        assert product.urunKontrolAraba.isDisplayed();
        Driver.closeDriver();

    }

}

