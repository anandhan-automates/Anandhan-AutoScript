package Miscellaneous_topic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class soft_Assertion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	        // Locate the link element containing "soapui" in the href and extract its URL
	        //String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	        //System.out.println("Checking link: " + url);
	        List<WebElement> url_list= driver.findElements(By.cssSelector("#gf-BIG a"));
	        
	        SoftAssert a = new SoftAssert();
	        for(int i=0;i<url_list.size();i++)
	        {
	        	
	        String url=url_list.get(i).getAttribute("href");
	         
	        // Create a URL object with the extracted URL
	        URL urls = new URL(url);

	        // Open a connection to the URL and cast it to HttpURLConnection
	       // Reason: The openConnection() method returns a generic URLConnection object, 
	       //but since we are dealing with an HTTP request, we cast it to HttpURLConnection.
	      //This allows us to use HTTP-specific methods such as setRequestMethod(), getResponseCode(), etc.
	        HttpURLConnection con = (HttpURLConnection) urls.openConnection();

	        // Set request method to "HEAD" (only checks if the link works without downloading content)
	        con.setRequestMethod("HEAD");

	        // Establish the connection
	        con.connect();
            
	       
	        // Get the response code from the server (e.g., 200 for OK, 404 for broken)
	        int response_code = con.getResponseCode();

	        // Check if the response code indicates a broken link (greater than 400)
	       System.out.println(response_code);
	       a.assertTrue(response_code<400,"broken link found"+" text: "+url+" "+response_code);
	        
	       }
	       a.assertAll();

	        // Close the browser session
	        driver.close();

	        // Confirm that the script ran successfully
	        System.out.println("Script ran successfully without any errors.");
	}

}
