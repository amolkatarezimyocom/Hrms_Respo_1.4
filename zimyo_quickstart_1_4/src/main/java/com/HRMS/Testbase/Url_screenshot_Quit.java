package com.HRMS.Testbase;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import com.HRMS.Pagelayer.Loginpage;
import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Url_screenshot_Quit {
	
	
	public WebDriver driver;

	

@BeforeMethod
	public void url() throws InterruptedException {
String br = "chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		

		driver.get("https://www.zimyo.work/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		Loginpage login_obj = new Loginpage(driver);
		login_obj.username_txtbox("Pawan.dalal@yopmail.com");
		login_obj.password_txtbox("pawanDal@190");
		login_obj.Login_btn_click();	
		login_obj.Sucessfully_mess_get_text();	
		
	}
   

	
	public void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des = new File ("D:\\screenshot automated\\04_02_2023\\"+filename+".png");
		FileHandler.copy(src, des);
	
	}
	
	
//	public void waits() {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	}
	
	
	

	
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(9000);
		driver.close();
	}

}
