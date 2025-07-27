import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));// It will wait every 4 seconds for each steps
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Anandhan");
		driver.findElement(By.name("inputPassword")).sendKeys("Anandhan2001");
	    driver.findElement(By.className("signInBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//css selector
	    driver.findElement(By.linkText("Forgot your password?")).click();//Link text
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anandhan");
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anandhanbecse@gmail.com");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anandhanpy151@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("6382998143");
	    driver.findElement(By.className("reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	    
	    

	}

}
