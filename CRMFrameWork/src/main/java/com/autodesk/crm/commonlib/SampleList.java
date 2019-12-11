package com.autodesk.crm.commonlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/**
 * 
 * @author Deepak
 *
 */
public class SampleList implements ITestListener {
 /**
  * take screenshot by @listener
  */
	public void onTestFailure(ITestResult t) {
		
		String tstName = t.getName();
		EventFiringWebDriver edr = new EventFiringWebDriver(BaseClass.driver);
		File srcFile = edr.getScreenshotAs(OutputType.FILE);
		File dfile = new File("./screenshot/"+tstName+".png");
		try {
			FileUtils.copyFile(srcFile, dfile);
		} catch (IOException e) { }
		
	}


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	 
	
}
