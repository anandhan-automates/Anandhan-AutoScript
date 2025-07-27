import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxassignement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 //Check the first checkbox and verify if it is successfully checked, then uncheck it again to verify if it is successfully unchecked
		 driver.findElement(By.id("checkBoxOption1")).click();
		 Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 driver.findElement(By.id("checkBoxOption1")).click();
		 Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 //How to get the count of the number of checkboxes present on the page
		 int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		 System.out.println("Total no.of checkboxes present in the page is:"+count);
		 System.out.println("Script ran sucessfully with out any errors");
	}

}
