package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser name , chrome or firefox");
		String browserValue = sc.nextLine();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver"," ./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			
	}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");//avoid IllegalStateException
			driver=new FirefoxDriver();//open firefox browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the web application
			Thread.sleep(5000);

		}

		else
		{
			System.out.println("type valid input");
		}
	}
}

