package Delta.RepServ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class methods {
	private static WebDriver d;
	public static WebDriver driver = d;

	public static void browser_config() {
		// TODO Auto-generated method stubk
		System.out.println("My first output");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgaddamede\\Downloads\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.republicservices.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("Website launched successfully");
	}

	// @Test(dependsOnMethods= ("Voidbase"))
	public static void search_area() throws InterruptedException {

		System.out.println("Method2 executing");
		driver.findElement(By.xpath("//li[5]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Truck");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		System.out.println("Executed method2");

	}

	public static void invalid_address() throws InterruptedException {

		driver.findElement(
				By.xpath("//a[contains(text(),'University Recycling & Waste Collection | Republic Services')]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='addressLine1']")).sendKeys("valley street");
		// Thread.sleep(900);
		driver.findElement(By.cssSelector(".col-xs-12:nth-child(3) .form-control")).sendKeys("44120");
		// driver.findElement(By.xpath("//input[@name='postalCode'])[2]")).sendKeys("hello");
		// driver.findElement(By.xpath("xpath=//div[2]/rs-postal-code-input/rs-form-control-group/div/label/div/ng-transclude/input")).sendKeys("40126");
		// driver.findElement(By.className("postalCode")).sendKeys("45010");
		driver.findElement(By.xpath("//span/span[2]/span")).click();
		driver.findElement(By.xpath("//div[2]/button")).click();
		Thread.sleep(1000);
		System.out.println("Sorry, we were not able to validate your address");
	}

	@Test(enabled = false)
	public static void pdf_checker() {

		driver.findElement(By.linkText("Communities")).click();
		driver.findElement(By.linkText("2017 Sustainability Report")).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		System.out.println("I am on other tab");
		// assertTrue(driver.getPageSource().contains("2017SustainabilityReport.pdf"));
		// System.out.println("Pdf opened successfully");

		/*
		 * try { assertEquals("VerifyText in Element",
		 * driver.findElement(By.cssSelector("div.bbMargin")).getText()); }
		 * catch (Error e) { VerificationException.append(e.toString()); }
		 */
		if (driver.getPageSource().contains("2017SustainabilityReport.pdf")) {
			System.out.println("Pdf is Present");
		} else {
			System.out.println("pdf is not Present");

		}

	}
}
