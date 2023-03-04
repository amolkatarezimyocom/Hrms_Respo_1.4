package com.HRMS.Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sub_module {
        private WebDriver driver;
        
      public  Sub_module(WebDriver driver){
        	this.driver=driver;
        	PageFactory.initElements(driver, this);
        }
        
      
//----------------Object Repository
         
      
        @FindBy(xpath="//h3[contains(text(),'Onboarding')]")
    	private	 WebElement Onboarding_object;
 
     //********************calendar**************************
        @FindBy(xpath="//h3[contains(text(),'Shift')]")
        private WebElement shift_object;
     
//------------------Action Repository
        
       public void submodule_onboarding_click()  {    	   
    	   Onboarding_object.click();  
       }
     //********************calendar**************************


       public void submodule_shift_click() {
    	   shift_object.click();
       }

       
       
       
       
}
