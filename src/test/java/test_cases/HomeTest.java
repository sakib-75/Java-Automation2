package test_cases;

import driver.BaseDrive;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Properties;

import static utils.PropertiesDataParser.loadProperties;

public class HomeTest extends BaseDrive {

    @Test
    public void tc1() {
        Properties properties = loadProperties("config.properties");
        String url = properties.getProperty("base-url");

        driver.get(url);

    }


}
