package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRicbuzz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://www.cricbuzz.com");
driver.manage().window().maximize();
WebElement ele = driver.findElement(By.xpath("//a[text()='Rankings']"));
Actions ac=new Actions(driver);
ac.moveToElement(ele).build().perform();
driver.findElement(By.xpath("//div[@id='rankingDropDown']/descendant::a[text()='ICC Rankings - Women']")).click();
WebElement webtable = driver.findElement(By.xpath("//div[@class=\"cb-col cb-col-100 cb-padding-left0\"]"));
List<WebElement> rows = webtable.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-font-14 cb-lst-itm text-center\"]"));
int rowcount = rows.size();
System.out.println(rowcount);
for(WebElement set:rows)
{
	System.out.println(set.getText());

	//System.out.println(values);
}
driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
List<WebElement> sc = driver.findElements(By.xpath("//div[@ng-show=\"active_match_type == 'league-tab'\"]/descendant::div[@class=\"cb-mtch-lst cb-col cb-col-100 cb-tms-itm\"]"));
for(WebElement score:sc)
{
System.out.println(score.getText());
}
driver.findElement(By.xpath("//span[text()='ALL']")).click();
}

	}
