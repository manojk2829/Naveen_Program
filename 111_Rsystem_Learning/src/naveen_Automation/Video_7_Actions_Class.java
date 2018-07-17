package naveen_Automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Video_7_Actions_Class {
	WebDriver dr;
	@Test
	public void Handle_WindowsFrame() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://spicejet.com/");
		
		WebDriverWait myWait=new WebDriverWait(dr, 50);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("highlight-addons")));
		
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.id("highlight-addons"))).build().perform();
		//myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Combined Form']")));
		act.moveToElement(myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Hot Meals ']"))))
		.click().build().perform();
		
		//dr.findElement(By.xpath("//a[text()='Contacts']")).click();
        File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
		   FileHandler.copy(src, new File("D://report//A.jpg"));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
        wait(2);
	}
	
	@AfterTest
	public void tearDown() {
	   wait(10);   
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
