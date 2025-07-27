package Miscellaneous_topic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Https_certificate_handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To handle https certification if our browser is internal then will face this issue
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true); //Accepting https certification issue give object to the driver
		
		WebDriver driver = new ChromeDriver(option);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        driver.close();
	}

}
