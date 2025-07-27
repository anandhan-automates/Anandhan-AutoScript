package Latest_Feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class Relative_locators_below_left_right {

    public static void main(String[] args) {
        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        // Open the target webpage
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        // Locate the input field below the DOB label -- below
        WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        System.out.println(driver.findElement(with(By.tagName("input")).below(dob)).getAttribute("value"));
        
        // Select the checkbox to the left of the "Check me out if you Love IceCreams!" label -- left
        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCream)).click();
        
        // Get the text on the right side of the first radio button -- right
        WebElement radioBtn = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBtn)).getText());
    }
}
