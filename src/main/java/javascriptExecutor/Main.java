package javascriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> columnValues = driver.findElements(By.xpath("//*[@class='tableFixHead'] //td[4]"));
		
		int count = 0;
		
		for(int i=0; i<columnValues.size(); i++) {
			count += Integer.parseInt(columnValues.get(i).getText());
		}
		
		System.out.println(count);
		
		int expectedSum =  Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(count, expectedSum);
		System.out.println(expectedSum);
		driver.close();
	}

}
