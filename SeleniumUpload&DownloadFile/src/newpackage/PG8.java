package newpackage;

import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG8 {

	public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","/Users/carios/Documents/Librerías/chromedriver");
                String baseUrl = "http://demo.guru99.com/test/yahoo.html";
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();
        
        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By
        .id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try {
        	Process exec = Runtime.getRuntime().exec(wget_command);
        	int exitVal = exec.waitFor();
        	System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        	System.out.println(ex.toString());
        }
        driver.close();
	}
}
