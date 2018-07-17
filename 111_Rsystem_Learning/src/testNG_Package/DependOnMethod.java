package testNG_Package;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependOnMethod {
	
	@Test(dataProvider="getData")
	public void testLogin(String user,String pass,String b) {
		System.out.println(user+" "+pass+" "+b);
		Assert.assertTrue(true);
	}

	
	@Test(dependsOnMethods= {"testLogin"})
	public void changePassWord() {
		System.out.println("changePassWord");
		//throw new SkipException("Skipping Test");
	}
	
	
	@Test(dependsOnMethods= {"changePassWord"})
	public void Log_out() {
		System.out.println("Log_out");
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][3];
		data[0][0]="u1";
		data[0][1]="p1";
		data[0][2]="b1";
		
		data[1][0]="u2";
		data[1][1]="p2";
		data[1][2]="b2";
		
		return data;
	}
}
