import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Syncronization_Assignement_3 {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver , Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='radiotextsty'])[2]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement staticdropdown = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
        Select cl = new Select(staticdropdown);
        cl.selectByIndex(0);
        driver.findElement(By.name("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        
        //Implementing explicit time for synchronization
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class='card-title']")));
		//driver.switchTo().alert().accept();
		//getting listwebelements from web page
		List<WebElement> carts_list=driver.findElements(By.cssSelector("h4[class='card-title']"));
		String[] choice = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
	    List choice_List = Arrays.asList(choice);//converting array as list to perform some method efficently
	    Add_To_Cart(driver,carts_list,choice_List);
	    driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();// clicking checkout button
	    driver.findElement(By.xpath("(//button[@class='btn btn-danger'])[1]")).click();//removing first select item from carts
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();// clicking final checkout button
	    driver.findElement(By.id("country")).sendKeys("Madurai");
	    driver.findElement(By.cssSelector(".checkbox.checkbox-primary")).click();
	    driver.findElement(By.cssSelector("input[value='Purchase']")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success.alert-dismissible")));
	    String msg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
	    System.out.println(msg);
}

	private static void Add_To_Cart(WebDriver driver, List<WebElement> carts_list, List choice_List) {
		
		 int count = 0;
		// TODO Auto-generated method stub
		for(int i=0;i<carts_list.size();i++)
	    {
			String value = carts_list.get(i).getText();
			System.out.println(value);
	    	if(choice_List.contains(value))
	    	{
	    		driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
	    		count ++;
	    		if(count == choice_List.size())
	    		{
	    			break;
	    		}
	    	}
	    	
		
		
		}
		
	}

}
