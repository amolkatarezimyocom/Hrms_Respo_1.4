package com.HRMS.Testlayer;

import java.io.IOException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.HRMS.Pagelayer.OnBoardingPage;
import com.HRMS.Testbase.Main_Module;
import com.HRMS.Testbase.Sub_module;
import com.HRMS.Testbase.Url_screenshot_Quit;
import com.HRMS.Utilities.ExcelFileHandler;

import form_library.Candidate_Creation_form;
import form_library_testlayer.Candidate_Creation_Testcase;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public  class Onboarding_Test extends Url_screenshot_Quit  {                                                                                                                                                                     




	Scanner myObj ; 
	public OnBoardingPage onboarding;
	public Candidate_Creation_Testcase Candidate_Detail_fill;
    public int i;
    private ExcelFileHandler excelFileHandler;
    
	@Test(dataProvider="onboardingData",dataProviderClass=ExcelFileHandler.class)
	public void Onboarding() throws InterruptedException, IOException  { 
	   try {
		Main_Module Organisation = new Main_Module(driver);
		Organisation.organisation_module();
		
		Thread.sleep(3000);
		
		Sub_module submodule_Onboarding = new Sub_module(driver);
		submodule_Onboarding.submodule_onboarding_click();

		Thread.sleep(3000);

		onboarding = new OnBoardingPage(driver);
//		onboarding.onboarding_overview_click();
		onboarding.onboarding_candidate_click();
		
		Thread.sleep(3000);
		onboarding.candidate_workflow_DD_button_click();
		onboarding.candidate_workflow_click();
		
		Thread.sleep(3000);
		
//	   	onboarding.create_new_click();
//     	onboarding.Add_manually_DD_click();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
//	    Candidate_Detail_fill = new Candidate_Creation_Testcase(driver);
//		Candidate_Detail_fill.Candidate_creation();
//
//		onboarding.submit_btn_click();	
		
		excelFileHandler = new ExcelFileHandler(); 
//		excelData = excelFileHandler.onboarding();
//		for (int i = 0; i < excelData.length; i++) {
//			System.out.println(excelData[i]);
//		}
		

		System.out.println("Enter CID?????"+"\"CID\":");
		String cid_id= excelFileHandler.readData(1, 1, 3);
		
		sendToStep(1,cid_id);
//		askInput(cid_id); 

//		myObj.close();
		
		
		
	   }
	   catch( Exception e) {
		   System.out.println(e.getMessage());
		   int a = 0;
		   int b=2;
		   System.out.println(b/a);
		  	   }
	}


@DataProvider(dataProvider="onboardingData",dataProviderClass=ExcelFileHandler.class)
public void askInput(String cid_id) throws InterruptedException, IOException {
	try {
		System.out.println("Send Welcome  Mail           : Press 1");
		System.out.println("Send Management Approval     : Press 2");
		System.out.println("Send Candidate Joinee Form   : Press 3");
		System.out.println("Send Verify Candidate Detail : Press 4");
		System.out.println("Send Aadhaar Verification    : Press 5");
		System.out.println("Send CTC Approval            : Press 6");
		System.out.println("Send Add Candidate CTC       : Press 7");
		System.out.println("Send Offer Letter            : Press 8");
		System.out.println("Send LOI                     : Press 9");
		System.out.println("Send Convert to Employee     : Press 10");
		System.out.println("Send Employee Credentials    : Press 11");
//		System.out.println("Send Transfer Document       : Press 2");
//		System.out.println("Send Appointment Letter      : Press 2");
//		System.out.println("Send Background Verification : Press 2");
//		System.out.println("Send Request Assets          : Press 2");

//		System.out.println("Please Enter Number :  ");
//		myObj = new Scanner(System.in);
//		int step = myObj.nextInt();
		
		String[] step=excelFileHandler.onboarding();
		for (int i = 0; i < step.length; i++) {
			System.out.println("Step: "+step[i]);
		}
//		sendToStep(step, cid_id);
		System.out.println("askinput end");
//		myObj.close();

	}
	catch(InputMismatchException | ElementClickInterceptedException | NoSuchElementException e) {
		askInput(cid_id);
		System.out.println("Enter correct value");
	}
}



private void sendToStep(int step,String cid_id) throws InterruptedException, IOException {

	
	switch(step) {
	case 1: {
//		onboarding.welcome_mail_Three_Dot_send_candidate(cid_id);
//		onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.welcome_mail_Three_Dot_send_candidate(cid_id);
		onboarding.welcome_email_Bucket_send_candidate();
		
	}
	break;
	case 2:{
//		onboarding.management_Bucket_Three_dot_send_candidate(cid_id);
//		onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.management_Bucket_Three_dot_send_candidate(cid_id);
		onboarding.management_Bucket_send_candidate();
				
		}
	break;
	case 3:{
//		onboarding.candidate_joinee_Three_dot_send_candidate(cid_id);
//		onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.candidate_joinee_Three_dot_send_candidate(cid_id);
		onboarding.Candidate_joinee_send_candidate();

	}
	break;
	case 4:{
//		onboarding.verify_candidate_Three_dot_click(cid_id);
//		onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.verify_candidate_Three_dot_click(cid_id);
        onboarding.Verify_candidate_send_candidate();
        onboarding.verify_candidate_detail();
	}
	break;
	case 5:{
//		onboarding.Adhaar_verification_Three_Dot_click(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Adhaar_verification_Three_Dot_click(cid_id);
        onboarding.Three_dot_move_to_next_step_candidate_click();
	}
	break;
	case 6:{
//		onboarding.Ctc_approval_Three_Dot_send_candidate(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Ctc_approval_Three_Dot_send_candidate(cid_id);
		onboarding.Ctc_Approval_send_candidate();
	}
	break;
	case 7:{
//		onboarding.Add_candidate_CTC_Three_Dot_click(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Add_candidate_CTC_Three_Dot_click(cid_id);
		Thread.sleep(1000);
		onboarding.Add_candidate_Ctc_click();
		onboarding.joinee_ctc();
	}
	break;
	case 8:{
//		onboarding.Offer_letter_Three_Dot_send_candidate(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Offer_letter_Three_Dot_send_candidate(cid_id);
		onboarding.Offer_letter_send_candidate();
		onboarding.offer_letter_page_action();
	}
	break;
	case 9:{
//		onboarding.LOI_Three_Dot_click_send_canditate(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.LOI_Three_Dot_click_send_canditate(cid_id);
		onboarding.Loi_send_candidate();
		onboarding.Loi_page_action();
	}
	break;
	case 10:{
//		onboarding.Convert_To_Employee_Three_Dot_click(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Convert_To_Employee_Three_Dot_click(cid_id);
		onboarding.convert_to_Employees_send_candidate();
	}
	break;
	case 11:{
//		onboarding.Employee_Credential_Three_Dot_click(cid_id);
//        onboarding.Three_dot_view_candidate_click();
//		onboarding.get_candidate_email_address();
		onboarding.Employee_Credential_Three_Dot_click(cid_id);
		onboarding.Employee_credential_send_candidate();
	}
	break;
	default:
		for(i=1;i<=2;i++) {
			Thread.sleep(3000);
		onboarding.Intitate_btn_mutiple_time_click(cid_id);
		System.out.println(i);
		Thread.sleep(2000);
		}

		
	}
	
	System.out.println("Next Bucket ---> true");
	System.out.println("Complete Stage---> false");
	System.out.println("Rerun Again ---> ????? ");
    String Rerun_again = myObj.next();
	if(Rerun_again.contains("true")) {
				askInput(cid_id);
       }


	myObj.close();	
	}
	

	
	}

	



