package TestNGAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgetPasswordFunctionality extends LaunchBrowser {
	@Test()
	public void forgetPassword() {
		SoftAssert ast = new SoftAssert();
		driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']")).click();
		ast.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode");
		System.out.println("Yes, Forget Yout Password Link is Working Fine");
		ast.assertAll();
		driver.navigate().back();

	}

}
