package trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google 
{

	public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com"); 
        WebElement web = driver.findElement(By.name("q"));
        web.sendKeys("selemium");
        web.findElement(By.xpath("//div[starts-with(@id,'gbqfbw')]/button[@id='gbqfb']/span")).click();
        driver.quit();
      
   }
	
}
