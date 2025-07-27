package Streams_in_Selenium;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter_Webtable {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();
        
        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        // Enter "Rice" in the search field to filter table data
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        
        // Get the list of all visible table elements after filtering
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        
        // Use Streams to filter only rows that contain "Rice"
        List<WebElement> sortedList = veggies.stream()
                .filter(s -> s.getText().contains("Rice"))
                .collect(Collectors.toList());
        
        // Assert that the filtered list matches the displayed elements
        Assert.assertEquals(veggies, sortedList);
        
        // Print the size of both lists for verification
        System.out.println(veggies.size() + "----" + sortedList.size());
        
        // Close the browser session
        driver.close();
        
        // Print success message
        System.out.println("Script ran successfully without any errors");
    }
}
