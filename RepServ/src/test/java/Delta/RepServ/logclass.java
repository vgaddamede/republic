package Delta.RepServ;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logclass {
	
	public static WebDriver driver;

    static Logger log = Logger.getLogger(Feedback.class.getName());

	public static void main(String[] args) {
		
		// TODO Auto-generated method stu	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vgaddamede\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();		
	 driver.get("https://finance.yahoo.com/quote/RSG/");
	 log.info("yahoo finance page should be displayed");
	 driver.findElement(By.linkText("Industries")).click();
	 log.info("Industries page should be displayed");
	 driver.quit();
	 
     
	}

}
