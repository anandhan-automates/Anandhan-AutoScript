package Mouse_interaction;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class child_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
      driver.findElement(By.className("blinkingText")).click();
      // Retrieve the IDs of all browser windows currently open.
      Set<String> windows_ID = driver.getWindowHandles(); 

      // Create an Iterator to traverse through the window IDs.
      Iterator<String> it = windows_ID.iterator(); 

      // Retrieve the first window ID (typically the parent window).
      String parent_ID = it.next(); 

      // Retrieve the second window ID (typically the child window).
      String child_ID = it.next(); 

      // Switch the focus of the driver to the child window using its ID.
      driver.switchTo().window(child_ID);
      
    // From the child window, locate the element with the CSS selector ".im-para.red" and retrieve its text.
      String userName = driver.findElement(By.cssSelector(".im-para.red")).getText() 
                        // Split the retrieved text into an array of words based on spaces.
                        .split(" ")[4] 
                        // Extract the 5th word (index 4) and trim any leading/trailing spaces.
                        .trim(); 

      // Switch back to the parent window using its window handle.
      driver.switchTo().window(parent_ID);

      // In the parent window, locate the input field with the ID "username" and enter the retrieved username into it.
      driver.findElement(By.id("username")).sendKeys(userName);

      
      
	}

}
