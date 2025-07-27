import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class End_to_End_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='one way']")).click();/*Not able to locate using other locator due to that identifying
		using text() -->xpath*/
		//driver.findElement(By.xpath("//div[text()='round trip']")).click();--- click round trip radio button
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Madurai']")).click();
		driver.findElement(By.xpath("//div[text()='Coimbatore']")).click();
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
		String value=driver.findElement(By.xpath("//div[text()='Return Date']")).getDomAttribute("style");
		System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getDomAttribute("style"));
		if(value.contains("opacity"))
		{
			System.out.println("Return Date is enabled!!");
		}
		else
		{
			System.out.println("Return date is disabled!!");
		}
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		for(int i=0;i<4;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();//5 adult will select
		}
		System.out.println(driver.findElement(By.xpath("(//div/div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[1]")).getText());
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[data-testid$='home-page-flight-cta']")).click();
		//driver.close();
		System.out.println("Script ran succesfully without any errors");
	}

}
