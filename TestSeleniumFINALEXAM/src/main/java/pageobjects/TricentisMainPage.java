package pageobjects;

import org.openqa.selenium.By;


import auto.framework.PageBase;
import auto.framework.ReportLog;
import auto.framework.web.Link;
import auto.framework.web.Page;
import auto.framework.web.WebControl;

public class TricentisMainPage extends PageBase {
	public static Page page = new Page("Tricentis - Main Page", "http://sampleapp.tricentis.com/101/");
	
	public static class AutomobileInsurance {
		
		private static Link _linkAutomobile = new Link("Automobile", By.xpath("(//a[@name=\"Navigation Automobile\" and text()=\"Automobile\"])[1]"));
        private static Link _linkTruck = new Link("Truck", By.xpath("(//a[@name=\"Navigation Truck\" and text()=\"Truck\"])[1]"));
        private static Link _linkMotorcycle = new Link("Motorcycle", By.xpath("(//a[@name=\"Navigation Motorcycle\" and text()=\"Motorcycle\"])[1]"));
        private static Link _linkCamper = new Link("Camper", By.xpath("(//a[@name=\"Navigation Camper\" and text()=\"Camper\"])[1]"));
		
		
		 public static void verifyMenuElement() {

			 ReportLog.setTestStep("Verify Header Section Displayed");
			 _linkAutomobile.waitForExist(true, 15);
	         _linkTruck.waitForExist(true, 15);
	         _linkMotorcycle.waitForExist(true, 15);
	         _linkCamper.waitForExist(true, 15);
	         _linkAutomobile.verifyDisplayed();
	         _linkTruck.verifyDisplayed();
	         _linkMotorcycle.verifyDisplayed();
	         _linkCamper.verifyDisplayed();
	        WebControl.waitForPageToLoad(60);       
             
	    }
		 public static void clickAutomobileLink() {
			 
			_linkAutomobile.waitForExist(true, 15);
			ReportLog.setTestStep("Click the Automobile hyperlink");
			_linkAutomobile.click();
			WebControl.waitForPageToLoad(60);
		}
	}
}
