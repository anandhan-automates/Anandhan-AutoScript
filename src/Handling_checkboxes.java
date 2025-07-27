import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Handling_checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     /*Problem is select checkboxes and know size of checkboxes presented in the webpage*/
     Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
     driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
     Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
     /*A CSS Selector using a regular expression (id*=) is used to match the id attribute that contains the text SeniorCitizenDiscount.
      This improves the readability and flexibility of the locator, making it easier to maintain and understand.*/
     int size =driver.findElements(By.cssSelector("input[type='checkbox']")).size();
     if(size == 6)
     {
    	 System.out.println("Great");
     }
     Thread.sleep(3000);
     driver.close();
     System.out.println("Script ran succesfully without any errors");
	}


}
