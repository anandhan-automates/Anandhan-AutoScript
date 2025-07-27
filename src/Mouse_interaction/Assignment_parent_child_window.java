	package Mouse_interaction;
	
	import java.util.Iterator;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Assignment_parent_child_window {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com");
			driver.findElement(By.linkText("Multiple Windows")).click();
			driver.findElement(By.linkText("Click Here")).click();
			Set<String> windows_ID =driver.getWindowHandles();
			Iterator<String> id=windows_ID.iterator();
			String parent_ID=id.next();
			String child_ID=id.next();
			driver.switchTo().window(child_ID);
			System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
			driver.switchTo().window(parent_ID);
			System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
			driver.quit();
			System.out.println("Script ran sucesfully without any errors");
		}
	
	}
