package windowHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		
//		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
		
		String mailID = driver.findElement(By.xpath("//strong/a")).getText();
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//*[text()='Username:']/following-sibling::input")).sendKeys(mailID);
		
	}

}
