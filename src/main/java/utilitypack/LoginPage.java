package utilitypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	
	@FindBy(id= "txtUsername")
	public WebElement username;
	//private By username;
	
	@FindBy(id= "txtPassword")
	public WebElement password; 
	//private By password;
	
	@FindBy(id= "btnLogin")
	public WebElement loginButton;
	//private By loginButton;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this); 
	// the initElements() of PageFactory intializes PageFactory elements (annotated by @FindBy)
	
	}
public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
	

}
