package practice;
import java.io.FileInputStream;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class irtccc222 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("disable notifications");
			System.setProperty("Webdriver.chrome.driver","./chromedriver.exe");
			WebDriver driver = new ChromeDriver(opt);
			driver.get("https://www.irctc.co.in");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-alig-justify']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
			Thread.sleep(1000);
			 String Pid = driver.getWindowHandle();
			 System.out.println(Pid);
			 Set<String> allid = driver.getWindowHandles();
			 System.out.println(allid);
			 for (String id : allid) {
				 if(!id.equals(allid))
						 {
				driver.switchTo().window(id);
				 }
			 }
				Thread.sleep(1000);
			WebElement ele=driver.findElement(By.xpath("//input[@name='From']"));
			ele.click();
			ele.sendKeys("Bengaluru");
			Thread.sleep(2000);
			WebElement from = driver.findElement(By.className("ui-menu-item"));
			Actions a=new Actions(driver);
			a.moveToElement(from).click().perform();
			WebElement element = driver.findElement(By.id("stationTo"));
			element.click();
			element.sendKeys("Chennai");
			Thread.sleep(5000);
			WebElement to = driver.findElement(By.xpath("//li[@class='ui-menu-item']//div[text()='Chennai (MAA)']"));
			Thread.sleep(3000);
			a.moveToElement(to).click().perform();
			driver.findElement(By.xpath("//input[@placeholder='Departure ']")).click();
			driver.findElement(By.xpath("//span[text()=' 15']")).click();
			WebElement lt2=driver.findElement(By.xpath("//button[text()='Later']"));
			a.moveToElement(lt2).click().perform();
			driver.findElement(By.xpath("//button[text()='Search ']")).click();
			List<WebElement> all = driver.findElements(By.tagName("b"));
			int count =all.size();
			FileInputStream fis=new FileInputStream("./irtccfetch.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet("sheet1");
			
			
			
			
			
		}
	}

