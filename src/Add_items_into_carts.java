import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_items_into_carts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] values = {"Cucumber","Brocolli"};
		
		//Unable to click the 'Add to Cart' button directly because it matches 30 elements.
		//Retrieve all 30 elements into a list and iterate through it until the specified value is reached.
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//Iterate until the specified value, i.e., cucumber, is reached.
		selectitems(values,products,driver);
		System.out.println("Script ran succesfully without any errors");
		driver.close();

	}
	/* 
	1. Creating a new method to add the given strings to the cart array.
	2. Passing three parameters to the method: given string array, WebElement products, and the driver.
	3. Iterating through all the given strings, and if a given string value matches with a WebElement retrieved from the web, clicking it.
	*/
	public static void selectitems(String[] values,List<WebElement> products,WebDriver driver)
	{
		for(int i=0;i<values.length;i++)
		{
			for(int j=0;j<products.size();j++)
			{
				String name = products.get(j).getText();//Retrieving the text of each index.
				if(name.contains(values[i]))//Comparing with the given string array value.
				{
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();
	                break;
				}
			}
		}
		
	}

}
