package mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='alias']")
    private WebElement aliasInput;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement addressInput;

    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneInput;

    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void fillAndConfirmNewAddress(String alias, String address, String zipCode, String city, String country, String phone) {

        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        zipCodeInput.sendKeys(zipCode);
        cityInput.sendKeys(city);
        Select countryInput = new Select(driver.findElement( By.name("id_country")));
        countryInput.selectByVisibleText(country);
        phoneInput.sendKeys(phone);
    }
}
