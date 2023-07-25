package TestNGAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageHomePageVerification extends LaunchBrowser {
	@Test
	public void loginPage() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	@Test()
	public void homePageVerification() {
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		System.out.println("User has landed on the correct HomePage");
		ast.assertAll();
	}
	
	
}
