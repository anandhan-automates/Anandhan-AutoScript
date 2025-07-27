package Latest_Feature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_webelement_screenshot {

    public static void main(String[] args) throws IOException {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        // Locate the "name" input field and store it in a variable
        WebElement ele = driver.findElement(By.name("name"));
        
        // Type "JavaWithSelenium" into the input field
        ele.sendKeys("JavaWithSelenium");
        
        // Capture a screenshot of the specific WebElement and store it in a File object
        File src = ele.getScreenshotAs(OutputType.FILE);
        
        // Save the screenshot to a specified file path on the local system
        FileUtils.copyFile(src, new File("C:\\Users\\anand\\logo.png"));
        
        // Print a success message
        System.out.println("Script ran successfully without any errors");

        // Close the browser session
        driver.close();
    }
}
