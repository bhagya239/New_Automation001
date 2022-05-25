package utilitypack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyHandling  {
	Properties property;
	public PropertyHandling() throws IOException
	{
		String filepath= "C:\\Users\\User\\eclipse-workspace\\New_Automation\\config.properties";
		FileInputStream input= new FileInputStream(filepath);
		property= new Properties();
		property.load(input);
		
	}
	
	
	public String getProperty(String key)
	{
		return property.getProperty(key);
		
	}

}
