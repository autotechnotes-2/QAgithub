package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {
	
public void mercuryToursTest () {
	
		
 
	//Set ChromeDriver properties 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	//Create an object of ChromeDriver.Will open ChromeBrowser
	
	WebDriver driver = new ChromeDriver();
	
	//Open mercury tours Site
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	//enter the user name field and user name mercury
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).click();
	driver.findElement(By.xpath("//input[name=\"login\"]"));
	}

}
