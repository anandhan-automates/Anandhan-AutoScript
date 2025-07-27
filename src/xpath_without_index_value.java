import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class xpath_without_index_value {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//clicking from dropdown
     driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='CJB']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
     driver.close();
     System.out.println("Script ran without any errors");
     
	}

}
