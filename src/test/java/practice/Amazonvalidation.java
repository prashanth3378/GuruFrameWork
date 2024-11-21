package practice;

import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.jna.Pointer;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Amazonvalidation {

	
		
		 class amazon1 {
			@Test
			public void amzon() throws Throwable {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.amazon.in/");
				WebElement ele = driver.findElement(By.xpath("//span[@class='action-inner']"));
				Point d3 = ele.getLocation();
				int x = d3.getX();
				int y = d3.getY();
				System.out.println(x);
				System.out.println(y);
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				for (int i = 0; i < 10; i++) {

					jse.executeScript("window.scrollBy("+x+","+y+")");
				}
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Facebook']")).click();
				String title = "Facebook";
				String titles = driver.getTitle();

				if (titles.contains(title)) {
					System.out.println("Tc is Pass");
				} else {
					System.out.println("Tc is fail");
				}
				driver.close();

			}
		}
	   
	   
	   
	}

