package com.RAFDataflow.AutomationMAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ReferaFriendDataflow {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://campaign.odicci.com/#/fd5dc14fc86f6a937003");
		driver.findElement(By.cssSelector("#submitButton > div")).click();;
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Rishabh");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Sinha");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("Risinhas@gmail.com");
		driver.findElement(By.cssSelector("#submitButton > div")).click();
		driver.findElement(By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div[6]/div[2]/div")).click();
		
		/*To copy and Paste a link:
		
		WebElement urlTextField = driver.findElement(By.cssSelector("#referrerLink"));
		urlTextField.sendKeys("https://campaign.odicci.com/#/86a771ecac336b0f9baa?fh=ef8beda90b1604b72bf6782b12c9abb854f90d03");
		Actions builder = new Actions(driver);
		builder.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		//builder.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		 driver.findElement(By.cssSelector("#mainWrapper > div.centerCol > div:nth-child(6) > div:nth-child(3) > div")).click();
		driver.get("https://www.google.com/");
		 WebElement descPaste = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.RNNXgb > div > div.a4bIc > input"));
			descPaste.click();
			builder.keyDown( Keys.CONTROL ).sendKeys( "v" ).keyUp( Keys.CONTROL ).build().perform();
			 
		*/
		
		WebElement urlTextField = driver.findElement(By.cssSelector("#referrerLink"));
		urlTextField.sendKeys("https://campaign.odicci.com/#/86a771ecac336b0f9baa?fh=ef8beda90b1604b72bf6782b12c9abb854f90d03");
		Actions builder = new Actions(driver);
		builder.keyDown( Keys.CONTROL ).sendKeys( "a" ).keyUp( Keys.CONTROL ).build().perform();
		//builder.keyDown( Keys.CONTROL ).sendKeys( "c" ).keyUp( Keys.CONTROL ).build().perform();
		 driver.findElement(By.cssSelector("#mainWrapper > div.centerCol > div:nth-child(6) > div:nth-child(3) > div")).click();
		 
	}
		
	

}
