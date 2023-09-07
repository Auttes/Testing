package Email.java;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Login {
    public static void main(String[] args)  {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://login.yahoo.com/");
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
        System.out.println(title);*/

        driver.findElement(By.id("login-username")).sendKeys("mohammadsalikcse");
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.id("login-passwd")).sendKeys("Welcome2023!");
        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.id("ybar-navigation-item-mail")).click();
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        driver.findElement(By.id("message-to-field")).sendKeys("ajmalkhan@gmail.com");
//        driver.findElement(By.xpath("//button[@title='Attach files']")).click();
//     //  driver.findElement(By.xpath("(//span[contains(text(),'Attach files from')])[2]")).click();
//        driver.findElement(By.xpath("(//span[contains(text(),'Attach files from')])[2]")). sendKeys("C:\\Users\\MY-PC\\java_error_in_idea64_8944.log");
        driver.findElement(By.xpath("//button[@title='Insert animated GIFs']")).click();
        driver.findElement(By.xpath("//img[@class='I_ZpQYvz']")).click();

      driver.findElement(By.xpath("//span[text()='Send']")).click();
      driver.findElement(By.xpath("//button[text()='Send']")).click();




    }
}
