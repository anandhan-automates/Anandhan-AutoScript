import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_items_to_the_carts_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] values = {"Cucumber","Brocolli","Beetroot","Carrot","Cauliflower"};
		
		//Unable to click the 'Add to Cart' button directly because it matches 30 elements.
		//Retrieve all 30 elements into a list and iterate through it until the specified value is reached.
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		/* 
		Converting the values in the string[] to an ArrayList to facilitate the comparison 
		between two arrays: the input string array and the retrieved list of WebElements. 
		Using the contains() method of ArrayList helps avoid the need for nested for-loops, 
		thereby improving execution time.
		*/
		List veggie_list = Arrays.asList(values); 
		Add_items_to_the_carts_Arraylist sel = new Add_items_to_the_carts_Arraylist();
		sel.selectitems(veggie_list,products,driver);
		System.out.println("Sript ran succesfully without any errors");

	}
	public static void selectitems(List veggie_list,List<WebElement> products,WebDriver driver)
	{
		//List<WebElement> is not formatted i.e  Brocolli - 1 Kg Cucumber - 1 Kg but we are compare values like this "Cucumber","Brocolli"
		//First we will format using split and trim method
		int count =0;
		for(int i=0;i<products.size();i++)
		{
			String[] formatted_Products = products.get(i).getText().split("-");
			String real_Value=formatted_Products[0].trim();
			
			if(veggie_list.contains(real_Value))
			{
				/*driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();-- previously used this locator but it fails at
				run time because text dynamically changing after click add to cart text it chaning to added text that it fails*/
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				count++;
				
				if(count == veggie_list.size())
				{
					break;
				}
					
			}
		}
		
		
	}

}
