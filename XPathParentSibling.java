import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPathParentSibling {
    public static void main(String[] args){

    String baseURL ="https://letskodeit.teachable.com/p/practice";

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//table[@id='product']//td[contains(text(),30)]")).click();


    }

}
