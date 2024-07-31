package Sprint_Two;

import org.testng.annotations.Test;

import FMSBaseClass.BrowserLaunch;
import SprintTwoUi.AllOperationsUiSprintTwo;

public class SprintTwoAllOperations extends BrowserLaunch {
	
	AllOperationsUiSprintTwo AllOperations;
	
	@Test
	public void AllOperationsUiTest() throws InterruptedException
	{
		
		AllOperations = new AllOperationsUiSprintTwo(driver);
		
		
		AllOperations.SignInPage();
		AllOperations.GoldPrices();	
		AllOperations.Ecommerece();
		AllOperations.Category();
		AllOperations.Subcategory();
		AllOperations.Products();
		AllOperations.Brands();
		AllOperations.EcommerceOrders();
		AllOperations.EcommerceTransactions();
		AllOperations.Banners();
		AllOperations.MainBanners();
		AllOperations.SplashBanners();
		AllOperations.EcomBanners();
		AllOperations.Coupons();
		AllOperations.CouponList();
		AllOperations.AdminCoupons();
		AllOperations.GiftCards();
		AllOperations.AllGiftCards();
		AllOperations.Notifications();
		AllOperations.Transactions();
		AllOperations.Trading();
		AllOperations.Events();
		AllOperations.LedgerReports();
		AllOperations.TransactionsReport();
		AllOperations.Settings();
		AllOperations.OtpList();
		AllOperations.AppManagement();
		AllOperations.Roles();
		AllOperations.FmsUsers();
		
		
		driver.close();
		
		
	}

}