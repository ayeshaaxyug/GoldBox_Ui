package Sprint_One;


import org.testng.annotations.Test;

import FMSBaseClass.BrowserLaunch;
import SprintOneUi.AllOperationsUi;

public class SprintOneAllOperations extends BrowserLaunch {
	
	 AllOperationsUi AllActions;
	
	// Calling Methods
	
	@Test	
	public void AllactionsUiTest()throws Exception
	{
		AllActions = new AllOperationsUi(driver);
		
		AllActions.SignInPage();
		AllActions.DashboardPage();
		AllActions.Users( driver);
		
		//driver.close();
	}
}