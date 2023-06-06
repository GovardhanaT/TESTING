package com.example.Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listen implements ITestListener{
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started...");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Success...");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed...");
	}
	public void onTestFinished(ITestResult result)
	{
		System.out.println("Test Finished...");
	}
	
	
	
	
	
	
}
