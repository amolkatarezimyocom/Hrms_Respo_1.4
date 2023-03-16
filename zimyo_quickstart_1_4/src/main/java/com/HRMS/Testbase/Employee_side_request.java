package com.HRMS.Testbase;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.Utilities.AssertObject;

public class Employee_side_request {
	
	private WebDriver driver;
	private AssertObject softassert;
	
	public Employee_side_request(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
//---------------- Object repro---------------------------
	@FindBy(xpath="(//h3[contains(text(),\"Request\")])[1]")
	private WebElement request_object;

	@FindBy(xpath="(//h3[contains(text(),\"Pending on me\")])[1]")
	private WebElement request_pending_on_me_object;
	
	@FindBy(xpath="//p[contains(text(),\"Request has been updated successfully.\")]")
	private WebElement Request_has_been_updated_successfully;
	
    //***************request management approval****************


	@FindBy(xpath="(//h3[contains(text(),\"Management Approval\")])[1]")
	private WebElement request_Management_Approval_object;
	
	@FindBy(xpath="((//p[contains(text(),\"Amol Test\")])//parent::div)[1]")
	private WebElement request_management_approval_clickcandidatelink;
	
	@FindBy(xpath="//span[contains(text(),\"Proceed\")]")
	private List<WebElement> request_management_approval_processbtn_click;

	@FindBy(xpath="//h6[contains(text(),\"Approve\")]")
	private List<WebElement> request_management_approval_process_btn;
	
	
    //***************request ctc approval****************
	
	@FindBy(xpath="(//h3[contains(text(),\"CTC Approval\")])[1]")
	private WebElement request_ctc_approval_object;
	
	@FindBy(xpath="((//p[contains(text(),\"Test new\")])//parent::div)[1]")
    private WebElement request_ctc_approval_candatelinkclick;
	
	@FindBy(xpath="(//input[contains(@name,\"remark\")])")
	private WebElement request_ctc_approval_remark_sendkeys_object;
	
	@FindBy(xpath="(//h6[contains(text(),\"Approve\")])[1]")
	private WebElement request_ctc_approval_accept_object;
	
	
	
	
	//------------------Action  repro-----------------------
	

	public void request_module_click() {
		request_object.click();
	}
	
	public void request_module_pendingonme_click() {
		request_pending_on_me_object.click();
	}
	
    //***************request****************

	
	public void request_module_Management_Approval_click() {
		request_Management_Approval_object.click();
	}
	
	public void reuest_module_management_approval_approval_click() {
		request_management_approval_clickcandidatelink.click();
		
	}
	
	public void request_module_management_approval_process_btn() throws InterruptedException {
		try {
		boolean process=request_management_approval_processbtn_click.size()>0;
		if(process == true) {
			System.out.println("we");
			Thread.sleep(1000);
			request_management_approval_processbtn_click.get(0).click();
			request_module_management_approval_process_btn();
				}
		else {
			System.out.println("wge");

		Boolean approve=request_management_approval_process_btn.size()>0;
		request_management_approval_process_btn.get(0).click();
		String actual=Request_has_been_updated_successfully.getText();
		softassert = new AssertObject();
		softassert.assertobject(actual, "Request has been updated successfully.");
		}
		}
		catch(NoSuchElementException e) {
			System.out.println("No such Candidate exist in management approval");
		}
		
	}
	
    //***************request ctc approval****************

	public void request_ctc_approval_click() {
		request_ctc_approval_object.click();
	}
	
	public void request_ctc_approval_accept() throws InterruptedException {
		try {
		request_ctc_approval_candatelinkclick.click();
		Thread.sleep(2000);
		request_ctc_approval_remark_sendkeys_object.sendKeys("ok");
		Thread.sleep(3000);
		request_ctc_approval_accept_object.click();
		String actual=Request_has_been_updated_successfully.getText();
		softassert = new AssertObject();
		softassert.assertobject(actual, "Request has been updated successfully.");
	}
	
	catch(NoSuchElementException e) {
		System.out.println("No such Candidate exist in ctc approval");
	
	}
}
}
