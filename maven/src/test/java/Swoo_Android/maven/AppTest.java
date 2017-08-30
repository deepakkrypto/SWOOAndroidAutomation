package Swoo_Android.maven;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import javafx.scene.input.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**

 */
public class AppTest
        extends Base {
    ResourceBundle rb;

    /**
     * Create the test case
     *
     * @throws InterruptedException
     */
    @BeforeMethod(alwaysRun = true)
    public void beforeClassMethod() throws InterruptedException, IOException {
        super.beforeClassMethod();
    }

    @AfterMethod(alwaysRun = true)
    public void AfterClassMethod(ITestResult result) throws InterruptedException, IOException {
        super.AfterClassMethod(result);
    }

    @Test
    public void GuestUserBroadcast() throws InterruptedException {
        Utility utility = new Utility(dr);
        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            Thread.sleep(3000);
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();
            //Thread.sleep(4000);
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            System.out.println("Splash");
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();
            //Thread.sleep(4000);
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));

        }
    }
/*
    @Test
    public void GuestUserFollow() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            //dr.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]")).click();

            dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
            //Thread.sleep(3000);
            if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                dr.findElement(By.id("android:id/button1")).click();
            }
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("FollowButton"))).size() != 0);
            dr.findElement(By.id(utility.rb.getString("FollowButton"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));

            System.out.println("Splash");
        }
    }
*/

    @Test
    public void GuestUserLike() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);
        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            //dr.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]")).click();

            dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
            if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                dr.findElement(By.id("android:id/button1")).click();
            }
            //MobileElement el1 = (MobileElement) dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox[2]");
            //el1.click();
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastLike"))).size() != 0);
            dr.findElement(By.id(utility.rb.getString("BroadcastLike"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            Assert.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            System.out.println("Splash");
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            //dr.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]")).click();

            dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
            if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                dr.findElement(By.id("android:id/button1")).click();
            }
            MobileElement el1 = (MobileElement) dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox[2]");
            el1.click();
            //AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastLike"))).isDisplayed());
            //dr.findElement(By.id(utility.rb.getString("BroadcastLike"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));


        }
    }

    @Test
    public void GuestUserBroadcastHome() throws InterruptedException {
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeDuration"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeChannel"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeDescription"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeViews"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeLikes"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeMore"))).isDisplayed());
            System.out.println("Splash");
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeDuration"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeChannel"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeDescription"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeViews"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeLikes"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastHomeMore"))).isDisplayed());
        }


    }

    @Test
    public void GuestUserBroadcastDetails() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            //dr.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]")).click();

            dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
            if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                dr.findElement(By.id("android:id/button1")).click();
            }
            if (dr.findElements(By.id(utility.rb.getString("WIPWatchLater"))).size() != 0) {
                String WatchLater = dr.findElement(By.id(utility.rb.getString("WIPWatchLater"))).getText();
                System.out.print(WatchLater);
                Assert.assertTrue(WatchLater.contains("Go to Broadcasts"));
                String BroadcastOverText = dr.findElement(By.id(utility.rb.getString("LiveBroadcastOverText"))).getText();
                Assert.assertTrue(BroadcastOverText.contains("video is processing"));

                System.out.print("Quiting Application");
                Assert.fail("Processing Screen");
                dr.quit();
            }
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);

            if (dr.findElements(By.id(utility.rb.getString("BroadcastLive"))).size() != 0) {
                String live = dr.findElement(By.id(utility.rb.getString("BroadcastLive"))).getText();
                System.out.print(live);
                AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastLive"))).getText().contains("live"));
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailUsername"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTitle"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailUserHandle"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastDetailLocation"))).isDisplayed());
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTime"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailChannel"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastDetailParticipants"))).isDisplayed());
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailLike"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailViewCount"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailShareIcon"))).size() != 0);

            } else {

                AssertJUnit.assertTrue(dr.findElements(By.xpath(utility.rb.getString("BroadcastDate"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailUsername"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTitle"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailUserHandle"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastDetailLocation"))).isDisplayed());
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTime"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailChannel"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("BroadcastDetailParticipants"))).isDisplayed());
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailLike"))).size() != 0);
                AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailViewCount"))).size() != 0);
                //AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailShareIcon"))).size() != 0);

            }
        }

    }


    @Test
    public void GuestUserBroadcastNotification() throws InterruptedException {
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            dr.findElement(By.id(utility.rb.getString("Notification"))).click();
            Thread.sleep(3000);
            System.out.print(dr.findElement(By.id(utility.rb.getString("NotificationTitle"))).getText());

            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NotificationTitle"))).getText().contains("Notifications"));
            String NoNotifications = dr.findElement(By.id(utility.rb.getString("NoNotificationText"))).getText();
            System.out.println(NoNotifications);
            AssertJUnit.assertTrue(NoNotifications.contains("No notifications"));
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NoNotificationDetailText"))).getText().contains("Please follow broadcaster to get more notifications"));
            System.out.print(dr.findElement(By.id(utility.rb.getString("NotificationGoHome"))));
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NotificationGoHome"))).getText().contains("Go to Home"));
            dr.findElement(By.id(utility.rb.getString("NotificationGoHome"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            System.out.println("Splash");
        } else {

            dr.findElement(By.id(utility.rb.getString("Notification"))).click();

            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NotificationTitle"))).getText().contains("Notifications"));
            String NoNotifications = dr.findElement(By.id(utility.rb.getString("NoNotificationText"))).getText();
            System.out.println(NoNotifications);
            AssertJUnit.assertTrue(NoNotifications.contains("No notifications"));
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NoNotificationDetailText"))).getText().contains("Please follow broadcaster to get more notifications"));
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("NotificationGoHome"))).getText().contains("Go to Home"));
            dr.findElement(By.id(utility.rb.getString("NotificationGoHome"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
        }


    }

    @Test
    public void GuestUserCommunity() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());

			  
			  /*String Swipe = utility.rb.getString("Bounds");
              String [] ints=Swipe.split(",");
			  
			  int x = Integer.parseInt(ints[0]);
				int y = Integer.parseInt(ints[1]);
				int z = Integer.parseInt(ints[2]);
				int s = Integer.parseInt(ints[3]);
				int c = Integer.parseInt(ints[4]);
				
				for(int i=0; i<6; i++)
				{
				dr.swipe(x, y, z, s,c);
				}
				*/

            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            String CommunityHeading = dr.findElement(By.id(utility.rb.getString("CommunityHeading"))).getText();


            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityNetwork"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityProfileIcon"))).size() != 0);
            //AssertJUnit.assertTrue(CommunityFollowing.contains("Following"));
            //AssertJUnit.assertTrue(CommunityFollowers.contains("Followers"));

            List Broadcasters = dr.findElements(By.id(utility.rb.getString("CommunityBroadcastRow")));
            Assert.assertTrue(Broadcasters.size() != 0);
            for (int i = 0; i < Broadcasters.size(); i++) {
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).size() != 0);
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterUserhandle"))).size() != 0);
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterFollowing"))).size() != 0);
            }
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            Assert.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            Assert.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            System.out.println("Splash");
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
		  
		  
		  /*String Swipe = utility.rb.getString("Bounds");
		  String [] ints=Swipe.split(",");
		  
		  int x = Integer.parseInt(ints[0]);
			int y = Integer.parseInt(ints[1]);
			int z = Integer.parseInt(ints[2]);
			int s = Integer.parseInt(ints[3]);
			int c = Integer.parseInt(ints[4]);
			
			for(int i=0; i<6; i++)
			{
			dr.swipe(x, y, z, s,c);
			}
			*/

            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            String CommunityHeading = dr.findElement(By.id(utility.rb.getString("CommunityHeading"))).getText();


            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityNetwork"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityProfileIcon"))).size() != 0);
            //AssertJUnit.assertTrue(CommunityFollowing.contains("Following"));
            //AssertJUnit.assertTrue(CommunityFollowers.contains("Followers"));
            List Broadcasters = dr.findElements(By.id(utility.rb.getString("CommunityBroadcastRow")));
            Assert.assertTrue(Broadcasters.size() != 0);
            for (int i = 0; i < Broadcasters.size(); i++) {
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).size() != 0);
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterUserhandle"))).size() != 0);
                System.out.print("test passed");
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("CommunityBroadcasterFollowing"))).size() != 0);
            }
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            System.out.println(CreateProfileMessage);
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            System.out.println(CreateProfileButton);
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));

        }
    }

    @Test
    public void GuestUserNetworkFollowingFollowers() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);

            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterSearch"))).sendKeys("teststaging");
            Thread.sleep(1000);

            dr.tap(1, size.width - 5, size.height - 5, 1);
            Thread.sleep(30000);
            String Username = dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).getText();
            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).click();
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfilePic"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowing"))).size() != 0);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().contains("test"));
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowButton"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileShareButton"))).size() != 0);
            //Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileSocialNetwork"))).size()!=0);
            dr.findElement(By.xpath(utility.rb.getString("UserProfileBackButton"))).click();
            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterFollowing"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            dr.findElement(By.id(utility.rb.getString("Close"))).click();
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterSearch"))).sendKeys("teststaging");
            Thread.sleep(1000);

            dr.tap(1, size.width - 5, size.height - 5, 1);
            Thread.sleep(30000);
            String Username = dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).getText();
            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterUsername"))).click();
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfilePic"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowing"))).size() != 0);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().contains("Ram"));
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowButton"))).size() != 0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileShareButton"))).size() != 0);
            //Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileSocialNetwork"))).size()!=0);
            dr.findElement(By.xpath(utility.rb.getString("UserProfileBackButton"))).click();
            dr.findElement(By.id(utility.rb.getString("CommunityBroadcasterFollowing"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            dr.findElement(By.id(utility.rb.getString("Close"))).click();
        }
    }

    @Test
    public void GuestUserDiscover() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);
            String DiscoverHeading = dr.findElement(By.id(utility.rb.getString("DiscoverHeading"))).getText();
            AssertJUnit.assertTrue(DiscoverHeading.contains("Discover"));
            /*String DiscoverWatchLater = dr.findElement(By.id(utility.rb.getString("DiscoverWatchLater"))).getText();
            String DiscoverFollowing = dr.findElement(By.id(utility.rb.getString("DiscoverFollowing"))).getText();
            String DiscoverMyBroadcast = dr.findElement(By.id(utility.rb.getString("DiscoverMyBroadcast"))).getText();
            AssertJUnit.assertTrue(DiscoverHeading.contains("Discover"));
            AssertJUnit.assertTrue(DiscoverWatchLater.contains("Watch Later"));
            AssertJUnit.assertTrue(DiscoverFollowing.contains("Following"));
            AssertJUnit.assertTrue(DiscoverMyBroadcast.contains("My Broadcast"));*/
            AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("DiscoverSearchIcon"))).size() != 0);
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);
            String DiscoverHeading = dr.findElement(By.id(utility.rb.getString("DiscoverHeading"))).getText();
            AssertJUnit.assertTrue(DiscoverHeading.contains("Discover"));
            String DiscoverWatchLater = dr.findElement(By.id(utility.rb.getString("DiscoverWatchLater"))).getText();
            String DiscoverFollowing = dr.findElement(By.id(utility.rb.getString("DiscoverFollowing"))).getText();
            String DiscoverMyBroadcast = dr.findElement(By.id(utility.rb.getString("DiscoverMyBroadcast"))).getText();
            AssertJUnit.assertTrue(DiscoverHeading.contains("Discover"));
            AssertJUnit.assertTrue(DiscoverWatchLater.contains("Watch Later"));
            AssertJUnit.assertTrue(DiscoverFollowing.contains("Following"));
            AssertJUnit.assertTrue(DiscoverMyBroadcast.contains("My Broadcast"));
            AssertJUnit.assertTrue(dr.findElements(By.id(utility.rb.getString("DiscoverSearchIcon"))).size() != 0);

        }
    }

    @Test
    public void GuestUserWatchLaterFollowingMyBroadcast() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);
        try {
            if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
                dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
                dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
                AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
                size = dr.manage().window().getSize();
                System.out.println(size);
                int endx = (int) (size.width * 0.90);
                int startx = (int) (size.width * 0.09);
                int starty = size.height / 2;
                dr.swipe(startx, starty, endx, starty, 500);
                Thread.sleep(5000);
                dr.findElement(By.id(utility.rb.getString("DiscoverWatchLater"))).click();
                String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
                CreateProfileMessage = CreateProfileMessage.replace("\n", "");
                AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
                String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
                AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
                dr.findElement(By.id(utility.rb.getString("Close"))).click();
                Thread.sleep(2000);
                dr.findElement(By.id(utility.rb.getString("DiscoverFollowing"))).click();
                AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
                AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
                dr.findElement(By.id(utility.rb.getString("Close"))).click();
                Thread.sleep(2000);
                dr.findElement(By.id(utility.rb.getString("DiscoverMyBroadcast"))).click();
                AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
                AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
                System.out.println("Splash");
            }
        } catch (Exception e) {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("DiscoverWatchLater"))).click();
            String CreateProfileMessage = dr.findElement(By.id(utility.rb.getString("CreateProfileMessage"))).getText();
            CreateProfileMessage = CreateProfileMessage.replace("\n", "");
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            String CreateProfileButton = dr.findElement(By.id(utility.rb.getString("LoginSignUpButton"))).getText();
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            dr.findElement(By.id(utility.rb.getString("Close"))).click();
            Thread.sleep(2000);
            dr.findElement(By.id(utility.rb.getString("DiscoverFollowing"))).click();
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));
            dr.findElement(By.id(utility.rb.getString("Close"))).click();
            Thread.sleep(2000);
            dr.findElement(By.id(utility.rb.getString("DiscoverMyBroadcast"))).click();
            AssertJUnit.assertTrue(CreateProfileMessage.contains("Please create your profile"));
            AssertJUnit.assertTrue(CreateProfileButton.contains("LOGIN/SIGN UP with mobile number"));

        }
    }

    @Test
    public void GuestUserDiscoverSearch() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("Splash2"))).click();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int endx = (int) (size.width * 0.90);
            int startx = (int) (size.width * 0.09);
            int starty = size.height / 2;
            dr.swipe(startx, starty, endx, starty, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("DiscoverSearchIcon"))).click();
            dr.findElement(By.id(utility.rb.getString("DiscoverSearchTextField"))).sendKeys("test");
            Thread.sleep(1000);

            dr.tap(1, size.width - 5, size.height - 5, 1);


            //dr.pressKeyCode(AndroidKeyCode.ENTER);
            Thread.sleep(30000);
            String SearchResultHeader = dr.findElement(By.id(utility.rb.getString("DiscoverSearchTitle"))).getText();
            Assert.assertEquals(SearchResultHeader, "test");
            List stuff = new ArrayList();
            stuff = dr.findElements(By.id("com.kryptolabs.android.speakerswire:id/main_layout"));
            AssertJUnit.assertTrue(stuff.size() > 0);
            System.out.println("Splash");
        }
    }

    @Test
    public void LoginButtonFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();
            String PhoneNumberTextMessage = dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumberText"))).getText();
            String PhoneNumberTermsCondition = dr.findElement(By.id(utility.rb.getString("LoginRegisterTermsCondition"))).getText();
            System.out.print(PhoneNumberTextMessage + "and " + PhoneNumberTermsCondition);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).isDisplayed());
            Assert.assertTrue(PhoneNumberTextMessage.contains("What’s your phone number?"));
            Assert.assertTrue(PhoneNumberTermsCondition.contains("Terms & Conditions"));
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("United Arab Emirates");
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryName"))).click();
            String SelectedCountryName = dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).getText();
            Assert.assertTrue(SelectedCountryName.contains("United Arab Emirates(+971)"));


            System.out.println("Splash");
        } else {

        }
    }

    @Test
    public void LoginValidPhoneValidOTP() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();

            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("United Arab Emirates");
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryName"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys("0000000000");
            String ConfirmationCodeButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).getText();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            String InvalidPhoneNumberText = dr.findElement(By.id(utility.rb.getString("LoginRegisterInvalidPhoneNumber"))).getText();
            Assert.assertTrue(InvalidPhoneNumberText.contains("*Invalid number entered"));
            Assert.assertTrue(ConfirmationCodeButton.contains("Send confirmation code"));
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).clear();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys("527856869");
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            if (dr.findElements(By.id(utility.rb.getString("BroadcastContinueButton"))).size() != 0) {
                dr.findElement(By.id(utility.rb.getString("BroadcastContinueButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                Thread.sleep(3000);
                String EnterOTPCodeText = dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterCodeText"))).getText();
                String DigitCodeTextMessage = dr.findElement(By.id(utility.rb.getString("LoginRegister4DigitTextMessage"))).getText();
                String ResendOTPButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterResendOTP"))).getText();
                String OTPOnCallButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterOTPOnCall"))).getText();
                Assert.assertTrue(EnterOTPCodeText.contains("Enter Code"));
                Assert.assertTrue(DigitCodeTextMessage.contains("We have sent you 4 digit code"));
                Assert.assertTrue(ResendOTPButton.contains("Resend OTP"));
                Assert.assertTrue(OTPOnCallButton.contains("OTP on call"));
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1111");
                String InvalidOTPText = dr.findElement(By.id(utility.rb.getString("LoginRegisterInvalidOTP"))).getText();
                System.out.print(InvalidOTPText);
                Assert.assertTrue(InvalidOTPText.contains("*The OTP Entered is Incorrect"));
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).clear();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            } else {
                String EnterOTPCodeText = dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterCodeText"))).getText();
                String DigitCodeTextMessage = dr.findElement(By.id(utility.rb.getString("LoginRegister4DigitTextMessage"))).getText();
                String ResendOTPButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterResendOTP"))).getText();
                String OTPOnCallButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterOTPOnCall"))).getText();
                Assert.assertTrue(EnterOTPCodeText.contains("Enter Code"));
                Assert.assertTrue(DigitCodeTextMessage.contains("We have sent you 4 digit code"));
                Assert.assertTrue(ResendOTPButton.contains("Resend OTP"));
                Assert.assertTrue(OTPOnCallButton.contains("OTP on call"));
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1111");
                String InvalidOTPText = dr.findElement(By.id(utility.rb.getString("LoginRegisterInvalidOTP"))).getText();
                System.out.print(InvalidOTPText);
                Assert.assertTrue(InvalidOTPText.contains("*The OTP Entered is Incorrect"));
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).clear();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            }

            System.out.println("Splash");
        } else {

        }
    }


    @Test
    public void MemberUserBroadcast() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("India");
            List country = dr.findElements(By.id(utility.rb.getString("SelectCountryFromList")));
            WebElement selectcountry = (WebElement) country.get(1);
            selectcountry.click();
            String Username = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            String Phonenumber = RandomUtil.generateRandomPhoneNumber("8060", 6);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys(Phonenumber);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            if (dr.findElements(By.id(utility.rb.getString("BroadcastContinueButton"))).size() != 0) {
                dr.findElement(By.id(utility.rb.getString("BroadcastContinueButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }

                dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();
                String EnterInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastEnterinviteCode"))).getText();
                String AskForInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                String InviteCodelabel = dr.findElement(By.id(utility.rb.getString("BroadcastInviteLabel"))).getText();

                System.out.print(EnterInviteCodeButton + "and" + AskForInviteCodeButton + "and" + InviteCodelabel);
                Assert.assertTrue(EnterInviteCodeButton.contains("enter invite code"));
                Assert.assertTrue(AskForInviteCodeButton.contains("Ask For Invite"));
                Assert.assertTrue(InviteCodelabel.contains("to start your first broadcast"));
            } else {
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }
                dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();
                String EnterInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastEnterinviteCode"))).getText();
                String AskForInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                String InviteCodelabel = dr.findElement(By.id(utility.rb.getString("BroadcastInviteLabel"))).getText();

                System.out.print(EnterInviteCodeButton + "and" + AskForInviteCodeButton + "and" + InviteCodelabel);
                Assert.assertTrue(EnterInviteCodeButton.contains("enter invite code"));
                Assert.assertTrue(AskForInviteCodeButton.contains("Ask For Invite"));
                Assert.assertTrue(InviteCodelabel.contains("to start your first broadcast"));
                System.out.println("Splash");
            }
        } else {

        }
    }


    @Test
    public void MemberUserBroadcastAskForIntviteFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("India");
            List country = dr.findElements(By.id(utility.rb.getString("SelectCountryFromList")));
            WebElement selectcountry = (WebElement) country.get(1);
            selectcountry.click();
            String Username = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            String Phonenumber = RandomUtil.generateRandomPhoneNumber("8060", 6);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys(Phonenumber);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            if (dr.findElements(By.id(utility.rb.getString("BroadcastContinueButton"))).size() != 0) {
                dr.findElement(By.id(utility.rb.getString("BroadcastContinueButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }
                dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();


                dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).click();

                String BroadcastRequestHeader = dr.findElement(By.id(utility.rb.getString("BroadcastRequestHeader"))).getText();
                String BroadcastRequestMessage = dr.findElement(By.id(utility.rb.getString("BroadcastRequestMessage"))).getText();
                String BroadcastRequestYesButton = dr.findElement(By.id(utility.rb.getString("BroadcastRequestYesButton"))).getText();
                String BroadcastRequestLaterButton = dr.findElement(By.id(utility.rb.getString("BroadcastRequestLaterButton"))).getText();

                System.out.print(BroadcastRequestHeader + " **** " + BroadcastRequestMessage + " ***** " + BroadcastRequestYesButton + " *** " + BroadcastRequestLaterButton);
                Assert.assertTrue(BroadcastRequestHeader.contains("Request"));
                Assert.assertTrue(BroadcastRequestMessage.contains("You want to send request for broadcaster right"));
                Assert.assertTrue(BroadcastRequestYesButton.contains("Yes"));
                Assert.assertTrue(BroadcastRequestLaterButton.contains("Later"));
                dr.findElement(By.id(utility.rb.getString("BroadcastRequestLaterButton"))).click();
                String AskForInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                Assert.assertTrue(AskForInviteCodeButton.contains("Ask For Invite"));
                dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastRequestYesButton"))).click();
                String AskForInviteCodeSent = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                System.out.print(AskForInviteCodeSent);
                Assert.assertTrue(AskForInviteCodeSent.contains("Request Sent"));
            } else {
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");

                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }
                dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).click();


                dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).click();

                String BroadcastRequestHeader = dr.findElement(By.id(utility.rb.getString("BroadcastRequestHeader"))).getText();
                String BroadcastRequestMessage = dr.findElement(By.id(utility.rb.getString("BroadcastRequestMessage"))).getText();
                String BroadcastRequestYesButton = dr.findElement(By.id(utility.rb.getString("BroadcastRequestYesButton"))).getText();
                String BroadcastRequestLaterButton = dr.findElement(By.id(utility.rb.getString("BroadcastRequestLaterButton"))).getText();

                System.out.print(BroadcastRequestHeader + " **** " + BroadcastRequestMessage + " ***** " + BroadcastRequestYesButton + " *** " + BroadcastRequestLaterButton);
                Assert.assertTrue(BroadcastRequestHeader.contains("Broadcast request"));
                Assert.assertTrue(BroadcastRequestMessage.contains("You want to send request for broadcaster right"));
                Assert.assertTrue(BroadcastRequestYesButton.contains("Yes"));
                Assert.assertTrue(BroadcastRequestLaterButton.contains("Later"));
                dr.findElement(By.id(utility.rb.getString("BroadcastRequestLaterButton"))).click();
                String AskForInviteCodeButton = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                Assert.assertTrue(AskForInviteCodeButton.contains("Ask For Invite"));
                dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastRequestYesButton"))).click();
                String AskForInviteCodeSent = dr.findElement(By.id(utility.rb.getString("BroadcastAskForInvite"))).getText();
                System.out.print(AskForInviteCodeSent);
                Assert.assertTrue(AskForInviteCodeSent.contains("Request Sent"));
            }

        } else {

        }
    }

    @Test
    public void MemberUserBroadcastVideoPlay() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("United Arab Emirates");
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryName"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys("527856869");
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            if (dr.findElements(By.id(utility.rb.getString("BroadcastContinueButton"))).size() != 0) {
                dr.findElement(By.id(utility.rb.getString("BroadcastContinueButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();

                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
                if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                    dr.findElement(By.id("android:id/button1")).click();
                }
                size = dr.manage().window().getSize();
                System.out.println(size);
                int endx = (int) (size.width * 0.90);
                int startx = (int) (size.width * 0.09);
                int starty = size.height / 2;
                dr.swipe(startx, starty, endx, starty, 500);
                Thread.sleep(5000);
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTime"))).size() != 0);
            } else {
                //dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                dr.findElement(By.id(utility.rb.getString("BroadcastHome"))).click();
                if (dr.findElements(By.id("android:id/button1")).size() != 0) {
                    dr.findElement(By.id("android:id/button1")).click();
                }
                Thread.sleep(3000);
                size = dr.manage().window().getSize();
                System.out.println(size);
                int endx = (int) (size.width * 0.90);
                int startx = (int) (size.width * 0.09);
                int starty = size.height / 2;
                dr.swipe(startx, starty, endx, starty, 500);
                Thread.sleep(5000);
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastDetailTime"))).size() != 0);
            }

        } else {

        }
    }

    @Test
    public void NewUserLogin() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {


            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterButtom"))).click();

            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCode"))).click();
            dr.findElement(By.id(utility.rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("India");
            List country = dr.findElements(By.id(utility.rb.getString("SelectCountryFromList")));
            WebElement selectcountry = (WebElement) country.get(1);
            selectcountry.click();
            String Phonenumber = RandomUtil.generateRandomPhoneNumber("8060", 6);
            String Username = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterPhoneNumber"))).sendKeys(Phonenumber);
            dr.findElement(By.id(utility.rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
            if (dr.findElements(By.id(utility.rb.getString("BroadcastContinueButton"))).size() != 0) {
                dr.findElement(By.id(utility.rb.getString("BroadcastContinueButton"))).click();
                dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                Thread.sleep(2000);
                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesText"))).getText().contains("Select preferences"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }
            } else {
                String EnterOTPCodeText = dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterCodeText"))).getText();
                String DigitCodeTextMessage = dr.findElement(By.id(utility.rb.getString("LoginRegister4DigitTextMessage"))).getText();
                String ResendOTPButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterResendOTP"))).getText();
                String OTPOnCallButton = dr.findElement(By.id(utility.rb.getString("LoginRegisterOTPOnCall"))).getText();
                Assert.assertTrue(EnterOTPCodeText.contains("Enter Code"));
                Assert.assertTrue(DigitCodeTextMessage.contains("We have sent you 4 digit code"));
                Assert.assertTrue(ResendOTPButton.contains("Resend OTP"));
                Assert.assertTrue(OTPOnCallButton.contains("OTP on call"));
                dr.findElement(By.id(utility.rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginUsernameFullNameMaleprofile"))).isDisplayed());
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginUsernameFullNameFemaleprofile"))).isDisplayed());
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginUsernameFullNameScreenTextMessage"))).getText().contains("Select your display picture"));

                dr.findElement(By.id(utility.rb.getString("LoginFullName"))).sendKeys(Username);
                dr.findElement(By.id(utility.rb.getString("LoginUserName"))).sendKeys(Username);
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).getText().contains("Next"));
                dr.findElement(By.id(utility.rb.getString("LoginNewUserNextButton"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesText"))).getText().contains("Select preferences"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelSelection"))).click();
                Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).getText().contains("Done"));
                dr.findElement(By.id(utility.rb.getString("SelectPreferencesChannelDoneButton"))).click();
                Thread.sleep(3000);
                if (dr.findElements(By.id(utility.rb.getString("BroadcastAllowButton"))).size() != 0) {
                    dr.findElement(By.id(utility.rb.getString("BroadcastAllowButton"))).click();
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                } else {
                    AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
                }
            }

            System.out.println("Splash");
        } else {

        }
    }


    @Test
    public void HomeFilterScreenAvailability() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            String HomeFilterDoneButton=dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).getText();
            String HomeFilterResetButton=dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).getText();
            String HomeFilterDurationToggle=dr.findElement(By.id(utility.rb.getString("HomeFilterDurationToggle"))).getText();
            String HomeFilterToggle=dr.findElement(By.id(utility.rb.getString("HomeFilterToggle"))).getText();
            String HomeFilterDurationDefaultText=dr.findElement(By.id(utility.rb.getString("HomeFilterDurationDefaultText"))).getText();
            String HomeFilterSortDefaultText=dr.findElement(By.id(utility.rb.getString("HomeFilterSortDefaultText"))).getText();
            String HomeFilterToggleSort=dr.findElement(By.id(utility.rb.getString("HomeFilterToggleSort"))).getText();
            String HomeFilterDefaultText=dr.findElement(By.id(utility.rb.getString("HomeFilterDefaultText"))).getText();

            System.out.print(HomeFilterDoneButton + "**"+ HomeFilterResetButton + HomeFilterDurationToggle + "**"+ HomeFilterToggle+ "**"+ HomeFilterDurationDefaultText +"**" + HomeFilterSortDefaultText + "**" + HomeFilterToggleSort +"**" +HomeFilterDefaultText);
            Assert.assertTrue(HomeFilterDoneButton.contains("Done"));
            Assert.assertTrue(HomeFilterResetButton.contains("Reset"));
            Assert.assertTrue(HomeFilterDurationToggle.contains("Duration OFF"));
            Assert.assertTrue(HomeFilterToggle.contains("Filter OFF"));
            Assert.assertTrue(HomeFilterDurationDefaultText.contains("Default all broadcasts"));
            Assert.assertTrue(HomeFilterSortDefaultText.contains("Default sort: New & Popular"));
            Assert.assertTrue(HomeFilterToggleSort.contains("Sort OFF"));
            Assert.assertTrue(HomeFilterDefaultText.contains("Default all broadcasts"));

        } else {

        }
    }

    @Test
    public void HomeSortFilterFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggleSort"))).click();
            String SortFilterViews=dr.findElement(By.id(utility.rb.getString("HomeFilterSortViews"))).getText();
            String HomeFilterSortLikes=dr.findElement(By.id(utility.rb.getString("HomeFilterSortLikes"))).getText();
            String HomeFilterSortTime=dr.findElement(By.id(utility.rb.getString("HomeFilterSortTime"))).getText();
            Assert.assertTrue(SortFilterViews.contains("Views"));
            Assert.assertTrue(HomeFilterSortLikes.contains("Likes"));
            Assert.assertTrue(HomeFilterSortTime.contains("Time"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterSortViews"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterSortDefaultText"))).getText().contains("Maximum to minimum views"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterResultViews=dr.findElements(By.id(utility.rb.getString("BroadcastHomeViews")));
            for(int i=1; i<HomeFilterResultViews.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterResultViews.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterResultViews.get(i)).getText();
                int PrevInt = Integer.parseInt(prevText);
                int CurrInt=Integer.parseInt(currText);
                Assert.assertTrue(PrevInt >=CurrInt);
            }
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggleSort"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterSortLikes"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterSortDefaultText"))).getText().contains("Maximum to minimum likes"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterResultLikes=dr.findElements(By.id(utility.rb.getString("BroadcastHomeLikes")));
            for(int i=1; i<HomeFilterResultLikes.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterResultLikes.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterResultLikes.get(i)).getText();
                int PrevInt = Integer.parseInt(prevText);
                int CurrInt=Integer.parseInt(currText);
                Assert.assertTrue(PrevInt >=CurrInt);
            }

            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggleSort"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterSortTime"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterSortDefaultText"))).getText().contains("Recent"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterSortTimeList=dr.findElements(By.id(utility.rb.getString("BroadcastDate")));
            for(int i=1; i<HomeFilterSortTimeList.size(); i++) {
                String prevText = ((AndroidElement) HomeFilterSortTimeList.get(i - 1)).getText();
                String currText = ((AndroidElement) HomeFilterSortTimeList.get(i)).getText();
                if (prevText.contains("Now")) {
                    Assert.assertTrue(prevText.contains("Now"));

                }
            }

        } else {

        }
    }
    @Test
    public void HomeSortFilterLiveRecordFollowing() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggle"))).click();
            String SortFilterRecorded=dr.findElement(By.id(utility.rb.getString("HomeFilterRecorded"))).getText();
            String HomeFilterLive=dr.findElement(By.id(utility.rb.getString("HomeFilterLive"))).getText();
            String HomeFilterFollowing=dr.findElement(By.id(utility.rb.getString("HomeFilterFollowing"))).getText();
            Assert.assertTrue(SortFilterRecorded.contains("Recorded"));
            Assert.assertTrue(HomeFilterLive.contains("Live"));
            Assert.assertTrue(HomeFilterFollowing.contains("Following"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterRecorded"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterSortTimeList=dr.findElements(By.id(utility.rb.getString("BroadcastDate")));
            for(int i=0; i<HomeFilterSortTimeList.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterSortTimeList.get(i)).getText();

                Assert.assertFalse(prevText.contains("Now"));
            }
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterFollowing"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterResultLikes=dr.findElements(By.id(utility.rb.getString("BroadcastHomeLikes")));
            for(int i=0; i<HomeFilterResultLikes.size(); i++)
            {
                Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("BroadcastHomeLikes"))).size()!=0);
            }

            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterToggle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterLive"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();

            for(int i=0; i<HomeFilterSortTimeList.size(); i++) {
                String prevText =  ((AndroidElement)HomeFilterSortTimeList.get(i)).getText();
                if (prevText.contains("Now")) {
                    Assert.assertTrue(prevText.contains("Now"));

                }
            }

        } else {

        }
    }
    @Test
    public void HomeFilterDurationFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElements(By.id(utility.rb.getString("Splash1"))).size() != 0) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDurationToggle"))).click();
            String Duration2=dr.findElement(By.id(utility.rb.getString("HomeFilterDuration2"))).getText();
            String Duration5=dr.findElement(By.id(utility.rb.getString("HomeFilterDuration5"))).getText();
            String Duration10=dr.findElement(By.id(utility.rb.getString("HomeFilterDuration10"))).getText();
            String Duration20=dr.findElement(By.id(utility.rb.getString("HomeFilterDuration20"))).getText();
            Assert.assertTrue(Duration2.contains("2"));
            Assert.assertTrue(Duration5.contains("5"));
            Assert.assertTrue(Duration10.contains("10"));
            Assert.assertTrue(Duration20.contains("20"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDuration2"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterDurationDefaultText"))).getText().contains("Broadcast duration upto 2 min"));

            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            List HomeFilterDurationList=dr.findElements(By.id(utility.rb.getString("BroadcastHomeDuration")));
            for(int i=1; i<HomeFilterDurationList.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterDurationList.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterDurationList.get(i)).getText();
                String[] splitPrev = prevText.split(" ");
                String[] splitCurr = currText.split(" ");
                int PrevInt = Integer.parseInt(splitPrev[0]);
                int CurrInt=Integer.parseInt(splitCurr[0]);
                System.out.print(PrevInt + "***" + CurrInt);
                Assert.assertTrue(PrevInt >=CurrInt);
            }
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDurationToggle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDuration5"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterDurationDefaultText"))).getText().contains("Broadcast duration upto 5 min"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
            for(int i=1; i<HomeFilterDurationList.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterDurationList.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterDurationList.get(i)).getText();
                String[] splitPrev = prevText.split(" ");
                String[] splitCurr = currText.split(" ");
                int PrevInt = Integer.parseInt(splitPrev[0]);
                int CurrInt=Integer.parseInt(splitCurr[0]);
                System.out.print(PrevInt + "***" + CurrInt);
                Assert.assertTrue(PrevInt >=CurrInt);
            }

            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDurationToggle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDuration10"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterDurationDefaultText"))).getText().contains("Broadcast duration upto 10 min"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();

            for(int i=1; i<HomeFilterDurationList.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterDurationList.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterDurationList.get(i)).getText();
                String[] splitPrev = prevText.split(" ");
                String[] splitCurr = currText.split(" ");
                int PrevInt = Integer.parseInt(splitPrev[0]);
                int CurrInt=Integer.parseInt(splitCurr[0]);
                System.out.print(PrevInt + "***" + CurrInt);
                Assert.assertTrue(PrevInt >=CurrInt);
            }

            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDurationToggle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDuration20"))).click();
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("HomeFilterDurationDefaultText"))).getText().contains("Broadcast duration upto 20 min"));
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();

            for(int i=1; i<HomeFilterDurationList.size(); i++)
            {
                String prevText =  ((AndroidElement)HomeFilterDurationList.get(i-1)).getText();
                String currText =  ((AndroidElement)HomeFilterDurationList.get(i)).getText();
                String[] splitPrev = prevText.split(" ");
                String[] splitCurr = currText.split(" ");
                int PrevInt = Integer.parseInt(splitPrev[0]);
                int CurrInt=Integer.parseInt(splitCurr[0]);
                System.out.print(PrevInt + "***" + CurrInt);
                Assert.assertTrue(PrevInt >=CurrInt);
            }
            dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterResetButton"))).click();
            dr.findElement(By.id(utility.rb.getString("HomeFilterDoneButton"))).click();
        } else {

        }
    }
    @Test
    public void UserProfileUpdateFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            String EditprofileButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).getText();
            String AboutMeHeaderText=dr.findElement(By.id(utility.rb.getString("UserProfileAboutMeText"))).getText();
            String UsernameProfile=dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText();
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileSettingsImage"))).size()!=0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowingCount"))).size()!=0);
            String UserProfileShareButton=dr.findElement(By.id(utility.rb.getString("UserProfileShareButton"))).getText();
            Assert.assertTrue((EditprofileButton.contains("Edit profile")));
            Assert.assertTrue((AboutMeHeaderText.contains("About Me")));
            Assert.assertTrue((UsernameProfile.contains("Testdeepakuserstage")));
            Assert.assertTrue((UserProfileShareButton.contains("Share")));
        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            String EditprofileButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).getText();
            String AboutMeHeaderText=dr.findElement(By.id(utility.rb.getString("UserProfileAboutMeText"))).getText();
            String UsernameProfile=dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText();
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileSettingsImage"))).size()!=0);
            Assert.assertTrue(dr.findElements(By.id(utility.rb.getString("UserProfileFollowingCount"))).size()!=0);
            String UserProfileShareButton=dr.findElement(By.id(utility.rb.getString("UserProfileShareButton"))).getText();
            Assert.assertTrue((EditprofileButton.contains("Edit profile")));
            Assert.assertTrue((AboutMeHeaderText.contains("About Me")));
            Assert.assertTrue((UsernameProfile.contains("Testdeepakuserstage")));
            Assert.assertTrue((UserProfileShareButton.contains("Share")));
        }
    }

    @Test
    public void UserProfileEditFunctionality() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            String EditprofileSaveButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).getText();
            String Edittext = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys(Edittext);
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
            Thread.sleep(5000);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileHeadline"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileAboutme"))).getText().toLowerCase().contains(Edittext));
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys("Testdeepakuserstage");
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();

        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            String EditprofileSaveButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).getText();
            String Edittext = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys(Edittext);
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
            Thread.sleep(5000);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileHeadline"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileAboutme"))).getText().toLowerCase().contains(Edittext));
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys("Testdeepakuserstage");
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
        }

    }/*
    public void CreateBroadcast() throws InterruptedException {
        Dimension size;
        Utility utility = new Utility(dr);

        if (dr.findElement(By.id(utility.rb.getString("Splash1"))).isDisplayed()) {
            dr.findElement(By.id(utility.rb.getString("Splash1"))).click();
            utility.ExistingUserLogin();
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            String EditprofileSaveButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).getText();
            String Edittext = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys(Edittext);
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
            Thread.sleep(5000);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileHeadline"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileAboutme"))).getText().toLowerCase().contains(Edittext));
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys("Testdeepakuserstage");
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();

        } else {
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooHeaderTitle"))).isDisplayed());
            AssertJUnit.assertTrue(dr.findElement(By.id(utility.rb.getString("SwooBroadcastIcon"))).isDisplayed());
            size = dr.manage().window().getSize();
            System.out.println(size);
            int star_x = (int) (size.width * 0.90);
            int end_x = (int) (size.width * 0.09);
            int star_y = size.height / 2;
            System.out.println("star_x = " + star_x + " ,end_x = " + end_x + " , star_y = " + star_y);
            //Right to left
            dr.swipe(star_x, star_y, end_x, star_y, 500);
            Thread.sleep(5000);
            dr.findElement(By.id(utility.rb.getString("CommunityProfileIcon"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            String EditprofileSaveButton=dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).getText();
            String Edittext = RandomUtil.generateRandomPhoneNumber("abcd", 6);
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys(Edittext);
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditHeadline"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).click();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditAboutMe"))).sendKeys(Edittext);
            dr.hideKeyboard();
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
            Thread.sleep(5000);
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileFullname"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileHeadline"))).getText().toLowerCase().contains(Edittext));
            Assert.assertTrue(dr.findElement(By.id(utility.rb.getString("UserProfileAboutme"))).getText().toLowerCase().contains(Edittext));
            dr.findElement(By.id(utility.rb.getString("UserProfileEditButton"))).click();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).clear();
            dr.findElement(By.id(utility.rb.getString("UserEditFullName"))).sendKeys("Testdeepakuserstage");
            dr.findElement(By.id(utility.rb.getString("UserProfileEditSaveButton"))).click();
        }



    }*/
}
	    

	  

	  


