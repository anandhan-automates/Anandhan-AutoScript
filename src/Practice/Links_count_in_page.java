package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_count_in_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Use findElements() to locate all anchor tags (<a>) on the webpage using an XPath expression.
		// Store the list of WebElements in the variable 'count'.
		List<WebElement> count =driver.findElements(By.xpath("//a"));
		System.out.println(count.size());
		// Alternative way: Use the tagName locator to find and count all <a> tags on the page.
		// Print the size of the list directly for validation.
		System.out.println("Using Tag Name:"+driver.findElements(By.tagName("a")).size());
		driver.close();
		System.out.println("Script ran succesfully without any erros");
		
	}

}
