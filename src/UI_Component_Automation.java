import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class UI_Component_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//  driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		//Dropdown with select tag
		WebElement staticdropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);//select by index value
		System.out.println(dropdown.getFirstSelectedOption().getText());//get selected option
		dropdown.selectByVisibleText("AED");//select using visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");//select using value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//driver.close();
		System.out.println("Script ran succesfully without any errors!!");

	}

}
