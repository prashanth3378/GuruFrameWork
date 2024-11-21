package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.crm.Generic_utility.webdriver_utility;

public class practicsel {

	public static void main(String[] args) throws Throwable 
	{
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("disable notifications");

System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.cricbuzz.com");

driver.manage().window().maximize();
/*
 * driver.findElement(By.xpath(
 * "//a[text()='Schedule']/following::a[text()='MATCHES']")).click();
 * List<WebElement> ele = driver.findElements(By.
 * xpath("//a[text()='SUPER SMASH 2022-23']/following::div[2]"));
 * Thread.sleep(5000); for(WebElement list:ele) { System.out.println(list); }
 * String text =
 * driver.findElement(By.xpath("//div[text()='217-9 (20 Ovs)']")).getText();
 * System.out.println(text);
 */
	} 
}