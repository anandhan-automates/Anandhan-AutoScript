package Latest_Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative_locators_above {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        // Locate the input box using its "name" attribute
        WebElement nameEditBox = driver.findElement(By.name("name"));
        
        // Locate the label above the input box using Relative Locator
        String name = driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
        
        // Print the label's text to the console
        System.out.println("Label name: " + name);
        
        // Close the browser session
        driver.close();
    }
}
