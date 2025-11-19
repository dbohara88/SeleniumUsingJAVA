package testNG;

import org.testng.annotations.*;


public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1. @BeforeSuite - Runs once before the entire suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("2. @BeforeTest - Runs before <test> tag in testng.xml");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("3. @BeforeClass - Runs before the first test method in this class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("4. @BeforeMethod - Runs before each @Test method");
	}

	@Test
	public void testMethod1() {
		System.out.println("5. @Test - Test Method 1");
	}

	@Parameters({"url"})
	@Test
	public void testMethod2(String urlname) {
		System.out.println("5. @Test - Test Method 2");
		System.out.println(urlname);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("6. @AfterMethod - Runs after each @Test method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("7. @AfterClass - Runs after all tests in this class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("8. @AfterTest - Runs after <test> tag execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("9. @AfterSuite - Runs once after the entire suite");
	}
}
