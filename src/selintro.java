import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class selintro {

	public static void main(String[] args) {
		// invoke browser
		//ChromeDriver class -- ChromeDriver() 
		//FirefoxDriver class -- FirefoxDriver()
		//Edgdriver class -- EdgeDriver()
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://bgsw.udemy.com/course/istqb-foundation-level-ctfl-certification/learn/lecture/41322526#overview");
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("Firefox/chrome opened and closed successfully!!");
	}

}
