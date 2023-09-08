package Email.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class OpenBrowser
{
    public static RemoteWebDriver driver;
    @Parameters({"url"})
    @BeforeMethod
    public static void  Obrowser(String url)
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(url);
        driver.findElement(By.id("login-username")).sendKeys("mohammadsalikcse");
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.id("login-passwd")).sendKeys("Welcome2023!");
        driver.findElement(By.id("login-signin")).click();
    }
    @AfterMethod
    public static void CloseBrowser() throws InterruptedException {
        Thread.sleep(7000);
        driver.close();

    }
    @DataProvider(name="setdata")
    public String[][] setdata() throws IOException {

     return  ReadExcel.readData();
    }
}
