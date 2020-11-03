import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class YouTubeIDXPathCSS {
    public static void main(String[] args){

        String baseURL ="https://www.youtube.com/";
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Hindi Songs");
        driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();



    }
}
