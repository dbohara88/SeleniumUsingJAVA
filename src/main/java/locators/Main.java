package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        
        // ========================================
        // 1. ID - Locates element by 'id' attribute
        // ========================================
        // HTML: <input id="username" type="text">
        WebElement elementById = driver.findElement(By.id("username"));
        
        // Example usage
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.findElement(By.id("loginBtn")).click();
        
        
        // ========================================
        // 2. ClassName - Locates element by 'class' attribute
        // ========================================
        // HTML: <div class="error-message">Invalid credentials</div>
        WebElement elementByClass = driver.findElement(By.className("error-message"));
        
        // Example usage
        driver.findElement(By.className("submit-button")).click();
        String errorText = driver.findElement(By.className("validation-error")).getText();
        
        // Note: Use only ONE class name, not multiple
        // Wrong: By.className("btn btn-primary")
        // Right: By.className("btn-primary")
        
        
        // ========================================
        // 3. Name - Locates element by 'name' attribute
        // ========================================
        // HTML: <input name="password" type="password">
        WebElement elementByName = driver.findElement(By.name("password"));
        
        // Example usage
        driver.findElement(By.name("firstName")).sendKeys("John");
        driver.findElement(By.name("gender")).click();
        
        
        // ========================================
        // 4. TagName - Locates element by HTML tag name
        // ========================================
        // HTML: <input>, <button>, <a>, <div>, etc.
        WebElement elementByTag = driver.findElement(By.tagName("input"));
        
        // Example usage - Get all links on page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + allLinks.size());
        
        // Get all images
        List<WebElement> allImages = driver.findElements(By.tagName("img"));
        
        // Note: Usually returns multiple elements, better to use findElements()
        
        
        // ========================================
        // 5. LinkText - Locates anchor tag by EXACT visible text
        // ========================================
        // HTML: <a href="/login">Click Here to Login</a>
        WebElement elementByLinkText = driver.findElement(By.linkText("Click Here to Login"));
        
        // Example usage
        driver.findElement(By.linkText("Sign Up")).click();
        driver.findElement(By.linkText("Forgot Password?")).click();
        
        // Note: Text must match EXACTLY (case-sensitive)
        
        
        // ========================================
        // 6. PartialLinkText - Locates anchor tag by PARTIAL visible text
        // ========================================
        // HTML: <a href="/register">Click Here to Register Now</a>
        WebElement elementByPartialLink = driver.findElement(By.partialLinkText("Register"));
        
        // Example usage
        driver.findElement(By.partialLinkText("Sign")).click(); // Matches "Sign Up"
        driver.findElement(By.partialLinkText("Forgot")).click(); // Matches "Forgot Password?"
        
        // Note: Matches if the text CONTAINS the specified string
        
        
        // ========================================
        // 7. XPath - Locates element using XML path expression
        // ========================================
        
        // Absolute XPath (starts from root - NOT recommended)
        WebElement absoluteXPath = driver.findElement(By.xpath("/html/body/div/form/input"));
        
        // Relative XPath (starts from anywhere - RECOMMENDED)
        WebElement relativeXPath = driver.findElement(By.xpath("//input[@id='username']"));
        
        // XPath with attribute
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");
        
        // XPath with multiple attributes
        driver.findElement(By.xpath("//input[@type='text' and @name='username']"));
        
        // XPath with text()
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        
        // XPath with contains()
        driver.findElement(By.xpath("//input[contains(@id,'user')]")); // Matches id containing 'user'
        driver.findElement(By.xpath("//div[contains(text(),'Welcome')]")); // Text contains 'Welcome'
        driver.findElement(By.xpath("//input[contains(@class,'form-control')]"));
        
        // XPath with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@id,'user')]")); // id starts with 'user'
        
        // XPath axes - parent, child, following-sibling, preceding-sibling
        driver.findElement(By.xpath("//input[@id='email']//parent::div"));
        driver.findElement(By.xpath("//div[@class='container']//child::input"));
        driver.findElement(By.xpath("//label[@for='username']//following-sibling::input"));
        
        // XPath with index
        driver.findElement(By.xpath("(//input[@type='text'])[1]")); // First text input
        driver.findElement(By.xpath("(//button)[2]")); // Second button
        
        
        // ========================================
        // 8. CSS Selector - Locates element using CSS selector syntax
        // ========================================
        
        // CSS with id (use #)
        WebElement cssById = driver.findElement(By.cssSelector("#username"));
        driver.findElement(By.cssSelector("#email")).sendKeys("test@test.com");
        
        // CSS with class (use .)
        WebElement cssByClass = driver.findElement(By.cssSelector(".error-message"));
        driver.findElement(By.cssSelector(".btn-primary")).click();
        
        // CSS with tag name
        driver.findElement(By.cssSelector("input"));
        
        // CSS with attribute
        driver.findElement(By.cssSelector("input[name='password']"));
        driver.findElement(By.cssSelector("input[type='email']"));
        
        // CSS with multiple attributes
        driver.findElement(By.cssSelector("input[type='text'][name='username']"));
        
        // CSS with tag + id
        driver.findElement(By.cssSelector("input#username"));
        
        // CSS with tag + class
        driver.findElement(By.cssSelector("button.submit-btn"));
        driver.findElement(By.cssSelector("div.error-message"));
        
        // CSS with contains (use *= for attribute contains)
        driver.findElement(By.cssSelector("input[id*='user']")); // id contains 'user'
        driver.findElement(By.cssSelector("input[class*='form']")); // class contains 'form'
        
        // CSS with starts-with (use ^=)
        driver.findElement(By.cssSelector("input[id^='user']")); // id starts with 'user'
        
        // CSS with ends-with (use $=)
        driver.findElement(By.cssSelector("input[id$='name']")); // id ends with 'name'
        
        // CSS with child combinator (>)
        driver.findElement(By.cssSelector("div.container > input"));
        
        // CSS with descendant combinator (space)
        driver.findElement(By.cssSelector("div.form input"));
        
        // CSS with nth-child
        driver.findElement(By.cssSelector("ul > li:nth-child(2)")); // 2nd list item
        driver.findElement(By.cssSelector("input:nth-of-type(3)")); // 3rd input element
        
        // CSS with first-child and last-child
        driver.findElement(By.cssSelector("ul > li:first-child"));
        driver.findElement(By.cssSelector("ul > li:last-child"));
        
        
        // ========================================
        // COMPARISON & BEST PRACTICES
        // ========================================
        
        /*
         * PRIORITY ORDER (Fastest to Slowest):
         * 1. ID - Fastest, most reliable (if unique)
         * 2. Name - Fast
         * 3. CSS Selector - Fast, flexible
         * 4. XPath - Slower but very powerful
         * 5. ClassName - Fast but may not be unique
         * 6. LinkText/PartialLinkText - Only for links
         * 7. TagName - Usually returns multiple elements
         * 
         * RECOMMENDATIONS:
         * - Use ID when available and unique
         * - Use CSS Selector for complex scenarios (better performance than XPath)
         * - Use XPath when you need advanced traversal or text-based selection
         * - Avoid Absolute XPath
         * - Create custom XPath/CSS for better control
         */
        
        driver.quit();
    }
}
