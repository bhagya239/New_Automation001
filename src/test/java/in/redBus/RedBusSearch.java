package in.redBus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import redBus.RedBusHomePage;
import utilitypack.BaseClass;
import utilitypack.PropertyHandling;

public class RedBusSearch extends BaseClass{
	
	PropertyHandling pro;
	RedBusHomePage homepg;
	Select select;
  @Test
  public void LaunchRedBus() throws IOException {
	getBrowserInstance("Chrome");
	  pro= new PropertyHandling();
	  driver.navigate().to(pro.getProperty("reBusURL"));
	homepg= new RedBusHomePage();
	
	 // homepg.searchBuses("Bangalore", "Mumbai");
	//  homepg.fromLoc.sendKeys("Bangalore");
//	 select = new Select(homepg.fromLoc);
//	 select.selectByIndex(3);
//	  homepg.toLoc.sendKeys("Pune");
//	  select = new Select(homepg.toLoc);
//	  select.selectByIndex(3);
	  homepg.fromLoc.sendKeys("Bangalore");
	for(WebElement wb: homepg.searchresult)
	{
		//System.out.println(wb.getText());
		if(wb.getText().equals("Majestic, Bangalore"))
		{
			wb.click();	break;
		}
	}

	homepg.toLoc.sendKeys("Pune");
	for(WebElement wb: homepg.searchresult)
	{
		if(wb.getText().equals("Wakad, Pune"))
		{
			wb.click();	break;
		}
	}
	
	homepg.date(23);
	homepg.searchButton.click();
	
	//System.out.println(homepg.rate.size());
	/*
	 * for(WebElement wb: homepg.rate) {
	 * 
	 * String s= wb.getText(); System.out.println(s);
	 * 
	 * //int i= Integer.parseInt(wb.getText()); //System.out.println(i);
	 * //ts.add(i); }
	 */
	
	//System.out.println(ts);
	String s="//div[@class=\"fare d-block\"]/span";
	ArrayList<Integer> ts= new ArrayList<>();
	
	List<WebElement> pricelist= driver.findElements(By.xpath(s));
	System.out.println();
/*System.out.println(pricelist.size());
for(WebElement wb : pricelist) {
	String price= wb.getText();
	if(!price.isEmpty())
	{int i= Integer.parseInt(price);
	ts.add(i);}
}

System.out.println(ts);

JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1200);");

pricelist= driver.findElements(By.xpath(s));
System.out.println(pricelist.size());
for(WebElement wb : pricelist) {
	String price= wb.getText();
	if(!price.isEmpty())
	{int i= Integer.parseInt(price);
	ts.add(i);}
}

System.out.println(ts);

*/


/*
 * int cnt=1; for(WebElement element: pricelist) { String pr= element.getText();
 * System.out.println(cnt+"    "+pr); cnt++; }
 */
  
  
  
  }
}
