package Sprint_One;


import org.testng.annotations.Test;

import FMSBaseClass.BrowserLaunch;
import SprintOneUi.AllOperationsUiSprintOne;

public class SprintOneAllOperations extends BrowserLaunch {
	
	 AllOperationsUiSprintOne AllActions;
	
	// Calling Methods
	
	@Test	
	public void AllactionsUiTest()throws Exception
	{
		
		AllActions = new AllOperationsUiSprintOne(driver);
	
		
		AllActions.SignInPage();
		AllActions.DashboardPage();
		AllActions.UsersList( driver);
		AllActions.Userskyc();
		AllActions.RedeemGoldUsers();
		AllActions.SchemeList();
		AllActions.GoldPlusPlanUsers();
		AllActions.MyGoldPlanUsers();
		AllActions.PhysicalGoldUsers();
		AllActions.BuyGoldContent();
		
		
	    driver.close();
	}
}