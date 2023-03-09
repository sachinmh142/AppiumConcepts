package com.qa.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static AppiumDriver driver ;
    public HomePage(AppiumDriver driver) 
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
    @AndroidFindBy(xpath = "//*[@text='API Demos']")
	public WebElement api_demos;

    //driver.findElement(By.xpath("")).click();
    @AndroidFindBy(xpath = "//*[@text='Animation']")
    public WebElement Animation;

    //driver.findElement(By.id("android:id/text1")).click();
    @AndroidFindBy(id = "android:id/text1")
    public WebElement countrySelection;

    public WebElement api_Demos() {
        System.out.println("trying to find the name field");
        return api_demos;
    }

    public WebElement getCountrySelection() {
        System.out.println("selecting the option from dropdown");
        return countrySelection;
    }

}