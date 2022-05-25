package testNG_pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample1 {
	
	
	@BeforeTest
	public void b4Test() {
		
		System.out.println(" NEW INNINGS");
	}
	
	@BeforeClass
	public void b4class()
	{
		System.out.println("..START CLASS....");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("... END  CLASS...");
	}
	
	
	@BeforeMethod
	public void b4method()
	{
		System.out.println(" b4 method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}

	@Test(priority = 1)
	public void test1()
	{
		System.out.println(" !!......Hello Guys...!!");
	}
	@Test(priority = 2,enabled = true)
	public void test2()
	{
		System.out.println(" ......Welcome to Cyber Success..");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println(" EXIT INNINGS ");
	}
	
	@BeforeSuite
	public void beforesuite99()
	{
		System.out.println(" B4U---12345 ");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite --09876");
	}
	@BeforeSuite
	public void beforesuite2()
	{
		System.out.println(" B4U-suite 22");
	}
	
	
	
	@BeforeGroups
	public void b4grp()
	{
		System.out.println(" GROUP 555..");
	}
	
	@AfterGroups
	public void aftergrp()
	{
		System.out.println(" after GROUP 999999..");
	}
}
