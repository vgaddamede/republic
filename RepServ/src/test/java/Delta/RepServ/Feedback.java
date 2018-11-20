package Delta.RepServ;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.Test;

public class Feedback extends methods {
	 //private static Logger Log = Logger.getLogger(Log.class.getName());//
     static Logger log = Logger.getLogger(Feedback.class.getName());


  @Test
  public void feedback() throws InterruptedException {
	       
	     main.browser_config();
	     log.info("browser is launched");
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println("into feedback class");
	    // Log.info("driver is into feedback class");
	     //Thread.sleep(10000);
		 getD().findElement(By.xpath("//button[@id='nebula_div_btn']/div[2]")).click();
	     getD().switchTo().frame(1);
	     log.info("ensure driver is into frame");
	     System.out.println("into frame");
	     //Thread.sleep(3000);
		 getD().findElement(By.xpath("//span[9]/label/span")).click();
	     //Assert.assertEquals(true, 8);
		 log.info("8th rating is selected");
	     System.out.println("selected 8");
	     //getD().findElement(By.id("317a-448a-c7df-1adb-cd3f-95ec-a1ed-a93e")).click();
	     //Thread.sleep(1000);
	     getD().findElement(By.xpath("//md-radio-button/div/div")).click();
	     System.out.println("radio button is selected");
	     //Thread.sleep(1000);
	     getD().findElement(By.id("id=317a-448a-c7df-1adb-cd3f-95ec-a1ed-a93e")).click();
	     System.out.println("dropdown is selected");
	     
	     /*
	     WebElement pricing = driver.findElement(By.id("317a-448a-c7df-1adb-cd3f-95ec-a1ed-a93e"));
	     pricing.click();
	     if(pricing.isSelected())
	        {
	          System.out.println("pricing is selected");
	        }
	      else
	        {
	             System.out.println("Sorry , Dropdown not selected yet");
	         }
		 */
	     
	    
	     //dropdown.selectByVisisbleText("pricing");
	     //getD().quit();	
  
    }
  
  }

