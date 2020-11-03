import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByClass {
    public static void main(String[] args){

        String baseURL = "https:/wwww.facebook.com";
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Fredo Bang Bang");
        //driver.findElement(By.id("pass")).sendKeys("Testing123");
        //driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        //driver.findElement(By.xpath("//button[@value='1']")).click();

        driver.findElement(By.xpath("//a[@role='button']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ing123");


        driver.findElement(By.xpath("//select[@id='month']//option[@value='7']")).click();
        driver.findElement(By.xpath("//select[@id='day']//option[@value='29']")).click();
        driver.findElement(By.xpath("//select[@id='year']//option[@value='2000']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();



    }

}
