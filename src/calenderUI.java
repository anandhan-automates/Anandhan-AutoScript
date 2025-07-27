import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[@value='IXM']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
      Thread.sleep(4000);
      //Going to select current date in calendar highlighted class help us to select current date
      driver.findElement(By.cssSelector(".ui-state-highlight.ui-state-active.ui-state-hover")).click();
      driver.close();
      System.out.println("Script ran sucessfully without any errors");
      
      
      
	}

}
