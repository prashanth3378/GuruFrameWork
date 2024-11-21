package DATADRiveing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datafetchexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("C:\\Users\\prashanth\\Downloads\\Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);

	  	int sheets = book.getNumberOfSheets();
	  	for(int i=0;i<sheets;i++)
	  	{
	 if(book.getSheetName(i).equalsIgnoreCase("sheet1"))
						 {
	XSSFSheet sheett = book.getSheetAt(i);
	
	int cells = sheett.getRow(i).getLastCellNum();
	for(int j=0;j<cells;j++)
	{
	System.out.println(cells);
	}
	int rows = sheett.getLastRowNum();
						 
	System.out.println(rows);
	
	
						 }
			    	}}}

