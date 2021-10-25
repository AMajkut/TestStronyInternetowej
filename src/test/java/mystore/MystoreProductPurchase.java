package mystore;

import Common.Screenshot;
import Common.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mystore.pages.LoginPage;
import mystore.pages.ProductPage;
import mystore.sections.HeaderSection;
import org.openqa.selenium.WebDriver;

public class MystoreProductPurchase {

    private WebDriver driver;

    @Given("user with opened website with mystore-testlab account")
    public void userWithOpenedWebsiteWithMystoreTestlabAccount() {
        driver = Utils.setUpChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("user logs in with {string} and {string}")
    public void userLogsIn(String email, String password) {
        HeaderSection headerSection = new HeaderSection(driver);
        headerSection.authentication();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs(email, password);
    }

    @And("user writes {string} on search bar")
    public void userWritesProductNameOnSearchBar(String productName) {
        ProductPage productPage = new ProductPage(driver);
        productPage.searchProduct(productName);
    }

    @When("user picks {string} product")
    public void userPicksProduct(String productName) {
        ProductPage productPage = new ProductPage(driver);
        productPage.choiceProduct(productName);
    }

    @When("user chooses {string}")
    public void userChoosesSize(String size) {
        ProductPage productPage = new ProductPage(driver);
        productPage.choiceSize(size);
    }

    @When("user chooses {string} pices of product")
    public void userChoosesQuantityPicesOfProduct(String quantity) {
        ProductPage productPage = new ProductPage(driver);
        productPage.choiceQuantity(quantity);
    }

//    @And("user checks if product price is reduced by 20%")
//    public void userChecksIfProductIsReduced() {
//
//    }

    @And("user clicks Add to cart button")
    public void userClicksAddToCartButton() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }

    @And("user clicks Proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {
        ProductPage productPage = new ProductPage(driver);
        productPage.proceedToCheckout();
    }

    @And("user clicks Proceed to checkout button again")
    public void userClicksProceedToCheckoutButtonAgain() {
        ProductPage productPage = new ProductPage(driver);
        productPage.proceedToCheckoutButtonShoppingCart();
    }

    @When("user confirms the address")
    public void userConfirmsAddress() {
        ProductPage productPage = new ProductPage(driver);
        productPage.confirmAddress();
        productPage.goToShipingMethod();
    }

    @And("user chooses Shiping method as pick up in store")
    public void userChoosesShipingMethod() {
        ProductPage productPage = new ProductPage(driver);
        productPage.choiceDelivery();
        productPage.confirmShipingMethod();
    }

    @And("user chooses Payment as Pay by Check")
    public void userChoosesPayment() {
        ProductPage productPage = new ProductPage(driver);
        productPage.choicePayment();
    }

    @When("user clicks on therms of service checkbox")
    public void userClicksOnThermsOfServiceCheckbox() {
        ProductPage productPage = new ProductPage(driver);
        productPage.agreeToThermsOfService();
    }

    @And("user clicks Order with an obligation to pay button")
    public void userClicksOrderWithAndOligationToPayButton() {
        ProductPage productPage = new ProductPage(driver);
        productPage.obligationToPay();
    }

    @Then("user take a screenshot")
    public void userTakeScreenshot() {
        Screenshot screenshot = new Screenshot();
        screenshot.captureScreenshot(driver);
    }
}
