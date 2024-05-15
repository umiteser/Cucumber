package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD_old {

    public static WebDriver driver;
    //Her bir sürecin kendine özel static driverı olmalı.: Local static diyeceğiz.
    //paralel çalışan her bir browser demek süreç.
    //süreç=thread
    //thread.sleep= ilgili süreci durduruyor bir süre.
    //her bir thread in kendine özel statiği olmalı yani LOCAL static.

    public static WebDriver getDriver(){

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language","EN");

        if(driver==null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        }
            return driver;
    }
    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // driver kapat
        if (driver!=null){
            driver.quit();
            driver=null;
        }

    }
}
