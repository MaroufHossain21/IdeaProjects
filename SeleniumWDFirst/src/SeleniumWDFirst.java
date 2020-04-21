import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWDFirst{
    public static void main(String[] args){
        // System.setProperty("webdriver.chrome.driver","/Users/maroufhossain/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.bloomingdales.com";
        driver.get(baseURL);


    }

}