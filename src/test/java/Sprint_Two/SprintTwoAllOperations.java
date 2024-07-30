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
		
		
		
		driver.close();
		
		
	}

}
