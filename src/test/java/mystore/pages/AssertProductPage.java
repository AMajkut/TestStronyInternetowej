package mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertProductPage {

    private WebDriver driver;

    /* regularna cena produktu */
    @FindBy(xpath = "//span[@class='regular-price']")
    private WebElement productRegularPrice;

    /* cena produktu po obnizce */
    @FindBy(xpath = "//span[@itemprop='price']")
    private WebElement productDiscountPrice;

    /* napis 'SAVE 20%' */
    @FindBy(xpath = "//*[@class='discount discount-percentage']")
    private WebElement productDiscount;

    public AssertProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean isProductPriceReduced() {

        double regularPrice = Double.parseDouble(productRegularPrice.getText().substring(1));
        double discountPrice = Double.parseDouble(productDiscountPrice.getText().substring(1));

        double discount = regularPrice * 0.20;
        double salePrice = regularPrice - discount;
        if (discountPrice == salePrice) {
            System.out.println("Product is 20% discount.");
            return true;
        } else {
            System.out.println("Product is not 20% discount.");
            return false;
        }
    }

}
