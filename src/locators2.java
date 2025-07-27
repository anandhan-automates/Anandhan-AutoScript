import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selnium.edge.EdgeDriver;
import org.testng.Assert;

public class locators2 {
	static String str="";
	static String name = "Anandhan";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		str=driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(str, "You are successfully logged in.");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText(), "Welcome to Rahul Shetty Academy");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		System.out.println("Script ran sucessfully without any errors");
	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String PasswordText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		String[] Password=PasswordText.split("'");
		String realpassword=Password[1].split("'")[0];
		return realpassword;
	}

}
