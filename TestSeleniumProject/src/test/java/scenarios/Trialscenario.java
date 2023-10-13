package scenarios;

import org.testng.annotations.Test;

import auto.framework.ReportLog;
import auto.framework.TestBase;
import auto.framework.web.WebControl;
import common.TestDataHandler;
import pageobjects.Guru99HomeTabPage;
import pageobjects.Guru99LoginPage;
import pageobjects.Guru99RequestQuotationPage;


public class Trialscenario extends TestBase {

	@Test
	public void testScenario() throws Exception {
		TestDataHandler testDataHandler = TestDataHandler.loadTestData("Guru99", "RowSelection='Guru99_SignInWithRegisteredUserTest'");		
		ReportLog.setTestName("Guru99- SignInFunctionality");
		ReportLog.setTestCase("Valid Login in Guru99");		


		//open browser
		WebControl.open(testDataHandler.URL);
		WebControl.waitForPageToLoad(60);

		//call out the actions
		Guru99LoginPage.LoginPage.fillupLoginForm(testDataHandler);
		Guru99HomeTabPage.HomePage.verifyLogin(testDataHandler);
		Guru99HomeTabPage.HomePage.clickRequestQuotation();
		Guru99RequestQuotationPage.ReqestQuotationPage.fillupRequestQuotation(testDataHandler);

	}
}