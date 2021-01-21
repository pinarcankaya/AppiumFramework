package appium.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackAndroit {

    public static final String USERNAME = "pinarangaya1";
    public static final String AUTOMATE_KEY = "xp7fctp2pgbbCqsysHJp";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    AndroidDriver<AndroidElement> driver;

    @Test
    public void BrowserTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("name", "pinarangaya1's First Test");
        caps.setCapability("app","bs://45bcef94925b6b9bc01da8ee787eabb4bf790f97"); //CMD'den aldigimin komutu buraya yapistirdik

        //Remote cihazin bilgilerini almak icin siteden alinan command
        //BrowserStack sitesinden arama yerine appium yazdik //run appium test test dedik // javayi sectik
        //Upload your app basliginin altindaki codu alip buraya yapistirdik
        //@ isaretinden sonraki bilgi etsy.apk dosyasinin absulute path'i yapistirdik
        //X'ten once bir bosluk F'ten once iki bosluk koyduk

      //**  curl -u "pinarangaya1:xp7fctp2pgbbCqsysHJp"  -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\pinar\IdeaProjects\appiumFramework\etsy.apk"


        //bu komutu CMD'ye yapistirdik //bilgisayarda curl-u yuklu olmali

        driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);
    } 
}
