package Streams_in_Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customized_method_build {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();
        
        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        // Click on the first column header to sort the table items
        driver.findElement(By.xpath("//tr/th[1]")).click();
        
        // Retrieve all WebElements from the first column and store them in a list
        List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));

        // Requirement: Fetch the price of "Beans"
        // Use `filter()` to select rows containing "Beans"
        // Use `map()` to extract the price by calling the custom method `getPrice()`
        List<String> priceList = elementsList.stream()
                .filter(s -> s.getText().contains("Beans"))
                .map(s -> getPrice(s))
                .collect(Collectors.toList());

        // Print all retrieved prices for "Beans"
        priceList.forEach(s->System.out.println("Price of Beans is:"+s));
    }

    private static String getPrice(WebElement s) {
        // Fetch the price of the corresponding item using following-sibling XPath
        // XPath to locate price: `//tr/td[1]/following-sibling::td[1]`
        String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return price;
    }
}
