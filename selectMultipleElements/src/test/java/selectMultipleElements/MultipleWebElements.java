package selectMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWebElements {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		Thread.sleep(1000);
		
		findMultipleElements();
		
		Thread.sleep(1000);
	}
	
	public static void findMultipleElements() {
		List<WebElement> selectOptions = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : selectOptions) {
			System.out.println(element.getText());
		}
		
		driver.quit();
	}

}
