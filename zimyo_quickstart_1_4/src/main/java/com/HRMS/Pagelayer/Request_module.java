package com.HRMS.Pagelayer;


import org.testng.annotations.Test;

import com.HRMS.Testbase.Employee_side_request;
import com.HRMS.Testbase.Main_Module;
import com.HRMS.Testbase.Sub_module;
import com.HRMS.Testbase.Url_screenshot_Quit;

public class Request_module extends Url_screenshot_Quit{

	

	private Main_Module apps_module_click;
	private Sub_module ess;
	private Employee_side_request es;


	@Test
	public void management_approval()   throws InterruptedException {
		apps_module_click = new Main_Module(driver);
		apps_module_click.apps_module();
		
		ess = new Sub_module(driver);
		ess.submodule_ess_click();
		Thread.sleep(2000);

		es=new Employee_side_request(driver);

		es.request_module_click();
		es.request_module_pendingonme_click();
		Thread.sleep(2000);
		es.request_module_Management_Approval_click();
		Thread.sleep(2000);
		es.reuest_module_management_approval_approval_click();
    	es.request_module_management_approval_process_btn();
		
	}
	
	@Test(priority=1)
	public void ctc_approval()   throws InterruptedException {
		apps_module_click = new Main_Module(driver);
		apps_module_click.apps_module();
		
		ess = new Sub_module(driver);
		ess.submodule_ess_click();
		Thread.sleep(2000);

		es=new Employee_side_request(driver);

		es.request_module_click();
		es.request_module_pendingonme_click();
		Thread.sleep(2000);
		es.request_ctc_approval_click();
		Thread.sleep(2000);
		es.request_ctc_approval_accept();
    	
		
	}
	
	
}
