package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Grab the label of selected checkbox.
		String value=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		//clicking first checkbox--option1
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		//select an option in dropddown --- option should come from step 2.
        s.selectByContainsVisibleText(value);
        //Enter grabbed text in alert box
        driver.findElement(By.id("name")).sendKeys(value);
        driver.findElement(By.id("alertbtn")).click();
        String alertmsg = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        String Actualmsg= alertmsg.split(",")[0].split(" ")[1];
        System.out.println(Actualmsg);
        Assert.assertEquals(Actualmsg, "Option1");
        if(Actualmsg.equals("Option1")) {
        	System.out.println("Sucess! Given Requirment is working successfully");
        }
        else
        {
        	System.out.println("Failure! There are some failure.");
        }
        driver.close();
	}

}
