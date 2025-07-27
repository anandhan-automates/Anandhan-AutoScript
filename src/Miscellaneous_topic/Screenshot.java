package Miscellaneous_topic;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

    public static void main(String[] args) throws IOException {
        // Initialize the Chrome WebDriver to launch a browser instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google homepage
        driver.get("https://google.com");

        // Capture a screenshot of the current webpage
        // The WebDriver instance is cast to TakesScreenshot to enable screenshot functionality
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot in the local system
        /*FileUtils.copyFile(src, new File("c://screenshot.png"));--> Access denied error due to can't place in 
        C directory without admin privileges*/
        FileUtils.copyFile(src, new File("C:\\Users\\anand\\screenshot.png"));

        // Close the browser after execution
        driver.close();
    }
}
