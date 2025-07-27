import org.openqa.selenium.chrome.ChromeDriver;
public class Browsernavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();//Run script on maximize mode
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//navigate one page to another
		driver.navigate().back();//move backward
		driver.navigate().forward();//move forward
		driver.close();
		System.out.println("Script ran sucessfully without any error");
	}

}
