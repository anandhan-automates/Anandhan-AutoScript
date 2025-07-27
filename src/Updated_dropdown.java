import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Updated_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();// navigate to the passenger locator
		Thread.sleep(2000);
        //selecting 5 adults in the dropdown i am choosing for loop already 1 adult selected
		System.out.println("Before Executing loop:"+driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1 ;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println("After Executing loop:"+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println("Script ran succesfully without any errors");
		driver.close();
	}

}
