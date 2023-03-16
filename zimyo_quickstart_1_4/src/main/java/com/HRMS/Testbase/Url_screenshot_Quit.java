package com.HRMS.Testbase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.HRMS.Pagelayer.Loginpage;
import com.HRMS.Utilities.ExcelFileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Url_screenshot_Quit {
	
	
	public WebDriver driver;
	


	
	@BeforeMethod
	public void url() throws InterruptedException, IOException {
   
	ExcelFileHandler fh=new ExcelFileHandler();
	
	String br = fh.readData(0, 0, 1);
		
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
		
		

		driver.get(fh.readData(0, 1, 1));
//		String actual=driver.getCurrentUrl();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		
//		if (actual.equals(fh.readData(0, 1, 1))) {
//			fh.writeData(0, 1, 2, "pass");
//		}

		Loginpage login_obj = new Loginpage(driver);
		login_obj.username_txtbox(fh.readData(0, 2, 1));
		login_obj.password_txtbox(fh.readData(0, 3, 1));
		login_obj.Login_btn_click();	
		login_obj.Sucessfully_mess_get_text();	
		
		
	}
   

	
	public String screenshot(String filename) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des = new File ("D:\\automation screenshot\\"+filename+".png");
		FileUtils.copyFile(src, des);
		return filename;
	
	}
	
	
//	public void waits() {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	}
	
	

	
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(9000);
		driver.close();
		driver.quit();
	}

}
