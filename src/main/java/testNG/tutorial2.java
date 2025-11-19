package testNG;

import org.testng.annotations.Test;

public class tutorial2 {

	@Test(groups= {"smoke"})
	public void Test() {
		System.out.println("good");
	}
	
	@Test
	public void Hi() {
		System.out.println("Hi");
	}
}
