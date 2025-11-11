package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		//total rows
		System.out.println(driver.findElements(By.xpath("//*[@name='courses'] //tr")).size());
		
		//total columns
		System.out.println(driver.findElements(By.xpath("//*[@class='table-display']/tbody //th")).size());
		
		//print 2nd row
		System.out.println(driver.findElement(By.xpath("//*[@name='courses'] //tr[3]")).getText());
		
		driver.close();
		
	}

}
