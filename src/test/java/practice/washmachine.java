package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class washmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.amazon.com");
driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("washmachine");

WebElement ele = driver.findElement(By.xpath("//div[@aria-label=\"washmachines\"]"));
ele.click();
driver.findElement(By.xpath("//span[.=\"Amana NTW4516FW 3.5 Cu. Ft. White Top Load Washer\"]")).click();

List<WebElement> elements = driver.findElements(By.xpath("descendant::table[@id=\"productDetails_techSpec_section_1\"]//tr"));
	


//table[@id="productDetails_techSpec_section_1"]/descendant::tbody/child::tr

//List<WebElement> elements = driver.findElements(By.xpath("//h1[text()=\"Technical Details\"]/../../..//table//tr"));

for(WebElement ele1:elements)
{
	String texts = ele1.getText();
	System.out.println(texts);
	
}



	}

}
