package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.xpath("//*[text()='Username:']/following-sibling::input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[text()='Password:']/following-sibling::input")).sendKeys("learning");
		
		driver.findElement(By.xpath("//*[text()=' User']/following-sibling::span")).click();
		
		WebDriverWait okayButton = new WebDriverWait(driver, Duration.ofSeconds(3));
		okayButton.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		Select s1 = new Select(driver.findElement(By.tagName("select")));
		s1.selectByValue("teach");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
//		WebDriverWait loginWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		loginWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()=\"ProtoCommerce\"]")));
		
	}

}
