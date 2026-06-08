package Utilities; 


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import Base.Task_BaseClass;

public class Task_UtilityClass extends Task_BaseClass{
	public static String[][] getExcelData() throws IOException {
		FileInputStream file=new FileInputStream("E:\\Vijay\\java_programming\\POM_Project\\target\\TestData.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("sheet1");
		int totalrows = sheet.getLastRowNum();
		short totalcells = sheet.getRow(1).getLastCellNum();
		String data[][] =new String[totalrows][totalcells];
//		System.out.println("no of rows :"+totalrows);
//		System.out.println("no of cells :"+totalcells);
		
		for(int r=1;r<=totalrows;r++) {
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0;c<totalcells;c++) {
				XSSFCell cell = currentrow.getCell(c);
				data[r-1][c] =cell.toString();
			}
		}
		book.close();
		file.close();
		
		return data;
	}
	
	public static void screenshot(WebDriver driver,String loginClass) throws IOException  {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\sonyg\\eclipse-workspace\\pom\\screenshot\\"+loginClass+".png");
		Files.copy(src, dest);
		
		System.out.println("screenshot captured");
	}

}