package Mouse_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement login = driver.findElement(By.className("_1TOQfO"));
		a.moveToElement(login).build().perform();
		
		WebElement search = driver.findElement(By.cssSelector("input[class='Pke_EE']"));
		/* Move to the search -> click it -> press Shift on the keyboard -> send keys -> double-click to select the entered text -> as usual, use 
		 the build() and perform() methods in the Actions class */

		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("HELLo").doubleClick().build().perform();
		
		// Move to the login button again and right-click the mouse
		a.moveToElement(login).contextClick().build().perform();
		
		String a1="Please email us at mentor@rahulshettyacademy.com with below template to receive response";
		String Actual =a1.split(" ")[4].trim();
		System.out.println(Actual);

	}

}