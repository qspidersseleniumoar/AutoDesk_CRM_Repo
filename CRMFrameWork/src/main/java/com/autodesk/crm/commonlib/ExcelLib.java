package com.autodesk.crm.commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.media.sound.InvalidFormatException;
/**
 * 
 * @author deepak
 *
 */
public class ExcelLib {
	
	String filePath = "./src/test/resources/testData.xlsx";
	/**
	 * used to read data from Excel
	 * @param sheetNAme
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws EncryptedDocumentException
	
	 */
	public String getExcelData(String sheetNAme, int rowNum, int colNum) 
			throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(colNum).getStringCellValue();
	    wb.close();
		return data;
	}
	/**
	 * Write data back to Excel
	 * @param sheetNAme
	 * @param rowNum
	 * @param colNum
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 * @throws org.apache.poi.openxml4j.exceptions.InvalidFormatException
	 */
	public void setExcelData(String sheetNAme, int rowNum, int colNum,String data) 
			throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
	    Cell cel = row.createCell(colNum);
	    cel.setCellValue(data);
	    FileOutputStream fos = new FileOutputStream(filePath);
	    wb.write(fos);
	    wb.close();
		
	}
	/**
	 * get the TestData.Excel last used Row Count
	 * @param sheetNAme
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 * @throws org.apache.poi.openxml4j.exceptions.InvalidFormatException
	 */
	public int getRowCount(String sheetNAme) throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		int rowIndex = sh.getLastRowNum();
		return rowIndex;
		
	}
	/**
	 * get the data from properties File 
	 * @return
	 * @throws Throwable
	 */
	public Properties getPropertesObject() throws Throwable {
		FileInputStream fis = new FileInputStream("./config.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}


}
