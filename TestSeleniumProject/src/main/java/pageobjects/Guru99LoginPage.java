package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Page;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class Guru99LoginPage extends PageBase  {

	public static Page page = new Page("Guru99 Login Page", "https://demo.guru99.com/insurance/v1/index.php");
	//always add the page we visit
	//always add the protocol - http(s)

	public static class LoginPage {
		//after declaring you subclass, it is now time for you to declare the elements	
		private static TextBox _textBoxEmail = new TextBox("Email textbox", By.xpath("//input[@name='email']"));
		private static TextBox _textPassword = new TextBox("Password textbox", By.xpath("//input[@name='password']"));
		private static Button _buttonLogin = new Button("Login Button", By.xpath("//input[@name='submit']"));

		//
		//maglalagay ng action
		public static void fillupLoginForm(TestDataHandler testDataHandler) {
			//ilalagay mo lang itong (TestDataHandler testDataHandler) kapag may test data ka
			//sa actions mo
			ReportLog.setTestStep("Step 1: Fillup login form");
			//setTestStep - we are naming the test step that will reflect from our report
			_textBoxEmail.type(testDataHandler.Email);
			_textPassword.type(testDataHandler.Password);
		}

		//may ilalagay ka ba na testData?
		public static void clickLogin() {
			//ilalagay mo lang itong (TestDataHandler testDataHandler) kapag may test data ka
			//sa actions mo
			ReportLog.setTestStep("Step 2: Click Login");
			_buttonLogin.click();
			WebControl.waitForPageToLoad(60);
		}


	}
}