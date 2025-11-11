package handlingCalenderUI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String month = "6";
		String date = "15";
		String year = "2027";
		
		String[] expectedList = {month, date, year};
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__button:nth-child(3)")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		
		driver.findElement(By.xpath("//*[text()='"+year+"']")).click();
		
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//button/abbr[text()='"+date+"']")).click();
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0; i<actualList.size(); i++) {
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
			System.out.println(actualList.get(i).getAttribute("value"));
		}
		
		
		driver.close();
		
	}

}
