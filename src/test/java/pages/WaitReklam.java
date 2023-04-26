package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitReklam {

    static WebDriver driver;
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        driver.findElement(By.xpath("")).click();
                        break;
                    }catch (Exception e){

                    }
                }

            }
        };

        Thread t = new Thread(r);
        t.start();

    }
}
