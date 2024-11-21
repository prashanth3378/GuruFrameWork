package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class akkamaiexcelprogram {
@Test
	public  void pro() throws Throwable
	{
	LinkedHashSet<String>set=new LinkedHashSet<>();
		FileInputStream fis=new FileInputStream("./Book7.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int no = sheet.getLastRowNum();
		{
			for(int i=0;i<=no;i++)
			{
				String data = sheet.getRow(i).getCell(0).getStringCellValue();
				set.add(data);
			}
			for(String d:set)
			{
				System.out.println(d);
			}
		}}}
		

