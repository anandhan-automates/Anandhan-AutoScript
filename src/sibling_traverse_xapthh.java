import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class sibling_traverse_xapthh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		driver.close();
		System.out.println("Script ran succesfully without any errors");
	
}

}
