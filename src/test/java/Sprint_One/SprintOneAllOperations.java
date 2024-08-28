package Sprint_One;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import FMSBaseClass.BrowserLaunch;
import SprintOneUi.AllOperationsUiSprintOne;

public class SprintOneAllOperations extends BrowserLaunch {
	
	 AllOperationsUiSprintOne AllActions;
	
	// Calling Methsod
	
	@Test	
	public void AllactionsUiTest()throws Exception
	{
		
		AllActions = new AllOperationsUiSprintOne(driver);
	    AllActions.SignInPage();
		AllActions.DashboardPage();
		AllActions.UsersList( driver);
		AllActions.Userskyc();
		AllActions.PenaltyUsers();
		AllActions.RedeemGoldUsers();
		AllActions.SchemeList();
		AllActions.GoldPlusPlanUsers();
		AllActions.MyGoldPlanUsers();
		AllActions.PhysicalGoldUsers();
		AllActions.Content();
		AllActions.GoldPlusPlanContent();
		AllActions.MyGoldPlanContent();
		AllActions.BuyGoldContent();
		
		
	    driver.close();
	}
}