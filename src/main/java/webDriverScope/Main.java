package webDriverScope;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// print all the links in webpage
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// print all links in footer section
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		// print all links in first column of footer section
		
		WebElement columnFooterSection = footerDriver.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		System.out.println(columnFooterSection.findElements(By.tagName("a")).size());
		
		// open links in footer column section in separate tabs
	
		
		
		for(int i=1; i<columnFooterSection.findElements(By.tagName("a")).size(); i++) {		
			columnFooterSection.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
