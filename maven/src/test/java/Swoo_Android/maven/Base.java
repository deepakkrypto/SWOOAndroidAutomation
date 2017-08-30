package Swoo_Android.maven;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class Base {
	
		public	AndroidDriver dr;
		public File file_read;
		 
		public ResourceBundle testdata;
		
		public ExtentReports report;
		public ExtentTest logger;
		
		public void beforeClassMethod() throws InterruptedException, IOException
		{
//		    ServerArguments server = new ServerArguments();
//			server.setArgument("--address", "127.0.0.1");
//			server.setArgument("--chromedriver-port", 9516);
//			server.setArgument("--port", 8081);
//			server.setArgument("--no-reset", true);
//			server.setArgument("--local-timezone", true);
//			AppiumServer _appiumServer = new AppiumServer(new File("/Applications/Appium.app/Contents/Resources/node/bin/node"), new File("/Applications/Appium.app/Contents/Resources/node_modules/appium/build/lib/main.js"), server);
//			
//				if(_appiumServer.isServerRunning())
//				{
//					System.out.println("Server is already running");
//				}
//				else
//				{
//					_appiumServer.startServer();
//				}

				DesiredCapabilities capabilities = new DesiredCapabilities();
			/*capabilities.setCapability("appium-version", "1.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "5.1");
			capabilities.setCapability("deviceName", "test");*/

			capabilities.setCapability("appium-version", "1.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "6.0.1");
			capabilities.setCapability("deviceName", "55f1bf37");

				capabilities.setCapability("app", "/Users/dvyas/Desktop/Appium_Swoo/AndroidAPK/20170820/swoo-v4.0.1.apk");
				capabilities.setCapability("appPackage", "com.kryptolabs.android.speakerswire");
				capabilities.setCapability("appActivity", "com.kryptolabs.android.speakerswire.activities.SplashActivity");
				dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
				dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
		    Thread.sleep(5000);
		    Set<String> contextNames = dr.getContextHandles();
		    System.out.println("Context View   "  + contextNames.size());
		    
		          System.out.println(contextNames);
		    Thread.sleep(10000);
		    for (String contextName : contextNames)
		    {
		        if (!contextName.equals("NATIVE_APP"))
		        {
		            dr.context(contextName);
		                    break;
		        }
		    }
	        //testdata  = ResourceBundle.getBundle("testCases/TestData");
	 }
		
		public void AfterClassMethod(ITestResult result) throws InterruptedException, IOException
		{
			/*if (result.getStatus() == ITestResult.FAILURE) {
	            logger.log(LogStatus.FAIL, result.getThrowable());
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            logger.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	        } else {
	            logger.log(LogStatus.PASS, "Test passed");
	        }
	        
			report.endTest(logger);
			
			report.flush();
			*/
			dr.quit();
		}

		
	}

	


