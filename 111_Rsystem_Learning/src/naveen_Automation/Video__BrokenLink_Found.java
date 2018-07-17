package naveen_Automation;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

public class Video__BrokenLink_Found {
	WebDriver dr;
	@Test
	public void Handle_WindowsFrame() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		
		//dr.get("https://demo.codeforgeek.com/ajaxbox/");
		
		dr.get("https://google.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		List<WebElement> list_link=dr.findElements(By.tagName("a"));
		
		list_link.addAll(dr.findElements(By.tagName("img")));
		System.out.println(list_link.size());
		
		
		List<WebElement> activelink = new ArrayList<WebElement>();
		//Find all link witch have not any href property.
		for(int i=0;i<list_link.size();i++) {
			if(list_link.get(i).getAttribute("href")!=null && (! list_link.get(i).getAttribute("href").contains("javascript"))){
				activelink.add(list_link.get(i));
			}
		}
		System.out.println("Active link -- > " + activelink.size());
		for(int j=0;j<activelink.size();j++) {
		try{
			HttpURLConnection connection=(HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response_Message = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelink.get(j).getAttribute("href")+" -- " + response_Message);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

		
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
