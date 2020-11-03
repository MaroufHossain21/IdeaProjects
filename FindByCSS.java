import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByCSS {
    public static void main(String[] args){

        String baseURL = "http://letskodeit.teachable.com/p/practice";
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.cssSelector("input[id='bmwradio']")).click();
        driver.findElement(By.xpath("//select[@id='carselect']//option[@value='benz']")).click();
        driver.findElement(By.xpath("//option[@value='orange']")).click();
        //driver.findElement(By.cssSelector("#benzcheck")).click();
        driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
        driver.findElement(By.cssSelector("input[class=inputs]")).sendKeys("Got This");
        driver.findElement(By.cssSelector("input[class='inputs displayed-class']")).sendKeys("yea");
        driver.findElement(By.id("opentab")).click();



    }

}
