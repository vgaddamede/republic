package Delta.RepServ;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DeviceManager {
  
   public  WebDriver driver;
   @Test
	public  void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver.get("https://republicservices.com");
		//Assert.assertFalse(true);
	}

}
