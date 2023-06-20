package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class BaseDrive {

    public static AppiumDriver driver = null;

    @BeforeSuite
    public static void setup() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.UDID, "emulator-5554");

        File appDir = new File("src/test/java/resources/apk");
        File app = new File(appDir, "prothom_alo.apk");
        capability.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        String serverUrl = "http://127.0.0.1:4723/wd/hub";
        URL url = new URI(serverUrl).toURL();

        driver = new AndroidDriver(url, capability);

    }

    @AfterSuite
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
