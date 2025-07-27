import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//clicking from dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();/*
		The reason for using index value 2 is that MAA will be detected
		in the 'from' dropdown. For unique identification to select in to dropdown, we use the index value 2.
		If this is not specified, an error may occur, such as 
		"Not able to find in the current page," due to the locator for MAA 
		in the 'from' dropdown.
		*/
		driver.close();
		System.out.println("Script ran without any errors");
		
	}

}
