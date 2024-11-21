package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import freemarker.core.ReturnInstruction.Return;

public class Dataprovider {

	@Test(dataProvider="getdata")
	public void login (String usn,String pwd)
	{
		System.out.println(usn +" username "+ pwd + " password ");
	}
@DataProvider
public  Object[] [] getdata()
{
	Object[][] obj = new Object [3] [2];
	obj[0][0]="prasha";
	obj[0][1]="ma";
	
	obj[1][0]="hg";
	obj[1][1]="kj";
	
	obj[2][0]="ki";
	obj[2][1]="iuy";
	return obj;
	
	
	
}

}