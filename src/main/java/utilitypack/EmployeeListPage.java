package utilitypack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends BaseClass{
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIMModule;
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement employeeName;
	
	@FindBy(id="empsearch_id")
	public WebElement empsearchId;
	
	@FindBy(id="empsearch_employee_status")
	public WebElement employmentStatus;
	
	@FindBy(id="empsearch_termination")
	public WebElement include;
	
	@FindBy(id="empsearch_supervisor_name")
	public WebElement supervisorName ;
	
	@FindBy(id="empsearch_job_title")
	public WebElement jobTitle;
	
	@FindBy(id="empsearch_sub_unit")
	public WebElement subUnit;
	
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@FindBy(id="resetBtn")
	public WebElement resetButton;
	
	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	@FindBy(id="btnDelete")
	public WebElement deleteButton;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	
	@FindBy(id="btnSave")
	public WebElement saveButton;
	
	public EmployeeListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addEmployee(String first, String last)
	{  
		PIMModule.click();
		addButton.click();
		firstName.sendKeys(first); lastName.sendKeys(last);
		saveButton.click();
		
	}
	
	
	

}
