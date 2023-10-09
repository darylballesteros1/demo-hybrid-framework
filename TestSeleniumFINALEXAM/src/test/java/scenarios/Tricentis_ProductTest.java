package scenarios;

import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.WebControl;
import common.TestDataHandler;
import pageobjects.TricentisAutomobileEnterInsurantDataPage;
import pageobjects.TricentisAutomobileEnterProductDataPage;
import pageobjects.TricentisEnterVehicleDataPage;
import pageobjects.TricentisMainPage;
import pageobjects.TricentisSelectPriceOptionPage;
import pageobjects.TricentisSendQuotePage;

public class Tricentis_ProductTest extends TestBase { 
	
	@Test
	public void testScenario() throws Exception   {
		
		TestDataHandler testDataHandler = TestDataHandler.loadTestData("Tricentis", "RowSelection='Tricentis_ProductTest'");
		
		ReportLog.setTestName("Tricentis - Automobile Insurance");
		ReportLog.setTestCase("Successful purchase of items");
		
		ReportLog.setTestStep("Validate Header Section");	
		
		WebControl.open(testDataHandler.url);
		
		WebControl.waitForPageToLoad(60);
		TricentisMainPage.AutomobileInsurance.verifyMenuElement();
		TricentisMainPage.AutomobileInsurance.clickAutomobileLink();
		TricentisEnterVehicleDataPage.AutomobileInsurance.enterVehicleData(testDataHandler);
		TricentisAutomobileEnterInsurantDataPage.AutomobileInsurance.enterInsurantData(testDataHandler);
		TricentisAutomobileEnterProductDataPage.AutomobileInsurance.enterProductData(testDataHandler);
		TricentisSelectPriceOptionPage.AutomobileInsurance.selectPriceOption(testDataHandler);
		TricentisSendQuotePage.AutomobileInsurance.sendQuote(testDataHandler);
	}
}
