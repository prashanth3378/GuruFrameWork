package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jupiter12 {




@Test
public void validatetest() throws InterruptedException {

String errmsg = "We welcome your feedback - but we won't get it unless you complete the form correctly.";
String confmsg = "Thanks prashanth, we appreciate your feedback.";

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("https://jupiter.cloud.planittesting.com/");
driver.findElement(By.xpath("//a[contains(.,'Contact')]")).click();
driver.findElement(By.xpath("//a[text()='Submit']")).click();
String msg = driver.findElement(By.xpath("//div[@class='alert alert-error ng-scope']")).getText();
System.out.println(msg);


Assert.assertEquals(errmsg, msg);
System.out.println("Error msg is displayed");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='forename']")).sendKeys("prashanth");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("nothing");
driver.findElement(By.xpath("//a[text()='Submit']")).click();
String new_msg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
System.out.println(new_msg);
Assert.assertEquals(new_msg, confmsg);

driver.close();

}

@Test(invocationCount = 1)
public void validatTest2() {
WebDriverManager.chromedriver().setup();

String confmsg = "Thanks prashanth, we appreciate your feedback.";

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("https://jupiter.cloud.planittesting.com/");
driver.findElement(By.xpath("//a[contains(.,'Contact')]")).click();

driver.findElement(By.xpath("//input[@name='forename']")).sendKeys("prashanth");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("hi all");
driver.findElement(By.xpath("//a[text()='Submit']")).click();
String msg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
System.out.println(msg);
Assert.assertEquals(confmsg, msg);
driver.close();
}



	}

