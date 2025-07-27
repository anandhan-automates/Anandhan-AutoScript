package Mouse_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//iframe[class*='demo']
		WebElement frame_Element = driver.findElement(By.cssSelector("iframe[class*='demo']"));
		driver.switchTo().frame(frame_Element);
		driver.findElement(By.id("draggable")).click();
		// Identify the source (draggable) element by its ID.
		WebElement source = driver.findElement(By.id("draggable"));
		// Identify the destination (droppable) element by its ID.
		WebElement destination = driver.findElement(By.id("droppable"));
		// Initialize the Actions class to perform advanced user interactions like drag and drop.
		Actions a = new Actions(driver);
		// Perform the drag-and-drop action from the source element to the destination element, then execute it.
		a.dragAndDrop(source, destination).build().perform();
		// Switch the WebDriver's context back to the main webpage after interacting with the iframe.
		driver.switchTo().defaultContent();
		//driver.close();
		System.out.println("Script ran succesfully without any errors");

	}

}
