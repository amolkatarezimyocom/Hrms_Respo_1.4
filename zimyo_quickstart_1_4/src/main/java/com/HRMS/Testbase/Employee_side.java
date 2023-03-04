package com.HRMS.Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_side {
	
	private WebDriver driver;
	
	Employee_side(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
//	pagefactory  Object repro
	
	@FindBy(xpath="//h3[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	
//   Action  repro
	
	public void dashboard_module() {
		dashboard.click();		
	}
	
	

}
