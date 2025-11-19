package testNG;
import org.testng.annotations.Test;

public class tutorial3 {

	
	@Test
	public void homeloan()
	{
		System.out.println("hello from homeloan()");
	}
	
	@Test(groups= {"smoke"})
	public void carloan()
	{
		System.out.println("hello from carloan()");
	}
	
}
