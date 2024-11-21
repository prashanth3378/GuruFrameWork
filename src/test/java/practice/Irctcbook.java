package practice;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctcbook {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	ChromeOptions	options=new ChromeOptions();
	options.addArguments("disable notifications");
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in");
		//String alertmesg = driver.switchTo().alert().getText();
		//System.out.println(alertmesg);
		String parentid = driver.getWindowHandle();
		System.out.println("parentid is"+parentid);
	//	driver.findElement(By.xpath("//button[text()='Allow']")).click();
		driver.findElement(By.xpath("//div[@class='h_menu_drop_button_hidden_xs']//i[class='fa fa-align-justify']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='a']//label[txt()='FLIGHTS']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String wid:allid)
		{
			if(wid.equals(parentid))
			{
				driver.switchTo().window(wid);
				break;
			}
		}
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//button[text()='later']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//input[@id='stationFrom']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//div [@id='ui-id-182']")).click();
		driver.findElement(By.xpath("//input[@id='stationTo']")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//input[@id='originDate']")).click();
		String month = "December 2022";
	String date = "14";

		//Dynamic xpath
	driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='datepicker datepicker-dropdown datepicker-left datepicker-bottom rdeparturedate no-border']/descendent::p[text()='"+date+"']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-md yellow-gradient home-btn']")).click();
	
	}
		
	}





















/*
Set<String> allid1 = driver.getWindowHandles();
Iterator<String> it1 = allid1.iterator();
while(it1.hasNext())
{
String wid = it1.next();
driver.switchTo().window(wid);
if(driver.getTitle().contains("Click on allow to subscribe to notifications"))
{
  break;
}}*/