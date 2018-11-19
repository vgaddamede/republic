package Delta.RepServ;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class main extends methods {

	@Test(enabled = true)
	public void all_methods() throws InterruptedException {

		methods.browser_config();
		methods.search_area();
		methods.invalid_address();
		methods.pdf_checker();
		System.out.println("all methods has been executed");

	}

	@Test(enabled = false)
	@Parameters({ "aEmailadd", "aPassword" })
	public void login_valid(String aEmailadd, String aPassword) {
		methods.browser_config();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("logonform-email")).sendKeys(aEmailadd);
		driver.findElement(By.id("logonform-password")).sendKeys(aPassword);

	}

	@Test(enabled = false)
	@Parameters({ "bEmailadd", "bPassword" })
	public void login_invalid(String bEmailadd, String bPassword) {
		methods.browser_config();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("logonform-email")).sendKeys(bEmailadd);
		driver.findElement(By.id("logonform-password")).sendKeys(bPassword);

	}
	
	public static void gitrep(){
		
		System.out.println("checking.....!");
	}
	
	

}
