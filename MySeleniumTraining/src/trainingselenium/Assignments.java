package trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignments 
{
	


@Test

public void testlogopresentChrome()  
{
	System.setProperty("webdriver.chrome.driver","C://Users//admin//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://www.macys.com");
    driver.findElement(By.xpath("//a[@id='closeButton']")).click();
    //assert(islogopresent());
    driver.quit();
}

@Test

public void testlogopresentIE()  
{
	System.setProperty("webdriver.ie.driver",
		    "C://Users//admin//IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
    driver.get("http://www.macys.com");
    driver.findElement(By.xpath("//a[@id='closeButton']")).click();
    assert(islogopresent());
    driver.quit();
}

@Test
	
	public void testSignUpVerification()  
	{
		WebDriver driver = new FirefoxDriver();
     driver.get("http://www.macys.com"); 
     driver.findElement(By.xpath("//a[@id='closeButton']")).click();
     WebElement web = driver.findElement(By.xpath("//div[@id='globalMastheadPool']/div[2]/a/img"));
     web.sendKeys("Jeans");
     web.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();
     driver.quit();
	}



boolean islogopresent()
{ 
	boolean isLogoPresent =false;
	WebDriver driver = new FirefoxDriver();
	WebElement logo = driver.findElement(By.xpath("//div[@id='globalMastheadBrandLogo']"));
	if(logo.isEnabled()) 
		isLogoPresent =true;
 
	else 
		isLogoPresent= false;
	return isLogoPresent;
	
}



}
