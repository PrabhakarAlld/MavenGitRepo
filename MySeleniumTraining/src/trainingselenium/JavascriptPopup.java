package trainingselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptPopup
{
	private WebDriver driver;
	 @Test
		
		public void testlogopresent() throws InterruptedException  
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("file:///C://Users//admin//Desktop//OCT//28-10//alerts.html");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
	        driver.quit();
		}
	

}
