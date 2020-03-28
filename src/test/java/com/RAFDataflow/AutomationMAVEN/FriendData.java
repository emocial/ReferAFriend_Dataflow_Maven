package com.RAFDataflow.AutomationMAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FriendData {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://campaign.odicci.com/#/86a771ecac336b0f9baa?fh=55f95dc6869ec7ea275b80583fecce7a2d776519");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Abhi");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Bach");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("AbhiBach@gmail.com");
		driver.findElement(By.cssSelector("#submitButton > div")).click();
		}
}
