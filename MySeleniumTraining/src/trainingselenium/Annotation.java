package trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Annotation 
{
	
	@Test
	
	public void testGoogle()  
	{
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com"); 
        WebElement web = driver.findElement(By.name("q"));
        web.sendKeys("selemium");
        web.findElement(By.xpath("//div[starts-with(@id,'gbqfbw')]/button[@id='gbqfb']/span")).click();
        driver.quit();
		
	}
	
     @Test
	
	public void testSignUpVerification()  
	{
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.macys.com"); 
        WebElement web = driver.findElement(By.xpath("//input[@id='globalSearchInputField']"));
        web.sendKeys("Jeans");
        web.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();
        driver.quit();
	}
     
     @Test
 	
 	public void testSignUpVerification1()  
 	{
 		WebDriver driver = new FirefoxDriver();
         driver.get("http://www.macys.com"); 
         driver.findElement(By.xpath("//a[@id='closeButton']")).click();
         WebElement web = driver.findElement(By.xpath("//input[@id='globalSearchInputField']"));
         web.sendKeys("Jeans");
         web.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();
         driver.quit();
 	}
     

}
