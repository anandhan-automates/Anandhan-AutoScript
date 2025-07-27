package Practice;

import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class No_of_links_in_footer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Minimize the scope of WebDriver to focus only on the footer section,
		// by locating the footer using its unique ID "gf-BIG".
        WebElement footer_Driver=driver.findElement(By.id("gf-BIG"));
        int size=footer_Driver.findElements(By.tagName("a")).size();
        System.out.println("The No.of.Links present in the footer page:"+size);
        // First column footer links count
        WebElement footer_col1_driver=footer_Driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println("First col footer driver name:"+footer_col1_driver.findElements(By.tagName("a")).size());
        
        // Second column footer links count
        WebElement footer_col2_driver =footer_Driver.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
        System.out.println("Second col footer driver name:"+footer_col2_driver.findElements(By.tagName("a")).size());
        //driver.close();
        
        //Actions a = new Actions(driver); using actions class
        String move=Keys.chord(Keys.CONTROL,Keys.ENTER); // using without actions keys.chord
        //Want to click each link in first column
        for(int i=1;i<footer_col1_driver.findElements(By.tagName("a")).size();i++)
        {
        	WebElement c = footer_col1_driver.findElements(By.tagName("a")).get(i);
        	//a.moveToElement(c).keyDown(Keys.CONTROL).click().build().perform();--->Using action class
        	c.sendKeys(move); //
        }
        
        
        //Get title all opened links
        Set<String> handle=driver.getWindowHandles();
        Iterator<String> it =handle.iterator();
        int i=0;
        while(it.hasNext())//iterating untill tag is present
        {
        	
        	i++;
        	String title = driver.switchTo().window(it.next()).getTitle();
        	System.out.println("Title"+i+":"+title);
        }
        System.out.println("Script ran succesfully without any errors");
        driver.quit();
		
	}

}
