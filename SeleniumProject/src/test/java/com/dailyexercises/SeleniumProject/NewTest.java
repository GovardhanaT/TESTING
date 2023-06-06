package com.dailyexercises.SeleniumProject;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void add(Integer n, Integer s) {
	  System.out.print(n+s);
  }
  @Test(dataProvider = "dp")
  public void sub(Integer n,Integer s) {
	  System.out.print(n-s);
  }
  @Test(dataProvider = "dp")
  public void multiply(Integer n, Integer s) {
	  System.out.print(n*s);
  }
  @Test(dataProvider = "dp")
  public void divide(Integer n, Integer s) {
	  System.out.print(n/s);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 2 },
      new Object[] { 20, 5 },
    };
  }
}
