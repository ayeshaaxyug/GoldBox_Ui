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
	
	// Ecommerce - Brands
	
	@FindBy(xpath ="//a[.='Brands']") private WebElement BrandsLnk;
	@FindBy(xpath ="//h4[.='Brands']") private WebElement BrandsTextLnk;
	@FindBy(xpath ="//button[.='Add Brand']") private WebElement BrandsAddBrandsBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement BrandsSearchEdt;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement BrandsEditBtn;
	@FindBy(xpath ="(//div[@class='mdc-form-field'])[1]") private WebElement BrandsBootStrapBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement BrandsDeleteBtn;
	
	// Ecommerce - Orders
	
	@FindBy(xpath ="//a[.='Ecommerce Orders']") private WebElement EcommerceOrdersLnk;
	@FindBy(xpath ="//h4[.='Ecommerce Orders']") private WebElement EcommerceOrdersTextLnk;
	@FindBy(xpath ="//button[@class='btn btn-added1 mr-2']") private WebElement OPCancelledOrderslnk;
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
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SplashBannersSearchEdt;
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
	@FindBy(xpath ="//h4[.='All Giftcards']") private WebElement AllGiftCardsTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement AllGiftCardsSearchEdt;
	@FindBy(xpath ="//button[.='Add Gift Card']") private WebElement AllGiftCardsAddGiftCardBtn;
	@FindBy(xpath ="(//button[.='Buy Users'])[1]") private WebElement AllGiftCardsBuyUsersBtn;
	@FindBy(xpath ="(//button[.='Gift Card Used Users'])[1]") private WebElement AllGiftCardsGiftCardUsedUsersBtn;
	
	// Merchants
	
	@FindBy(xpath ="//a[.='Merchants']") private WebElement MerchantsLnk;
	@FindBy(xpath ="//h4[.='Merchants']") private WebElement MerchantsTextLnk;
	@FindBy(xpath ="//button[.='Add Merchants']") private WebElement MerchantsAddMerchantsBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement MerchantsSearchEdt;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement MerchantsEditBtn;
	
	// Notifications
	
	@FindBy(xpath ="//span[.='Notifications']") private WebElement NotificationsLnk;
	@FindBy(xpath ="//h4[.='Notifications List']") private WebElement NotificationListLnk;
	@FindBy(xpath ="//button[.='Add Notification']") private WebElement NotificationAddNotificationBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement NotificationSeacrhEdt;
	@FindBy(xpath ="(//button[@class='btn-sm btn-view'])[1]") private WebElement NotificationViewBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit mr-2'])[1]") private WebElement NotificationEditBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit bg-danger'])[1]") private WebElement NotificationDeleteBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-edit ml-2'])[1]") private WebElement NotificationSendBtn;

	// Transactions
	
	@FindBy(xpath ="//span[.='Transactions']") private WebElement TransactionsLnk;
	@FindBy(xpath ="//h4[.='All Transactions']") private WebElement TransactionsTextLnk;
	@FindBy(xpath ="//button[.='Export to Excel']") private WebElement ExportToExcelBtn;
	@FindBy(xpath ="//label[.='Enter a date range']") private WebElement TransactionsDateRangeEdt;
	@FindBy(xpath ="//span[.='Select TXN type']") private WebElement TransactionsSelectTypeDrpDwn;
	@FindBy(xpath ="//label[.='Mobile number']") private WebElement TransactionsMobileNumberEdt;
	@FindBy(xpath ="//label[.='Transaction ID']") private WebElement TransactionsIdEdt;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto']") private WebElement TransactionsSearchBtn;
	@FindBy(xpath ="//button[@class='btn btn-filters ms-auto bg-gold']") private WebElement TransactionsRefreshBtn;
	@FindBy(xpath ="//input[@class='mdc-checkbox__native-control']") private WebElement TransactionsShowAllBoxLnk;

	// Trading
	
	@FindBy(xpath ="//span[.='Trading']") private WebElement TradingLnk;
	@FindBy(xpath ="//h4[.='Trading Bids']") private WebElement TradingBidsTextLnk;
	@FindBy(xpath ="//button[.='Export to Excel']") private WebElement TradingExportToExcelBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement TradingSearchEdt;

	// Events
	
	@FindBy(xpath ="//span[.='Events']") private WebElement EventsLnk;
	@FindBy(xpath ="//h4[.='Event Requests']") private WebElement EventsRequestTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement EventsSearchEdt;
	@FindBy(xpath ="(//button[.='Info'])[1]") private WebElement EventsInfoBtn;
	@FindBy(xpath ="(//mat-select[@aria-haspopup='listbox'])[1]") private WebElement EventsStatusUpdateDrpDwn;

	// Ledger Reports
	
	@FindBy(xpath ="//span[.='Ledger reports']") private WebElement LedgerReportsLnk;

	// Transactions Report
	
	@FindBy(xpath ="//a[.='Transaction report']") private WebElement TransactionsReportLnk;
	@FindBy(xpath ="//h4[.='Ledger Report of transaction']") private WebElement TransactionReportTextLnk;
	@FindBy(xpath ="//label[.='Enter a date range']") private WebElement TransactionsReportDateRangeEdt;
	@FindBy(xpath ="//label[.='Mobile number']") private WebElement TransactionsReportMobileNumberEdt;
	@FindBy(xpath ="//button[.=' Get Report']") private WebElement TransactionsReportGetReportBtn;
	
	// Settings
	
	@FindBy(xpath ="//span[.='Settings']") private WebElement SettingsLnk;
	
	// Settings - Otp List
	
	@FindBy(xpath ="//a[.='OTP List']") private WebElement OtpListLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement OtpListSearchEdt;
	
	// Settings - App Management
	
	@FindBy(xpath ="//a[.='App management']") private WebElement AppManagementLnk;
	@FindBy(xpath ="//h4[.='App status management']") private WebElement AppManagementTextLnk;
	@FindBy(xpath ="(//div[@class='mdc-form-field'])[1]") private WebElement AppManagementBootstrapBtn;

	// settings - Payment Management
	
	@FindBy(xpath ="//a[.='Payment management']") private WebElement PaymentManagementLnk;
	@FindBy(xpath ="//h4[.='Payment method management List']") private WebElement AppPaymentManagementTextLnk;
	@FindBy(xpath ="(//div[@class='mdc-form-field'])[1]") private WebElement PaymentManagementBootstrapBtn;

	// Settings - Roles
	
	@FindBy(xpath ="//a[.='Roles']") private WebElement RolesLnk;
	@FindBy(xpath ="//h4[.='Roles List']") private WebElement RolesListTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement RolesSearchEdt;
	@FindBy(xpath ="//button[.='Add Role']") private WebElement RolesAddRoleBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement RolesEditBtn;
	@FindBy(xpath ="(//button[@class='mr-2 btn-danger'])[1]") private WebElement RolesDeleteBtn;

	// Settings - Fms Users
	
	@FindBy(xpath ="//a[.='FMS Users']") private WebElement FmsUsersLnk;
	@FindBy(xpath ="//h4[.='FMS Users']") private WebElement FmsUsersTextLnk;
	@FindBy(xpath ="//button[.='Add FMS User']") private WebElement FmsUsersAddBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement FmsUsersSearchEdt;
	@FindBy(xpath ="//button[.=' Edit ']") private WebElement FmsUsersEditBtn;
	@FindBy(xpath ="//button[@class='mr-2 btn-danger']") private WebElement FmsUsersDeleteBtn;

	
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
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

		boolean  = .isDisplayed();
		System.out.println(" is Displayed : "+);
		Thread.sleep(3000);

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
		Thread.sleep(3000);
		
		boolean SinginToAcc = SinginToAccText.isDisplayed();
		System.out.println("SignIn To Account Displayed : "+SinginToAcc);
		Thread.sleep(3000);

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
		
		Thread.sleep(6000);
		boolean GoldPrices = GoldPricesLnk.isDisplayed();
		System.out.println("GoldPrices is Displayed : "+GoldPrices);
		Thread.sleep(3000);
		GoldPricesLnk.click();
		Thread.sleep(3000);
		
		boolean GoldPricesList = GoldPricesListText.isDisplayed();
		System.out.println("Gold Prices List is Displayed : "+GoldPricesList);
		Thread.sleep(3000);

		boolean FilterButton = FilterBtn.isDisplayed();
		System.out.println("Filter Button is Displayed : "+FilterButton);
		Thread.sleep(3000);

		boolean GPLSearchEdit = GPLSearchEdt.isDisplayed();
		System.out.println("GPLSearch Edit is Displayed : "+GPLSearchEdit);
		Thread.sleep(3000);

		boolean GPLAddGoldPricesButton = GPLAddGoldPricesBtn.isDisplayed();
		System.out.println("GPLAdd GoldPrices Button is Displayed : "+GPLAddGoldPricesButton);
		Thread.sleep(3000);

	}
		
	public void Ecommerece() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		boolean Ecommerce = EcommerceLnk.isDisplayed();
		System.out.println("Ecommerce is Displayed : "+Ecommerce);
		Thread.sleep(3000);
		EcommerceLnk.click();
		Thread.sleep(3000);

	}

	public void Category() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Category = CategoryLnk.isDisplayed();
		System.out.println("Category is Displayed : "+Category);
		Thread.sleep(3000);
		CategoryLnk.click();
		Thread.sleep(3000);

		boolean CategoryListText = CategoryListTextLnk.isDisplayed();
		System.out.println("Category List Text is Displayed : "+CategoryListText);
		Thread.sleep(3000);

		boolean CategorySeachEdit = CategorySeachEdt.isDisplayed();
		System.out.println("Category Seach Edit is Displayed : "+CategorySeachEdit);
		Thread.sleep(3000);

		boolean CategoryAddCategoryButton = CategoryAddCategoryBtn.isDisplayed();
		System.out.println("Category Add Category Button is Displayed : "+CategoryAddCategoryButton);
		Thread.sleep(3000);

		boolean CategoryEditButton = CategoryEditBtn.isDisplayed();
		System.out.println("Category Edit Button is Displayed : "+CategoryEditButton);
		Thread.sleep(3000);

		boolean CategoryBootStrapButton = CategoryBootStrapBtn.isDisplayed();
		System.out.println("Category BootStrap Button is Displayed : "+CategoryBootStrapButton);
		Thread.sleep(3000);

		boolean CategoryDeleteButton = CategoryDeleteBtn.isDisplayed();
		System.out.println("Category Delete Button is Displayed : "+CategoryDeleteButton);
		Thread.sleep(3000);

		
	}
	
	public void Subcategory() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Subcategory = SubcategoryLnk.isDisplayed();
		System.out.println("Subcategory is Displayed : "+Subcategory);
		Thread.sleep(3000);
		SubcategoryLnk.click();
		Thread.sleep(3000);
		
		boolean SubcategoryListText = SubcategoryListTextLnk.isDisplayed();
		System.out.println("Subcategory List Text is Displayed : "+SubcategoryListText);
		Thread.sleep(3000);

		boolean SubcategorySearchEdit = SubcategorySearchEdt.isDisplayed();
		System.out.println("Subcategory Search Edit is Displayed : "+SubcategorySearchEdit);
		Thread.sleep(3000);

		boolean SubcategoryAddSubcategoryButton = SubcategoryAddSubcategoryBtn.isDisplayed();
		System.out.println("Subcategory Add Subcategory Button is Displayed : "+SubcategoryAddSubcategoryButton);
		Thread.sleep(3000);

		boolean SubcategoryEditButton = SubcategoryEditBtn.isDisplayed();
		System.out.println("Subcategory Edit Button is Displayed : "+SubcategoryEditButton);
		Thread.sleep(3000);

		boolean SubcategoryBootStrapButton = SubcategoryBootStrapBtn.isDisplayed();
		System.out.println("Subcategory BootStrap Button is Displayed : "+SubcategoryBootStrapButton);
		Thread.sleep(3000);

		boolean SubcategoryDeleteButton = SubcategoryDeleteBtn.isDisplayed();
		System.out.println("Subcategory Delete Button is Displayed : "+SubcategoryDeleteButton);
		Thread.sleep(3000);


	}
	
	public void Products() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Products = ProductsLnk.isDisplayed();
		System.out.println("Products is Displayed : "+Products);
		Thread.sleep(3000);
		ProductsLnk.click();
		Thread.sleep(3000);

		boolean ProductsListText = ProductsListTextLnk.isDisplayed();
		System.out.println("Products List Text is Displayed : "+ProductsListText);
		Thread.sleep(3000);

		boolean ProductsAddProductsButton = ProductsAddProductsBtn.isDisplayed();
		System.out.println("Products Add Products Button is Displayed : "+ProductsAddProductsButton);
		Thread.sleep(3000);

		boolean ProductsSearchEdit = ProductsSearchEdt.isDisplayed();
		System.out.println("Products Search Edit is Displayed : "+ProductsSearchEdit);
		Thread.sleep(3000);

		boolean ProductsWeightInfoButton = ProductsWeightInfoBtn.isDisplayed();
		System.out.println("Products Weight Info Button is Displayed : "+ProductsWeightInfoButton);
		Thread.sleep(3000);

		boolean ProductsStonesViewButton = ProductsStonesViewBtn.isDisplayed();
		System.out.println("Products Stones View Button is Displayed : "+ProductsStonesViewButton);
		Thread.sleep(3000);

		boolean ProductsDesriptionViewButton = ProductsDesriptionViewBtn.isDisplayed();
		System.out.println("Products Desription View Button is Displayed : "+ProductsDesriptionViewButton);
		Thread.sleep(3000);

		boolean ProductsEditButton = ProductsEditBtn.isDisplayed();
		System.out.println("Products Edit Button is Displayed : "+ProductsEditButton);
		Thread.sleep(3000);

		boolean ProductsBootstrapButton = ProductsBootstrapBtn.isDisplayed();
		System.out.println("Products Bootstrap Button is Displayed : "+ProductsBootstrapButton);
		Thread.sleep(3000);

		boolean ProductsDeleteButton = ProductsDeleteBtn.isDisplayed();
		System.out.println("Products Delete Button is Displayed : "+ProductsDeleteButton);
		Thread.sleep(3000);

	
	}
	
	public void Brands() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Brands = BrandsLnk.isDisplayed();
		System.out.println("Brands is Displayed : "+Brands);
		Thread.sleep(3000);
		BrandsLnk.click();
		Thread.sleep(3000);

		boolean BrandsText = BrandsTextLnk.isDisplayed();
		System.out.println("Brands Text is Displayed : "+BrandsText);
		Thread.sleep(3000);

		boolean BrandsAddBrandsButton = BrandsAddBrandsBtn.isDisplayed();
		System.out.println("Brands Add Brands Button is Displayed : "+BrandsAddBrandsButton);
		Thread.sleep(3000);

		boolean BrandsSearchEdit = BrandsSearchEdt.isDisplayed();
		System.out.println("Brands Search Edit is Displayed : "+BrandsSearchEdit);
		Thread.sleep(3000);

		boolean BrandsEditButton = BrandsEditBtn.isDisplayed();
		System.out.println("Brands Edit Button is Displayed : "+BrandsEditButton);
		Thread.sleep(3000);

		boolean BrandsBootStrapButton = BrandsBootStrapBtn.isDisplayed();
		System.out.println("Brands BootStrap Button is Displayed : "+BrandsBootStrapButton);
		Thread.sleep(3000);

		boolean BrandsDeleteButton = BrandsDeleteBtn.isDisplayed();
		System.out.println("Brands Delete Button is Displayed : "+BrandsDeleteButton);
		Thread.sleep(3000);

		
	}
	
	public void EcommerceOrders() throws InterruptedException
	{
		
		boolean EcommerceOrders = EcommerceOrdersLnk.isDisplayed();
		System.out.println("Ecommerce Orders is Displayed : "+EcommerceOrders);
		Thread.sleep(3000);
		EcommerceOrdersLnk.click();
		Thread.sleep(3000);

		boolean EcommerceOrdersText = EcommerceOrdersTextLnk.isDisplayed();
		System.out.println("Ecommerce Orders Text is Displayed : "+EcommerceOrdersText);
		Thread.sleep(4000);

		boolean OPCancelledOrders = OPCancelledOrderslnk.isDisplayed();
		System.out.println("OPCancelled Orders is Displayed : "+OPCancelledOrders);
		Thread.sleep(3000);

		boolean OPPendingOrders = OPPendingOrdersLnk.isDisplayed();
		System.out.println("OPPending Orders is Displayed : "+OPPendingOrders);
		Thread.sleep(3000);

		boolean OPDeliveredOrders = OPDeliveredOrdersLnk.isDisplayed();
		System.out.println("OPDelivered Orders is Displayed : "+OPDeliveredOrders);
		Thread.sleep(3000);

		boolean OPFilterButton = OPFilterBtn.isDisplayed();
		System.out.println("OPFilter Button is Displayed : "+OPFilterButton);
		Thread.sleep(3000);

		boolean OPSearchEdit = OPSearchEdt.isDisplayed();
		System.out.println("OPSearch Edit is Displayed : "+OPSearchEdit);
		Thread.sleep(3000);

		boolean OPExportToExcelButton = OPExportToExcelBtn.isDisplayed();
		System.out.println("OPExport To Excel Button is Displayed : "+OPExportToExcelButton);
		Thread.sleep(3000);

		boolean OPProductsViewButton = OPProductsViewBtn.isDisplayed();
		System.out.println("OPProducts View Button is Displayed : "+OPProductsViewButton);
		Thread.sleep(3000);

		boolean OPActionStatusButton = OPActionStatusBtn.isDisplayed();
		System.out.println("OPAction Status Button is Displayed : "+OPActionStatusButton);
		Thread.sleep(3000);


	}
	
	public void EcommerceTransactions() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean ECommerceTransactions = ECommerceTransactionsLnk.isDisplayed();
		System.out.println("ECommerce Transactions is Displayed : "+ECommerceTransactions);
		Thread.sleep(3000);
		ECommerceTransactionsLnk.click();
		Thread.sleep(3000);

		boolean EcommerceTransactionsText = EcommerceTransactionsTextLnk.isDisplayed();
		System.out.println("Ecommerce Transactions Text is Displayed : "+EcommerceTransactionsText);
		Thread.sleep(3000);

		boolean ETSearchEdit = ETSearchEdt.isDisplayed();
		System.out.println("ETSearch Edit is Displayed : "+ETSearchEdit);
		Thread.sleep(3000);

	
	}
	
	public void Banners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Banners = BannersLnk.isDisplayed();
		System.out.println("Banners is Displayed : "+Banners);
		Thread.sleep(3000);
		BannersLnk.click();
		Thread.sleep(3000);


	}
	
	public void MainBanners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean MainBanners = MainBannersLnk.isDisplayed();
		System.out.println("Main Banners is Displayed : "+MainBanners);
		Thread.sleep(3000);
		MainBannersLnk.click();
		Thread.sleep(3000);
		
		boolean MainBannersText = MainBannersTextLnk.isDisplayed();
		System.out.println("Main Banners Text is Displayed : "+MainBannersText);
		Thread.sleep(3000);

		boolean MainBannersAddMainBannersButton = MainBannersAddManiBannersBtn.isDisplayed();
		System.out.println("Main Banners Add Main Banners Button is Displayed : "+MainBannersAddMainBannersButton);
		Thread.sleep(3000);
		
		boolean MainBannersSearchEdit = MainBannersSearchEdt.isDisplayed();
		System.out.println("MainBanners Search Edit is Displayed : "+MainBannersSearchEdit);
		Thread.sleep(3000);
		
		boolean MainBannerViewButton = MainBannerViewBtn.isDisplayed();
		System.out.println("Main Banner View Button is Displayed : "+MainBannerViewButton);
		Thread.sleep(3000);

		boolean MainBannerEditButton = MainBannerEditBtn.isDisplayed();
		System.out.println("Main Banner Edit Button is Displayed : "+MainBannerEditButton);
		Thread.sleep(3000);

		boolean MainBannerBootStrapButton = MainBannerBootStrapBtn.isDisplayed();
		System.out.println("Main Banner BootStrap Button is Displayed : "+MainBannerBootStrapButton);
		Thread.sleep(3000);

		
	}
	
	public void SplashBanners() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SplashBanners = SplashBannersLnk.isDisplayed();
		System.out.println("Splash Banners is Displayed : "+SplashBanners);
		Thread.sleep(3000);
		SplashBannersLnk.click();
		Thread.sleep(3000);

		boolean SplashBannersText = SplashBannersTextLnk.isDisplayed();
		System.out.println("Splash Banners Text is Displayed : "+SplashBannersText);
		Thread.sleep(3000);

		boolean SplashBannersAddSplashBannersButton = SplashBannersAddSplashBannersBtn.isDisplayed();
		System.out.println("Splash Banners Add Splash Banners Button is Displayed : "+SplashBannersAddSplashBannersButton);
		Thread.sleep(3000);

		boolean SplashBannersSearchEdit = SplashBannersSearchEdt.isDisplayed();
		System.out.println("Splash Banners Search Edit is Displayed : "+SplashBannersSearchEdit);
		Thread.sleep(3000);

		boolean SplashBannerViewButton = SplashBannerViewBtn.isDisplayed();
		System.out.println("Splash Banner View Button is Displayed : "+SplashBannerViewButton);
		Thread.sleep(3000);

		boolean SplashBannerEditButton = SplashBannerEditBtn.isDisplayed();
		System.out.println("Splash Banner Edit Button is Displayed : "+SplashBannerEditButton);
		Thread.sleep(3000);

		boolean SplashBannerBootstrapButton = SplashBannerBootstrapBtn.isDisplayed();
		System.out.println("Splash Banner Bootstrap Button is Displayed : "+SplashBannerBootstrapButton);
		Thread.sleep(3000);
		
			
	}
	
	public void EcomBanners() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean EcomBanners = EcomBannersLnk.isDisplayed();
		System.out.println("Ecom Banners is Displayed : "+EcomBanners);
		Thread.sleep(3000);
		EcomBannersLnk.click();
		Thread.sleep(3000);

		boolean EcomBannersText = EcomBannersTextLnk.isDisplayed();
		System.out.println("Ecom Banners Text is Displayed : "+EcomBannersText);
		Thread.sleep(3000);

		boolean EcomBannersAddEcomBannersButton = EcomBannersAddEcomBannersBtn.isDisplayed();
		System.out.println("Ecom Banners Add Ecom Banners Button is Displayed : "+EcomBannersAddEcomBannersButton);
		Thread.sleep(3000);

		boolean EcomBannersSearchEdit = EcomBannersSearchEdt.isDisplayed();
		System.out.println("Ecom Banners Search Edit is Displayed : "+EcomBannersSearchEdit);
		Thread.sleep(3000);

		boolean EComBannersViewButton = EComBannersViewBtn.isDisplayed();
		System.out.println("ECom Banners View Button is Displayed : "+EComBannersViewButton);
		Thread.sleep(3000);

		boolean EcomBannersEditButton = EcomBannersEditBtn.isDisplayed();
		System.out.println("Ecom Banners Edit Button is Displayed : "+EcomBannersEditButton);
		Thread.sleep(3000);

		boolean EcomBannersBootstrapButton = EcomBannersBootstrapBtn.isDisplayed();
		System.out.println("Ecom Banners Bootstrap Button is Displayed : "+EcomBannersBootstrapButton);
		Thread.sleep(3000);


	}
	
	public void Coupons() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Coupons = CouponsLnk.isDisplayed();
		System.out.println("Coupons is Displayed : "+Coupons);
		Thread.sleep(3000);
		CouponsLnk.click();
		Thread.sleep(3000);

	}
	
	public void CouponList() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean CouponList = CouponListLnk.isDisplayed();
		System.out.println("CouponList is Displayed : "+CouponList);
		Thread.sleep(3000);
		CouponListLnk.click();
		Thread.sleep(3000);
		
		boolean CouponListText = CouponListTextLnk.isDisplayed();
		System.out.println("Coupon List Text is Displayed : "+CouponListText);
		Thread.sleep(3000);

		boolean CouponListAddCouponButton = CouponListAddCouponBtn.isDisplayed();
		System.out.println("Coupon List Add Coupon Button is Displayed : "+CouponListAddCouponButton);
		Thread.sleep(3000);

		boolean CouponListSearchEdit = CouponListSearchEdt.isDisplayed();
		System.out.println("Coupon List Search Edit is Displayed : "+CouponListSearchEdit);
		Thread.sleep(3000);

		boolean CouponListViewButton = CouponListViewBtn.isDisplayed();
		System.out.println("Coupon List View Button is Displayed : "+CouponListViewButton);
		Thread.sleep(3000);

		boolean CouponListUsedUsersButton = CouponListUsedUsersBtn.isDisplayed();
		System.out.println("Coupon List Used Users Button is Displayed : "+CouponListUsedUsersButton);
		Thread.sleep(3000);

		boolean CouponListEditButton = CouponListEditBtn.isDisplayed();
		System.out.println("Coupon List Edit Button is Displayed : "+CouponListEditButton);
		Thread.sleep(3000);

		boolean CouponListBootStrapButton = CouponListBootStrapBtn.isDisplayed();
		System.out.println("Coupon List BootStrap Button is Displayed : "+CouponListBootStrapBtn);
		Thread.sleep(3000);

	}
	
	public void AdminCoupons() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean AdminCoupons = AdminCouponsLnk.isDisplayed();
		System.out.println("Admin Coupons is Displayed : "+AdminCoupons);
		Thread.sleep(3000);
		AdminCouponsLnk.click();
		Thread.sleep(3000);

		boolean AdminCouponsText = AdminCouponsTextLnk.isDisplayed();
		System.out.println("Admin Coupons Text is Displayed : "+AdminCouponsText);
		Thread.sleep(3000);

		boolean AdminCouponAddAdminCouponButton = AdminCouponAddAdminCouponBtn.isDisplayed();
		System.out.println("Admin Coupon Add Admin Coupon Button is Displayed : "+AdminCouponAddAdminCouponButton);
		Thread.sleep(3000);

		boolean AdminCouponSearchEdit = AdminCouponSearchEdt.isDisplayed();
		System.out.println("Admin Coupon Search Edit is Displayed : "+AdminCouponSearchEdit);
		Thread.sleep(3000);

		boolean AdminCouponViewButton = AdminCouponViewBtn.isDisplayed();
		System.out.println("Admin Coupon View Button is Displayed : "+AdminCouponViewButton);
		Thread.sleep(3000);

		boolean AdminCouponEditButton = AdminCouponEditBtn.isDisplayed();
		System.out.println("Admin Coupon Edit Button is Displayed : "+AdminCouponEditButton);
		Thread.sleep(3000);

		boolean AdminCouponBootstrapButton = AdminCouponBootstrapBtn.isDisplayed();
		System.out.println("Admin Coupon Bootstrap Button is Displayed : "+AdminCouponBootstrapButton);
		Thread.sleep(3000);

		
	}
	
	public void GiftCards() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean GiftCards = GiftCardsLnk.isDisplayed();
		System.out.println("GiftCards is Displayed : "+GiftCards);
		Thread.sleep(3000);
		GiftCardsLnk.click();
		Thread.sleep(3000);
		
		
	}
	
	public void AllGiftCards() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean AllGiftCards = AllGiftCardsLnk.isDisplayed();
		System.out.println("All Gift Cards is Displayed : "+AllGiftCards);
		Thread.sleep(3000);
		AllGiftCardsLnk.click();
		Thread.sleep(4000);

		boolean AllGiftCardsText = AllGiftCardsTextLnk.isDisplayed();
		System.out.println("All Gift Cards Text is Displayed : "+AllGiftCardsText);
		Thread.sleep(3000);

		boolean AllGiftCardsSearchEdit = AllGiftCardsSearchEdt.isDisplayed();
		System.out.println("All Gift Cards Search Edit is Displayed : "+AllGiftCardsSearchEdit);
		Thread.sleep(3000);

		boolean AllGiftCardsAddGiftCardButton = AllGiftCardsAddGiftCardBtn.isDisplayed();
		System.out.println("All Gift Cards Add Gift Card Button is Displayed : "+AllGiftCardsAddGiftCardButton);
		Thread.sleep(3000);

		boolean AllGiftCardsBuyUsersButton = AllGiftCardsBuyUsersBtn.isDisplayed();
		System.out.println("All Gift Cards Buy Users Button is Displayed : "+AllGiftCardsBuyUsersButton);
		Thread.sleep(3000);

		boolean AllGiftCardsGiftCardUsedUsersButton = AllGiftCardsGiftCardUsedUsersBtn.isDisplayed();
		System.out.println("All Gift Cards Gift Card Used Users Button is Displayed : "+AllGiftCardsGiftCardUsedUsersButton);
		Thread.sleep(3000);


	}
	
	public void Merchants() throws InterruptedException
	{
	
		Thread.sleep(3000);
		boolean Merchants = MerchantsLnk.isDisplayed();
		System.out.println("Merchants is Displayed : "+Merchants);
		Thread.sleep(3000);
		MerchantsLnk.click();
		Thread.sleep(3000);

		boolean MerchantsText = MerchantsTextLnk.isDisplayed();
		System.out.println("Merchants Text is Displayed : "+MerchantsText);
		Thread.sleep(3000);

		boolean MerchantsAddMerchantsButton = MerchantsAddMerchantsBtn.isDisplayed();
		System.out.println("Merchants Add Merchants Button is Displayed : "+MerchantsAddMerchantsButton);
		Thread.sleep(3000);

		boolean MerchantsSearchEdit = MerchantsSearchEdt.isDisplayed();
		System.out.println("Merchants Search Edit is Displayed : "+MerchantsSearchEdit);
		Thread.sleep(3000);

		boolean MerchantsEditButton = MerchantsEditBtn.isDisplayed();
		System.out.println("Merchants Edit Button is Displayed : "+MerchantsEditButton);
		Thread.sleep(3000);

	
	}
	
	public void Notifications() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Notifications = NotificationsLnk.isDisplayed();
		System.out.println("Notifications is Displayed : "+Notifications);
		Thread.sleep(3000);
		NotificationsLnk.click();
		Thread.sleep(3000);

		boolean NotificationList = NotificationListLnk.isDisplayed();
		System.out.println("Notification List is Displayed : "+NotificationList);
		Thread.sleep(3000);

		boolean NotificationAddNotificationButton = NotificationAddNotificationBtn.isDisplayed();
		System.out.println("Notification Add Notification Button is Displayed : "+NotificationAddNotificationButton);
		Thread.sleep(3000);

		boolean NotificationSeacrhEdit = NotificationSeacrhEdt.isDisplayed();
		System.out.println("Notification Seacrh Edit is Displayed : "+NotificationSeacrhEdit);
		Thread.sleep(3000);

		boolean NotificationViewButton = NotificationViewBtn.isDisplayed();
		System.out.println("Notification View Button is Displayed : "+NotificationViewButton);
		Thread.sleep(3000);

		boolean NotificationEditButton = NotificationEditBtn.isDisplayed();
		System.out.println("Notification Edit Button is Displayed : "+NotificationEditButton);
		Thread.sleep(3000);

		boolean NotificationDeleteButton = NotificationDeleteBtn.isDisplayed();
		System.out.println("Notification Delete Button is Displayed : "+NotificationDeleteButton);
		Thread.sleep(3000);

		boolean NotificationSendButton = NotificationSendBtn.isDisplayed();
		System.out.println("Notification Send Button is Displayed : "+NotificationSendButton);
		Thread.sleep(3000);


	}
	
	public void Transactions() throws Exception
	{
		
		Thread.sleep(3000);
		boolean Transactions = TransactionsLnk.isDisplayed();
		System.out.println("Transactions is Displayed : "+Transactions);
		Thread.sleep(3000);
		TransactionsLnk.click();
		Thread.sleep(3000);

		boolean TransactionsText = TransactionsTextLnk.isDisplayed();
		System.out.println("Transactions Text is Displayed : "+TransactionsText);
		Thread.sleep(3000);

		boolean ExportToExcelButton = ExportToExcelBtn.isDisplayed();
		System.out.println("Export To Excel Button is Displayed : "+ExportToExcelButton);
		Thread.sleep(3000);

		boolean TransactionsDateRangeEdit = TransactionsDateRangeEdt.isDisplayed();
		System.out.println("Transactions Date Range Edit is Displayed : "+TransactionsDateRangeEdit);
		Thread.sleep(3000);

		boolean TransactionsSelectTypeDropDown = TransactionsSelectTypeDrpDwn.isDisplayed();
		System.out.println("Transactions Select Type Drop Down is Displayed : "+TransactionsSelectTypeDropDown);
		Thread.sleep(3000);

		boolean TransactionsMobileNumberEdit = TransactionsMobileNumberEdt.isDisplayed();
		System.out.println("Transactions Mobile Number Edit is Displayed : "+TransactionsMobileNumberEdit);
		Thread.sleep(3000);

		boolean TransactionsIdEdit = TransactionsIdEdt.isDisplayed();
		System.out.println("Transactions Id Edit is Displayed : "+TransactionsIdEdit);
		Thread.sleep(3000);

		boolean TransactionsSearchButton = TransactionsSearchBtn.isDisplayed();
		System.out.println("Transactions Search Button is Displayed : "+TransactionsSearchButton);
		Thread.sleep(3000);
		
		boolean TransactionsRefreshButton = TransactionsRefreshBtn.isDisplayed();
		System.out.println("Transactions Refresh Button is Displayed : "+TransactionsRefreshButton);
		Thread.sleep(3000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(4);


		boolean TransactionsShowAllBox = TransactionsShowAllBoxLnk.isDisplayed();
		System.out.println("Transactions Show All Box is Displayed : "+TransactionsShowAllBox);
		Thread.sleep(3000);


	}
	
	public void Trading() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Trading = TradingLnk.isDisplayed();
		System.out.println("Trading is Displayed : "+Trading);
		Thread.sleep(3000);
		TradingLnk.click();
		Thread.sleep(3000);
		
		boolean TradingBidsText = TradingBidsTextLnk.isDisplayed();
		System.out.println("Trading Bids Text is Displayed : "+TradingBidsText);
		Thread.sleep(3000);

		boolean TradingExportToExcelButton = TradingExportToExcelBtn.isDisplayed();
		System.out.println("Trading Export To Excel Button is Displayed : "+TradingExportToExcelButton);
		Thread.sleep(3000);

		boolean TradingSearchEdit = TradingSearchEdt.isDisplayed();
		System.out.println("Trading Search Edit is Displayed : "+TradingSearchEdit);
		Thread.sleep(3000);
 
	
	}
	
	public void Events() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Events = EventsLnk.isDisplayed();
		System.out.println("Events is Displayed : "+Events);
		Thread.sleep(3000);
		EventsLnk.click();
		Thread.sleep(3000);
		
		boolean EventsRequestText = EventsRequestTextLnk.isDisplayed();
		System.out.println("Events Request Text is Displayed : "+EventsRequestText);
		Thread.sleep(3000);

		boolean EventsSearchEdit = EventsSearchEdt.isDisplayed();
		System.out.println("Events Search Edit is Displayed : "+EventsSearchEdit);
		Thread.sleep(4000);

		boolean EventsInfoButton = EventsInfoBtn.isDisplayed();
		System.out.println("Events Info Button is Displayed : "+EventsInfoButton);
		Thread.sleep(3000);

		boolean EventsStatusUpdateDropDown = EventsStatusUpdateDrpDwn.isDisplayed();
		System.out.println("Events Status Update DropDown is Displayed : "+EventsStatusUpdateDropDown);
		Thread.sleep(3000);

		
	}
	
	public void LedgerReports() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean LedgerReports = LedgerReportsLnk.isDisplayed();
		System.out.println("Ledger Reports is Displayed : "+LedgerReports);
		Thread.sleep(3000);
		LedgerReportsLnk.click();

		
	}
	
	public void TransactionsReport() throws InterruptedException
	{

		Thread.sleep(3000);
		boolean TransactionsReport = TransactionsReportLnk.isDisplayed();
		System.out.println("Transactions Report is Displayed : "+TransactionsReport);
		Thread.sleep(3000);
		TransactionsReportLnk.click();

		boolean TransactionReportText = TransactionReportTextLnk.isDisplayed();
		System.out.println("Transaction Report Text is Displayed : "+TransactionReportText);
		Thread.sleep(3000);

		boolean TransactionReportDateRangeEdit = TransactionsReportDateRangeEdt.isDisplayed();
		System.out.println("Transaction Report Date Range Edit is Displayed : "+TransactionReportDateRangeEdit);
		Thread.sleep(3000);

		boolean TransactionReportMobileNumberEdit = TransactionsReportMobileNumberEdt.isDisplayed();
		System.out.println("Transaction Report Mobile Number Edit is Displayed : "+TransactionReportMobileNumberEdit);
		Thread.sleep(3000);

		boolean TransactionReportGetReportButton = TransactionsReportGetReportBtn.isDisplayed();
		System.out.println("Transaction Report Get Report Button is Displayed : "+TransactionReportGetReportButton);
		Thread.sleep(3000);


	}
	
	public void Settings() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Settings = SettingsLnk.isDisplayed();
		System.out.println("Settings is Displayed : "+Settings);
		Thread.sleep(3000);
		SettingsLnk.click();
		Thread.sleep(3000);


	}
	
	public void OtpList() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean OtpList = OtpListLnk.isDisplayed();
		System.out.println("Otp List is Displayed : "+OtpList);
		Thread.sleep(3000);
		OtpListLnk.click();
		Thread.sleep(3000);
		
		boolean OtpListSearchEdit = OtpListSearchEdt.isDisplayed();
		System.out.println("Otp List Search Edit is Displayed : "+OtpListSearchEdit);
		Thread.sleep(3000);


	}
	
	public void AppManagement() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean AppManagement = AppManagementLnk.isDisplayed();
		System.out.println("App Management is Displayed : "+AppManagement);
		Thread.sleep(3000);
		AppManagementLnk.click();
		Thread.sleep(3000);

		boolean AppManagementText = AppManagementTextLnk.isDisplayed();
		System.out.println("App Management Text is Displayed : "+AppManagementText);
		Thread.sleep(3000);

		boolean AppManagementBootstrapButton = AppManagementBootstrapBtn.isDisplayed();
		System.out.println("App Management Bootstrap Button is Displayed : "+AppManagementBootstrapButton);
		Thread.sleep(3000);
		

	}
	
	public void PaymentManagement() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean PaymentManagement = PaymentManagementLnk.isDisplayed();
		System.out.println("Payment Management is Displayed : "+PaymentManagement);
		Thread.sleep(3000);
		PaymentManagementLnk.click();
		Thread.sleep(3000);

		boolean AppPaymentManagementText = AppPaymentManagementTextLnk.isDisplayed();
		System.out.println("App Payment Management Text is Displayed : "+AppPaymentManagementText);
		Thread.sleep(3000);

		boolean PaymentManagementBootstrapButton = PaymentManagementBootstrapBtn.isDisplayed();
		System.out.println("PaymentManagementBootstrapButton is Displayed : "+PaymentManagementBootstrapButton);
		Thread.sleep(3000);

	
	}
	
	public void Roles() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean Roles = RolesLnk.isDisplayed();
		System.out.println("Roles is Displayed : "+Roles);
		Thread.sleep(3000);
		RolesLnk.click();
		Thread.sleep(3000);

		boolean RolesListText = RolesListTextLnk.isDisplayed();
		System.out.println("Roles List Text is Displayed : "+RolesListText);
		Thread.sleep(3000);

		boolean RolesSearchEdit = RolesSearchEdt.isDisplayed();
		System.out.println("Roles Search Edit is Displayed : "+RolesSearchEdit);
		Thread.sleep(3000);

		boolean RolesAddRoleButton = RolesAddRoleBtn.isDisplayed();
		System.out.println("Roles Add Role Button is Displayed : "+RolesAddRoleButton);
		Thread.sleep(3000);

		boolean RolesEditButton = RolesEditBtn.isDisplayed();
		System.out.println("Roles Edit Button is Displayed : "+RolesEditButton);
		Thread.sleep(3000);

		boolean RolesDeleteButton = RolesDeleteBtn.isDisplayed();
		System.out.println("Roles Delete Button is Displayed : "+RolesDeleteButton);
		Thread.sleep(3000);

	}
	
	public void FmsUsers() throws InterruptedException
    {
		
		Thread.sleep(3000);
		boolean FmsUsers = FmsUsersLnk.isDisplayed();
		System.out.println("Fms Users is Displayed : "+FmsUsers);
		Thread.sleep(3000);
		FmsUsersLnk.click();
		Thread.sleep(3000);

		boolean FmsUsersText = FmsUsersTextLnk.isDisplayed();
		System.out.println("Fms Users Text is Displayed : "+FmsUsersText);
		Thread.sleep(3000);

		boolean FmsUsersAddButton = FmsUsersAddBtn.isDisplayed();
		System.out.println("Fms Users Add Button is Displayed : "+FmsUsersAddButton);
		Thread.sleep(3000);

		boolean FmsUsersSearchEdit = FmsUsersSearchEdt.isDisplayed();
		System.out.println("Fms Users Search Edit is Displayed : "+FmsUsersSearchEdit);
		Thread.sleep(3000);

		boolean FmsUsersEditButton = FmsUsersEditBtn.isDisplayed();
		System.out.println("Fms Users Edit Button is Displayed : "+FmsUsersEditButton);
		Thread.sleep(3000);

		boolean FmsUsersDeleteButton = FmsUsersDeleteBtn.isDisplayed();
		System.out.println("Fms Users Delete Button is Displayed : "+FmsUsersDeleteButton);
		Thread.sleep(3000);


    }
}