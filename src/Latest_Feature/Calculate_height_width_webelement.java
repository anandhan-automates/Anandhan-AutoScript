package Latest_Feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculate_height_width_webelement {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        // Locate the "name" input field by its "name" attribute and store it in a variable
        WebElement ele = driver.findElement(By.name("name"));
        
        // Get the height of the input field using the getRect() method
        int height = ele.getRect().getDimension().getHeight();
        
        // Get the width of the input field using the getRect() method
        int width = ele.getRect().getDimension().getWidth();
        
        // Print the height and width of the WebElement
        System.out.println("Height is: " + height + " Width is: " + width);
        System.out.println(ele.getRect().getWidth());
        
        // Close the browser
        driver.close();
    }
}
