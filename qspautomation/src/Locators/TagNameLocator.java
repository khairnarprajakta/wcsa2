package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/rohit/OneDrive/Desktop/HTML/Disabled%20element.html");
		
		//how to user tagname locator
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		
	}

}
