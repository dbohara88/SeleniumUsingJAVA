package streams;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> fruitList = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> streamFruitList = fruitList.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		List<String> sortFruitList = streamFruitList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(streamFruitList, sortFruitList);
		
		
		List<String> price = fruitList.stream().filter(s -> s.getText().contains("Beans")).map(s -> PriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
	}

	private static String PriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		return s.findElement(By.xpath("following-sibling::td[1]")).getText();
	}

}
