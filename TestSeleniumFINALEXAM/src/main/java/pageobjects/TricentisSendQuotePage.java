package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Page;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class TricentisSendQuotePage extends PageBase {

	public static Page page = new Page("Tricentis - Send Quote Page", "http://sampleapp.tricentis.com/101/app.php");
	
	public static class AutomobileInsurance {
		
		private static TextBox _textBoxEmail = new TextBox("Start Date", By.xpath("//input[@id='email']"));
        private static TextBox _textBoxUsername = new TextBox("Start Date", By.xpath("//input[@id='username']"));
        private static TextBox _textBoxPassword = new TextBox("Start Date", By.xpath("//input[@id='password']"));
        private static TextBox _textBoxConfirmPassword = new TextBox("Start Date", By.xpath("//input[@id='confirmpassword']"));
        private static Button _buttonSend = new Button("Send", By.xpath("//button[@id='sendemail']"));
        private static Element _elementMessage = new Element("Next", By.xpath("//h2[contains(text(),'Sending')]"));
        private static Button _buttonOK = new Button("Send", By.xpath("//button[contains(text(),'OK')]"));
		
		public static void sendQuote(TestDataHandler testDataHandler) {
			ReportLog.setTestStep("Update Send Quote Page");
			
			_textBoxEmail.type(testDataHandler.email);
            _textBoxUsername.type(testDataHandler.userName);
            _textBoxPassword.type(testDataHandler.password);
            _textBoxConfirmPassword.type(testDataHandler.confirmPassword);
            ReportLog.setTestStep("Click Send Button");
            _buttonSend.click();
            WebControl.waitForPageToLoad(60);
            ReportLog.setTestStep("Validate Sending Email Success");
            _elementMessage.waitForExist(true, 30);
            _elementMessage.verifyDisplayed();
            ReportLog.setTestStep("Click the OK Button");
            _buttonOK.click();
		}
	}
}
