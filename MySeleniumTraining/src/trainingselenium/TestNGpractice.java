package trainingselenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGpractice 
{
	private WebDriver driver;
	
	@BeforeMethod
	 
    public void test1() {

		driver = new FirefoxDriver();
        driver.get("http://www.macys.com"); 

    }
	
	@Test
	 
    public void testCase() {

		driver.findElement(By.xpath("//a[@id='closeButton']")).click();
        WebElement web = driver.findElement(By.xpath("//input[@id='globalSearchInputField']"));
        web.sendKeys("Jeans");
        web.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();

    }
	 @AfterMethod
	 
     public void test2() {

		 driver.quit();

     }
	 @Test
		
		public void testlogopresent()  
		{
			 driver = new FirefoxDriver();
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
	

	 }}
