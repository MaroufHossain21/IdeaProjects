package SeleniumWDT;


import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestingChromeWD {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/maroufhossain/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.Facebook.com";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("this_is_just_a_test@icloud.com");
        driver.findElement(By.id("pass")).sendKeys("sfsdfskjss");
        driver.findElement(By.id("loginbutton")).click();



    }
}
