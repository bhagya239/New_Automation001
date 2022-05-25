package redBus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilitypack.BaseClass;

public class RedBusHomePage  extends BaseClass{
	
	@FindBy(id="src")
	public WebElement fromLoc;
	
//WebElement fromloc= driver.findElement(By.id("src"));
	
	@FindBy(id="dest")
	public WebElement toLoc;
	
	@FindBy(id="onward_cal")
	public WebElement calender;
	
	@FindBy(id="search_btn")
	public WebElement searchButton;
	
	@FindBy(xpath = "//ul[@class=\"autoFill homeSearch\"]/li")
	public List<WebElement> searchresult;
	
	final String date= "//tr[@class=\"rb-monthHeader\"]/following::tr/td";
	@FindBy(xpath = date)
	public List<WebElement> dateSelect;
	
	@FindBy(xpath = "//div[@class=\"dp-time f-19 d-color f-bold\"]")
	public List<WebElement> timeList;
	
	@FindBy(xpath = "//div[@class=\"travels lh-24 f-bold d-color\"]")
	public List<WebElement> tourList;
	
	
	@FindBy(xpath ="//div[@class=\"seat-fare \"]//span[@class=\"f-19 f-bold\" or @class=\"f-bold f-19\"]")
	public List<WebElement> rate;
	
	WebElement element2= driver.findElement(By.id("src"));
	
public RedBusHomePage()
{
	PageFactory.initElements(driver, this);
}

	public void searchBuses(String from, String to)
	{
		fromLoc.sendKeys(from);
		List<WebElement> fromSearchList= driver.findElements(By.xpath(
				"//ul[@class='autoFill homeSearch']/li"));
		for(WebElement wb: fromSearchList)
		{
			String text= wb.getText();
			if(text.contains("Madiwala"))
				wb.click();
				break;
			
		}
		toLoc.sendKeys(to);
		List<WebElement> toSearchList= driver.findElements(By.xpath(
				"//ul[@class='autoFill homeSearch']/li"));
			
		for(WebElement wb: toSearchList)
		{
			
			Select select= new Select(wb);
			String text= wb.getText();
			if(text.equals("Borivali East, Mumbai"))
				select.selectByVisibleText(text);
				
			break;
				
		}//for	
}//method searchbuses

	public void date(int dt) {
	for(WebElement wb: dateSelect)
	{
		String day= wb.getAttribute("class");
		if(day.equals("current day") || 
		day.equals("wd day")||day.equals("we day"))
		{
		String days=wb.getText();
		int i= Integer.parseInt(days);
		if(dt==i)
		{
			wb.click();break;
		}
		}
	
	
	}
	}
	
	
	
}
