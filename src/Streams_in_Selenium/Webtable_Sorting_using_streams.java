package Streams_in_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Webtable_Sorting_using_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		  // Clicking on the first column header to sort the table items
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//take all webelements values from web put it in list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tbody/tr/td[1]//tbody/tr/td[1]"));
		
		//Retrieve text from list of webelements store in the list
		List<String> originalList =elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort original list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original vs sorted List
		Assert.assertEquals(originalList, sortedList);
		
		System.out.println("Script ran succesfully without any errors");
		
		driver.close();
		

	}

}
