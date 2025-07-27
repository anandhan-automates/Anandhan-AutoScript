import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement2_webUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Anandhan");
		driver.findElement(By.name("email")).sendKeys("anandhanbecse@gmail.com");
		driver.findElement(By.cssSelector("input[id*=Password]")).sendKeys("Anandhan@2001");
	    driver.findElement(By.id("exampleCheck1")).click();
	    System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
	    WebElement choice = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select option = new Select(choice);//If select tag is available we can use select class
	    //option.selectByIndex(0);
	    option.selectByVisibleText("Male");
	    System.out.println(option.getFirstSelectedOption().getText());
	    driver.findElement(By.id("inlineRadio2")).click();
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("03/11/2025");
	    driver.findElement(By.className("btn-success")).click();
	    driver.close();
	    System.out.println("Script ran sucessfully without any errors");
	    
	    
	    
	    
	}

}
