package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jupiter3 {
@Test
	public void validatTest3() {
		WebDriverManager.chromedriver().setup();
		int frog_count = 1;
		int Bunny_count = 2;
		int Bear_count = 1;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jupiter.cloud.planittesting.com/");
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-large']")).click();
		for (int i = 0; i < frog_count; i++) 
		{
		driver.findElement(By.xpath("//div[contains(.,'Stuffed Frog')]/p/a[@class='btn btn-success']")).click();
		}
		for (int i = 0; i < Bunny_count; i++) {

		driver.findElement(By.xpath("//div[contains(.,'Fluffy Bunny')]/p/a[@class='btn btn-success']")).click();
		}
		for (int i = 0; i < Bear_count; i++) {

		driver.findElement(By.xpath("//div[contains(.,'Valentine Bear')]/p/a[@class='btn btn-success']")).click();
		}
		driver.findElement(By.xpath("//a[contains(.,'Cart (')]")).click();
		
		String frog_p = driver.findElement(By.xpath("//td[contains(.,' Stuffed Frog')]/following-sibling::td[1]"))
		.getText().substring(1);
		String bunny_p = driver.findElement(By.xpath("//td[contains(.,' Fluffy Bunny')]/following-sibling::td[1]"))
		.getText().substring(1);
		String bear_p = driver.findElement(By.xpath("//td[contains(.,' Valentine Bear')]/following-sibling::td[1]"))
		.getText().substring(1);
		double frog_price = Double.parseDouble(frog_p);
		double bunny_price = Double.parseDouble(bunny_p);
		double bear_price = Double.parseDouble(bear_p);

		double exp_Tfrog_price=frog_price*frog_count;
		double exp_Tbunny_price=bunny_price*Bunny_count;
		double exp_Tbear_price=bear_price*Bear_count;
		// System.out.println(exp_Tfrog_price);
		// System.out.println(exp_Tbunny_price);
		// System.out.println(exp_Tbear_price);

		// System.out.println(bear_p);
		String Tfrog_p = driver.findElement(By.xpath("//td[contains(.,' Stuffed Frog')]/following-sibling::td[3]"))
		.getText().substring(1);;
		String Tbunny_p = driver.findElement(By.xpath("//td[contains(.,' Fluffy Bunny')]/following-sibling::td[3]"))
		.getText().substring(1);;
		String Tbear_p = driver
		.findElement(By.xpath("//td[contains(.,' Valentine Bear')]/following-sibling::td[3]")).getText().substring(1);;
		double Tfrog_price = Double.parseDouble(Tfrog_p);
		double Tbunny_price = Double.parseDouble(Tbunny_p);
		double Tbear_price = Double.parseDouble(Tbear_p);
		// System.out.println(Tfrog_price);
		// System.out.println(Tbunny_price);
		// System.out.println(Tbear_price);
		Assert.assertEquals(exp_Tfrog_price, Tfrog_price);
		Assert.assertEquals( exp_Tbunny_price, Tbunny_price);
		Assert.assertEquals(exp_Tbear_price, Tbear_price);

		driver.close();
		}


			}


