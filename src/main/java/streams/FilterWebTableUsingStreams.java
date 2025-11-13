package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebTableUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String product = "Rice";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys(product);
		
		
		List<WebElement>productList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement>filteredList = productList.stream().filter(s -> s.getText().equalsIgnoreCase(product)).collect(Collectors.toList());
		
		Assert.assertEquals(productList.size(), filteredList.size());
	}

}
