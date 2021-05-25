package UITesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumsuite2 {

    @Test
    public void Dropdown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/puneethsmac/Desktop/Testing/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ag-grid.com/example.php");
        String value = "Balham";
        Select dropdown = new Select(driver.findElement(By.id("grid-theme")));
        dropdown.selectByVisibleText(value);
        Thread.sleep(999);
        driver.quit();

    }

}
