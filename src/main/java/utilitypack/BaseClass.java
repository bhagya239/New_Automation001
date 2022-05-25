package utilitypack;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static  WebDriver driver=null;
	
public static void	getBrowserInstance(String browser)
	{
	switch(browser)
		{
	case "Chrome":
		System.setProperty("webdriver.chrome.driver", "D:\\All WebDrivers\\chromedriver.exe");
			 driver= new ChromeDriver(setChromeOption());
			break;
	case "Edge":
		System.setProperty("webdriver.edge.driver", "D:\\All WebDrivers\\msedgedriver.exe");
		 driver= new EdgeDriver();

		break;
	default:
		System.setProperty("webdriver.chrome.driver", "D:\\All WebDrivers\\chromedriver.exe");
		 driver= new ChromeDriver();
		}// switch ended
	
	}
	
	public  static ChromeOptions  setChromeOption()
	{
		ChromeOptions option= new ChromeOptions();
		option.setImplicitWaitTimeout(Duration.ofSeconds(10));
		Map<String, Object> map= new HashMap<>();
		map.put("download.default_directory", "D:\\Downloads Files");
		return option.setExperimentalOption("prefs", map);
		
	}//chromeoption method
	

}//class
