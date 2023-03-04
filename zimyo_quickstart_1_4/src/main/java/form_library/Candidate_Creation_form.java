package form_library;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.HRMS.Testbase.Url_screenshot_Quit;

public class Candidate_Creation_form {
	
	private WebDriver driver;
	
	public Candidate_Creation_form(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
//	Object Repository
	
	@FindBy(xpath="//input[@id='CANDIDATE NAME']")
	private WebElement full_name_sendkey_object;
	
	@FindBy(xpath="//input[@id='CANDIDATE EMAIL']")
	private WebElement candidate_email_sendkey_object;
	
	@FindBy(xpath="//input[@id='multiple-limit-tags']")
	private WebElement reporting_manager_sendkey_object;
	
	@FindBy(xpath="//input[contains(@name,\"CANDIDATE_DEPARTMENT\")]")
	private WebElement candidate_dep_sendkeys_enter_object;
	
	@FindBy(xpath="//input[contains(@name,\"CANDIDATE_LOCATION\")]")
	private WebElement  candidate_location_sendkeys_enter_object; 
	
	@FindBy(xpath="//input[contains(@name,\"CANDIDATE_ENTITY\")]")
	private WebElement entity_sendkeys_enter_object;
	
	@FindBy(xpath="//input[contains(@name,\"JOINING_DATE\")]")
	private WebElement joining_date_sendkeys_enter_object;
	
	@FindBy(xpath="//input[contains(@name,\"CANDIDATE_CTC\")]")
	private WebElement ctc_sendkeys_enter_object;
	
	@FindBy(xpath="//input[contains(@name,\"CANDIDATE_DESIGNATION\")]")
	private WebElement designation_sendkeys_enter_object;
	
	@FindBy(xpath="//input[contains(@name,\"WORKFLOW_ID\")]")
	private WebElement workflow_sendkeys_enter_object;

	@FindBy(xpath="//input[contains(@name,\"SALARY\")]")
	private WebElement salary_structure_sendkeys_object;
	
	@FindBy(xpath="//input[@id='AGE']")
	private WebElement age_sendkeys_object;
	
	@FindBy(xpath="//div[contains(text(),\"Candidate has been added successfully\")]")
	private WebElement Candidate_create_sucess_mess_object;
	
	
//	Action Repository
	
	public void candidate_name_sendkeys(String fullname) throws InterruptedException {
		full_name_sendkey_object.click();
		full_name_sendkey_object.sendKeys(fullname + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void candidate_email_sendkey(String Email) throws InterruptedException {
		candidate_email_sendkey_object.sendKeys(Email + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void reporting_sendkeys_enter(String rm) throws InterruptedException {
		reporting_manager_sendkey_object.sendKeys(rm);
	Thread.sleep(3000);
	reporting_manager_sendkey_object.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	
	public void candidate_department_sendkeys(String department) {
		candidate_dep_sendkeys_enter_object.sendKeys(department + Keys.ARROW_DOWN + Keys.ENTER);
	}

	public void candidate_location_sendkeys(String location) {
		candidate_location_sendkeys_enter_object.sendKeys(location + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void entity_sendkeys_click(String entity) {
		entity_sendkeys_enter_object.sendKeys(entity + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void joining_sendkeys_click(String joining_date) {
		joining_date_sendkeys_enter_object.sendKeys(joining_date +  Keys.ENTER);
	}
	
	public void ctc_sendkeys_click(String ctc) {
		ctc_sendkeys_enter_object.sendKeys(ctc + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void designation_sendkeys_click(String designation) {
		designation_sendkeys_enter_object.sendKeys(designation + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void workflow_sendkeys_click(String workflow) {
		workflow_sendkeys_enter_object.sendKeys(workflow + Keys.ARROW_DOWN + Keys.ENTER);
	}
	
	public void salary_structure_click(String sa_st){
		salary_structure_sendkeys_object.sendKeys(sa_st + Keys.ARROW_DOWN +Keys.ENTER);
	}

	public void age_sendkeys(String age) {
		age_sendkeys_object.sendKeys(age);	
	}
	
//	public void candidate_create_suceess_mess_gettext() throws InterruptedException {
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	  WebElement re=  wait.until(ExpectedConditions.exception(Candidate_create_sucess_mess_object));
//		System.out.println("a");
//		String candidate_Mess=Candidate_create_sucess_mess_object.getText();
//	    System.out.println("b");
//	    // element is now stale and can be safely accessed or manipulated
//
//		System.out.println(candidate_Mess.replaceAll("\\s", ""));
//		
////	    Assert.assertEquals(candidate_Mess, "Success Candidate has been added successfully");
//	    Assert.assertEquals("Success", candidate_Mess);
//	}

	
	
}
