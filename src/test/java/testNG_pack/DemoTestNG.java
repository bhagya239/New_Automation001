package testNG_pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilitypack.BaseClass;

public class DemoTestNG extends BaseClass{
	
	@Test
	
	public void sample() throws InterruptedException
	{
		getBrowserInstance("Chrome");
	//	driver.navigate().to("https://www.redbus.in/");
		driver.get("https://www.redbus.in/search?fromCityName=Majestic%2C%20Bangalore&"
				+ "fromCityId=66016&toCityName=Wakad%2C%20Pune&toCityId=89672&onward=23-Apr-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");

		driver.manage().window().maximize();
	//Thread.sleep(1700);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele=driver.findElement(By.xpath("//span[@class=\"g-button d-color fr\"]"));
		ele.click();
		
		  String s="//div[@class=\"fare d-block\"]/span"; 
		  ArrayList<Integer> ts= new ArrayList<>(); 
		  WebElement element1= driver.findElement(By.xpath("//div[@class=\"w-100 pR fl footer-links\"]"));
		  List<WebElement>pricelist= null; 
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		
		  Actions act= new Actions(driver);
	
		  for (int i=0; i<=16;i++)
		  {
			  js.executeScript("window.scrollBy(0,1200)");
			 pricelist= driver.findElements(By.xpath(s));
		  
		  }
		 
		  List<WebElement> departTime= null; 
		  for (int i=0; i<=17;i++)
		  {
			  js.executeScript("window.scrollBy(0,1200)");
			  departTime= driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
		  }
		  
		  int count=1;
		  for(WebElement deptime: departTime)
		  {
			  
			  System.out.println(count+"  "+deptime.getText()); count++;
		  }
	
System.out.println(pricelist.size());
int cnt=1;
for(WebElement web: pricelist)
{
	String pr= web.getText();
	int i = Integer.parseInt(pr);
	System.out.println(cnt+".   "+ i);
	cnt++;
}

System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
pricelist.sort(null);


	
//driver.quit();
	/*{
	for(WebElement wb: pricelist)
	{
		System.out.println(wb.getText());
	}
	
	
	js.executeScript("window.scrollBy(0,1500);");
	
	
	//pricelist= driver.findElements(By.xpath(s));

	}

	
	}*/
	

	}
	

}
