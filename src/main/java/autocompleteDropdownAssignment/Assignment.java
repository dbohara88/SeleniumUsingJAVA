package autocompleteDropdownAssignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;


public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country = "united";
		String countryName = "United States (USA)";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys(country);
		
		List<WebElement> countryList = driver.findElements(By.className("ui-menu-item"));
	
		for(WebElement option: countryList) {
			if (option.getText().equalsIgnoreCase(countryName)) {
				option.click();
				break;
			}
		}
		
		driver.close();
	}

}
