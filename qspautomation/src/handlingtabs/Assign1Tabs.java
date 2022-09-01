package handlingtabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1Tabs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
	     
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.className("q")).sendKeys("Iphone 12");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        String parenthandle = driver.getWindowHandle();
        Set<String>alltabs = driver.getWindowHandles();
        
        for(String tab:alltabs)
        {
        	System.out.println(tab);
        	if(!parenthandle.equals(tab))
        	{
        		System.out.println(tab);
        		driver.switchTo().newWindow(tab);
        		
        	}
        	else
        	{
        		
        	}
        }
        
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//div[text()='Green']/ancestor::div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM']/preceding-sibling::a")).click();
        
        driver.findElement(By.xpath())
	}

}
