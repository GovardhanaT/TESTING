package com.example.Listener;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Listeners(com.example.Listener.Listen.class)
public class TestDay9_Task5 {
	WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  WebElement username= driver.findElement(By.name("username"));
	  username.sendKeys("Admin");
	  WebElement password= driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  Thread.sleep(1000);
	  WebElement login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  login.click();
	  Assert.assertTrue(true);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  driver.manage().window().maximize();
	  driver.get(url);
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
