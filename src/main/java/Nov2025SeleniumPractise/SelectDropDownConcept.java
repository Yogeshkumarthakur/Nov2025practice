package Nov2025SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
		WebElement dropdown = driver.findElement(By.name("Country"));
		Select select = new Select(dropdown);
		select.selectByIndex(5);
	}

}
