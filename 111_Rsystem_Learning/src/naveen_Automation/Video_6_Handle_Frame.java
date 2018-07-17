package naveen_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Video_6_Handle_Frame {
	WebDriver dr;
	@Test
	public void Handle_WindowsFrame() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.freecrm.com/");
		dr.findElement(By.name("username")).sendKeys("naveenk");
		dr.findElement(By.name("password")).sendKeys("test@123");
		dr.findElement(By.name("password")).sendKeys(Keys.ENTER);
		wait(2);
		dr.switchTo().frame("mainpanel");
		System.out.println("Frame found");
		
		//dr.findElement(By.xpath("//a[text()='Logout']")).click();
		
		WebDriverWait myWait=new WebDriverWait(dr, 50);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Contacts']")));
		dr.findElement(By.xpath("//a[text()='Contacts']")).click();
        
        
	}
	
	@AfterTest
	public void tearDown() {
	   wait(6);   
	   dr.quit();
	}
	
	public void wait(int s) {
	 
		try{
			   Thread.sleep(s*1000);
		   }catch(Exception ex) {
			   System.out.println(ex.getMessage());
		   }
	}

}
