package mystore;

import Common.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mystore.pages.AssertNewAddressPage;
import mystore.pages.LoginPage;
import mystore.pages.NewAddressPage;
import mystore.sections.HeaderSection;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MystoreNewAddress {

    private WebDriver driver;

    @Given("user with mystore-testlab account with opened website")
    public void userWithMystoretestlabAccountWithOpenedWebsite() {
        driver = Utils.setUpDriver();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("user logs in with {string} as email and {string} as password")
    public void userLogsInWithEmailAndPassword(String email, String password) {
        HeaderSection headerSection = new HeaderSection(driver);
        headerSection.authentication();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs(email, password);
    }

    @And("user clicks Addresses button")
    public void userClicksAddressesButton() {
        driver.findElement(By.id("address-link")).click();
    }

    @When("user fills {string}, {string}, {string}, {string}, {string}, {string}")
    public void userFillsAddressData(String alias, String address, String zipCode, String city, String country, String phone) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.fillAndConfirmNewAddress(alias, address, zipCode, city, country, phone);
    }

    @And("user clicks Save button")
    public void userClicksSaveButton() {
        WebElement saveNewAddress = driver.findElement(By.xpath("//button[@class='btn btn-primary float-xs-right'][@type='submit']"));
        saveNewAddress.submit();
    }

    @Then("{string} is displayed")
    public void addressSuccessfullyAddedIsDisplayed(String message) {
        AssertNewAddressPage assertNewAddressPage = new AssertNewAddressPage(driver);
        Assertions.assertEquals(message, assertNewAddressPage.getAssertNewAddress());
    }

}
