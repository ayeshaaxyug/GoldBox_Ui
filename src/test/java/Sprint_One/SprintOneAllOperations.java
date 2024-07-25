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