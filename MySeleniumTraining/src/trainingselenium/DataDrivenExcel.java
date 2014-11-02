package trainingselenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataDrivenExcel 

{

	Excel excel =new Excel();
	private WebDriver driver;
	@Test
	
	public void testlogopresent() throws IOException 
	{
		excel.setExcel("C:\\Users\\admin\\Desktop\\OCT\\Test.xlsx","Sheet1");
		System.out.println(excel.getCellvalue(1,1));
	}
@Test
	
	public void testgmail() throws IOException, InterruptedException 
	{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com");
	excel.setExcel("C:\\Users\\admin\\Desktop\\OCT\\Test.xlsx","Sheet1");
	//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(arg0)
	System.out.println(excel.getCellvalue(1,1));
	System.out.println(excel.getCellvalue(1,2));
	String str= excel.getCellvalue1(1,1);
	String str1= excel.getCellvalue1(1,2);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(str);
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(str1);
	driver.findElement(By.xpath("//input[@id='signIn']")).click();
	  Thread.sleep(5000);
	}
	
@Test

public void testgspann() throws IOException, InterruptedException 
{
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://mail.gspann.com");
excel.setExcel("C:\\Users\\admin\\Desktop\\OCT\\Test.xlsx","Sheet1");
//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(arg0)
String str= excel.getCellvalue1(1,1);
String str1= excel.getCellvalue1(1,2);
driver.findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(str);
driver.findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(str1);
driver.findElement(By.xpath("//span[@id='cred_sign_in_button']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id='O365_TopMenu']/div[2]/div/div/table/tbody/tr/td[1]/div/button")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='_ariaId_312']/div/div[2]/div[3]/div/div[4]/div/div/span[2]")).click();
Thread.sleep(5000);
driver.quit();
}

@Test

public void testMacysProfile() throws IOException, InterruptedException 
{
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.macys.com/account/profile");
excel.setExcel("C:\\Users\\admin\\Desktop\\OCT\\TestFile.xlsx","Sheet1");
System.out.println(excel.getCellvalue1(1,1));
System.out.println(excel.getCellvalue1(1,2));
String str= excel.getCellvalue1(1,1);
String str1= excel.getCellvalue1(1,2);
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(str);
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(str1);
driver.findElement(By.xpath("//input[@id='addressLine1']")).sendKeys("HIG");
driver.findElement(By.xpath("//input[@id='addressLine2']")).sendKeys("AWC");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("AWC");
Select select = new Select(driver.findElement(By.name("profile.profileAddress.address.state")));
select.selectByVisibleText("American Samoa");
select = new Select(driver.findElement(By.name("profile.profileAddress.address.state")));
select.selectByVisibleText("June");
select = new Select(driver.findElement(By.name("profile.date")));
select.selectByVisibleText("15");
select = new Select(driver.findElement(By.name("profile.year")));
select.selectByVisibleText("1996");
driver.findElement(By.xpath("//input[@id='city']")).click();
Thread.sleep(5000);
driver.quit();
}
@Test

public void testIRCTCFlight() throws IOException, InterruptedException {
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in");
driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[2]/a")).click();
excel.setExcel("Files//TestFile.xlsx","Sheet2");
//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(arg0)
/*String str= excel.getCellvalue1(1,1);
String str1= excel.getCellvalue1(1,2);
driver.findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(str);
driver.findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(str1);
driver.findElement(By.xpath("//span[@id='cred_sign_in_button']")).click();*/
Set<String> handler=driver.getWindowHandles();
 for (String handlesname : handler) 
{
	
	String winTitle=driver.switchTo().window(handlesname).getTitle();
	
	if(winTitle.equals("IRCTC Online Passenger Reservation System"))
	{
		break;	
	}
}
  ArrayList <String> excelData= new ArrayList <String> ();
 for (int i = 2 ; i< 4; i++){
	 for (int j =1 ; j < 5 ; j++){
		 excelData.add( excel.getCellvalue1(i,j));
		 
	
	 }
 }
 System.out.println("Printing excel"+excelData);
 /*System.out.println(excel.getCellvalue1(2,1));
 System.out.println(excel.getCellvalue1(2,2));
*/
 driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(excelData.get(0));
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(excelData.get(1));
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//div[@id='showdometic']/div[3]/div[2]/div[2]/img")).click();
 driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/a")).click();
 Select select = new Select(driver.findElement(By.name("classTypeInt")));
 select.selectByVisibleText(excelData.get(3));
 driver.findElement(By.xpath("//div[@id='showdometic']/div[7]")).click();
 driver.navigate().back();
 driver.navigate().refresh();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(excelData.get(4));
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(excelData.get(5));
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//div[@id='showdometic']/div[3]/div[2]/div[2]/img")).click();
 driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/a")).click();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 select = new Select(driver.findElement(By.name("classTypeInt")));
 /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 select.selectByVisibleText(excelData.get(7));*/
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/a")).sendKeys(excelData.get(6));
driver.findElement(By.xpath("//div[@id='showdometic']/div[7]")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile,new File("Screen Shot//IRCTCFlight.jpg"));
driver.quit();
}

/*@Test

public void testIRCTCFlight() throws IOException, InterruptedException 
{
driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in");
driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[2]/a")).click();
excel.setExcel("C:\\Users\\admin\\Desktop\\OCT\\TestFile.xlsx","Sheet2");
//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(arg0)
String str= excel.getCellvalue1(1,1);
String str1= excel.getCellvalue1(1,2);
driver.findElement(By.xpath("//input[@id='cred_userid_inputtext']")).sendKeys(str);
driver.findElement(By.xpath("//input[@id='cred_password_inputtext']")).sendKeys(str1);
driver.findElement(By.xpath("//span[@id='cred_sign_in_button']")).click();
Set<String> handler=driver.getWindowHandles();
 for (String handlesname : handler) 
{
	
	String winTitle=driver.switchTo().window(handlesname).getTitle();
	
	if(winTitle.equals("IRCTC Online Passenger Reservation System"))
	{
		break;	
	}
}
  ArrayList <String> excelData= new ArrayList <String> ();
 for (int i = 2 ; i< 4; i++){
	 for (int j =1 ; j < 5 ; j++){
		 excelData.add( excel.getCellvalue1(i,j) );
	
	 }
 }
 System.out.println(excel.getCellvalue1(2,1));
 System.out.println(excel.getCellvalue1(2,2));

 driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(str1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(str);
 Thread.sleep(2000);
 driver.findElement(By.xpath("//a[@id='ui-active-menuitem']")).click();
 driver.findElement(By.xpath("//div[@id='showdometic']/div[7]")).click();
Thread.sleep(5000);
driver.quit();
 driver.quit();
}*/
}