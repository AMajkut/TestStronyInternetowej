package mystore.sections;

import okhttp3.internal.http2.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {

    private WebDriver driver;

    @FindBy(id = "_desktop_user_info")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    private WebElement signOutButton;

    public HeaderSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void authentication() {
        signInButton.click();
    }

    public void signOut() {
        signOutButton.click();
    }

}
