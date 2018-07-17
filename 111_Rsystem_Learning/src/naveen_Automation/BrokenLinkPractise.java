package naveen_Automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkPractise {
	
	@Test
	public void getBrokenLink() {
		System.setProperty("webdriver.chrome.driver", "D://MANOJ//chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		dr.get("http://makemysushi.com/404?");
        List<WebElement> link = dr.findElements(By.tagName("a"));
        link.addAll(dr.findElements(By.tagName("img")));
        System.out.println(link.size());
        
        List<WebElement> activeLink = new ArrayList<WebElement>();
        System.out.println("Actibe Link -- > " + activeLink.size());
        for(int i=0;i<link.size();i++) {
        	if(link.get(i).getAttribute("href") != null && (! link.get(i).getAttribute("href").contains("javascript"))) {
        		activeLink.add(link.get(i));
        	}
        }
        
        for(int j=0;j<activeLink.size();j++) {
        
        try{
        	HttpURLConnection connection=(HttpURLConnection) new URL(activeLink.get(j).getAttribute("href")).openConnection();
            connection.connect();
            
            String getMessage= connection.getResponseMessage();
            System.out.println(activeLink.get(j).getAttribute("href") + "--  "+getMessage);
            connection.disconnect();
            
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
	}
  }
}
