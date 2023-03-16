package com.HRMS.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFileHandler {
	
	private String path = "D:\\Login_Excel.xlsx";

	

	public String readData(int sheet_index,int row_num,int cell_num ) throws IOException {

		File file = new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sheet = wb.getSheetAt(0);
//		XSSFRow row = sheet.getRow(0);
//		XSSFCell cell = row.getCell(0);
//		String data=cell.getStringCellValue();
		String data = wb.getSheetAt(sheet_index).getRow(row_num).getCell(cell_num).getStringCellValue();
//		print whatever data take from excel
		System.out.println(""+data);
		return data;
		
	}
	


	public void writeData(int sheet_index,int row_index,int cell_index,String cell ) throws IOException {
		
		try {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
//		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFWorkbook wb=new XSSFWorkbook();
	    XSSFSheet wds=wb.getSheetAt(sheet_index);
		XSSFRow wdr=wds.getRow(row_index);
		XSSFCell wdc=wdr.createCell(cell_index);
		wdc.setCellValue(cell);
//		wb.getSheetAt(sheet_index).getRow(row_index).createCell(cell_index).setCellValue(cell);
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		fos.close();
		fis.close();}
		catch(IOException  e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="onboardingData")
	public String[] onboarding() throws IOException {
		
		int row_int=8;
//		array int start from zero whenever we uses array from 1  so uses i-1 becuse excel doesnot have index 0
		String[] onboardingdata=new String[row_int];
		for(int i=1;i<=row_int;i++) {
			onboardingdata[i-1] = readData(2, i, 1);
		}
		return onboardingdata;
		
	}
	
}
