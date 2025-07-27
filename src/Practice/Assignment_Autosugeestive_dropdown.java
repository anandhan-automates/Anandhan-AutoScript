package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Autosugeestive_dropdown {

    public static void main(String[] args) throws InterruptedException {
        // Initialize the Chrome WebDriver to open a browser instance
        WebDriver driver = new ChromeDriver();

        // Set an implicit wait to allow elements to load before interaction
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Navigate to the specified URL containing the autosuggestive dropdown
        driver.get("http://qaclickacademy.com/practice.php");

        // Type the first three characters ("ind") in the autosuggestive dropdown input field
        driver.findElement(By.id("autocomplete")).sendKeys("ind");

        // Pause execution for 2 seconds to allow the dropdown suggestions to load
        Thread.sleep(2000);

        // Press the down arrow key twice to navigate through the suggestions
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        // Press the Enter key to select the currently highlighted suggestion
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

        // Retrieve the selected value from the input field using the "value" attribute
        String value = driver.findElement(By.id("autocomplete")).getAttribute("value");

        // Print the selected value to the console for verification
        System.out.println(value);

        // Optionally close the browser window after the operation
        driver.close();

        // Print a success message indicating that the script executed correctly
        System.out.println("Script ran successfully without any errors");
    }
}
