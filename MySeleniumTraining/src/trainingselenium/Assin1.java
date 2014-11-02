package trainingselenium;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assin1 {
	
	private WebDriver driver;
	 @Test
		
		public void testlogopresent()  
		{
			driver = new FirefoxDriver();
	        driver.get("http://www.macys.com");
	        driver.findElement(By.xpath("//a[@id='closeButton']")).click();
	        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='macysHomePageLogo']")));
	        driver.quit();
		}
	 @Test
		
		public void testlogopresentChrome()  
		{
		 System.setProperty("webdriver.chrome.driver","C://Users//admin//chromedriver.exe");
		    driver = new ChromeDriver();
	        driver.get("http://www.macys.com");
	        driver.findElement(By.xpath("//a[@id='closeButton']")).click();
	        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='macysHomePageLogo']")));
	        driver.quit();
		}
	 @Test
		
		public void testlogopresentIE()  
		{
		 System.setProperty("webdriver.ie.driver","C://Users//admin//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
	        driver.get("http://www.macys.com");
	        driver.findElement(By.xpath("//a[@id='closeButton']")).click();
	        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='macysHomePageLogo']")));
	        driver.quit();
		}
	 boolean isElementPresent(By by){
		    try{
		     driver.findElement(by);
		     return true;
		    }
		    catch(NoSuchElementException e){
		     return false;
		    }
	

	 }

}
