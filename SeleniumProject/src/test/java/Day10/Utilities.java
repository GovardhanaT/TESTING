package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utilities 
{
	public static void main(String[] args)
   {
	 String excelPath="C:\\Users\\Govardhana Thangavel\\Documents\\TESTING\\SeleniumProject\\target\\excelss.xlsx";
	 try
	 {
		 FileInputStream inputStream = new FileInputStream(excelPath);
		 Workbook workbook = new XSSFWorkbook(inputStream);
		 Sheet sheet = workbook.getSheetAt(0);
	     
		 
		 //read data from excel
		 readSheet(sheet);
		 
		 //write data from excel
		 writeSheet(sheet);
		 
		 
		 FileOutputStream outputStream = new FileOutputStream(excelPath);
		 workbook.write(outputStream);
		 workbook.close();
		 outputStream.close();
		 System.out.println("Your message is retreived and entered successfully");
		 
	 
	 }
	 catch(IOException e)
	 {
		 System.out.println(e);
	 }
		
		
	}

	private static void writeSheet(Sheet sheet) 
	{
		Row newRow = sheet.createRow(sheet.getLastRowNum());
        Cell newCell_1 =newRow.createCell(0);
        newCell_1.setCellValue("first index done");
	}

	private static void readSheet(Sheet sheet) {
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				CellType cellType = cell.getCellType();
				if(cellType ==cellType.STRING)
					
			
					System.out.println(cell.getStringCellValue());
					
				
				else if(cellType==cellType.NUMERIC)
					System.out.println(cell.getNumericCellValue());
;				
			}
		}
		
	}

}
