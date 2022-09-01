package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//span[@onclick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)' and .='5']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(6)' and .='6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		
		driver.findElement(By.xpath("//span[@onclick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)' and .='5']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(8)' and .='8']")).click();
		Thread.sleep(3000);
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		
		driver.navigate().refresh();
	}

}
