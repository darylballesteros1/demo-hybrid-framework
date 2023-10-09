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

public class TricentisAutomobileEnterInsurantDataPage extends PageBase {

	public static Page page = new Page("Tricentris - Enter Insurant Data Page", "http://sampleapp.tricentis.com/101/app.php");
	
	public static class AutomobileInsurance {
		
		private static TextBox _textBoxFirst = new TextBox("First Name", By.xpath("//input[@id='firstname']"));
        private static TextBox _textBoxLast = new TextBox("Last Name", By.xpath("//input[@id='lastname']"));
        private static TextBox _textBoxDateofBirth = new TextBox("Date of Birth", By.xpath("//input[@id='birthdate']"));
        private static RadioButton _radioButtonGender = new RadioButton("Female", By.xpath("(//span[@class='ideal-radio' ])[2]"));
        private static TextBox _textBoxAddress = new TextBox("Address", By.xpath("//input[@id='streetaddress']"));
        private static ListBox _listBoxCountry = new ListBox("Country", By.xpath("//select[@id='country']"));
        private static TextBox _textBoxZipCode = new TextBox("Zip Code", By.xpath("//input[@id='zipcode']"));
        private static TextBox _textBoxCity = new TextBox("City", By.xpath("//input[@id='city']"));
        private static ListBox _listBoxOccupation = new ListBox("Occupation", By.xpath("//select[@id=\"occupation\"]"));
        private static RadioButton _radioButtonHobbies = new RadioButton("Speeding", By.xpath("(//span[@class='ideal-check' ])[1]"));
        private static Button _buttonNext = new Button("Next", By.xpath("//button[@id='nextenterproductdata']"));
		
		public static void enterInsurantData(TestDataHandler testDataHandler) {
			ReportLog.setTestStep("Update Enter Insurant Data");
			 _textBoxFirst.type(testDataHandler.firstName);
			 _textBoxLast.type(testDataHandler.lastName);
	            _textBoxDateofBirth.type(testDataHandler.dateOfBirth);
	            _radioButtonGender.click();
	            _textBoxAddress.type(testDataHandler.streetAddress);
	            _listBoxCountry.selectByVisibleText(testDataHandler.country);
	            _textBoxZipCode.type(testDataHandler.zipCode);
	            _textBoxCity.type(testDataHandler.city);
	            _listBoxOccupation.selectByVisibleText(testDataHandler.occupation);
	            _radioButtonHobbies.click();
	         ReportLog.setTestStep("Click Insurant Data Next Button");
	            _buttonNext.click();
	            WebControl.waitForPageToLoad(60);   
		}
	}
}
