package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.ListBox;
import auto.framework.web.Page;
import auto.framework.web.RadioButton;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class TricentisAutomobileEnterProductDataPage extends PageBase {

	public static Page page = new Page("Tricentis - Enter Product Data Page", "http://sampleapp.tricentis.com/101/app.php");
	
	public static class AutomobileInsurance {
		
		private static TextBox _textBoxStartDate = new TextBox("Start Date", By.xpath("(//input[@name='Start Date' ])"));
        private static ListBox _listBoxInsuranceSum = new ListBox("Insurance Sum", By.name("Insurance Sum"));
        private static ListBox _listBoxMeritRating = new ListBox("Merit Rating", By.xpath("(//select[@name='Merit Rating' ])"));
        private static ListBox _listBoxDamageInsurance = new ListBox("Damage Insurance", By.xpath("(//select[@name='Damage Insurance' ])"));
        private static RadioButton _radioButtonOptionalProducts = new RadioButton("Optional Products", By.xpath("(//span[@class='ideal-check' ])[5]"));
        private static ListBox _listBoxCourtesyCar = new ListBox("Courtesy Car", By.xpath("(//select[@name='Courtesy Car' ])"));
        private static Button _buttonNext = new Button("Next", By.xpath("//button[@id='nextselectpriceoption']"));
		
		public static void enterProductData(TestDataHandler testDataHandler) {
			ReportLog.setTestStep("Update Enter Product Data");
			
			_textBoxStartDate.type(testDataHandler.startDate);
            _listBoxInsuranceSum.selectByVisibleText(testDataHandler.insuranceSum);
            _listBoxMeritRating.selectByVisibleText(testDataHandler.meritRating);
            _listBoxDamageInsurance.selectByVisibleText(testDataHandler.damageInsurance);
            _radioButtonOptionalProducts.click();
            _listBoxCourtesyCar.selectByVisibleText(testDataHandler.courtesyCar);
            ReportLog.setTestStep("Click Product Data Next Button");
            _buttonNext.click();
            WebControl.waitForPageToLoad(60);
		}
	}
}
