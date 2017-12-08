package com.seleniumcookbook.examples.chapter01;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduSearchTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baidu.com");
	}
	
	@Test
	public void testBaiduSearch(){
		
		WebElement element = driver.findElement(By.id("kw"));
	    element.sendKeys("selenium");
	    
	    WebElement element_submit = driver.findElement(By.id("su"));
	    element_submit.click();
	    
	}
}
