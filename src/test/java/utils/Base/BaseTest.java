package utils.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Drivers.Browsers;
import utils.Drivers.Driver;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BaseTest() {
        driver = Driver.getDriver(Browsers.CHROME);
        driver.manage().window().maximize();
        wait = Driver.getWait();
    }

    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeys(By locator, CharSequence... text){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(text);
    }

    public void selectByVisibleText(By locator, String text){
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);

    }
}
