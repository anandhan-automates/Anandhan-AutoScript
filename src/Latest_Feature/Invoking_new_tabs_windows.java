package Latest_Feature;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoking_new_tabs_windows {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Switch to a new tab in the same browser window
        driver.switchTo().newWindow(WindowType.TAB); // For a new window, use WindowType.Window

        // Retrieve parent and child window handles using getWindowHandles()
        Set<String> id = driver.getWindowHandles();
        Iterator<String> it = id.iterator();

        // Store parent and child window IDs
        String parentId = it.next();
        String childId = it.next();

        // Switch driver control to the child tab
        driver.switchTo().window(childId);

        // Open another webpage in the new tab
        driver.get("https://rahulshettyacademy.com/");

        // Find and extract text from the second course link
        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p'"))
                .get(1).getText();

        // Switch driver control back to the parent tab
        driver.switchTo().window(parentId);

        // Populate the name field with the extracted course name
        driver.findElement(By.name("name")).sendKeys(courseName);

        // Quit the browser session
        driver.quit();
    }
}
