package com.RAFDataflow.AutomationMAVEN;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReferFriendData {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://campaign.odicci.com/#/fd5dc14fc86f6a937003");
		driver.findElement(By.cssSelector("#submitButton > div")).click();;
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Yang");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Zoin");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("YangZoin@gmail.com");
		driver.findElement(By.cssSelector("#submitButton > div")).click();
		driver.findElement(By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div[6]/div[2]/div")).click();
	}
}
