package trainingselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPOPUP 
{
	
	private WebDriver driver;
	 @Test
		
		public void testlogopresent() throws InterruptedException  
		{
	driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("Email")).sendKeys("seleniumtesting2384@gmail.com");
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("alert('WelCome')");
	  Thread.sleep(5000);
	  
	  //js.executeScript("alert((document.getElementsByTagName('input').length))");
	  
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
		}
}
