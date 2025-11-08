package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement hover = driver.findElement(By.id("nav-link-accountList"));
		Actions action = new Actions(driver);
		
		
		// move to specific element
		action.moveToElement(hover).build().perform();
		
		
		// moving, clicking and sending text
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("iphone").keyUp(Keys.SHIFT).sendKeys(" 17 ").keyDown(Keys.SHIFT).sendKeys("pro max").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		
	}

}
