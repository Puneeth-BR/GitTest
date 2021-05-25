package UITesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Seleniumsuite1 {

    @Test
    public void SearchTestCase() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/puneethsmac/Desktop/Testing/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.youtube.com/");
        driver1.findElement(By.id("search")).sendKeys("pirimidal fintech");
        driver1.findElement(By.id("search-icon-legacy")).click();
        driver1.findElement(By.id("guide-icon")).click();
        //driver1.findElement(By.xpath("//div[@title='Home']")).click();
        //driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait1 = new WebDriverWait(driver1,20);
        Thread.sleep(999);
        driver1.quit();

    }

}
