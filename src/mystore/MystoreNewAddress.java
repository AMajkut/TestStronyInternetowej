package mystore;

import Common.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MystoreNewAddress {

    private WebDriver driver;

    @Given("user with mystore-testlab account with opened website")
    public void userWithMystoretestlabAccountWithOpenedWebsite() {
        driver = Utils.setUpDriver();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("user logs in with {string} as email and {string} as password")
    public void userLogsInWithEmailAndPassword(String email, String password) {

    }

    @And("user clicks Addresses button")
    public void userClicksAddressesButton() {

    }

    @When("user fills {string}, {string}, {string}, {string}, {string}, {string}")
    public void userFillsAddressData(String alias, String address, String zipCode, String city, String country, String phone) {

    }

    @And("user clicks Save button")
    public void userClicksSaveButton() {

    }

    @Then("new address {string} appears on Your addresses page")
    public void newAddressAliasAppearsOnYourAddressesPage(String alias) {
//        WebElement addedAddress = driver.findElement(By.xpath("//*[text()='" + address + "']/../.."));
//        addedAddress.findElement(By.xpath("//*[@data-id=\"addresses_confirm\"]")).click();
    }

    @And("{string} is displayed")
    public void addressSuccessfullyAddedIsDisplayed(String message) {

    }

}



































