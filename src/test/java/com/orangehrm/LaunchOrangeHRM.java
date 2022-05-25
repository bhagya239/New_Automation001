package com.orangehrm;

import java.io.IOException;

import org.openqa.selenium.By;

import utilitypack.BaseClass;
import utilitypack.EmployeeListPage;
import utilitypack.LoginPage;
import utilitypack.PropertyHandling;

public class LaunchOrangeHRM extends BaseClass{

	public static void main(String[] args) throws IOException {
	
BaseClass.getBrowserInstance("Chrome");	
PropertyHandling  prop= new PropertyHandling();
LoginPage loginPage= new LoginPage();
EmployeeListPage empListPg= new EmployeeListPage();
driver.navigate().to(prop.getProperty("OrangeURl"));

loginPage.login(prop.getProperty("OrangeUsername"), prop.getProperty("OrangePassword"));

empListPg.addEmployee("Akshay", "Kumar");
System.out.println(" program ended..!!");






		
		
		
		
		
		
		
		
		
		
	}

}
