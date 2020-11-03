import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BikeTest extends TestCase {
    WebDriver driver;
    String baseURL;



    public void setUp() throws Exception {
        //super.setUp();
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public void testMain() {
        driver.get(baseURL);
        driver.findElement(By.xpath("//div[@id=\"navbar\"]//a[@href='/sign_in']")).click();
        System.out.println("Click on login");
        driver.findElement(By.id("user_email")).sendKeys("Testing123@test.com");
        System.out.println("Sending keys to username field");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("Testing123");
        driver.findElement(By.id("user_email")).clear();
        System.out.println("Clearing Username field");
    }

    public void tearDown() throws Exception {
        //driver.quit();
    }







    }
