package mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertNewAddressPage {

    private WebDriver driver;

    @FindBy(xpath = "//article[@class='alert alert-success']")
    private WebElement successAlertText;

    public AssertNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getAssertNewAddress() {

        return successAlertText.getText();
    }
}
