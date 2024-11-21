package practice;


import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.AccessException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.Generic_utility.webdriver_utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
//JavascriptExecutor js=(JavascriptExecutor)driver;
driver.get("https://www.amazon.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
List<WebElement> ele = driver.findElements(By.xpath("//a"));
for(int i=0;i<ele.size();i++)
{
	String url=ele.get(i).getAttribute("href");
	try {
		URL u= new URL(url);
URLConnection urlcon = u.openConnection();
HttpURLConnection httpcon=(HttpURLConnection)urlcon;
int statuscode = httpcon.getResponseCode();
if(statuscode!=200)
{
	System.out.println("this url"+url+"is==="+httpcon.getResponseCode()+"=="+httpcon.getResponseMessage());
}}
	catch(Exception e)
	{
		System.out.println("this link is broken"+url);
	}
	{
		
}
	}

		
	}
}


	
	
	
	
	