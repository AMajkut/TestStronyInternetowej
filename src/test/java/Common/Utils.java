package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utils {

    public static WebDriver setUpDriver() {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public static String generateEmail() {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        return "test" + randomNumber + "mail.com";
    }

}
