import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

class AmazonzoomSceniro {
@Test
	public void amazon() throws Throwable
	{
	WebDriverManager.chromedriver().setup();
//	ChromeOptions op=new ChromeOptions();
//	op.addArguments("--headless");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	String title = "Facebook";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement fb = driver.findElement(By.xpath("//li[@class=\"nav_first\"]/a[text()='Facebook']"));
	int y = fb.getLocation().getY();
	
	js.executeScript("window.scrollBy(0,800)");
	fb.click();
	String ftitle = driver.getTitle();
	Thread.sleep(2000);
	Assert.assertTrue(ftitle.contains(title));	
	}
}
