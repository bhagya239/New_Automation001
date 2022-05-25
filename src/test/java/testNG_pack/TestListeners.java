package testNG_pack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestListeners {
	
	@BeforeTest
	public void b4Test()
	{
		System.out.println(" ------method KE PAHILE----");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println(" **** method KE BAAD ********");
	}
	
	@BeforeMethod
	public void b4Method()
	{
		System.out.println(" Before every method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println(" After every method");
	}
	@Test
	public void t1()
	{
		System.out.println(" t1 method");
	}
	
	@Test
	public void t2()
	{
		System.out.println(" t2 method");
	int a=10;
	System.out.println("result :"+a/0);
	
	
	
	}

}
