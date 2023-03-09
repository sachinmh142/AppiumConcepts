package com.qa.test;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.base.BaseHybrid;
import com.qa.pages.HomePage;

import Utils.Common_Methods;
import Utils.Common_Methods.Direction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;



public class HomePageTestCase_1 extends BaseHybrid {
	
	@Test
    public void Testcase() throws MalformedURLException, InterruptedException {

		/**
		 * KUMARA BADKO
		 * 
		 */
		
		
        capabilities("real");

    	
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
			hp.api_demos.click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//*[@text='API Demos']")).click();
		}
        try {
			hp.Animation.click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//*[@text='Animation']")).click();
			
		}
        Meth.swipeScreen(Direction.DOWN);
        Thread.sleep(2000);
        Meth.swipeScreen(Direction.UP);
        Thread.sleep(2000);
        driver.quit();
        
    }

}