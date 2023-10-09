package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Element;
import auto.framework.web.Page;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class Guru99HomeTabPage extends PageBase {

	public static Page page = new Page("Guru99 Home Page", "https://demo.guru99.com/insurance/v1/header.php");
	//always add the page we visit
	//always add the protocol - http(s)

	//maglalagay ng locators
	public static class HomePage {
		//after declaring you subclass, it is now time for you to declare the elements	
		private static Element _header = new Element("Header", By.xpath("(//h2)[1]"));
		private static Button _requestQuotationButton = new Button("Request Quotation Button", By.xpath("//a[@id='ui-id-2']"));



		//maglalagay ng action
		public static void verifyLogin(TestDataHandler testDataHandler) {
			//ilalagay mo lang itong (TestDataHandler testDataHandler) kapag may test data ka
			//sa actions mo
			ReportLog.setTestStep("Step 3: Verify the header");
			//setTestStep - we are naming the test step that will reflect from our report
			_header.verifyDisplayed();
			_header.verifyText(testDataHandler.HeaderText);
		}

		//maglalagay ng action
		public static void clickRequestQuotation() {
			//ilalagay mo lang itong (TestDataHandler testDataHandler) kapag may test data ka
			//sa actions mo
			ReportLog.setTestStep("Step 4: Click the Request Quotation Button");
			//setTestStep - we are naming the test step that will reflect from our report
			_requestQuotationButton.click();
			WebControl.waitForPageToLoad(60);
		}

	}


}
