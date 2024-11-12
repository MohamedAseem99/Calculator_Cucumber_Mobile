package utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static void InitializeDriver()
	{
		try
		{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("appium:platformName", "Android");
		capability.setCapability("appium:platformVersion", "15.0");
		capability.setCapability("appium:deviceName", "emualtor-5554");
		capability.setCapability("appium:app", "C:\\Users\\mohamedar\\Downloads\\sample_calculator.apk");
		capability.setCapability("appium:automationName", "UIAutomator2");
		
		driver = new AndroidDriver<MobileElement> (new URL(" http://127.0.0.1:4723/"), capability);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static AndroidDriver<MobileElement> getDriver()
	{
		if(driver==null)
		{
			InitializeDriver();
		}
		return driver;
	}
	
	public static void tearDown()
	{
		driver.quit();
		driver = null;
	}

}
