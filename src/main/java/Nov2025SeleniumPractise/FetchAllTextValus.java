package Nov2025SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllTextValus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Fetch all the text value u entered:
		
		driver.findElement(By.id("input-firstname")).sendKeys("Balli@gmail.com");
		String email= driver.findElement(By.id("input-firstname")).getAttribute("value");
		System.out.println(email);
		
	}

}
