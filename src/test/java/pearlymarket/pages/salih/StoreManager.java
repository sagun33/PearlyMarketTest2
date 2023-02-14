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

    @FindBy(id="featured_img_display")
    public WebElement chooseImg;

    @FindBy(id="pro_title")
    public WebElement productTitle;

    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributes;

    @FindBy(id="attributes_is_active_1")
    public WebElement colorRadioButton;
    @FindBy(id="attributes_is_active_2")
    public WebElement sizeRadioButton;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement colorBox;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement sizeBox;


    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_variations_head']")
    public WebElement  variations;

    @FindBy(xpath = "(//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[1]")
    public  WebElement colorAddNew;

    @FindBy(xpath = "(//*[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    public  WebElement sizeAddNew;

    @FindBy(xpath = "//*[@id='product_url']")
    public  WebElement urlBox;

    @FindBy(xpath = "//*[@id='regular_price']")
    public  WebElement regularPrice;

    @FindBy(xpath = "//*[@id='button_text']")
    public  WebElement buttonTextBox;

    @FindBy(xpath = "//*[@id='sale_price']")
    public  WebElement salePriceBox2;

    @FindBy(xpath = "//div[@id='mceu_20']")  // ????
    public WebElement shortDescription;


    @FindBy(xpath = "//div[@id='mceu_20']")  // ????
    public WebElement description;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[1]")
    public WebElement categories;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_brand '])[2]")
    public WebElement productBrands;

    @FindBy(xpath = "(//*[@class='wcfm_add_new_category_box wcfm_add_new_taxonomy_box'])[1]")
    public WebElement addNewCategory;

    @FindBy(xpath = "(//*[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[2]")
    public WebElement addNewProductsBrands;

    @FindBy(id="wcfm_new_cat")
    public WebElement categoryName;

    @FindBy(name="wcfm_new_parent_cat")
    public WebElement parentCategory;

    @FindBy(id="wcfm_new_product_brand")
    public WebElement productBrandsName;

    @FindBy(name="wcfm_new_parent_product_brand")
    public WebElement parentProductBrand;

    @FindBy(xpath = "//*[@data-taxonomy='product_cat']")
    public WebElement add1;

    @FindBy(xpath = "//*[@data-taxonomy='product_brand']")
    public WebElement add2;

    @FindBy(className="description wcfm_full_ele wcfm_side_tag_cloud wcfm_fetch_tag_cloud")
    public WebElement tagsYazi;
    @FindBy(xpath = "//*[@aria-label='#MERCEDES (2 items)']")
    public WebElement tags;










}
