package Swoo_Android.maven;



import java.util.ResourceBundle;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

@SuppressWarnings("deprecation")
public class Utility {

	public AndroidDriver dr = null;
	public static ResourceBundle rb;

	public Utility(AndroidDriver dr) {
		this.dr = dr;
		rb = ResourceBundle.getBundle("Object");
	}

	public void ExistingUserLogin() {
		dr.findElement(By.id(rb.getString("LoginRegisterButtom"))).click();
		dr.findElement(By.id(rb.getString("LoginRegisterCountryCode"))).click();
		dr.findElement(By.id(rb.getString("LoginRegisterCountryCodeSearch"))).sendKeys("United Arab Emirates");
		dr.findElement(By.id(rb.getString("LoginRegisterCountryName"))).click();
		dr.findElement(By.id(rb.getString("LoginRegisterPhoneNumber"))).sendKeys("521334787");
		dr.findElement(By.id(rb.getString("LoginRegisterSendConfirmationCodeButton"))).click();
		if (dr.findElements(By.id(rb.getString("BroadcastContinueButton"))).size() != 0) {
			dr.findElement(By.id(rb.getString("BroadcastContinueButton"))).click();
			dr.findElement(By.id(rb.getString("BroadcastAllowButton"))).click();

			dr.findElement(By.id(rb.getString("LoginRegisterEnterOTP"))).sendKeys("1234");
			dr.findElement(By.id(rb.getString("BroadcastAllowButton"))).click();
			}
		}


	}
