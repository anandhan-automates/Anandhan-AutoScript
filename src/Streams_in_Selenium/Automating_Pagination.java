package Streams_in_Selenium;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_Pagination {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // Click on the first column header to sort the table
        driver.findElement(By.xpath("//tr/th[1]")).click();

        List<String> price; // Store the extracted price

        // Loop until "Dragon fruit" price is found
        do {
            // Get all product names from the first column
            List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

            // Filter "Dragon fruit" and get its price using a custom method
            price = elementsList.stream()
                    .filter(s -> s.getText().contains("Dragon fruit"))
                    .map(s -> getprice(s))
                    .collect(Collectors.toList());

            // Print the price if found
            price.forEach(s -> System.out.println("Dragon fruit price is: " + s));

            // If price is not found, click "Next" to go to the next page
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        } while (price.size() < 1); // Repeat until price is found

        // Close the browser
        driver.close();
        System.out.println("Script ran successfully without any errors");
    }

    // Method to extract the price of a product
    private static String getprice(WebElement s) {
        return s.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}
