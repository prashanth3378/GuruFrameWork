package practice;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://www.google.com");
driver.manage().window().maximize();
Set<String> allid = driver.getWindowHandles();
Iterator<String> it = allid.iterator();
while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println("switched");
}
driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	}
	

}
