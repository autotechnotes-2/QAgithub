package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursTest {
	
@Test
public void logintomercurytours() throws InterruptedException {
	//Set ChromeDriver properties 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//Create an object of ChromeDriver.Will open ChromeBrowser
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get-always takes you to specific URL.Open mercury tours Site
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//enter the user name field and user name mercury
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//add two second sleep
		Thread.sleep(2000);
		//enter the password field and password as mercury
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
		
		driver.close();
		driver.quit();
		
		
		}	
		
		
	}
	
	
	
	
	

