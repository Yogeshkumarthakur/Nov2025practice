package Nov2025SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotallinkPractice19Nov {

	public static void main(String[] args) {
		// find the total links on the page

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// Find all the elements on the page first with common html tag for link:

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total Links: " + allLinks.size());

		// to find the text of the links from normal for loop

		for (int i = 0; i < allLinks.size(); i++) {
			String text = allLinks.get(i).getText();
			if(text.length()!=0) {
			System.out.println(text);
		}

	}
		System.out.println("-----------");
		
		
		//to find the text of the links from for each loop
		
		for(WebElement e: allLinks ) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
		}
		
		
		
		System.out.println("-----------");

		//Total no of Text Fields
		
		List<WebElement> allTextFields = driver.findElements(By.className("form-control"));
		
		System.out.println(allTextFields.size());
		
		System.out.println("-----------");
		
		
		
		//To get the Attribute name
		
		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
		System.out.println(fn_type);
	}
}
