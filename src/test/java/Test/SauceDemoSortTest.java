package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoSortTest {

    public static void main(String[] args) {

     
        WebDriver driver = new ChromeDriver();

        try {
            // Open SauceDemo login page
            driver.get("https://www.saucedemo.com/v1/inventory.html");
            driver.manage().window().maximize();



            // Wait for the inventory page to load
            Thread.sleep(2000);

            // Locate the dropdown
            WebElement dropdown = driver.findElement(By.className("product_sort_container"));

            // Create Select object
            Select select = new Select(dropdown);

            // Select "Price (low to high)"
            select.selectByVisibleText("Price (low to high)");

            // Wait to observe sorting
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}
