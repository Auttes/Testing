package Email.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends OpenBrowser   {
   // public  static RemoteWebDriver driver;
    
    @Test
    public static void method( ){

        driver.findElement(By.id("ybar-navigation-item-mail")).click();
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        driver.findElement(By.id("message-to-field")).sendKeys("ajmalkhan@gmail.com");
        driver.findElement(By.xpath("//button[@title='Insert animated GIFs']")).click();
        driver.findElement(By.xpath("//img[@class='I_ZpQYvz']")).click();
        driver.findElement(By.xpath("//span[text()='Send']")).click();
        driver.findElement(By.xpath("//button[text()='Send']")).click();





    }
}
 /*  driver.findElement(By.id("createacc")).click();
        driver.findElement(By.id("usernamereg-firstName")).sendKeys("mohammed");
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("salik");
        driver.findElement(By.id("usernamereg-userId")).sendKeys("mohammadsalikcse");
        driver.findElement(By.id("usernamereg-show-button")).click();
        driver.findElement(By.id("usernamereg-password")).sendKeys("Welcome2023!");
        driver.findElement(By.id("usernamereg-show-button")).click();
        Select se = new Select(driver.findElement(By.id("usernamereg-month")));
        se.selectByValue("11");
        //driver.findElement(By.xpath("//option[text()='November']")).click();
       driver.findElement(By.id("usernamereg-day")).sendKeys("25");
       driver.findElement(By.id("usernamereg-year")).sendKeys("2001");
      //  driver.findElement(By.xpath("//button[text()='Continue']")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        driver.findElement(By.id("usernamereg-phone")).sendKeys("9384118014");
        driver.findElement(By.id("reg-submit-button")).click();
        driver.findElement(By.id("recaptcha-checkbox-checkmark")).click();
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        //        driver.findElement(By.xpath("//button[@title='Attach files']")).click();
//     //  driver.findElement(By.xpath("(//span[contains(text(),'Attach files from')])[2]")).click();
//        driver.findElement(By.xpath("(//span[contains(text(),'Attach files from')])[2]")). sendKeys("C:\\Users\\MY-PC\\java_error_in_idea64_8944.log");*/

