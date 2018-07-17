package naveen_Automation;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Video_10_MultiPopup_Window{
	//http://www.popuptest.com/goodpopups.html
	WebDriver dr;
	@Test
	public void Handle_WindowsFrame() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		dr=new ChromeDriver();
		
		dr.get("http://www.popuptest.com/goodpopups.html");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();	
		
		//WebDriverWait myWait=new WebDriverWait(dr, 50);
		clickOnButton_Visible_of_Element(dr, 10, dr.findElement(By.xpath("//a[text()='Good PopUp #1']")));
		System.out.println("Click success");
		Set<String> handles = dr.getWindowHandles();
		
		Iterator<String> it= handles.iterator();
		String parentWin=it.next();
		System.out.println("Parent Window ID -- > "+ parentWin);
		
		String childWin=it.next();
		System.out.println("Child Window -- >  " + childWin);
		
		dr.switchTo().window(childWin);
		wait(3);
		System.out.println(dr.getTitle());
		dr.close();
		System.out.println("Child window closed....");
		
		dr.switchTo().window(parentWin);
		System.out.println("Parent Window -- >  " + parentWin);
		
		dr.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		wait(2);
		dr.switchTo().window(childWin);
		
		System.out.println("Child Window -- >  " + childWin);
		System.out.println(dr.getTitle());
		wait(2);
		dr.close();
    	dr.switchTo().window(parentWin);	
		
		
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
