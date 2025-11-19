package testNG;

import org.testng.annotations.Test;



public class tutorial1 {
	

	@Test(groups= {"smoke"})
	public void Test(String urlname) {
	
		System.out.println("Hello from Test() method");
	}
	
	@Test(dependsOnGroups = "smoke")
	public void page() {
		System.out.println("depends on group smoke"); 
	}
}
