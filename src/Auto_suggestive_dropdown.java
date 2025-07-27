import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Auto_suggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       /*Obtain a generic value from the dropdown.
        Retrieve the list of WebElements from the browser.
        Iterate through the list to find the exact matching element.
        Click on the matching element.*/
       driver.findElement(By.id("autosuggest")).sendKeys("ind");//Obtain a generic value from the dropdown
       Thread.sleep(2000);
       List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));/* Retrieve the list of WebElements 
       from the browser.*/
       for(WebElement option : options )//Iterate through the list to find the exact matching element.
       {
    	   if(option.getText().equalsIgnoreCase("India"))
    	   {
    		   option.click();//Click on the matching element
    		   break;
    	   }
       }
       Thread.sleep(2000);
       driver.close();
       System.out.println("Script ran without any errors");
	}

}
