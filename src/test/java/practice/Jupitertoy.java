package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jupitertoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager .chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com/");
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
	driver.findElement(By.xpath("//input[@id='forename']")).sendKeys("raj");
	driver.findElement(By.xpath("//input[@id=\"surname\"]")).sendKeys("nothing");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("submit it ");
	driver.findElement(By.xpath("//a[text()='Submit']")).click();
	driver.findElement(By.xpath("//a[text()='Shop']")).click();
	
	
	
	
	
	
	}
	
	

}
