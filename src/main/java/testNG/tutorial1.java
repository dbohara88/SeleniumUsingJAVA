package testNG;

import org.testng.annotations.Test;

public class tutorial1 {
	
	@Test(groups= {"smoke"})
	public void Test() {
	
		System.out.println("Hello from Test() method");
	}
}
