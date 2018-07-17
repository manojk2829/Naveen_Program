package naveen_Automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Video_7_Dynemic_wait {
	WebDriver dr;
	@Test
	public void Handle_WindowsFrame() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		dr=new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();	
		
		WebDriverWait myWait=new WebDriverWait(dr, 50);
		clickOnButton_Visible_of_Element(dr, 10, dr.findElement(By.xpath("//a[text()='Sell']")));
		Actions act = new Actions(dr);
		act.moveToElement(myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Shop by']")))).build().perform();
		act.moveToElement(myWait.until(ExpectedConditions.
		visibilityOfElementLocated(By.xpath("//*[text()='Mobiles, Computers']")))).build().perform();
		
		act.moveToElement(dr.findElement(By.xpath("//*[text()='Printers & Ink']"))).click().build().perform();		
		
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
	
	public WebElement getElement(String locater) {
		WebElement we=null;
		if(locater.endsWith("_id")) {
			we=dr.findElement(By.id(locater));
		}else if(locater.endsWith("_name")) {
			we=dr.findElement(By.name(locater));
		}else if(locater.endsWith("_xpath")) {
			we=dr.findElement(By.xpath(locater));
		}else {
			System.out.println("Not found locater");
		}
		return we;
	}
	
	public void clickOnButton_Visible_of_Element(WebDriver dr,int timeOut,WebElement element){
		WebDriverWait my_wait=new WebDriverWait(dr, timeOut);
		my_wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	
	
}
