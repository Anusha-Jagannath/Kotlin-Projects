package com.tester;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AppiumDemo {

    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11.0");
        cap.setCapability("appPackage","com.google.android.deskclock");
        cap.setCapability("appActivity","com.android.deskclock.DeskClock");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        System.out.println("Device Time "+driver.getDeviceTime());
        driver.findElement(By.id("com.google.android.deskclock:id/fab_container")).click();

    }
}