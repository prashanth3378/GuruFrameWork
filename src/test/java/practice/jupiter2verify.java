package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jupiter2verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager .chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		String Expected ="Forename is required";
		String Exp1="Email is required";
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com");
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		String actmesg = driver.findElement(By.xpath("//span[text()='Forename is required']")).getText();
		if(actmesg.equals(actmesg))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}}
