import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Anandhan");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// clicking ok in alert box
		// ok and cancel alert box
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		// driver.close();
		System.out.println("Script ran successfully without any errors");
	}

}
