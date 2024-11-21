package practice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.Generic_utility.excel_utility;


import io.github.bonigarcia.wdm.WebDriverManager;

public class script1 {

	
	@Test()
	public void spiceJetBooking() throws AWTException, Throwable {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		int date = 19;
	WebDriver	driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(
				By.xpath("//div[@data-testid='to-testID-origin']/descendant::input[@autocapitalize='sentences']"))
				.sendKeys("Mum");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@data-testid='to-testID-destination']/descendant::input[@autocapitalize='sentences']"))
				.sendKeys("chennai");
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-18u37iz']/child::div[@data-testid='undefined-month-February-2023']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']/div[@data-testid='undefined-calendar-day-"
						+ date + "']"))
				.click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Search Flight']"))));
		WebElement ele = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		ele.click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-f9v2oj r-1a852e4 r-1609sg0 r-1pcd2l5 r-1mdbw0j r-hnxvie']/descendant::div[@class='css-1dbjc4n r-zso239']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1wtj0ep r-1f1sjgu']/descendant::div[@data-testid='continue-search-page-cta']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("prashanthvm");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("prash");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("12345467");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']"))
				.sendKeys("prashanthvmallapur@gmail.com");
}}