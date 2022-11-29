
package mobileapp.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
// import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class amazonshopping {
static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
 DesiredCapabilities capabilities = new DesiredCapabilities();
// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "33"); 
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel_6");
capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");




capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
capabilities.setCapability("appActivity","com.amazon.mShop.home.HomeActivity"); // This is Launcher activity of your app (you can get it from apk info app)

driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
Thread.sleep(6000);
System.out.println("Application is launched");

 /*
driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Username']")).sendKeys("standard_user");
driver.findElement(By.xpath("//android.widget.EditText[@content-desc='test-Password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']")).click();

System.out.println("I'm on login page");

Thread.sleep(5000);
*/

	}

}
