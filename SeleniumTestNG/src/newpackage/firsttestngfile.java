package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firsttestngfile {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "/Users/carios/Documents/Librerías/chromedriver";
    public WebDriver driver ; 
     
    @Test
    public void verifyHomepageTitle() {	
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      
      driver.manage().window().fullscreen();
      
      driver.get(baseUrl);
      
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      
      Assert.assertEquals(actualTitle, expectedTitle);
      
      driver.close();
  }

}
