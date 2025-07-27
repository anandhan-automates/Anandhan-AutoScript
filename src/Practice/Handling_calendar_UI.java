package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_calendar_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String month = "7";
		String day = "8";
		String year = "2001";
		String[] expectedlist = {month,day,year};
		driver.findElement(By.className("react-date-picker__calendar-button")).click();
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.className("react-calendar__navigation__label")).click();
		}
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
		}
	    driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
	    driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__year-view__months__month'])["+month+"]")).click();
        driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
        List<WebElement> acutallist =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        
        for(int i=0;i<acutallist.size();i++)
        {
        	System.out.println(acutallist.get(i).getAttribute("value"));
        	Assert.assertEquals(acutallist.get(i).getAttribute("value"), expectedlist[i]);
        }

		System.out.println("Script ran succesfully without any errors");

	}

}
