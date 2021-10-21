package mystore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/mystore-testlab-add-address.feature",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class MystoreNewAddressTest {
}
