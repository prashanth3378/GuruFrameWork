package practice;
import org.testng.annotations.Test;
public class Practice {

	@Test(priority = +1)
	public void ab()
	{
		System.out.println("1st");
	}
	@Test(priority = 0)
	public void abb()
	{
		System.out.println("2nd");
	}
	@Test
	public void a()
	{
		System.out.println("3rd");
	}
}
