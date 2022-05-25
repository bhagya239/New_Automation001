package testNG_pack;

import java.io.IOException;

import org.testng.annotations.Test;

import utilitypack.BaseClass;
import utilitypack.EmployeeListPage;
import utilitypack.LoginPage;
import utilitypack.PropertyHandling;

public class NewTest extends BaseClass{
	
	PropertyHandling prop;
	LoginPage loginPage;
	EmployeeListPage emplistpg;
  @Test (priority = 1)
  public void loginOrangeHRM() throws IOException {
	  BaseClass.getBrowserInstance("Chrome");	
	   prop= new PropertyHandling();
	   loginPage= new LoginPage();
	  driver.navigate().to(prop.getProperty("OrangeURl"));
	  loginPage.login(prop.getProperty("OrangeUsername"), prop.getProperty("OrangePassword"));
	  }
  @Test (priority = 2)
  public void addEmp()
  {
	  emplistpg= new EmployeeListPage();
	 String[] firstname= prop.getProperty("firstname").split(",");
	 String[] lastname= prop.getProperty("lastname").split(",");
	 // emplistpg.addEmployee("Ritu", "Kumar");
	 for(int i=0;i<firstname.length;i++)
	 {
		 System.out.println(firstname[i]+"  "+lastname[i]);
		 emplistpg.addEmployee(firstname[i], lastname[i]);
	 }
	  System.out.println(driver.getCurrentUrl());
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
