package SprintTwoUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class AllOperationsUiSprintTwo 
{

	// All Operations for Sprint Two
	
	public static WebDriver driver;	
	WebDriverUtility wUtility = new WebDriverUtility();

	// Sign In
	
	@FindBy(xpath ="//div[@class='login-logo logo-normal']") private WebElement SignInLogoLnk;
	@FindBy(xpath ="//h4[.='Please login to your account']") private WebElement SinginToAccText; 	
	@FindBy(xpath ="//input[@placeholder='Enter your email address']") private WebElement EmailEdt;	
	@FindBy(xpath ="//input[@placeholder='Enter your password']") private WebElement PasswordEdt; 	
	@FindBy(xpath ="//button[.=' Sign In ']") private WebElement SignInBtn; 
	
	// Gold Prices
	
	@FindBy(xpath ="//span[.='Gold Prices']") private WebElement GoldPricesLnk;
	@FindBy(xpath ="//h4[.='Gold Prices List']") private WebElement GoldPricesListText;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement FilterBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement GPLSearchEdt;	
	@FindBy(xpath ="//button[@class='btn btn-added']") private WebElement GPLAddGoldPricesBtn;

	// E-Commerce
	
	@FindBy(xpath ="//span[.='Ecommerce']") private WebElement EcommerceLnk;

    // Ecommerce - Category
	
	@FindBy(xpath ="//a[.='Category']") private WebElement CategoryLnk;
	@FindBy(xpath ="//h4[.='Category List']") private WebElement CategoryListTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement CategorySeachEdt;
	@FindBy(xpath ="//button[@class='btn btn-added']") private WebElement CategoryAddCategoryBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement CategoryEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement CategoryBootStrapBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement CategoryDeleteBtn;

	// Ecommerce - Subcategory
	
	@FindBy(xpath ="//a[.='Sub Category']") private WebElement SubcategoryLnk;
	@FindBy(xpath ="//h4[.='SubCategory List']") private WebElement SubcategoryListTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SubcategorySearchEdt;
	@FindBy(xpath ="//button[.='Add SubCategory ']") private WebElement SubcategoryAddSubcategoryBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement SubcategoryEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement SubcategoryBootStrapBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement SubcategoryDeleteBtn;	
	
	// Ecommerece - Products
	
	@FindBy(xpath ="//a[.='Products']") private WebElement ProductsLnk;
	@FindBy(xpath ="//h4[.='Product List']") private WebElement ProductsListTextLnk;
	@FindBy(xpath ="//button[.='Add Product']") private WebElement ProductsAddProductsBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement ProductsSearchEdt;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement ProductsWeightInfoBtn;
	@FindBy(xpath ="(//button[.=' View '])[1]") private WebElement ProductsStonesViewBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-view'])[2]") private WebElement ProductsDesriptionViewBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement ProductsEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement ProductsBootstrapBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement ProductsDeleteBtn;
	
	// Ecommerce - Orders
	
	@FindBy(xpath ="//a[.='Ecommerce Orders']") private WebElement EcommerceOrdersLnk;
	@FindBy(xpath ="//h4[.='Ecommerce Orders']") private WebElement EcommerceOrdersTextLnk;
	@FindBy(xpath ="//button[@class='btn btn- mr-2']") private WebElement OPCancelledOrderslnk;
	@FindBy(xpath ="//button[@class='btn btn-added mr-2']") private WebElement OPPendingOrdersLnk;
	@FindBy(xpath ="//button[@class='btn btn-added3']") private WebElement OPDeliveredOrdersLnk;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement OPFilterBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement OPSearchEdt;
	@FindBy(xpath ="//button[.='Export to Excel']") private WebElement OPExportToExcelBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-danger btn-view mr-2 position-relative'])[1]") private WebElement OPProductsViewBtn;
	@FindBy(xpath ="(//button[.=' Status '])[1]") private WebElement OPActionStatusBtn;

	// Ecommerce - Transactions
	
	@FindBy(xpath ="//a[.='Ecom-Transactions']") private WebElement ECommerceTransactionsLnk;
	@FindBy(xpath ="//h4[.='Ecommerce Transactions']") private WebElement EcommerceTransactionsTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search']") private WebElement ETSearchEdt;
	
	// Banners
	
	@FindBy(xpath ="//span[.='Banners']") private WebElement BannersLnk;

	// Banners - Main Banners
	
	@FindBy(xpath ="//a[.='Main Banners']") private WebElement MainBannersLnk;
	@FindBy(xpath ="//h4[.='Main Banners']") private WebElement MainBannersTextLnk;
	@FindBy(xpath ="//button[.=' Add Main Banners ']") private WebElement MainBannersAddManiBannersBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement MainBannersSearchEdt;
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement MainBannerViewBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement MainBannerEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement MainBannerBootStrapBtn;
	
	// Banners - Splash Banners
	
	@FindBy(xpath ="//a[.='Splash Banners']") private WebElement SplashBannersLnk;
	@FindBy(xpath ="//h4[.='Splash Banners']") private WebElement SplashBannersTextLnk;
	@FindBy(xpath ="//button[.='Add Splash Banners']") private WebElement SplashBannersAddSplashBannersBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SplashBannerssearchEdt;
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement SplashBannerViewBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement SplashBannerEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement SplashBannerBootstrapBtn;
	
	// Banners - Ecom Banners
	
	@FindBy(xpath ="//a[.='Ecom Banners']") private WebElement EcomBannersLnk;
	@FindBy(xpath ="//h4[.='Ecom Banners']") private WebElement EcomBannersTextLnk;
	@FindBy(xpath ="//button[.='Add Ecom Banners']") private WebElement EcomBannersAddEcomBannersBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement EcomBannersSearchEdt;
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement EComBannersViewBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement EcomBannersEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement EcomBannersBootstrapBtn;
	
	// Coupons
	
	@FindBy(xpath ="//span[.='Coupons']") private WebElement CouponsLnk;

	// Coupons - Coupons List
	
	@FindBy(xpath ="//a[.='Coupons List']") private WebElement CouponListLnk;
	@FindBy(xpath ="//h4[.='Coupons List']") private WebElement CouponListTextLnk;
	@FindBy(xpath ="//button[.='Add Coupon']") private WebElement CouponListAddCouponBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement CouponListSearchEdt;
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement CouponListViewBtn;
	@FindBy(xpath ="(//button[.='Used Users'])[1]") private WebElement CouponListUsedUsersBtn;
	@FindBy(xpath ="(//button[.='Edit'])[1]") private WebElement CouponListEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement CouponListBootStrapBtn;
	
	// Coupons - Admin Coupons
	
	@FindBy(xpath ="//a[.='Admin Coupons']") private WebElement AdminCouponsLnk;
	@FindBy(xpath ="//h4[.='Admin Coupon ']") private WebElement AdminCouponsTextLnk;
	@FindBy(xpath ="//button[.='Add admin Coupon']") private WebElement AdminCouponAddAdminCouponBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement AdminCouponSearchEdt;
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement AdminCouponViewBtn;
	@FindBy(xpath ="(//button[.='Edit'])[1]") private WebElement AdminCouponEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-switch__track'])[1]") private WebElement AdminCouponBootstrapBtn;

    // Gift Cards
	
	@FindBy(xpath ="//span[.='Gift Cards']") private WebElement GiftCardsLnk;
	
	// All Gift Cards
	
	@FindBy(xpath ="//a[.='All Gift cards']") private WebElement AllGiftCardsLnk;
	@FindBy(xpath ="//h4[.='All Gift Cards']") private WebElement AllGiftCardsTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement AllGiftCardsSearchEdt;
	@FindBy(xpath ="//button[.='Add Gift Card']") private WebElement AllGiftCardsAddGiftCardBtn;
	@FindBy(xpath ="(//button[.='Buy Users'])[1]") private WebElement AllGiftCardsBuyUsersBtn;
	@FindBy(xpath ="(//button[.='Gift Card Used Users'])[1]") private WebElement AllGiftCardsGiftCardUsedUsersBtn;

	// Notifications
	
	@FindBy(xpath ="//span[.='Notifications']") private WebElement NotificationsLnk;
	@FindBy(xpath ="//h4[.='Notifications List']") private WebElement NotificationListLnk;
	@FindBy(xpath ="//button[.='Add Notification']") private WebElement NotificationAddNotificationBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement NotificationSeacrhEdt;
	@FindBy(xpath ="(//button[@class='btn-sm btn-view'])[1]") private WebElement NotificationViewBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit mr-2'])[1]") private WebElement NotificationEditBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement NotificationDeleteBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit ml-2'])[1]") private WebElement NotificationSendBtn;


	/*
	 *
	
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	@FindBy(xpath ="") private WebElement ;
	
		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(2000);

	 * 
	 */
	
	
	public AllOperationsUiSprintTwo(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}	

	
	public void SignInPage() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SignInLogo = SignInLogoLnk.isDisplayed();
		System.out.println("SignIn Logo Displayed : "+SignInLogo);
		Thread.sleep(2000);
		
		boolean SinginToAcc = SinginToAccText.isDisplayed();
		System.out.println("SignIn To Account Displayed : "+SinginToAcc);
		Thread.sleep(2000);

		boolean Email = EmailEdt.isDisplayed();
		System.out.println("Email is Displayed : "+ Email);
		Thread.sleep(3000);
		EmailEdt.sendKeys("soumya@gmail.com");
		Thread.sleep(1000);
		
		boolean Password = PasswordEdt.isDisplayed();
		System.out.println("Password is Displayed : "+ Password);
		Thread.sleep(3000);
		PasswordEdt.sendKeys("Backend@2024");
		Thread.sleep(1000);

		boolean SignInButton = SignInBtn.isDisplayed();
		System.out.println("SignIn Button is Displayed : "+ SignInButton);
		Thread.sleep(3000);
		SignInBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void GoldPrices() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean GoldPrices = GoldPricesLnk.isDisplayed();
		System.out.println("GoldPrices is Displayed : "+GoldPrices);
		Thread.sleep(2000);
		GoldPricesLnk.click();
		Thread.sleep(2000);
		
		boolean GoldPricesList = GoldPricesListText.isDisplayed();
		System.out.println("Gold Prices List is Displayed : "+GoldPricesList);
		Thread.sleep(2000);

		boolean FilterButton = FilterBtn.isDisplayed();
		System.out.println("Filter Button is Displayed : "+FilterButton);
		Thread.sleep(2000);

		boolean GPLSearchEdit = GPLSearchEdt.isDisplayed();
		System.out.println("GPLSearch Edit is Displayed : "+GPLSearchEdit);
		Thread.sleep(2000);

		boolean GPLAddGoldPricesButton = GPLAddGoldPricesBtn.isDisplayed();
		System.out.println("GPLAdd GoldPrices Button is Displayed : "+GPLAddGoldPricesButton);
		Thread.sleep(2000);

	}
		
	public void Ecommerece() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		boolean Ecommerce = EcommerceLnk.isDisplayed();
		System.out.println("Ecommerce is Displayed : "+Ecommerce);
		Thread.sleep(2000);
		EcommerceLnk.click();
		Thread.sleep(2000);

	}

	public void Category() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Category = CategoryLnk.isDisplayed();
		System.out.println("Category is Displayed : "+Category);
		Thread.sleep(2000);
		CategoryLnk.click();
		Thread.sleep(2000);

		boolean CategoryListText = CategoryListTextLnk.isDisplayed();
		System.out.println("Category List Text is Displayed : "+CategoryListText);
		Thread.sleep(2000);

		boolean CategorySeachEdit = CategorySeachEdt.isDisplayed();
		System.out.println("Category Seach Edit is Displayed : "+CategorySeachEdit);
		Thread.sleep(2000);

		boolean CategoryAddCategoryButton = CategoryAddCategoryBtn.isDisplayed();
		System.out.println("Category Add Category Button is Displayed : "+CategoryAddCategoryButton);
		Thread.sleep(2000);

		boolean CategoryEditButton = CategoryEditBtn.isDisplayed();
		System.out.println("Category Edit Button is Displayed : "+CategoryEditButton);
		Thread.sleep(2000);

		boolean CategoryBootStrapButton = CategoryBootStrapBtn.isDisplayed();
		System.out.println("Category BootStrap Button is Displayed : "+CategoryBootStrapButton);
		Thread.sleep(2000);

		boolean CategoryDeleteButton = CategoryDeleteBtn.isDisplayed();
		System.out.println("Category Delete Button is Displayed : "+CategoryDeleteButton);
		Thread.sleep(2000);

		
	}
	
	public void Subcategory() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Subcategory = SubcategoryLnk.isDisplayed();
		System.out.println("Subcategory is Displayed : "+Subcategory);
		Thread.sleep(2000);
		SubcategoryLnk.click();
		Thread.sleep(2000);
		
		boolean SubcategoryListText = SubcategoryListTextLnk.isDisplayed();
		System.out.println("Subcategory List Text is Displayed : "+SubcategoryListText);
		Thread.sleep(2000);

		boolean SubcategorySearchEdit = SubcategorySearchEdt.isDisplayed();
		System.out.println("Subcategory Search Edit is Displayed : "+SubcategorySearchEdit);
		Thread.sleep(2000);

		boolean SubcategoryAddSubcategoryButton = SubcategoryAddSubcategoryBtn.isDisplayed();
		System.out.println("Subcategory Add Subcategory Button is Displayed : "+SubcategoryAddSubcategoryButton);
		Thread.sleep(2000);

		boolean SubcategoryEditButton = SubcategoryEditBtn.isDisplayed();
		System.out.println("Subcategory Edit Button is Displayed : "+SubcategoryEditButton);
		Thread.sleep(2000);

		boolean SubcategoryBootStrapButton = SubcategoryBootStrapBtn.isDisplayed();
		System.out.println("Subcategory BootStrap Button is Displayed : "+SubcategoryBootStrapButton);
		Thread.sleep(2000);

		boolean SubcategoryDeleteButton = SubcategoryDeleteBtn.isDisplayed();
		System.out.println("Subcategory Delete Button is Displayed : "+SubcategoryDeleteButton);
		Thread.sleep(2000);


	}
	
	public void Products() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Products = ProductsLnk.isDisplayed();
		System.out.println("Products is Displayed : "+Products);
		Thread.sleep(2000);
		ProductsLnk.click();
		Thread.sleep(2000);

		boolean ProductsListText = ProductsListTextLnk.isDisplayed();
		System.out.println("Products List Text is Displayed : "+ProductsListText);
		Thread.sleep(2000);

		boolean ProductsAddProductsButton = ProductsAddProductsBtn.isDisplayed();
		System.out.println("Products Add Products Button is Displayed : "+ProductsAddProductsButton);
		Thread.sleep(2000);

		boolean ProductsSearchEdit = ProductsSearchEdt.isDisplayed();
		System.out.println("Products Search Edit is Displayed : "+ProductsSearchEdit);
		Thread.sleep(2000);

		boolean ProductsWeightInfoButton = ProductsWeightInfoBtn.isDisplayed();
		System.out.println("Products Weight Info Button is Displayed : "+ProductsWeightInfoButton);
		Thread.sleep(2000);

		boolean ProductsStonesViewButton = ProductsStonesViewBtn.isDisplayed();
		System.out.println("Products Stones View Button is Displayed : "+ProductsStonesViewButton);
		Thread.sleep(2000);

		boolean ProductsDesriptionViewButton = ProductsDesriptionViewBtn.isDisplayed();
		System.out.println("Products Desription View Button is Displayed : "+ProductsDesriptionViewButton);
		Thread.sleep(2000);

		boolean ProductsEditButton = ProductsEditBtn.isDisplayed();
		System.out.println("Products Edit Button is Displayed : "+ProductsEditButton);
		Thread.sleep(2000);

		boolean ProductsBootstrapButton = ProductsBootstrapBtn.isDisplayed();
		System.out.println("Products Bootstrap Button is Displayed : "+ProductsBootstrapButton);
		Thread.sleep(2000);

		boolean ProductsDeleteButton = ProductsDeleteBtn.isDisplayed();
		System.out.println("Products Delete Button is Displayed : "+ProductsDeleteButton);
		Thread.sleep(2000);

	
	}
	
	public void EcommerceOrders() throws InterruptedException
	{
		
		boolean EcommerceOrders = EcommerceOrdersLnk.isDisplayed();
		System.out.println("Ecommerce Orders is Displayed : "+EcommerceOrders);
		Thread.sleep(2000);
		EcommerceOrdersLnk.click();
		Thread.sleep(2000);

		boolean EcommerceOrdersText = EcommerceOrdersTextLnk.isDisplayed();
		System.out.println("Ecommerce OrdersText is Displayed : "+EcommerceOrdersText);
		Thread.sleep(2000);

		boolean OPCancelledOrders = OPCancelledOrderslnk.isDisplayed();
		System.out.println("OPCancelled Orders is Displayed : "+OPCancelledOrders);
		Thread.sleep(2000);

		boolean OPPendingOrders = OPPendingOrdersLnk.isDisplayed();
		System.out.println("OPPending Orders is Displayed : "+OPPendingOrders);
		Thread.sleep(2000);

		boolean OPDeliveredOrders = OPDeliveredOrdersLnk.isDisplayed();
		System.out.println("OPDelivered Orders is Displayed : "+OPDeliveredOrders);
		Thread.sleep(2000);

		boolean OPFilterButton = OPFilterBtn.isDisplayed();
		System.out.println("OPFilter Button is Displayed : "+OPFilterButton);
		Thread.sleep(2000);

		boolean OPSearchEdit = OPSearchEdt.isDisplayed();
		System.out.println("OPSearch Edit is Displayed : "+OPSearchEdit);
		Thread.sleep(2000);

		boolean OPExportToExcelButton = OPExportToExcelBtn.isDisplayed();
		System.out.println("OPExport To Excel Button is Displayed : "+OPExportToExcelButton);
		Thread.sleep(2000);

		boolean OPProductsViewButton = OPProductsViewBtn.isDisplayed();
		System.out.println("OPProducts View Button is Displayed : "+OPProductsViewButton);
		Thread.sleep(2000);

		boolean OPActionStatusButton = OPActionStatusBtn.isDisplayed();
		System.out.println("OPAction Status Button is Displayed : "+OPActionStatusButton);
		Thread.sleep(2000);


	}
	
	public void EcommerceTransactions() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean ECommerceTransactions = ECommerceTransactionsLnk.isDisplayed();
		System.out.println("ECommerce Transactions is Displayed : "+ECommerceTransactions);
		Thread.sleep(2000);
		ECommerceTransactionsLnk.click();
		Thread.sleep(2000);

		boolean EcommerceTransactionsText = EcommerceTransactionsTextLnk.isDisplayed();
		System.out.println("Ecommerce Transactions Text is Displayed : "+EcommerceTransactionsText);
		Thread.sleep(2000);

		boolean ETSearchEdit = ETSearchEdt.isDisplayed();
		System.out.println("ETSearch Edit is Displayed : "+ETSearchEdit);
		Thread.sleep(2000);

	
	}
	
	public void Banners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Banners = BannersLnk.isDisplayed();
		System.out.println("Banners is Displayed : "+Banners);
		Thread.sleep(2000);
		BannersLnk.click();
		Thread.sleep(3000);


	}
	
	public void MainBanners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean MainBanners = MainBannersLnk.isDisplayed();
		System.out.println("Main Banners is Displayed : "+MainBanners);
		Thread.sleep(2000);
		MainBannersLnk.click();
		Thread.sleep(2000);
		
		boolean MainBannersText = MainBannersTextLnk.isDisplayed();
		System.out.println("Main Banners Text is Displayed : "+MainBannersText);
		Thread.sleep(2000);

		boolean MainBannersAddMainBannersButton = MainBannersAddManiBannersBtn.isDisplayed();
		System.out.println("Main Banners Add Main Banners Button is Displayed : "+MainBannersAddMainBannersButton);
		Thread.sleep(2000);
		
		boolean MainBannersSearchEdit = MainBannersSearchEdt.isDisplayed();
		System.out.println("MainBanners Search Edit is Displayed : "+MainBannersSearchEdit);
		Thread.sleep(2000);
		
		boolean MainBannerViewButton = MainBannerViewBtn.isDisplayed();
		System.out.println("Main Banner View Button is Displayed : "+MainBannerViewButton);
		Thread.sleep(2000);

		boolean MainBannerEditButton = MainBannerEditBtn.isDisplayed();
		System.out.println("Main Banner Edit Button is Displayed : "+MainBannerEditButton);
		Thread.sleep(2000);

		boolean MainBannerBootStrapButton = MainBannerBootStrapBtn.isDisplayed();
		System.out.println("Main Banner BootStrap Button is Displayed : "+MainBannerBootStrapButton);
		Thread.sleep(2000);

		
	}
	
	public void SplashBanners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SplashBanners = SplashBannersLnk.isDisplayed();
		System.out.println("SplashBanners is Displayed : "+SplashBanners);
		Thread.sleep(2000);
		SplashBannersLnk.click();
		Thread.sleep(2000);

		boolean SplashBannersText = SplashBannersTextLnk.isDisplayed();
		System.out.println("SplashBannersText is Displayed : "+SplashBannersText);
		Thread.sleep(2000);

		boolean SplashBannersAddSplashBannersButton = SplashBannersAddSplashBannersBtn.isDisplayed();
		System.out.println("SplashBannersAddSplashBannersButton is Displayed : "+SplashBannersAddSplashBannersButton);
		Thread.sleep(2000);

		boolean SplashBannerssearchEdit = SplashBannerssearchEdt.isDisplayed();
		System.out.println("SplashBannerssearchEdit is Displayed : "+SplashBannerssearchEdit);
		Thread.sleep(2000);

		boolean SplashBannerViewButton = SplashBannerViewBtn.isDisplayed();
		System.out.println("SplashBannerViewButton is Displayed : "+SplashBannerViewButton);
		Thread.sleep(2000);

		boolean SplashBannerEditButton = SplashBannerEditBtn.isDisplayed();
		System.out.println("SplashBannerEditButton is Displayed : "+SplashBannerEditButton);
		Thread.sleep(2000);

		boolean SplashBannerBootstrapButton = SplashBannerBootstrapBtn.isDisplayed();
		System.out.println("SplashBannerBootstrapButton is Displayed : "+SplashBannerBootstrapButton);
		Thread.sleep(2000);
		
			
	}
	
	public void EcomBanners() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean EcomBanners = EcomBannersLnk.isDisplayed();
		System.out.println("Ecom Banners is Displayed : "+EcomBanners);
		Thread.sleep(2000);
		EcomBannersLnk.click();
		Thread.sleep(2000);

		boolean EcomBannersText = EcomBannersTextLnk.isDisplayed();
		System.out.println("Ecom Banners Text is Displayed : "+EcomBannersText);
		Thread.sleep(2000);

		boolean EcomBannersAddEcomBannersButton = EcomBannersAddEcomBannersBtn.isDisplayed();
		System.out.println("Ecom Banners Add Ecom Banners Button is Displayed : "+EcomBannersAddEcomBannersButton);
		Thread.sleep(2000);

		boolean EcomBannersSearchEdit = EcomBannersSearchEdt.isDisplayed();
		System.out.println("Ecom Banners Search Edit is Displayed : "+EcomBannersSearchEdit);
		Thread.sleep(2000);

		boolean EComBannersViewButton = EComBannersViewBtn.isDisplayed();
		System.out.println("EComBannersViewButton is Displayed : "+EComBannersViewButton);
		Thread.sleep(2000);

		boolean EcomBannersEditButton = EcomBannersEditBtn.isDisplayed();
		System.out.println("EcomBannersEditButton is Displayed : "+EcomBannersEditButton);
		Thread.sleep(2000);

		boolean EcomBannersBootstrapButton = EcomBannersBootstrapBtn.isDisplayed();
		System.out.println("EcomBannersBootstrapButton is Displayed : "+EcomBannersBootstrapButton);
		Thread.sleep(2000);


	}
	
	public void Coupons() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Coupons = CouponsLnk.isDisplayed();
		System.out.println("Coupons is Displayed : "+Coupons);
		Thread.sleep(2000);
		CouponsLnk.click();
		Thread.sleep(2000);

	}
	
	public void CouponList() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean CouponList = CouponListLnk.isDisplayed();
		System.out.println("CouponList is Displayed : "+CouponList);
		Thread.sleep(2000);
		CouponListLnk.click();
		Thread.sleep(2000);
		
		boolean CouponListText = CouponListTextLnk.isDisplayed();
		System.out.println("Coupon List Text is Displayed : "+CouponListText);
		Thread.sleep(2000);

		boolean CouponListAddCouponButton = CouponListAddCouponBtn.isDisplayed();
		System.out.println("Coupon List Add Coupon Button is Displayed : "+CouponListAddCouponButton);
		Thread.sleep(2000);

		boolean CouponListSearchEdit = CouponListSearchEdt.isDisplayed();
		System.out.println("Coupon List Search Edit is Displayed : "+CouponListSearchEdit);
		Thread.sleep(2000);

		boolean CouponListViewButton = CouponListViewBtn.isDisplayed();
		System.out.println("Coupon List View Button is Displayed : "+CouponListViewButton);
		Thread.sleep(2000);

		boolean CouponListUsedUsersButton = CouponListUsedUsersBtn.isDisplayed();
		System.out.println("Coupon List Used Users Button is Displayed : "+CouponListUsedUsersButton);
		Thread.sleep(2000);

		boolean CouponListEditButton = CouponListEditBtn.isDisplayed();
		System.out.println("Coupon List Edit Button is Displayed : "+CouponListEditButton);
		Thread.sleep(2000);

		boolean CouponListBootStrapButton = CouponListBootStrapBtn.isDisplayed();
		System.out.println("Coupon List BootStrap Button is Displayed : "+CouponListBootStrapBtn);
		Thread.sleep(2000);

	}
	
	public void AdminCoupons() throws InterruptedException
	{
		
		Thread.sleep(2000);
		boolean AdminCoupons = AdminCouponsLnk.isDisplayed();
		System.out.println("Admin Coupons is Displayed : "+AdminCoupons);
		Thread.sleep(2000);
		AdminCouponsLnk.click();
		Thread.sleep(2000);

		boolean AdminCouponsText = AdminCouponsTextLnk.isDisplayed();
		System.out.println("Admin Coupons Text is Displayed : "+AdminCouponsText);
		Thread.sleep(2000);

		boolean AdminCouponAddAdminCouponButton = AdminCouponAddAdminCouponBtn.isDisplayed();
		System.out.println("Admin Coupon Add Admin Coupon Button is Displayed : "+AdminCouponAddAdminCouponButton);
		Thread.sleep(2000);

		boolean AdminCouponSearchEdit = AdminCouponSearchEdt.isDisplayed();
		System.out.println("Admin Coupon Search Edit is Displayed : "+AdminCouponSearchEdit);
		Thread.sleep(2000);

		boolean AdminCouponViewButton = AdminCouponViewBtn.isDisplayed();
		System.out.println("Admin Coupon View Button is Displayed : "+AdminCouponViewButton);
		Thread.sleep(2000);

		boolean AdminCouponEditButton = AdminCouponEditBtn.isDisplayed();
		System.out.println("Admin Coupon Edit Button is Displayed : "+AdminCouponEditButton);
		Thread.sleep(2000);

		boolean AdminCouponBootstrapButton = AdminCouponBootstrapBtn.isDisplayed();
		System.out.println("Admin Coupon Bootstrap Button is Displayed : "+AdminCouponBootstrapButton);
		Thread.sleep(2000);

		
	}
	
	public void GiftCards() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean GiftCards = GiftCardsLnk.isDisplayed();
		System.out.println("GiftCards is Displayed : "+GiftCards);
		Thread.sleep(2000);
		GiftCardsLnk.click();
		Thread.sleep(2000);
		
		
	}
	
	public void AllGiftCards() throws InterruptedException
	{
		
		Thread.sleep(2000);
		boolean AllGiftCards = AllGiftCardsLnk.isDisplayed();
		System.out.println("All Gift Cards is Displayed : "+AllGiftCards);
		Thread.sleep(2000);
		AllGiftCardsLnk.click();
		Thread.sleep(2000);

		boolean AllGiftCardsText = AllGiftCardsTextLnk.isDisplayed();
		System.out.println("All Gift Cards Text is Displayed : "+AllGiftCardsText);
		Thread.sleep(2000);

		boolean AllGiftCardsSearchEdit = AllGiftCardsSearchEdt.isDisplayed();
		System.out.println("All Gift Cards Search Edit is Displayed : "+AllGiftCardsSearchEdit);
		Thread.sleep(2000);

		boolean AllGiftCardsAddGiftCardButton = AllGiftCardsAddGiftCardBtn.isDisplayed();
		System.out.println("All Gift Cards Add Gift Card Button is Displayed : "+AllGiftCardsAddGiftCardButton);
		Thread.sleep(2000);

		boolean AllGiftCardsBuyUsersButton = AllGiftCardsBuyUsersBtn.isDisplayed();
		System.out.println("All Gift Cards Buy Users Button is Displayed : "+AllGiftCardsBuyUsersButton);
		Thread.sleep(2000);

		boolean AllGiftCardsGiftCardUsedUsersButton = AllGiftCardsGiftCardUsedUsersBtn.isDisplayed();
		System.out.println("All Gift Cards Gift Card Used Users Button is Displayed : "+AllGiftCardsGiftCardUsedUsersButton);
		Thread.sleep(2000);


	}
	
	public void Notifications() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Notifications = NotificationsLnk.isDisplayed();
		System.out.println("Notifications is Displayed : "+Notifications);
		Thread.sleep(2000);
		NotificationsLnk.click();
		Thread.sleep(2000);

		boolean NotificationList = NotificationListLnk.isDisplayed();
		System.out.println("Notification List is Displayed : "+NotificationList);
		Thread.sleep(2000);

		boolean NotificationAddNotificationButton = NotificationAddNotificationBtn.isDisplayed();
		System.out.println("Notification Add Notification Button is Displayed : "+NotificationAddNotificationButton);
		Thread.sleep(2000);

		boolean NotificationSeacrhEdit = NotificationSeacrhEdt.isDisplayed();
		System.out.println("Notification Seacrh Edit is Displayed : "+NotificationSeacrhEdit);
		Thread.sleep(2000);

		boolean NotificationViewButton = NotificationViewBtn.isDisplayed();
		System.out.println("Notification View Button is Displayed : "+NotificationViewButton);
		Thread.sleep(2000);

		boolean NotificationEditButton = NotificationEditBtn.isDisplayed();
		System.out.println("Notification Edit Button is Displayed : "+NotificationEditButton);
		Thread.sleep(2000);

		boolean NotificationDeleteButton = NotificationDeleteBtn.isDisplayed();
		System.out.println("Notification Delete Button is Displayed : "+NotificationDeleteButton);
		Thread.sleep(2000);

		boolean NotificationSendButton = NotificationSendBtn.isDisplayed();
		System.out.println("Notification Send Button is Displayed : "+NotificationSendButton);
		Thread.sleep(2000);


	}
}