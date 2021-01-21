package appium.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealCihazTest {



    @Test
    public void calculatorTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "Redmi");
        desiredCapabilities.setCapability("udid","c3942a257d28");

        desiredCapabilities.setCapability("appPackage", "com.miui.calculator"); //telefon acik olmali
        desiredCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        WebElement digit7 = driver.findElement(By.id("digit_7"));
        WebElement multiple = driver.findElement(By.id("op_mul"));
        WebElement digit4 = driver.findElement(By.id("digit_4"));
        WebElement equals = driver.findElement(By.id("eq"));
        WebElement result = driver.findElement(By.id("formula"));

        digit7.click();
        multiple.click();
        digit4.click();
        equals.click();
        System.out.println(result.getText());
    }
}
