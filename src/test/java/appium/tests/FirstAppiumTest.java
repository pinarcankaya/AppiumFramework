package appium.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {

        @Test
        public void test1() throws MalformedURLException, InterruptedException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            desiredCapabilities.setCapability("platformName","Android");
            desiredCapabilities.setCapability("platformVersion","7.0");
            desiredCapabilities.setCapability("deviceName","Pixel_2");
            desiredCapabilities.setCapability("automationName","UiAutomator2");
            desiredCapabilities.setCapability("app", "C:\\Users\\pinar\\IdeaProjects\\appiumFramework\\etsy.apk");
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,"com.etsy.android.ui.FragmentHolderSingleActivity");
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);



            WebElement getStarted = driver.findElementById("com.etsy.android:id/btn_link");
            getStarted.click();

            Thread.sleep(10000);
        }

}
