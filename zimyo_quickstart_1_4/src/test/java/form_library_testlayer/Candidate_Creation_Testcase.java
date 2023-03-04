package form_library_testlayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import form_library.Candidate_Creation_form;

public class Candidate_Creation_Testcase {
	
	private WebDriver driver;
	private Candidate_Creation_form form ;
	
	public Candidate_Creation_Testcase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Candidate_creation()  throws InterruptedException {
		form = new Candidate_Creation_form(driver);
	
		
		form.candidate_name_sendkeys(" world cup ");
		form.candidate_email_sendkey("TOLacup@yopmail.com");
		form.reporting_sendkeys_enter("Pawan Dalal Original");
		form.candidate_department_sendkeys("hr");
		form.candidate_location_sendkeys("Gurgaon");
		form.entity_sendkeys_click("amol");
		form.joining_sendkeys_click("2023/02/10");
		form.ctc_sendkeys_click("5627829");
		form.designation_sendkeys_click("president");
		form.workflow_sendkeys_click("Default wor");
		form.salary_structure_click("TEST");
		form.age_sendkeys("20");
		
	}
	
}
