package com.HRMS.Testlayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HRMS.Pagelayer.Dashboard;
import com.HRMS.Testbase.Main_Module;
import com.HRMS.Testbase.Url_screenshot_Quit;

public class Dashboard_Test extends Url_screenshot_Quit{

	
//	public Dashboard_Test(WebDriver driver) {
//		this.driver=driver;
//	}
	private Main_Module apps_module_click;
	Dashboard Apply_new_btn_click;
//	Url_screenshot_Quit url ;

	@Test
	public void Dashboard_Applynew_Btn()   throws InterruptedException {
		apps_module_click = new Main_Module(driver);
		apps_module_click.apps_module();
		Apply_new_btn_click = new Dashboard(driver);
    	Apply_new_btn_click.Apply_new_Btn_Click();
		
	}
	
	
}
