package com.HRMS.Pagelayer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMS.Testbase.Url_screenshot_Quit;

import form_library.Candidate_Creation_form;



public class OnBoardingPage {
																																																																																																																																																																																																																																																																
	private WebDriver driver;
	public Scanner myobj = new Scanner(System.in);
	
	public OnBoardingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	

//-------------------------Object Repository-------------------------------------------------
	
	@FindBy(xpath="//h3[contains(text(),'Overview')]")
	private WebElement  overview_object;
	
	@FindBy(xpath="//h3[contains(text(),'Candidate')]")
	 private WebElement candidate_object;
	
	@FindBy (xpath="//body/div[@id='root']/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/div[1]/*[1]")
	private WebElement Workflow_dropdown_arrow_btn_click_object;
	
	@FindBy(xpath="//h6[contains(text(),'Default Workflow')]")
	private WebElement Workflow_select_dropdown_object;
	
	@FindBy(xpath="//span[contains(text(),'Create New')]")
	private WebElement create_new_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Add Manually')]")
	private WebElement Add_manually_click_object;

	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submit_btn_object;
	
	private static final String intitate_button_click="(//div[contains(@data-rbd-draggable-id,%s)]//ancestor::button)[2]";

	
 ////************* common list click on Three dot on candidate**************//////////////////
	@FindBy(xpath="//span[contains(text(),'View Candidate')]")
	private WebElement View_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Edit Candidate')]")
	private WebElement Edit_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Withdraw')]")
	private WebElement Withdraw_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Blacklist')]")
	private WebElement Blacklist_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Move to previous step')]")
	private WebElement move_to_previous_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Move to next Step')]")
	private WebElement move_to_next_stage_candidate_click_object;

////*************** start click on Three dot on bucket list**************//////////////////

	private static final String cidwelcome = "(//div[contains(@data-rbd-draggable-id,\"Welcome Mail\") and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";

	private static final String cidmanagement="(//div[contains(@data-rbd-draggable-id,\"Management Approval\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidcandidatejoineeform="(//div[contains(@data-rbd-draggable-id,\"Candidate Joinee Form\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidverifycandidatedetail="(//div[contains(@data-rbd-draggable-id,\"Verify Candidate Details\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidaadharverify="(//div[contains(@data-rbd-draggable-id,\"Aadhaar Verification\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidctcapproval="(//div[contains(@data-rbd-draggable-id,\"CTC Approval\") and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidaddcandidatectc="(//div[contains(@data-rbd-draggable-id,\"Add Candidate CTC\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidofferletter="(//div[contains(@data-rbd-draggable-id,\"Offer letter\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidloi="(//div[contains(@data-rbd-draggable-id,\"LOI\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";

	private static final String cidconvertemployees ="(//div[contains(@data-rbd-draggable-id,\"Convert to Employee\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidemployeecredential ="(//div[contains(@data-rbd-draggable-id,\"Employee Credentials\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidtransferdocument ="(//div[contains(@data-rbd-draggable-id,\"Transfer Documents\")and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidappointmentletter ="(//div[contains(@data-rbd-draggable-id,\"Appointment Letter\") and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidbackgroundverification="(//div[contains(@data-rbd-draggable-id,\"Background Verification\") and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
	private static final String cidrequestasset="(//div[contains(@data-rbd-draggable-id,\"Request Assets\") and contains(@data-rbd-draggable-id,%s)]//child::button)[1]";
	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Welcome Mail\")]//child::button)[1]")
//	private WebElement welcome_mail_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Management Approval\")]//child::button)[1]")
//	private WebElement management_approval_threedot_click_object; 
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Candidate Joinee Form\")]//child::button)[1]")
//	private WebElement candidate_joinee_form_threedot_click_object; 
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Verify Candidate Details\")]//child::button)[1]")
//	private WebElement Verify_candidate_detail_threedot_click_object; 
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Aadhaar Verification\")]//child::button)[1]")
//	private WebElement adhaar_verification_threedot_click_object; 
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"CTC Approval\")]//child::button)[1]")
//	private WebElement ctc_approval_threedot_click_object; 
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Add Candidate CTC\")]//child::button)[1]")
//	private WebElement Add_candidate_CTC_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Offer letter\")]//child::button)[1]")
//	private WebElement Offer_letter_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"LOI\")]//child::button)[1]")
//	private WebElement LOI_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Convert to Employee\")]//child::button)[1]")
//	private WebElement convert_to_Employee_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Employee Credentials\")]//child::button)[1]")
//	private WebElement Employee_Credential_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Transfer Documents\")]//child::button)[1]")
//	private WebElement Transfer_Document_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Appointment Letter\")]//child::button)[1]")
//	private WebElement Appointment_Letter_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Background Verification\")]//child::button)[1]")
//	private WebElement Background_verification_threedot_click_object;
//	
//	@FindBy(xpath="(//div[contains(@data-rbd-draggable-id,\"Request Assets\")]//child::button)[1]")
//	private WebElement Request_Asset_threedot_click_object;
		
	
	
////*************** start click of  bucket list**************//////////////////

	@FindBy(xpath="//span[contains(text(),'Welcome mail')]")
	private WebElement welcome_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Management approval')]")
	private WebElement management_approval_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Candidate joinee form')]")
	private WebElement candidate_joinee_click_object;

	@FindBy(xpath="//span[contains(text(),'Verify candidate details')]")
	private WebElement Verify_candidate_detail_click_object;

	@FindBy(xpath="//body/div[@id='openModal']/div[3]/nav[1]/li[7]")
	private WebElement Aadhar_verfication_click_object;

	@FindBy(xpath="//span[contains(text(),'Ctc approval')]")
	private WebElement ctc_approval__click_object;
	
	@FindBy(xpath="//span[contains(text(),'Add candidate ctc')]")
	private WebElement Add_candidate_CTC_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Offer letter')]")	
	private WebElement Offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Letter of intent(loi)')]")
	private WebElement LOI_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Convert to employee')]")
	private WebElement convert_to_employees_click_object;	
	
	@FindBy(xpath="//span[contains(text(),'Employee credentials')]")
	private WebElement Employee_credential_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Appointment letter')]")
	private WebElement Appointment_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Background verification')]")
	private WebElement Background_verfication_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Appointment letter')]")
	private WebElement request_asset_click_object;
	
	
////*************** start click of  candidate profile **************//////////////////

	@FindBy(xpath="//span[contains(text(),\"CANDIDATE EMAIL\")]//following::div[2]")
	private WebElement get_candidate_email_object;
	
	@FindBy(xpath="//div[contains(text(),'Documents')]")
	private WebElement candidate_profile_Document_object;
	
	@FindBy(xpath="//span[contains(text(),\"CANDIDATE NAME\")]//following::div[2]")
	private WebElement get_candidate_name_object;
	
//	********************verify candidate detail**************************
	
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	private WebElement Procces_btn_verify_candidate_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Previous')]")
	private WebElement previous_btn_verify_candidate_click_object;
	
	@FindBy(xpath="//h6[contains(text(),'Approve')]")
	private WebElement approve_btn_verify_candidate_click_object;
	
	@FindBy(xpath="//h6[contains(text(),'Reclarification')]")
	private WebElement reclarification_btn_verify_candidate_click_object;
	
//	 *********************offer letter detail *************************

	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next_btn_offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	private WebElement cancel_btn_offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Send Offer Letter')]")
	private WebElement send_offer_btn_offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Update')]")
	private WebElement update_btn_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Preview Offer Letter')]")
	private WebElement preview_offer_btn_offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),'Previous')]")
	private WebElement previous_btn_offer_letter_click_object;
	
	@FindBy(xpath="//span[contains(text(),\"Attach\")]")
	private WebElement attach_document_offer_letter_object;
	
	@FindBy(xpath="//p[contains(text(),'Offer Letter')]")
	private WebElement offer_letter_select_object;
	
//	****************************LOI******************************
	@FindBy(xpath="//span[contains(text(),'Send Letter of Intent')]")
	private WebElement send_loi_btn_object;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	private WebElement cancel_btn_click_object;
	
	@FindBy(xpath="//p[contains(text(),'Application acknowledgment')]")
	private WebElement Application_Acknowledge_click_object;
	
//	joinee ctc
	
	@FindBy(xpath="//input[contains(@name,\"sal_structure\")]")
	private WebElement joinee_ctc_salary_structure_object;
	
	@FindBy(xpath="//input[contains(@name,\"incentive_plans\")]")
	private WebElement joinee_ctc_incentive_object;
	
	@FindBy(xpath="//input[contains(@name,\"ot_plans\")]")
	private WebElement joinee_ctc_overtime_plan;
	
	@FindBy(xpath="//input[contains(@name,\"flexi_plans\")]")
	private WebElement joinee_ctc_flexible_plan;
	
	@FindBy(xpath="//input[contains(@name,\"bonus_plans\")]")
	private WebElement joinee_ctc_bonus_plan;
	
	@FindBy(xpath="//input[contains(@name,\"applible_date_list\")]")
	private WebElement joinee_ctc_date;
	
	@FindBy(xpath="//input[contains(@name,\"esic_months\")]")
	private WebElement joinee_ctc_esc;
	
	@FindBy(xpath="//span[contains(text(),'Compute')]")
	private WebElement compute_btn_click;
	
	@FindBy(xpath="//span[contains(text(),\"Save\")]")
	private WebElement save_btn_click;
	
//---------------------------------------------------------------------
//-----------------------------	Action Repository----------------------------------------
	
	public void onboarding_overview_click() throws IOException, InterruptedException  {
		Url_screenshot_Quit screenshot = new Url_screenshot_Quit();
		overview_object.click();
		screenshot.screenshot("top");
		Thread.sleep(9000);
		overview_object.sendKeys(Keys.PAGE_DOWN);
		screenshot.screenshot("bottom");
		
	}
	
	public void candidate_workflow_DD_button_click() {
		Workflow_dropdown_arrow_btn_click_object.click();
	}
	
	public void onboarding_candidate_click() {
		candidate_object.click();
	}
	
	public void candidate_workflow_click() {
		Workflow_select_dropdown_object.click();
	}
	
	public void create_new_click() {
		create_new_click_object.click();
	}
	
	public void Add_manually_DD_click() {
		Add_manually_click_object.click();
	}
	
	public void submit_btn_click() {
		submit_btn_object.click();
	}
	
    public void Intitate_btn_mutiple_time_click(String cid_id) {
    	String fullpath=String.format(intitate_button_click, cid_id);
    	driver.findElement(By.xpath(fullpath)).click();

    }
	
////****************** common list click on Three dot on candidate**************//////////////////

	public void Three_dot_view_candidate_click() {
		View_candidate_click_object.click();
	}
	
    public void Three_dot_edit_candidate_click() {
    	Edit_candidate_click_object.click();
	}
    
    public void Three_dot_withdraw_candidate_click() {
    	Withdraw_candidate_click_object.click();
	}
    
    public void Three_dot_Blacklist_candidate_click() {
    	Blacklist_candidate_click_object.click();
	}
    
    public void Three_dot_move_to_next_step_candidate_click() {
    	move_to_next_stage_candidate_click_object.click();
	}
    
    public void Three_dot_move_to_prevoius_step_click() {
    	move_to_previous_candidate_click_object.click();
	}
	

    
////*************** start click on Three dot on bucket list**************//////////////////

    
	public void welcome_mail_Three_Dot_send_candidate(String cid_id) {
		  
		String fullXpath = String.format(cidwelcome, cid_id);
	    driver.findElement(By.xpath(fullXpath)).click();
//			welcome_mail_threedot_click_object.click();
	}
	
	public void management_Bucket_Three_dot_send_candidate(String cid_id) {
		  String fullXpath = String.format(cidmanagement, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		management_approval_threedot_click_object.click();
	}
	
	public void candidate_joinee_Three_dot_send_candidate(String cid_id) {
		  String fullXpath = String.format(cidcandidatejoineeform, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		candidate_joinee_form_threedot_click_object.click();
	}
	
	public void verify_candidate_Three_dot_click(String cid_id) {
		  String fullXpath = String.format(cidverifycandidatedetail, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Verify_candidate_detail_threedot_click_object.click();
	}
	
	public void Adhaar_verification_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidaadharverify, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		adhaar_verification_threedot_click_object.click();
	}
	
	public void Add_candidate_CTC_Three_Dot_click(String cid_id){
		  String fullXpath = String.format(cidaddcandidatectc, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Add_candidate_CTC_threedot_click_object.click();
	}
	
	public void Ctc_approval_Three_Dot_send_candidate(String cid_id) {
		  String fullXpath = String.format(cidctcapproval, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		ctc_approval_threedot_click_object.click();
	}
	
	public void Offer_letter_Three_Dot_send_candidate(String cid_id) {
		  String fullXpath = String.format(cidofferletter, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Offer_letter_threedot_click_object.click();
	}
	
	public void LOI_Three_Dot_click_send_canditate(String cid_id) {
		  String fullXpath = String.format(cidloi, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		LOI_threedot_click_object.click();
	}
	
	public void Convert_To_Employee_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidconvertemployees, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		convert_to_Employee_threedot_click_object.click();
	}
	
	public void Employee_Credential_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidemployeecredential, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Employee_Credential_threedot_click_object.click();
	}
	
	public void Transfer_Document_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidtransferdocument, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Transfer_Document_threedot_click_object.click();
	}
	
	public void Appointment_letter_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidappointmentletter, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Appointment_Letter_threedot_click_object.click();
	}
	
	public void Background_verification_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidbackgroundverification, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Background_verification_threedot_click_object.click();
	}
	
	public void Request_Asset_Three_Dot_click(String cid_id) {
		  String fullXpath = String.format(cidrequestasset, cid_id);
	      driver.findElement(By.xpath(fullXpath)).click();
//		Request_Asset_threedot_click_object.click();
	}
	
	
	
////*************** start click of  bucket list**************//////////////////
	
	public void welcome_email_Bucket_send_candidate() throws InterruptedException {
		welcome_candidate_click_object.click();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	public void management_Bucket_send_candidate() throws InterruptedException {
		management_approval_click_object.click();
//		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	public void Candidate_joinee_send_candidate() throws InterruptedException {
		candidate_joinee_click_object.click();
		driver.navigate().refresh();
		Thread.sleep(4000);
	}
	
	public void Verify_candidate_send_candidate() {
		Verify_candidate_detail_click_object.click();
	}
	
	public void Adhaar_verification_send_candidate() {
		Aadhar_verfication_click_object.click();
	}
	
	public void Ctc_Approval_send_candidate() {
		ctc_approval__click_object.click();
	}
	
	public void Add_candidate_Ctc_click() {
		Add_candidate_CTC_click_object.click();
	}
	
	public void Offer_letter_send_candidate(){
		Offer_letter_click_object.click();
	}
	
	public void Loi_send_candidate() {
		LOI_click_object.click();
	}
	
	public void convert_to_Employees_send_candidate() {
		convert_to_employees_click_object.click();
	}
	
	public void Employee_credential_send_candidate() {
		Employee_credential_click_object.click();
	}
	
	
	
////*************** start click of  candidate profile **************//////////////////

	public  void candidate_profile_document() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", candidate_profile_Document_object);
		Thread.sleep(3000);	 
		Actions action = new Actions(driver);
		action.moveToElement(candidate_profile_Document_object).click().perform();
		Thread.sleep(3000);	 
		driver.navigate().back();
		driver.navigate().refresh();
}
	
	
	public void get_candidate_email_address() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("Candidate Name  ----->  "+ get_candidate_name_object.getText());
	Thread.sleep(3000);
	System.out.println("On This Email Address User Get Email----->  "+ get_candidate_email_object.getText());	
	OnBoardingPage profile = new OnBoardingPage(driver);
	profile.candidate_profile_document();
	}
	
	
//	*************************verify candidate detail*********************************
	
	
	public void verify_candidate_detail() throws InterruptedException {
    	int j;
    	int process_btn_click = 0;
    	try {
    	for( j=1;j<=5;j++) {
    		Thread.sleep(3000);
    		process_btn_click =1;
    		verify_candidate_detail_btn_detail(process_btn_click); 
    	}
    	
    	System.out.println("Verify candidate detail approve ---> 1");
    	System.out.println("Verify candidate detail reclarification ---> 2");
    	System.out.println("Enter value of proceess ??");
    	String process=myobj.next();
    	
    	if(process.contains("1")) {
        	
        	for(j=1;j<=1;j++) {
        		process_btn_click = 3;
        		verify_candidate_detail_btn_detail(process_btn_click); 
        	}
        	}
    	if(process.contains("2")) {
        	
        	for(j=1;j<=1;j++) {
        		process_btn_click = 4;
        		verify_candidate_detail_btn_detail(process_btn_click); 
        	}
        	}
    	
    	}
    	catch(NoSuchElementException | ElementNotInteractableException e) {
    		verify_candidate_detail();
    	}
	}
  

    public  void verify_candidate_detail_btn_detail(int process_btn_click) throws InterruptedException {

    	
    	switch(process_btn_click) {
		case 1 : 
			Thread.sleep(3000);
			Procces_btn_verify_candidate_click_object.click();
			break;
			
		case 2:
			Thread.sleep(3000);
			previous_btn_verify_candidate_click_object.click();
		    break;
		    
		case 3 :
			Thread.sleep(3000);
			approve_btn_verify_candidate_click_object.click();
			break;
			
		case 4:
			Thread.sleep(3000);
			reclarification_btn_verify_candidate_click_object.click();
		    break;
		    
		default:
		}
   	
    	}
    
//  **********************************offer letter**********************
    
    public void offer_letter_page_action() throws InterruptedException {
    	

         
    	int offer_letter_stage=1;
    	
    	int offer_letter_action=myobj.nextInt();
    	
    	if(offer_letter_action == 1) {
    		offer_letter_action=3;
    	offer_letter_action_switch(offer_letter_action);}
    	else {
    		offer_letter_action=2;
    	offer_letter_action_switch(offer_letter_action);
    	}
    	
    	myobj.close();
    	}
    
    
    
   	public void offer_letter_action_switch(int offer_letter_stage) throws InterruptedException {
    		try {
    		switch(offer_letter_stage) {
    	case 1:{
    		next_btn_offer_letter_click_object.click();
    	}
    	break;
    	case 2:{
    		cancel_btn_offer_letter_click_object.click();
    	}
    	break;
    	case 3:{
    		send_offer_btn_offer_letter_click_object.click();
    	}
    	break;
    	case 5:{
    		update_btn_letter_click_object.click();
    	}
    	break;
    	case 4:{
    		preview_offer_btn_offer_letter_click_object.click();
    	}
    	break;
    	case 7:{
    		attach_document_offer_letter_object.click();
    	}
    	break;
    	case 8:{
    		offer_letter_select_object.click();
    	}
    	break; 
    	default:
    		
    		}

    		}
    	catch(NoSuchElementException e) {
    		offer_letter_page_action();
    	}
    	
 
    
    }
 
//******************************LOI****************
   	
   	public void Loi_page_action() {
   		int Loi_action = 0;
   		System.out.println("LOI send   --------> accept");
   		System.out.println("cancel click ------> cancel");
   		System.out.println("Enter value -->  ");
   		Loi_page_action_switch(Loi_action);
   	
   		String Loi=myobj.next();
   		if(Loi.equals("accept")){
//   			List<WebElement> li= driver.findElement(By.xpath("//li[contains(@class,\" css-1xhn06-MuiListItem-root\")]");
   			
    			Loi_action=1;
   	   		Loi_page_action_switch(Loi_action);

   		}
   		else {
   			System.out.println("c");
   			Loi_action=2;
   	   		Loi_page_action_switch(Loi_action);

   		}
   		
   	}
   	
   	public void Loi_page_action_switch(int Loi_action) {
   		switch(Loi_action) {
   		case 1 : {
   			send_loi_btn_object.click();
   		}break;
   		case 2 : {
   			cancel_btn_click_object.click();
   		}break; 
   		default:
   		   		   		   		}
	
   	}
   	
   	
   	
//   	joinee ctc
   	
   	public void joinee_ctc() throws InterruptedException {
   		joinee_ctc_salary_structure_object.sendKeys("New Structue");
   		joinee_ctc_incentive_object.sendKeys("incentives");
   		joinee_ctc_overtime_plan.sendKeys("Day wise");
   		joinee_ctc_flexible_plan.sendKeys("test");
   		joinee_ctc_bonus_plan.sendKeys("quarterly bonus");
   		joinee_ctc_date.sendKeys("Jan-2023");
   		joinee_ctc_esc.sendKeys("March-2023");
   		Thread.sleep(1000);
   		compute_btn_click.click();
   		Thread.sleep(1000);
   		int i=1;
   		for(i=1;i<=2;i++) {
   		Thread.sleep(1000);
   		save_btn_click.click();
   		System.out.println(i);
   		}
   	}
   	
}

    
    