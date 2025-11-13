package relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		WebElement inputBox = driver.findElement(By.id("username"));
		
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("label")).above(inputBox)).getText());
	}

}
