package Email.java;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DelectMessage extends OpenBrowser
{
    public DelectMessage(RemoteWebDriver driver)
    {
        OpenBrowser.driver =driver;
    }

    @Test
    public static void DelectMess()
    {
        driver.findElement(By.id("ybar-navigation-item-mail")).click();
        driver.findElement(By.xpath("//span[text()='Sent']")).click();
       driver.findElement(By.xpath("//span[@class='D_F']")).click();
        //(//span[@class='D_F ab_C gl_C W_6D6F'])[4]
//        Select se = new Select( driver.findElement(By.xpath("(//span[@class='D_F ab_C gl_C W_6D6F'])[6]")));
//        se.selectByVisibleText("All");
//       driver.findElement(By.xpath("(//span[text()='Delete'])")).click();

    }
}
