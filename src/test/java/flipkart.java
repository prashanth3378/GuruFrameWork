import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	@Test
	public void Flipcart() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		String title = "Facebook";
		WebElement fb = driver.findElement(By.xpath("//a[ text()='Facebook']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		int y = fb.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")");
		fb.click();
		String ftitle = driver.getTitle();
		Thread.sleep(2000);
		Assert.assertTrue(ftitle.contains(title));	
		}
	}
