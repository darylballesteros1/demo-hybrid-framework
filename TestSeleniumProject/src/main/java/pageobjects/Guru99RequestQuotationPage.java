package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.ListBox;
import auto.framework.web.Page;
import auto.framework.web.RadioButton;
import common.TestDataHandler;

public class Guru99RequestQuotationPage extends PageBase {
	public static Page page = new Page("Guru99 Request Quoatation Page", "https://demo.guru99.com/insurance/v1/header.php");
	//always add the page we visit
	//always add the protocol - http(s)

	//maglalagay ng locators
	public static class ReqestQuotationPage {
		//after declaring you subclass, it is now time for you to declare the elements	
		private static ListBox _breakDownCover = new ListBox("Header", By.xpath("//select[@name='0']"));
		private static RadioButton _yesWindScreenRepairRadioButton = new RadioButton("Yes button", By.xpath("(//input[@name='windscreenrepair'])[1]"));


		//maglalagay ng action
		public static void fillupRequestQuotation(TestDataHandler testDataHandler) {
			//ilalagay mo lang itong (TestDataHandler testDataHandler) kapag may test data ka
			//sa actions mo
			ReportLog.setTestStep("Step 5: Fill up the request quoation form");
			//setTestStep - we are naming the test step that will reflect from our report
			_breakDownCover.selectByVisibleText(testDataHandler.BreakdownCover);
			_yesWindScreenRepairRadioButton.click();
		}	




	}
}