package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
		public static String[][] readData(String filename) throws IOException
		{
	
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		//XSSFRow row = ws.getRow(1);
		int rowCount= ws.getLastRowNum();
		
		short columnCount = ws.getRow(0).getLastCellNum();
		//string[][]
		
		String[][] data =new String[rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row = ws.getRow(i); 
		
		for(int j=0;j<columnCount;j++) {
			
		XSSFCell cell = row.getCell(j);
		
		String cellValue = cell.getStringCellValue();
	     
		data[i-1][j]=cellValue;
		
		System.out.println(cellValue);
		}
	
	}
		wb.close();
		return data;
		
}
}