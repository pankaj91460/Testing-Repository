package TestNGAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static WebDriver driver;
	@BeforeSuite()
	public void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println("===========TrialText=============");
		System.out.println("===========TrialText1=============");
		System.out.println("========================Trial Testing tests");


	}
	
	
	@AfterSuite()
	public void closeChrome() {
		driver.quit();
		
	}
	
}
