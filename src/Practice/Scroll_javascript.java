package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll_javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;// javascript executor is used to automate scroll action
        js.executeScript("window.scrollBy(0,500)"); // Used to scroll to down using coordinates
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//scrolling particular table
        
        //Adding all values in the table
       int total =0;
       List<WebElement> values= driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
       /*//div[@class='tableFixHead'] //td[4] ---> fourth column under tableFixHead class*/
       for(int i=0;i<values.size();i++)
       {
    	   total = total + Integer.parseInt(values.get(i).getText());
       }
       System.out.println(total);
       
       //compare actual value and expected using assertion expected value will take from total amount collected in the web
       
       int expected =Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
       System.out.println(expected);
       Assert.assertEquals(expected, total);
       System.out.println("Script ran succesfully without any errors");
       driver.close();
	}

}
