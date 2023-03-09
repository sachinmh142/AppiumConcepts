package com.qa.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.pages.HomePage;

import Utils.Common_Methods;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseHybrid {
	public static HomePage homePage;
	
	public static  AppiumDriver driver;
	public static HomePage hp;
	public static  Common_Methods Meth;
    public static void capabilities(String device) throws MalformedURLException {

     //   File appDir = new File("src");
     //   File app = new File(appDir, "ApiDemos-debug.apk");
//       
//    	AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService().buildDefaultService();
//    	
//    	if(service.isRunning())
//    	{
//    		service.stop();
//    	}else
//    	{
//    		service.start();
//    		try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    	}

        DesiredCapabilities cap = new DesiredCapabilities();

        if (device.equals("emulator")) {
            //emulator
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel_2");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            cap.setCapability(MobileCapabilityType.APPLICATION_NAME, "UiAutomator2");

        } else if (device.equals("real")) {
            //real device
        	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "byam4pzhdirkd6yl");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
//			cap.setCapability(MobileCapabilityType.APP, "‪F:\\Software_Work\\base.apk");
			
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.touchboarder.android.api.demos");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.touchboarder.androidapidemos.MainActivity");
			cap.setCapability(MobileCapabilityType.NO_RESET, "true");
			cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
			 }
      //  AppiumDriver driver;		
 //       cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        URL url = new URL("http://127.0.0.1:4724/wd/hub");

        driver = new AppiumDriver(url, cap);
          Meth=new Common_Methods(driver);

         hp=new HomePage(driver);
    }
    
}