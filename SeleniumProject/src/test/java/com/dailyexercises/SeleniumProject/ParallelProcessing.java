package com.dailyexercises.SeleniumProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelProcessing {
	@Test
	public void Chrome()
	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
	}
	@Test
	public void edge()
	{
		WebDriverManager.edgedriver().setup();
		  WebDriver driver =new EdgeDriver();
		  driver.manage().window().maximize();
	}

}
