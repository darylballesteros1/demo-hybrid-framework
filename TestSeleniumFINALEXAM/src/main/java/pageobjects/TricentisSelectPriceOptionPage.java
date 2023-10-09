package pageobjects;

import org.openqa.selenium.By;

import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Button;
import auto.framework.web.Page;
import auto.framework.web.RadioButton;
import auto.framework.web.WebControl;
import common.TestDataHandler;

public class TricentisSelectPriceOptionPage extends PageBase {

	public static Page page = new Page("Tricentris - Select Price Option Page", "http://sampleapp.tricentis.com/101/app.php");
	
	public static class AutomobileInsurance{
	
		private static RadioButton _radioButtonUltimate = new RadioButton("Ultimate", By.xpath("(//span[@class='ideal-radio' ])[5]"));
        private static Button _buttonNext = new Button("Next", By.xpath("//button[@id='nextsendquote']"));
		
		public static void selectPriceOption(TestDataHandler testDataHandler) {
			ReportLog.setTestStep("Select the Ultimate radiobox");
			
			_radioButtonUltimate.click();
			ReportLog.setTestStep("Click Price Option Next Button");
            _buttonNext.click();
            WebControl.waitForPageToLoad(60);
		}
	}
}
