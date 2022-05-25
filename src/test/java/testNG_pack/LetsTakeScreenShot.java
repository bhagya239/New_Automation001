package testNG_pack;

import static org.testng.Assert.assertTrue;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import utilitypack.BaseClass;
import utilitypack.LoginPage;

public class LetsTakeScreenShot extends BaseClass {

	@Test
	public void launch() throws IOException {
		getBrowserInstance("Chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		LoginPage loginpage = new LoginPage();
		loginpage.login("Admin", "admin12345");

	}

	@Test
	public void screenshot() throws IOException {

		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-mm-yy-hh-mm-ss"));

		System.out.println("todays date: " + date);
		
		  String screenshotfolder= "C:\\Users\\User\\Downloads\\Bhagyashri\\Screenshot\\"+"today.png";
		  
		  
		  TakesScreenshot screenshot= (TakesScreenshot)driver;
		  File capturedScreenShot=screenshot.getScreenshotAs(OutputType.FILE);
		  
		  File savefile= new File(screenshotfolder);
		  FileUtils.copyFile(capturedScreenShot, savefile);
		  
		 
		// assertTrue(driver.findElement(By.id("menu_dashboard_index")).isDisplayed());

	}

}
