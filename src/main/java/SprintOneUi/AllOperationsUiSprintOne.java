package SprintOneUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericUtility.WebDriverUtility;

public class AllOperationsUiSprintOne {
	
	// All Operations for Sprint One
	
	public static WebDriver driver;	
	WebDriverUtility wUtility = new WebDriverUtility();
	
	// Sign In
	
	@FindBy(xpath ="//div[@class='login-logo logo-normal']") private WebElement SignInLogoLnk;
	@FindBy(xpath ="//h4[.='Please login to your account']") private WebElement SinginToAccText; 	
	@FindBy(xpath ="//input[@placeholder='Enter your email address']") private WebElement EmailEdt;	
	@FindBy(xpath ="//input[@placeholder='Enter your password']") private WebElement PasswordEdt; 	
	@FindBy(xpath ="//button[.=' Sign In ']") private WebElement SignInBtn; 
	
	// Dashboard Page
	
	@FindBy(xpath ="//a[@class='logo']") private WebElement DashboardPageLogoLnk; 	
	@FindBy(xpath ="//span[.='Dashboard']") private WebElement DashboardTextLnk; 	
	@FindBy(xpath ="//label[@id='mat-mdc-form-field-label-0']") private WebElement EnterDateText;	
	@FindBy(xpath ="//span[@class='mat-mdc-button-touch-target']") private WebElement CalendorIconLnk; 	
	@FindBy(xpath ="//button[@class='btn btn-added']") private WebElement TotalAmountText; 	
	@FindBy(xpath ="//button[@class='btn btn-added mt-2']") private WebElement TotalGramsText;	
	@FindBy(xpath ="//p[.='24K Gold 999 Purity']") private WebElement TFkGoldLiveRateText;	
	@FindBy(xpath ="//p[.='22K Gold 916 Purity']") private WebElement TTkGoldLiveRateText;	
	@FindBy(xpath ="//a[@id='toggle_btn']") private WebElement ToggleBtn;	
	@FindBy(xpath ="//h5[.='Users']") private WebElement DashboardPageUsersLnk; 	
	@FindBy(xpath ="//h5[.='Transactions']") private WebElement DashboardPageTransactionsLnk;
	@FindBy(xpath ="//h5[.='Gold Plus Plan Users']") private WebElement DashboardPageGoldPlusPlanUsersLnk;	
	@FindBy(xpath ="//h5[.='Gold Plus Plan Completed Users']") private WebElement DashboardPageGoldPlusPlanCompletedUsersLnk;	
	@FindBy(xpath ="//h5[.='My Gold Plan Users']") private WebElement DashboardPageMyGoldPlanUsersLnk;	
	@FindBy(xpath ="//h5[.='My Gold Plan Completed Users']") private WebElement DashboardPageMyGoldPlanCompletedUsersLnk;	
	@FindBy(xpath ="//h5[.='Sell Gold Transactions']") private WebElement DashboardPageSellGoldTransactionsLnk;	
	@FindBy(xpath ="//h5[.='Redeem Gold Transactions']") private WebElement DashboardPageRedeemGoldTransactionsLnk;	
	@FindBy(xpath ="//h6[.='Categories']") private WebElement DashboardPageCategoriesLnk;	
	@FindBy(xpath ="//span[@class='counters counter-value']") private WebElement DashboardPageCategoriesCountLnk;	
	@FindBy(xpath ="//h6[.='Sub Categories']") private WebElement DashboardPageSubCategoriesLnk;	
	@FindBy(xpath ="(//span[@class='counters'])[1]") private WebElement DashboardPageSubCategoriesCountLnk;	
	@FindBy(xpath ="//h6[.='Products']") private WebElement DashboardPageProductsLnk;	
	@FindBy(xpath ="(//span[@class='counters'])[2]") private WebElement DashboardPageProductsCountLnk;	
	@FindBy(xpath ="//h6[.='Brands']") private WebElement DashboardPageBrandsLnk;	
	@FindBy(xpath ="(//span[@class='counters'])[3]") private WebElement DashboardPageBrandsCountLnk;	
	@FindBy(xpath ="//span[@class='user-letter']") private WebElement DashboardPageUserProfileIocnLnk;	
	@FindBy(xpath ="//span[@class='user-name']") private WebElement DashboardPageUserNameLnk;
	
	// Users -- UsersList
	
	@FindBy(xpath ="//span[.='Users']") private WebElement UsersLnk;	
	@FindBy(xpath ="//a[.='Users List']") private WebElement UsersListLnk;	
	@FindBy(xpath ="//h4[.='All Users']") private WebElement UsersListAllUsersTextLnk;	
	@FindBy(xpath ="//h6[.='Manage Users List']") private WebElement UsersListHeaderTextLnk;	
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement UsersListFilterBtn;	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement UsersListSearchBtn;
	@FindBy(xpath ="//button[.='Export to Excel']") private WebElement UsersListExportToExcelBtn;	
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement UsersListViewBtn;
	@FindBy(xpath ="(//button[@class='info'])[1]") private WebElement UsersListInfoBtn; 	
	@FindBy(xpath ="//button[.='PROFILE']") private WebElement ULInfoProfileBtn; 	
	@FindBy(xpath ="//button[.='TRANSACTIONS']") private WebElement ULInfoTransactionsBtn;	
	@FindBy(xpath ="//button[.='LOGIN LOGS']") private WebElement ULInfoLoginLogsBtn;
	@FindBy(xpath ="//button[.='ADD GOLD']") private WebElement ULInfoAddGoldBtn;	
	@FindBy(xpath ="(//div[@class='mdc-switch__shadow'])[1]") private WebElement UsersListBootStrapBtn;
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement UsersListNextBtn;	
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement UsersListPrevBtn;
	
	// Users -- Users Kyc
	
	@FindBy(xpath ="//a[.='User KYC']") private WebElement UsersKycLnk;	
	@FindBy(xpath ="//h4[.='Users KYC Request']") private WebElement UsersKycRequestTextLnk;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement UsersKycSearchEdt;	
	@FindBy(xpath ="(//button[@data-bs-target='#exampleModal'])[1]") private WebElement UKAadharImageBtn;
	@FindBy(xpath ="(//button[@data-bs-target='#exampleModall'])[1]") private WebElement UKPanImageBtn;	
	@FindBy(xpath ="(//mat-select[@aria-haspopup='listbox'])[1]") private WebElement UKStatusBtn;
	@FindBy(xpath ="//a[text()=' Next ']") private WebElement UKNextBtn;	
	@FindBy(xpath ="//a[text()=' Prev ']") private WebElement UKPrevBtn;
	
	 // Users -- Redeem Gold Users
	
	@FindBy(xpath ="//a[.='Redeem Gold Users']") private WebElement RedeemGoldUsersLnk;	
	@FindBy(xpath ="//h4[.='Redeem Gold Users Transactions']") private WebElement RedeemGoldUsersTransactionsText;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement RGUFilterBtn;	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement RGUSerachEdt;
	@FindBy(xpath ="//button[.='Export to Excel']") private WebElement RGUExportToExcelBtn;	
	@FindBy(xpath ="(//button[.='View'])[1]") private WebElement RGUViewBtn;
	@FindBy(xpath ="(//button[.='Redeem Gold'])[1]") private WebElement RGURedeemGoldBtn;	
	@FindBy(xpath ="//input[@class='mdc-checkbox__native-control']") private WebElement RGUShowAllBtn;
	
	// Schemes -- Scheme List
	
	@FindBy(xpath ="//span[.='Schemes']") private WebElement SchemesLnk;	
	@FindBy(xpath ="//a[.='Scheme List']") private WebElement SchemeListLnk;	
	@FindBy(xpath ="//h4[.='Schemes List']") private WebElement SchemeListText;	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement SchemeListSearchEdt;
	@FindBy(xpath ="//h6[.='Add Scheme']") private WebElement AddSchemeBtn;	
	@FindBy(xpath ="(//button[.=' View '])[1]") private WebElement SLViewBtn;
	@FindBy(xpath ="//button[@data-bs-target='#tenure']") private WebElement SLTenureBtn;	
	@FindBy(xpath ="//button[@data-bs-target='#amount']") private WebElement SLAmountBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-danger btn-view mr-2'])[1]") private WebElement SLActionBtn;	
	@FindBy(xpath ="(//button[@data-bs-target='#editscheme'])[1]") private WebElement SLEditBtn;
	@FindBy(xpath ="(//button[@class='mdc-switch mdc-switch--selected mdc-switch--checked'])[1]") private WebElement SLBootStrapBtn;

	// Schemes -- Gold Plus Plan Users
	
	@FindBy(xpath ="//a[.='Gold Plus Plan Users']") private WebElement GoldPlusPlanUsersLnk;
	@FindBy(xpath ="//h4[.='Scheme Users']") private WebElement SchemesUsersText;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement GPPUSearchEdt;	
	@FindBy(xpath ="//span[.='Scheme Users :']") private WebElement GPPUSchemeUsersBtn;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement GPPUInfoBtn;
	
	// Schemes -- My Gold Plan Users
	
	@FindBy(xpath ="//a[.='My Gold Plan Users']") private WebElement SchemesMyGoldPlanUsersLnk;	
	@FindBy(xpath ="//h4[.='My Gold Plan Users']") private WebElement MYGoldPlanUsersText;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement MGPUSearchEdt;	
	@FindBy(xpath ="//button[.='All Users']") private WebElement AllUsersBtn;
	@FindBy(xpath ="//button[.='Daily Users']") private WebElement DailyUsersBtn;	
	@FindBy(xpath ="//button[.='Weekly Users']") private WebElement WeeklyUsersBtn;
	@FindBy(xpath ="//button[.='Monthly Users']") private WebElement MonthlyUsersBtn;	
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement MGPUInfoBtn;
	
	// Schemes -- Physical Gold Users
	
	@FindBy(xpath ="//a[.='Physical Gold Users']") private WebElement SchemesPhysicalGoldUsersLnk;	
	@FindBy(xpath ="//h4[.='Physical Gold Users']") private WebElement PhysicalGoldUsersText;
	@FindBy(xpath ="//span[.='Physical Gold Users :']") private WebElement PhysicalGoldUsersCountLnk;	
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement PGUSearchEdt;
	
	// Buy Gold Content
	
	@FindBy(xpath ="//span[.='Buy Gold Content']") private WebElement BuyGoldContentLnk;	
	@FindBy(xpath ="//h4[.='Buy Gold Content']") private WebElement BuyGoldContenttext;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement BGCSearchEdt;
	@FindBy(xpath ="//button[.='Add Content']") private WebElement BGCAddContentBtn;
	@FindBy(xpath ="//button[@data-bs-target='#buygold18']") private WebElement ContentBtn;	
	@FindBy(xpath ="//button[@data-bs-target='#content18']") private WebElement ExplanationBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement BGCEditBtn;	
	@FindBy(xpath ="(//div[@class='mdc-form-field'])[1]") private WebElement BGCBootStrapBtn;


	public AllOperationsUiSprintOne(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}	
	
	public void SignInPage() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SignInLogo = SignInLogoLnk.isDisplayed();
		System.out.println("SignIn Logo Displayed :"+SignInLogo);
		Thread.sleep(2000);
		
		boolean SinginToAcc = SinginToAccText.isDisplayed();
		System.out.println("SignIn To Account Displayed :"+SinginToAcc);
		Thread.sleep(2000);

		boolean Email = EmailEdt.isDisplayed();
		System.out.println("Email is Displayed :"+ Email);
		Thread.sleep(3000);
		EmailEdt.sendKeys("soumya@gmail.com");
		Thread.sleep(1000);
		
		boolean Password = PasswordEdt.isDisplayed();
		System.out.println("Password is Displayed :"+ Password);
		Thread.sleep(3000);
		PasswordEdt.sendKeys("Backend@2024");
		Thread.sleep(1000);

		boolean SignInButton = SignInBtn.isDisplayed();
		System.out.println("SignIn Button is Displayed :"+ SignInButton);
		Thread.sleep(3000);
		SignInBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void DashboardPage() throws InterruptedException
	{
		
		Thread.sleep(5000);
		boolean DashboardPageLogo = DashboardPageLogoLnk.isDisplayed();
		System.out.println("Dashboard Page Logo Displayed :"+DashboardPageLogo);
		Thread.sleep(2000);
		
		boolean DashboardText = DashboardTextLnk.isDisplayed();
		System.out.println("Dashboard Text Displayed :"+DashboardText);
		Thread.sleep(2000);

		boolean EnterDate = EnterDateText.isDisplayed();
		System.out.println("Enter Date Text Displayed :"+EnterDate);
		Thread.sleep(2000);

		boolean CalendorIcon = CalendorIconLnk.isDisplayed();
		System.out.println("CalendorIcon Displayed :"+CalendorIcon);
		Thread.sleep(4000);

		boolean TotalAmount = TotalAmountText.isDisplayed();
		System.out.println("Total Amount Text Displayed :"+TotalAmount);
		Thread.sleep(2000);

		boolean TotalGrams = TotalGramsText.isDisplayed();
		System.out.println("Total Grams Text Displayed :"+TotalGrams);
		Thread.sleep(2000);

		boolean TFkGoldLiveRate = TFkGoldLiveRateText.isDisplayed();
		System.out.println("TFk Gold Live Rate Text Displayed :"+TFkGoldLiveRate);
		Thread.sleep(2000);

		boolean TTkGoldLiveRate = TTkGoldLiveRateText.isDisplayed();
		System.out.println("TTk Gold Live Rate Text Displayed :"+TTkGoldLiveRate);
		Thread.sleep(2000);

		boolean ToggleButton = ToggleBtn.isDisplayed();
		System.out.println("ToggleBtn Displayed :"+ToggleButton);
		Thread.sleep(2000);
		ToggleBtn.click();
		Thread.sleep(3000);
		ToggleBtn.click();
		Thread.sleep(3000);
		
		boolean DashboardPageUsers = DashboardPageUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Users Text Displayed :"+DashboardPageUsers);
		Thread.sleep(2000);
		
		boolean DashboardPageTransactions = DashboardPageTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Transactions Text Displayed :"+DashboardPageTransactions);
		Thread.sleep(2000);

		boolean DashboardPageGoldPlusPlanUsers = DashboardPageGoldPlusPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Users Text Displayed :"+DashboardPageGoldPlusPlanUsers);
		Thread.sleep(2000);

		boolean  DashboardPageGoldPlusPlanCompletedUsers = DashboardPageGoldPlusPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Completed Users Text Displayed :"+DashboardPageGoldPlusPlanCompletedUsers);
		Thread.sleep(2000);

		boolean DashboardPageMyGoldPlanUsers = DashboardPageMyGoldPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Users Text Displayed :"+DashboardPageMyGoldPlanUsers);
		Thread.sleep(2000);

		boolean DashboardPageMyGoldPlanCompletedUsers = DashboardPageMyGoldPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Completed Users Text Displayed :"+DashboardPageMyGoldPlanCompletedUsers);
		Thread.sleep(2000);

		boolean DashboardPageSellGoldTransactions = DashboardPageSellGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Sell Gold Transactions Text Displayed :"+DashboardPageSellGoldTransactions);
		Thread.sleep(2000);

		boolean DashboardPageRedeemGoldTransactions = DashboardPageRedeemGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Redeem Gold Transactions Text Displayed :"+DashboardPageRedeemGoldTransactions);
		Thread.sleep(2000);

		boolean DashboardPageCategories = DashboardPageCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Text Displayed :"+DashboardPageCategories);
		Thread.sleep(2000);

		boolean DashboardPageCategoriesCount = DashboardPageCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Count Text Displayed :"+DashboardPageCategoriesCount);
		Thread.sleep(2000);

		boolean DashboardPageSubCategories = DashboardPageSubCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Text Displayed :"+DashboardPageSubCategories);
		Thread.sleep(2000);

		boolean DashboardPageSubCategoriesCount = DashboardPageSubCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Count Text Displayed :"+DashboardPageSubCategoriesCount);
		Thread.sleep(2000);

		boolean DashboardPageProducts = DashboardPageProductsLnk.isDisplayed();
		System.out.println("Dashboard Page Products Text Displayed :"+DashboardPageProducts);
		Thread.sleep(2000);

		boolean DashboardPageProductsCount = DashboardPageProductsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Products Count Text Displayed :"+DashboardPageProductsCount);
		Thread.sleep(2000);

		boolean DashboardPageBrands = DashboardPageBrandsLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Text Displayed :"+DashboardPageBrands);
		Thread.sleep(2000);

		boolean DashboardPageBrandsCount = DashboardPageBrandsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Count Text Displayed :"+DashboardPageBrandsCount);
		Thread.sleep(2000);

		boolean DashboardPageUserProfileIocn = DashboardPageUserProfileIocnLnk.isDisplayed();
		System.out.println("Dashboard Page User Profile Iocn Text Displayed :"+DashboardPageUserProfileIocn);
		Thread.sleep(2000);

		boolean DashboardPageUserName = DashboardPageUserNameLnk.isDisplayed();
		System.out.println("Dashboard Page User Name Text Displayed :"+DashboardPageUserName);
		Thread.sleep(2000);
		DashboardPageUserNameLnk.click();
		Thread.sleep(3000);
		DashboardPageUserNameLnk.click();
		Thread.sleep(3000);

	}
	
	public void UsersList(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean Users = UsersLnk.isDisplayed();
		System.out.println("Users is Displayed :"+Users);
		Thread.sleep(2000);
		UsersLnk.click();
		Thread.sleep(2000);
		
		boolean UsersList = UsersListLnk.isDisplayed();
		System.out.println("UsersList is Displayed :"+UsersList);
		Thread.sleep(2000);
		UsersListLnk.click();
		Thread.sleep(2000);

		boolean UsersListAllUsersText = UsersListAllUsersTextLnk.isDisplayed();
		System.out.println("UsersList AllUsers Text Displayed :"+UsersListAllUsersText);
		Thread.sleep(2000);

		boolean UsersListHeaderText = UsersListHeaderTextLnk.isDisplayed();
		System.out.println("UsersList Header Text Displayed :"+UsersListHeaderText);
		Thread.sleep(2000);

		boolean UsersListFilterButton = UsersListFilterBtn.isDisplayed();
		System.out.println("UsersList Filter Button Displayed :"+UsersListFilterButton);
		Thread.sleep(2000);

		boolean UsersListSearchButton = UsersListSearchBtn.isDisplayed();
		System.out.println("UsersList Search Button Displayed :"+UsersListSearchButton);
		Thread.sleep(2000);

		boolean UsersListExportToExcelButton = UsersListExportToExcelBtn.isDisplayed();
		System.out.println("UsersList Export To Excel Button Displayed :"+UsersListExportToExcelButton);
		Thread.sleep(2000);
		UsersListExportToExcelBtn.click();
		Thread.sleep(2000);
		
		boolean UsersListViewButton = UsersListViewBtn.isDisplayed();
		System.out.println("UsersList View Button Displayed :"+UsersListViewButton);
		Thread.sleep(2000);
		UsersListViewBtn.click();
		Thread.sleep(2000);
		UsersListLnk.click();
		Thread.sleep(4000);
	
		boolean UsersListInfoButton = UsersListInfoBtn.isDisplayed();
		System.out.println("UsersList Info Button Displayed :"+UsersListInfoButton);
		Thread.sleep(4000);
				
		boolean UsersListBootStrapButton = UsersListBootStrapBtn.isDisplayed();
		System.out.println("UsersList BootStrap Button Displayed :"+UsersListBootStrapButton);
		Thread.sleep(2000);
	
	}
	
	public void Userskyc() throws InterruptedException 
	{
			
		Thread.sleep(3000);
		boolean UsersKyc = UsersKycLnk.isDisplayed();
		System.out.println("UsersKyc Displayed :"+UsersKyc);
		Thread.sleep(2000);
		UsersKycLnk.click();
		Thread.sleep(2000);

		boolean UsersKycRequest = UsersKycRequestTextLnk.isDisplayed();
		System.out.println("UsersKyc Request Text Displayed :"+UsersKycRequest);
		Thread.sleep(2000);

		boolean UsersKycSearchEdit = UsersKycSearchEdt.isDisplayed();
		System.out.println("UsersKyc Search Edit Displayed :"+UsersKycSearchEdit);
		Thread.sleep(2000);

		boolean UKAadharImageButton = UKAadharImageBtn.isDisplayed();
		System.out.println("UKAadhar Image Button Displayed :"+UKAadharImageButton);
		Thread.sleep(2000);

		boolean UKPanImageButton = UKPanImageBtn.isDisplayed();
		System.out.println("UKPan Image Button Displayed :"+UKPanImageButton );
		Thread.sleep(2000);

		boolean UKStatusButton = UKStatusBtn.isDisplayed();
		System.out.println("UKStatus Button Displayed :"+UKStatusButton);
		Thread.sleep(2000);

		boolean UKNextButton = UKNextBtn.isDisplayed();
		System.out.println("UKNextButton Displayed :"+UKNextButton);
		Thread.sleep(3000);
		UKNextBtn.click();
		Thread.sleep(2000);
		
		boolean UKPrevButton = UKPrevBtn.isDisplayed();
		System.out.println("UKPrev Button Displayed :"+UKPrevButton);
		Thread.sleep(2000);
		UKPrevBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void RedeemGoldUsers() throws Exception
	{
		
		boolean RedeemGoldUsers = RedeemGoldUsersLnk.isDisplayed();
		System.out.println("Redeem Gold Users  Displayed :"+RedeemGoldUsers);
		Thread.sleep(2000);
		RedeemGoldUsersLnk.click();
		Thread.sleep(2000);
		
		boolean RedeemGoldUsersTransactions = RedeemGoldUsersTransactionsText.isDisplayed();
		System.out.println("Redeem Gold Users Transactions Displayed :"+RedeemGoldUsersTransactions);
		Thread.sleep(2000);

		boolean RGUFilterButton = RGUFilterBtn.isDisplayed();
		System.out.println("RGUFilter Button Displayed :"+RGUFilterButton);
		Thread.sleep(2000);

		boolean RGUSerachEdit = RGUSerachEdt.isDisplayed();
		System.out.println("RGUSerach Edit Displayed :"+RGUSerachEdit);
		Thread.sleep(2000);

		boolean RGUexportToExcelButton = RGUExportToExcelBtn.isDisplayed();
		System.out.println("RGUExport To Excel Button Displayed :"+RGUexportToExcelButton);
		Thread.sleep(2000);
		RGUExportToExcelBtn.click();
		Thread.sleep(2000);
		
		boolean RGUViewButton = RGUViewBtn.isDisplayed();
		System.out.println("RGUViewButton Displayed :"+RGUViewButton);
		Thread.sleep(2000);

		boolean RGURedeemGoldButton = RGURedeemGoldBtn.isDisplayed();
		System.out.println("RGURedeemGoldBtn Displayed :"+RGURedeemGoldButton);
		Thread.sleep(2000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(5);

		boolean RGUShowAllButton = RGUShowAllBtn.isDisplayed();
		System.out.println("RGUShowAllButton Displayed :"+RGUShowAllButton);
		Thread.sleep(2000);
		RGUShowAllBtn.click();
		Thread.sleep(2000);
	}

	public void SchemeList() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Schemes = SchemesLnk.isDisplayed();
		System.out.println("Schemes Displayed :"+Schemes);
		Thread.sleep(2000);
		SchemesLnk.click();
		Thread.sleep(2000);

		boolean SchemeList = SchemeListLnk.isDisplayed();
		System.out.println("Scheme List Displayed :"+SchemeList);
		Thread.sleep(2000);
		SchemeListLnk.click();
		Thread.sleep(2000);
		
		boolean SchemeListTexT = SchemeListText.isDisplayed();
		System.out.println("Scheme List TexT Displayed :"+SchemeListTexT);
		Thread.sleep(2000);

		boolean SchemeListSearchEdit = SchemeListSearchEdt.isDisplayed();
		System.out.println("Scheme List Search Edit Displayed :"+SchemeListSearchEdit);
		Thread.sleep(2000);

		boolean AddSchemeButton = AddSchemeBtn.isDisplayed();
		System.out.println("Add Scheme Button Displayed :"+AddSchemeButton);
		Thread.sleep(2000);

		boolean SLViewButton = SLViewBtn.isDisplayed();
		System.out.println("SLViewButton Displayed :"+SLViewButton);
		Thread.sleep(2000);

		boolean SLAmountButton = SLAmountBtn.isDisplayed();
		System.out.println("SLAmountButton Displayed :"+SLAmountButton);
		Thread.sleep(2000);

		boolean SLActionButton = SLActionBtn.isDisplayed();
		System.out.println("SLActionButton Displayed :"+SLActionButton);
		Thread.sleep(2000);

		boolean SLEditButton = SLEditBtn.isDisplayed();
		System.out.println("SLEditButton Displayed :"+SLEditButton);
		Thread.sleep(2000);

		boolean SLBootStrapButton = SLBootStrapBtn.isDisplayed();
		System.out.println("SLBootStrapBtn Displayed :"+SLBootStrapBtn);
		Thread.sleep(2000);
         
	}
	
	public void GoldPlusPlanUsers() throws InterruptedException 
	{
		
		boolean GoldPlusPlanUsers = GoldPlusPlanUsersLnk.isDisplayed();
		System.out.println("Gold Plus Plan Users Displayed :"+GoldPlusPlanUsers);
		Thread.sleep(2000);
		GoldPlusPlanUsersLnk.click();
		Thread.sleep(2000);

		boolean SchemesUsers = SchemesUsersText.isDisplayed();
		System.out.println("Schemes Users Displayed :"+SchemesUsers);
		Thread.sleep(2000);

		boolean GPPUSearchEdit = GPPUSearchEdt.isDisplayed();
		System.out.println("GPPUSearch Edit Displayed :"+GPPUSearchEdit);
		Thread.sleep(2000);

		boolean GPPUSchemeUsersButton = GPPUSchemeUsersBtn.isDisplayed();
		System.out.println("GPPUScheme Users Button Displayed :"+GPPUSchemeUsersButton);
		Thread.sleep(2000);

		boolean GPPUInfoButtoon = GPPUInfoBtn.isDisplayed();
		System.out.println("GPPUInfo Buttoon Displayed :"+GPPUInfoButtoon);
		Thread.sleep(2000);
		
	}
	
	public void MyGoldPlanUsers() throws InterruptedException
	{
		
		boolean SchemesMyGoldPlanUsers = SchemesMyGoldPlanUsersLnk.isDisplayed();
		System.out.println("Schemes My Gold Plan Users Displayed :"+SchemesMyGoldPlanUsers);
		Thread.sleep(2000);
		SchemesMyGoldPlanUsersLnk.click();
		Thread.sleep(2000);

		boolean MYGoldPlanUsers = MYGoldPlanUsersText.isDisplayed();
		System.out.println("MY Gold Plan Users Displayed :"+MYGoldPlanUsers);
		Thread.sleep(2000);

		boolean MGPUSearchEdit = MGPUSearchEdt.isDisplayed();
		System.out.println("MGPUSearch Edit Displayed :"+MGPUSearchEdit);
		Thread.sleep(2000);

		boolean AllUsersButton = AllUsersBtn.isDisplayed();
		System.out.println("All Users Button Displayed :"+AllUsersButton);
		Thread.sleep(2000);

		boolean DailyUsersButton = DailyUsersBtn.isDisplayed();
		System.out.println("Daily Users Button Displayed :"+DailyUsersButton);
		Thread.sleep(2000);
         
		boolean WeeklyUsersButton = WeeklyUsersBtn.isDisplayed();
		System.out.println("Weekly Users Button Displayed :"+WeeklyUsersButton);
		Thread.sleep(2000);

		boolean MonthlyUsersButton = MonthlyUsersBtn.isDisplayed();
		System.out.println("Monthly Users Button Displayed :"+MonthlyUsersButton);
		Thread.sleep(2000);

		boolean MGPUInfoButton = MGPUInfoBtn.isDisplayed();
		System.out.println("MGPUInfoButton Displayed :"+MGPUInfoButton);
		Thread.sleep(2000);
		
	}

	public void PhysicalGoldUsers() throws InterruptedException
	{
		
		boolean SchemesPhysicalGoldUsers = SchemesPhysicalGoldUsersLnk.isDisplayed();
		System.out.println("SchemesPhysicalGoldUsers Displayed :"+SchemesPhysicalGoldUsers);
		Thread.sleep(2000);
		SchemesPhysicalGoldUsersLnk.click();
		Thread.sleep(2000);
		
		boolean PhysicalGoldUsers = PhysicalGoldUsersText.isDisplayed();
		System.out.println("PhysicalGoldUsers Displayed :"+PhysicalGoldUsers);
		Thread.sleep(2000);

		boolean PhysicalGoldUsersCount = PhysicalGoldUsersCountLnk.isDisplayed();
		System.out.println("PhysicalGoldUsersCount Displayed :"+PhysicalGoldUsersCount);
		Thread.sleep(2000);

		boolean PGUSearchEdit = PGUSearchEdt.isDisplayed();
		System.out.println("PGUSearch Edit Displayed :"+PGUSearchEdit);
		Thread.sleep(2000);

	}
	
	public void BuyGoldContent() throws InterruptedException
	{
		
		boolean BuyGoldContent = BuyGoldContentLnk.isDisplayed();
		System.out.println("BuyGoldContent Displayed :"+BuyGoldContent);
		Thread.sleep(2000);
		BuyGoldContentLnk.click();
		Thread.sleep(2000);
		
		boolean BuyGoldContentText = BuyGoldContenttext.isDisplayed();
		System.out.println("BuyGoldContentText Displayed :"+BuyGoldContentText);
		Thread.sleep(2000);

		boolean BGCSearchEdit = BGCSearchEdt.isDisplayed();
		System.out.println("BGCSearchEdit Displayed :"+BGCSearchEdit);
		Thread.sleep(2000);

		boolean BGCAddContentButton = BGCAddContentBtn.isDisplayed();
		System.out.println("BGCAddContentButton Displayed :"+BGCAddContentButton);
		Thread.sleep(2000);

		boolean ContentButton = ContentBtn.isDisplayed();
		System.out.println("ContentButton Displayed :"+ContentButton);
		Thread.sleep(2000);
         
		boolean ExplanationButton = ExplanationBtn.isDisplayed();
		System.out.println("ExplanationButton Displayed :"+ExplanationButton);
		Thread.sleep(2000);

		boolean BGCEditButton = BGCEditBtn.isDisplayed();
		System.out.println("BGCEditButton Displayed :"+BGCEditButton);
		Thread.sleep(2000);

		boolean BGCBootStrapButton = BGCBootStrapBtn.isDisplayed();
		System.out.println("BGCBootStrapBtn Displayed :"+BGCBootStrapButton);
		Thread.sleep(2000);

	}
	
}