package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_print_no_of_rows_column_webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        //print no of columns in the web table
        //tr represents all rows in the table
        List<WebElement> col = driver.findElements(By.xpath("//table[@class='table-display'] //tr //th"));
        System.out.println("Number of columns presented in the webtable:"+col.size());
        
        //print no of columns in the web table
        //tr represents all rows in the table th represents header of the table no of header of the table = no of columns
        List<WebElement> row = driver.findElements(By.xpath("//table[@class='table-display'] //tr"));
        System.out.println("Number of rows presented in the webtable:"+row.size());
        
        //Need to print 2 row values
        List<WebElement> values = driver.findElements(By.xpath("//table[@class='table-display'] //tr[3] //td"));
        
        for(int i=0;i<values.size();i++)
        {
        	System.out.println(+(i+1)+"st column value:"+values.get(i).getText());
        }
        driver.close();
	}

}
