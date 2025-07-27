import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_disable_verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();//clicking one way should not Enabled
		String value=driver.findElement(By.id("Div1")).getDomAttribute("style");/* getDomAttribute method is used to retrieve an 
		HTML attribute from a web element.It is commonly used to check whether an element is enabled or not*/
		Enabled(value);//passing string to the method to the state
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//clicking Round trip should get Enabled
		String value2=driver.findElement(By.id("Div1")).getDomAttribute("style");
		Enabled(value2);
		System.out.println("Script ran succesfully without any error");
	}
	public static void Enabled(String value)
	{
		if(value.contains("1"))
		{
			System.out.println("Enabled");
		}
		else if(value.contains("0.5"))
		{
			System.out.println("Not Enabled");
		}
	}

}
