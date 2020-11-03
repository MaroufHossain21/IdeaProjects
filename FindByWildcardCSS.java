import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByWildcardCSS {
    public static void main(String[] args){

        String baseURL = "http://letskodeit.teachable.com/p/practice";
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.cssSelector("input[class$='inputs']")).sendKeys("Y not");
        driver.findElement(By.cssSelector("input[class$='displayed-class']")).sendKeys("Kross Kolors");
        //driver.findElement(By.id("hide-textbox")).click();
        driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
        driver.findElement(By.cssSelector("input[value*='A']")).click();


    }

}
