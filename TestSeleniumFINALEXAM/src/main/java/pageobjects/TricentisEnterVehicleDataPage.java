package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.ListBox;
import auto.framework.web.Page;
import auto.framework.web.TextBox;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class TricentisEnterVehicleDataPage extends PageBase {

	public static Page page = new Page("Tricentis - Enter Vehicle Data Page", "http://sampleapp.tricentis.com/101/app.php");
	
	public static class AutomobileInsurance {
		
		private static Button _buttonNext = new Button("Next", By.xpath("(//button[@name=\"Next (Enter Insurant Data)\"])"));
        private static ListBox _listBoxMake = new ListBox("Make", By.xpath("(//select[@name=\"Make\"])"));
        private static TextBox _textBoxEnginePerformance = new TextBox("Engine Performance", By.xpath("//input[@name=\"[kW]\"]"));
        private static TextBox _textBoxDateOfManufacture = new TextBox("Date of Manufacture", By.xpath("//input[@name=\"Date of Manufacture\"]"));
        private static ListBox _listBoxNumberOfSeats = new ListBox("Number of Seats", By.xpath("//select[@name=\"Number of Seats\"]"));
        private static ListBox _listBoxFuelType = new ListBox("Fuel Type", By.xpath("//select[@name=\"Fuel Type\"]"));
        private static TextBox _textBoxListPrice = new TextBox("List Price", By.xpath("//input[@name=\"List Price\"]"));
        private static TextBox _textBoxLicensePlateNumber = new TextBox("License Plate Number", By.xpath("//input[@name=\"License Plate Number\"]"));
        private static TextBox _textBoxAnnualMileage = new TextBox("Annual Mileage", By.xpath("//input[@name=\"Annual Mileage\"]"));
		
		public static void enterVehicleData(TestDataHandler testDataHandler) {
			ReportLog.setTestStep("Update Enter Vehicle Data");
			_listBoxMake.selectByVisibleText(testDataHandler.make);
            _textBoxEnginePerformance.type(testDataHandler.enginePerformance);
            _textBoxDateOfManufacture.type(testDataHandler.dateOfManufacture);
            _listBoxNumberOfSeats.selectByVisibleText(testDataHandler.numberOfSeats);
            _listBoxFuelType.selectByVisibleText(testDataHandler.fuelType);
            _textBoxListPrice.type(testDataHandler.listPrice);
            _textBoxLicensePlateNumber.type(testDataHandler.licensePlateNumber);
            _textBoxAnnualMileage.type(testDataHandler.annualMileage);
            ReportLog.setTestStep("Click Vehicle Data Next Button");
            _buttonNext.click();
            WebControl.waitForPageToLoad(60);
		}
	}
}