package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[contains(text(), 'Windows')]")).click();

		driver.findElement(By.xpath("//*[text()='Click Here']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);

		String Text = driver.findElement(By.xpath("//h3")).getText();

		System.out.println(Text);

		driver.switchTo().window(parentID);

		Text = driver.findElement(By.xpath("//h3")).getText();

		System.out.println(Text);
	}

}
