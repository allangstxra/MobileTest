package core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDRIVER() {
        return driver;
    }

    public static void createDriver() {
        File app = new File("src/main/resources/", "example.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "br.com.correios.calculaprecoprazo");
        desiredCapabilities.setCapability("appActivity", "br.com.correios.calculaprecoprazo.activity.SplashScreenActivity");
        desiredCapabilities.setCapability("app", app.getAbsolutePath());
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
