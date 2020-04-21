package SWD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWD {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/maroufhossain/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.macys.com";
        driver.get(baseURL);


    }

}