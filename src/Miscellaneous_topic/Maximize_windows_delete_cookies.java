	package Miscellaneous_topic;
	
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	public class Maximize_windows_delete_cookies {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			//window maximize
			driver.manage().window().maximize();
			//delete all cookie
			driver.manage().deleteAllCookies();
			//hit url after maximize window and delete all cookie
			driver.get("https://example.com");
			
			driver.navigate().refresh();
	
		}
	
	}
