package appium.tests;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest {

    @Test
    public void ChromeTest() throws MalformedURLException {

        DesiredCapabilities desCaps = new DesiredCapabilities();

        desCaps.setCapability("platformName","Android");
        desCaps.setCapability("platformVersion","7.0");
        desCaps.setCapability("deviceName","Pixel_2");
        desCaps.setCapability("automationName","UiAutomator2");
        desCaps.setCapability("browserName","chrome");

         WebDriverManager.chromedriver().version("2.23").setup();
         desCaps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, WebDriverManager.chromedriver().getBinaryPath());

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), desCaps);

        driver.get("https://www.amazon.com/");

        WebElement searchBox=driver.findElement(By.id("nav-search-keywords"));
        searchBox.sendKeys("mouse" + Keys.ENTER);

    }
}
