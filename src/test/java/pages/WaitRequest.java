package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Drivers.Driver;

import java.time.Duration;

public class WaitRequest {

    WebDriver driver;

    @Test
    public void test1() {
       driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600), Duration.ofSeconds(30));
        wait.until(d->{
            try {
                driver.navigate().refresh();
                driver.findElement(By.xpath("//a[.='Logout']"));
                return true;
            }catch (Exception e){
                return false;
            }
        });
    }

}
