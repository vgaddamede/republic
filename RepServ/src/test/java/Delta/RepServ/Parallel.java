package Delta.RepServ;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class Parallel {
	public static WebDriver driver;
	
  @Parameters("browser")
  
  @Test
  public void beforeClass(String browser) {
	  //if browser is firefox then do this
	  if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgaddamede\\Downloads\\chromedriver.exe");
		    driver = new ChromeDriver();
		  
	  }
	  
	  else if(browser.equalsIgnoreCase("ie")){
		  
		  driver = new InternetExplorerDriver();

	  driver.get("https://finance.yahoo.com/quote/RSG/");
  }
  }

  @AfterClass
  public void afterClass() {
  }

}
