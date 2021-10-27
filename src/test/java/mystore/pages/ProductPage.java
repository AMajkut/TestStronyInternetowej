package mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@class='ui-autocomplete-input'][@type='text']")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@class='product-miniature js-product-miniature']")
    private WebElement product;

    @FindBy(xpath = "//*[@id='group_1']")
    private WebElement productSize;

    @FindBy(xpath = "//*[@id='quantity_wanted']")
    private WebElement productQuantity;

    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='cart-content-btn']/a[@class='btn btn-primary']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    private WebElement proceedToCheckoutButtonShoppingCartButton;

    @FindBy(xpath = "//*[@name='id_address_delivery']")
    private WebElement addressRadioButton;

    @FindBy(xpath = "//*[@name='confirm-addresses']")
    private WebElement confirmAddressButton;

    @FindBy(xpath = "//input[@id='delivery_option_1']")
    private WebElement pickUpInStoreButton;

    @FindBy(xpath = "//button[@class='continue btn btn-primary float-xs-right'][@name='confirmDeliveryOption']")
    private WebElement confirmShippingMethodButton;

    @FindBy(id = "payment-option-1")
    private WebElement payByCheckButton;

    @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
    private WebElement thermsOfServiceCheckbox;

    @FindBy(xpath = "//button[@class='btn btn-primary center-block']")
    private WebElement obligationToPayButton;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void searchProduct(String productName) {
        searchBar.click();
        searchBar.clear();
        searchBar.sendKeys(productName);
        searchBar.submit();
    }

    public void choiceProduct(String productName) {
        product.click();
    }

    public void choiceSize(String size) {
        Select dropDownSize = new Select(productSize);
        switch (size) {
            case "S":
                dropDownSize.selectByValue("1");
                break;
            case "M":
                dropDownSize.selectByValue("2");
                break;
            case "L":
                dropDownSize.selectByValue("3");
                break;
            case "XL":
                dropDownSize.selectByValue("4");
                break;
            default:
                System.out.println("Incorrect size");
                break;
        }
    }

    public void choiceQuantity(String quantity) throws InterruptedException {
        Thread.sleep(2000);
        productQuantity.clear();
        productQuantity.sendKeys("5");
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void proceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    public void proceedToCheckoutButtonShoppingCart() {
        proceedToCheckoutButtonShoppingCartButton.click();
    }

    public void confirmAddress() {
        if(!addressRadioButton.isSelected()) {
            addressRadioButton.click();
        }
    }

    public void goToShipingMethod() {
        confirmAddressButton.click();
    }

    public void choiceDelivery() {
        if(!pickUpInStoreButton.isSelected()) {
            pickUpInStoreButton.click();
        }
    }

    public void confirmShipingMethod() {
        confirmShippingMethodButton.click();
    }

    public void choicePayment() {
        if(!payByCheckButton.isSelected()) {
            payByCheckButton.click();
        }
    }

    public void agreeToThermsOfService() {
        if(!thermsOfServiceCheckbox.isSelected()) {
            thermsOfServiceCheckbox.click();
        }
    }

    public void obligationToPay() {
        obligationToPayButton.click();
    }

}
