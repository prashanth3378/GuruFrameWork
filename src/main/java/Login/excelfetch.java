package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class excelfetch {
@Test
	public void fetch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
	}
}