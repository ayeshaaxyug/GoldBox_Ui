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
	
	// Users -- Penalty Users
	
	@FindBy(xpath ="//a[.='Penalty Users']") private WebElement PenaltyUsersLnk;
	@FindBy(xpath ="//h4[.='Penalty Users']") private WebElement PenaltyUsersTextLnk;
	@FindBy(xpath ="//a[@class='btn btn-filter']") private WebElement PenaltyUsersFilterBtn;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement PenaltyUsersSearchEdt;
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement PenaltyUsersInfoBtn;
	
	// Redeem Gold Users
	
	@FindBy(xpath ="//span[.='Redeem']") private WebElement RedeemLnk;
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
	@FindBy(xpath ="(//button[.=' Info '])[1]") private WebElement SLTenureBtn;	
	@FindBy(xpath ="(//button[.=' Info '])[2]") private WebElement SLAmountBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement SLActionBtn;	
	@FindBy(xpath ="(//div[@class='mdc-form-field'])[1]") private WebElement SLBootStrapBtn;

	// Schemes -- Gold Plus Plan Users
	
	@FindBy(xpath ="//a[.='Gold Plus Plan Users']") private WebElement GoldPlusPlanUsersLnk;
	@FindBy(xpath ="//h4[.='Gold Plus Plan Users']") private WebElement GoldPlusPlanUsersText;
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
	
	// Content
	
	@FindBy(xpath ="//span[.='Content']") private WebElement ContentLnk;

	// Content -- Gold Plus Plan Content
	
	@FindBy(xpath ="//a[.='Gold Plus Plan Content']") private WebElement GoldPlusPlanContentLnk;
	@FindBy(xpath ="//h4[.='Scheme Info']") private WebElement GPPCSchemeInfoTextLnk;
	@FindBy(xpath ="(//button[.='Update'])[1]") private WebElement GPPCUpdateBtn;
	@FindBy(xpath ="//h6[.='Add Feature']") private WebElement GPPCAddFeatureBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement GPPCEditBtn;
	@FindBy(xpath ="(//button[.=' Delete '])[1]") private WebElement GPPCDeleteBtn;
	@FindBy(xpath ="//h6[.='Add FAQ']") private WebElement GPPCAddFaqBtn;

	// Content -- My Gold Plan Content
	
	@FindBy(xpath ="//a[.='My Gold Plan Content']") private WebElement MyGoldPlanContentLnk;
	@FindBy(xpath ="//h4[.='Scheme Info']") private WebElement MGPCSchemeInfoTextLnk;
	@FindBy(xpath ="(//button[.='Update'])[1]") private WebElement MGPCUpdateBtn;
	@FindBy(xpath ="//h6[.='Add Feature']") private WebElement MGPCAddFeatureBtn;
	@FindBy(xpath ="(//button[.=' Edit '])[1]") private WebElement MGPCEditBtn;
	@FindBy(xpath ="(//button[.=' Delete '])[1]") private WebElement MFPCDeleteBtn;
	
	// Buy Gold Content
	
	@FindBy(xpath ="//a[.='Buy Gold Content']") private WebElement BuyGoldContentLnk;	
	@FindBy(xpath ="//h4[.='Buy Gold Content']") private WebElement BuyGoldContenttext;
	@FindBy(xpath ="//input[@placeholder='Search...']") private WebElement BGCSearchEdt;
	@FindBy(xpath ="//button[.='Add Content']") private WebElement BGCAddContentBtn;
	@FindBy(xpath ="(//button[@class='btn-sm btn-view'])[1]") private WebElement ContentBtn;	
	@FindBy(xpath ="(//button[@class='btn-sm btn-view'])[2]") private WebElement ExplanationBtn;
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
		Thread.sleep(3000);
		
		boolean SinginToAcc = SinginToAccText.isDisplayed();
		System.out.println("SignIn To Account Displayed :"+SinginToAcc);
		Thread.sleep(3000);

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
		Thread.sleep(3000);
		
		boolean DashboardText = DashboardTextLnk.isDisplayed();
		System.out.println("Dashboard Text Displayed :"+DashboardText);
		Thread.sleep(3000);

		boolean EnterDate = EnterDateText.isDisplayed();
		System.out.println("Enter Date Text Displayed :"+EnterDate);
		Thread.sleep(3000);

		boolean CalendorIcon = CalendorIconLnk.isDisplayed();
		System.out.println("Calendor Icon Displayed :"+CalendorIcon);
		Thread.sleep(4000);

		boolean TotalAmount = TotalAmountText.isDisplayed();
		System.out.println("Total Amount Text Displayed :"+TotalAmount);
		Thread.sleep(3000);

		boolean TotalGrams = TotalGramsText.isDisplayed();
		System.out.println("Total Grams Text Displayed :"+TotalGrams);
		Thread.sleep(3000);

		boolean TFkGoldLiveRate = TFkGoldLiveRateText.isDisplayed();
		System.out.println("TFk Gold Live Rate Text Displayed :"+TFkGoldLiveRate);
		Thread.sleep(3000);

		boolean TTkGoldLiveRate = TTkGoldLiveRateText.isDisplayed();
		System.out.println("TTk Gold Live Rate Text Displayed :"+TTkGoldLiveRate);
		Thread.sleep(3000);

		boolean ToggleButton = ToggleBtn.isDisplayed();
		System.out.println("Toggle Button Displayed :"+ToggleButton);
		Thread.sleep(3000);
		ToggleBtn.click();
		Thread.sleep(3000);
		ToggleBtn.click();
		Thread.sleep(3000);
		
		boolean DashboardPageUsers = DashboardPageUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Users Text Displayed :"+DashboardPageUsers);
		Thread.sleep(3000);
		
		boolean DashboardPageTransactions = DashboardPageTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Transactions Text Displayed :"+DashboardPageTransactions);
		Thread.sleep(3000);

		boolean DashboardPageGoldPlusPlanUsers = DashboardPageGoldPlusPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Users Text Displayed :"+DashboardPageGoldPlusPlanUsers);
		Thread.sleep(3000);

		boolean  DashboardPageGoldPlusPlanCompletedUsers = DashboardPageGoldPlusPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Completed Users Text Displayed :"+DashboardPageGoldPlusPlanCompletedUsers);
		Thread.sleep(3000);

		boolean DashboardPageMyGoldPlanUsers = DashboardPageMyGoldPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Users Text Displayed :"+DashboardPageMyGoldPlanUsers);
		Thread.sleep(3000);

		boolean DashboardPageMyGoldPlanCompletedUsers = DashboardPageMyGoldPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Completed Users Text Displayed :"+DashboardPageMyGoldPlanCompletedUsers);
		Thread.sleep(3000);

		boolean DashboardPageSellGoldTransactions = DashboardPageSellGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Sell Gold Transactions Text Displayed :"+DashboardPageSellGoldTransactions);
		Thread.sleep(3000);

		boolean DashboardPageRedeemGoldTransactions = DashboardPageRedeemGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Redeem Gold Transactions Text Displayed :"+DashboardPageRedeemGoldTransactions);
		Thread.sleep(3000);

		boolean DashboardPageCategories = DashboardPageCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Text Displayed :"+DashboardPageCategories);
		Thread.sleep(3000);

		boolean DashboardPageCategoriesCount = DashboardPageCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Count Text Displayed :"+DashboardPageCategoriesCount);
		Thread.sleep(3000);

		boolean DashboardPageSubCategories = DashboardPageSubCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Text Displayed :"+DashboardPageSubCategories);
		Thread.sleep(3000);

		boolean DashboardPageSubCategoriesCount = DashboardPageSubCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Count Text Displayed :"+DashboardPageSubCategoriesCount);
		Thread.sleep(3000);

		boolean DashboardPageProducts = DashboardPageProductsLnk.isDisplayed();
		System.out.println("Dashboard Page Products Text Displayed :"+DashboardPageProducts);
		Thread.sleep(3000);

		boolean DashboardPageProductsCount = DashboardPageProductsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Products Count Text Displayed :"+DashboardPageProductsCount);
		Thread.sleep(3000);

		boolean DashboardPageBrands = DashboardPageBrandsLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Text Displayed :"+DashboardPageBrands);
		Thread.sleep(3000);

		boolean DashboardPageBrandsCount = DashboardPageBrandsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Count Text Displayed :"+DashboardPageBrandsCount);
		Thread.sleep(3000);

		boolean DashboardPageUserProfileIocn = DashboardPageUserProfileIocnLnk.isDisplayed();
		System.out.println("Dashboard Page User Profile Iocn Text Displayed :"+DashboardPageUserProfileIocn);
		Thread.sleep(3000);

		boolean DashboardPageUserName = DashboardPageUserNameLnk.isDisplayed();
		System.out.println("Dashboard Page User Name Text Displayed :"+DashboardPageUserName);
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		UsersLnk.click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		boolean UsersList = UsersListLnk.isDisplayed();
		System.out.println("Users List is Displayed :"+UsersList);
		Thread.sleep(3000);
		UsersListLnk.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		boolean UsersListAllUsersText = UsersListAllUsersTextLnk.isDisplayed();
		System.out.println("Users List AllUsers Text Displayed :"+UsersListAllUsersText);
		Thread.sleep(3000);

		Thread.sleep(3000);
		boolean UsersListHeaderText = UsersListHeaderTextLnk.isDisplayed();
		System.out.println("Users List Header Text Displayed :"+UsersListHeaderText);
		Thread.sleep(3000);

		Thread.sleep(3000);
		boolean UsersListFilterButton = UsersListFilterBtn.isDisplayed();
		System.out.println("Users List Filter Button Displayed :"+UsersListFilterButton);
		Thread.sleep(3000);

		Thread.sleep(4000);
		boolean UsersListSearchButton = UsersListSearchBtn.isDisplayed();
		System.out.println("Users List Search Button Displayed :"+UsersListSearchButton);
		Thread.sleep(3000);

		Thread.sleep(4000);
		boolean UsersListExportToExcelButton = UsersListExportToExcelBtn.isDisplayed();
		System.out.println("Users List Export To Excel Button Displayed :"+UsersListExportToExcelButton);
		Thread.sleep(3000);
		UsersListExportToExcelBtn.click();
		Thread.sleep(3000);
		
		Thread.sleep(4000);
		boolean UsersListViewButton = UsersListViewBtn.isDisplayed();
		System.out.println("Users List View Button Displayed :"+UsersListViewButton);
		Thread.sleep(3000);
		UsersListViewBtn.click();
		Thread.sleep(3000);
		UsersListLnk.click();
		Thread.sleep(4000);
	
		Thread.sleep(4000);
		boolean UsersListInfoButton = UsersListInfoBtn.isDisplayed();
		System.out.println("Users List Info Button Displayed :"+UsersListInfoButton);
		Thread.sleep(4000);
				
		Thread.sleep(4000);
		boolean UsersListBootStrapButton = UsersListBootStrapBtn.isDisplayed();
		System.out.println("Users List BootStrap Button Displayed :"+UsersListBootStrapButton);
		Thread.sleep(3000);
	
	}
	
	public void Userskyc() throws InterruptedException 
	{
			
		Thread.sleep(3000);
		boolean UsersKyc = UsersKycLnk.isDisplayed();
		System.out.println("Users Kyc Displayed :"+UsersKyc);
		Thread.sleep(3000);
		UsersKycLnk.click();
		Thread.sleep(3000);

		boolean UsersKycRequest = UsersKycRequestTextLnk.isDisplayed();
		System.out.println("Users Kyc Request Text Displayed :"+UsersKycRequest);
		Thread.sleep(3000);

		boolean UsersKycSearchEdit = UsersKycSearchEdt.isDisplayed();
		System.out.println("Users Kyc Search Edit Displayed :"+UsersKycSearchEdit);
		Thread.sleep(3000);

		boolean UKAadharImageButton = UKAadharImageBtn.isDisplayed();
		System.out.println("UKAadhar Image Button Displayed :"+UKAadharImageButton);
		Thread.sleep(3000);

		boolean UKPanImageButton = UKPanImageBtn.isDisplayed();
		System.out.println("UKPan Image Button Displayed :"+UKPanImageButton );
		Thread.sleep(3000);

		boolean UKStatusButton = UKStatusBtn.isDisplayed();
		System.out.println("UKStatus Button Displayed :"+UKStatusButton);
		Thread.sleep(3000);

		boolean UKNextButton = UKNextBtn.isDisplayed();
		System.out.println("UKNext Button Displayed :"+UKNextButton);
		Thread.sleep(3000);
		UKNextBtn.click();
		Thread.sleep(3000);
		
		boolean UKPrevButton = UKPrevBtn.isDisplayed();
		System.out.println("UKPrev Button Displayed :"+UKPrevButton);
		Thread.sleep(3000);
		UKPrevBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void PenaltyUsers() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean PenaltyUsers = PenaltyUsersLnk.isDisplayed();
		System.out.println("Penalty Users is Displayed : "+PenaltyUsers);
		Thread.sleep(3000);
		PenaltyUsersLnk.click();
		Thread.sleep(3000);

		boolean PenaltyUsersText = PenaltyUsersTextLnk.isDisplayed();
		System.out.println("Penalty Users Text is Displayed : "+PenaltyUsersText);
		Thread.sleep(3000);

		boolean PenaltyUsersFilterButton = PenaltyUsersFilterBtn.isDisplayed();
		System.out.println("Penalty Users Filter Button is Displayed : "+PenaltyUsersFilterButton);
		Thread.sleep(3000);

		boolean PenaltyUsersSearchEdit = PenaltyUsersSearchEdt.isDisplayed();
		System.out.println("Penalty Users Search Edit is Displayed : "+PenaltyUsersSearchEdit);
		Thread.sleep(3000);

		boolean PenaltyUsersInfoButton = PenaltyUsersInfoBtn.isDisplayed();
		System.out.println("Penalty Users Info Button is Displayed : "+PenaltyUsersInfoButton);
		Thread.sleep(3000);


	}
	
	public void RedeemGoldUsers() throws Exception
	{
		
		Thread.sleep(3000);
		boolean Redeem = RedeemLnk.isDisplayed();
		System.out.println("Redeem is Displayed : "+Redeem);
		Thread.sleep(3000);
		RedeemLnk.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		boolean RedeemGoldUsers = RedeemGoldUsersLnk.isDisplayed();
		System.out.println("Redeem Gold Users  Displayed :"+RedeemGoldUsers);
		Thread.sleep(3000);
		RedeemGoldUsersLnk.click();
		Thread.sleep(3000);
		
		boolean RedeemGoldUsersTransactions = RedeemGoldUsersTransactionsText.isDisplayed();
		System.out.println("Redeem Gold Users Transactions Displayed :"+RedeemGoldUsersTransactions);
		Thread.sleep(3000);

		boolean RGUFilterButton = RGUFilterBtn.isDisplayed();
		System.out.println("RGUFilter Button Displayed :"+RGUFilterButton);
		Thread.sleep(3000);

		boolean RGUSerachEdit = RGUSerachEdt.isDisplayed();
		System.out.println("RGUSerach Edit Displayed :"+RGUSerachEdit);
		Thread.sleep(3000);

		boolean RGUexportToExcelButton = RGUExportToExcelBtn.isDisplayed();
		System.out.println("RGUExport To Excel Button Displayed :"+RGUexportToExcelButton);
		Thread.sleep(3000);
		RGUExportToExcelBtn.click();
		Thread.sleep(3000);
		
		boolean RGUViewButton = RGUViewBtn.isDisplayed();
		System.out.println("RGUView Button Displayed :"+RGUViewButton);
		Thread.sleep(3000);

		/*
		 * boolean RGURedeemGoldButton = RGURedeemGoldBtn.isDisplayed();
		 * System.out.println("RGURedeem Gold Button Displayed :"+RGURedeemGoldButton);
		 * Thread.sleep(3000);
		 */		
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(5);
		
       /*
        boolean RGUShowAllButton = RGUShowAllBtn.isDisplayed();
		System.out.println("RGUShow All Button Displayed :"+RGUShowAllButton);
		Thread.sleep(3000);
		RGUShowAllBtn.click();
		
		*/
		Thread.sleep(3000);
	}

	public void SchemeList() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Schemes = SchemesLnk.isDisplayed();
		System.out.println("Schemes Displayed :"+Schemes);
		Thread.sleep(3000);
		SchemesLnk.click();
		Thread.sleep(3000);

		boolean SchemeList = SchemeListLnk.isDisplayed();
		System.out.println("Scheme List Displayed :"+SchemeList);
		Thread.sleep(3000);
		SchemeListLnk.click();
		Thread.sleep(3000);
		
		boolean SchemeListTexT = SchemeListText.isDisplayed();
		System.out.println("Scheme List TexT Displayed :"+SchemeListTexT);
		Thread.sleep(3000);

		boolean SchemeListSearchEdit = SchemeListSearchEdt.isDisplayed();
		System.out.println("Scheme List Search Edit Displayed :"+SchemeListSearchEdit);
		Thread.sleep(3000);

		boolean AddSchemeButton = AddSchemeBtn.isDisplayed();
		System.out.println("Add Scheme Button Displayed :"+AddSchemeButton);
		Thread.sleep(3000);

		boolean SLViewButton = SLViewBtn.isDisplayed();
		System.out.println("SLView Button Displayed :"+SLViewButton);
		Thread.sleep(3000);
		
		boolean SLTenureButton = SLTenureBtn.isDisplayed();
		System.out.println("SLTenure Button Displayed :"+SLTenureButton);
		Thread.sleep(3000);

		boolean SLAmountButton = SLAmountBtn.isDisplayed();
		System.out.println("SLAmount Button Displayed :"+SLAmountButton);
		Thread.sleep(3000);

		boolean SLActionButton = SLActionBtn.isDisplayed();
		System.out.println("SLAction Button Displayed :"+SLActionButton);
		Thread.sleep(3000);

		boolean SLBootStrapButton = SLBootStrapBtn.isDisplayed();
		System.out.println("SLBootStrap Button Displayed :"+SLBootStrapButton);
		Thread.sleep(3000);
         
	}
	
	public void GoldPlusPlanUsers() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		boolean GoldPlusPlanUsers = GoldPlusPlanUsersLnk.isDisplayed();
		System.out.println("Gold Plus Plan Users Displayed :"+GoldPlusPlanUsers);
		Thread.sleep(3000);
		GoldPlusPlanUsersLnk.click();
		Thread.sleep(3000);

		boolean GPPUText = GoldPlusPlanUsersText.isDisplayed();
		System.out.println("Schemes Users Displayed :"+GPPUText);
		Thread.sleep(3000);

		boolean GPPUSearchEdit = GPPUSearchEdt.isDisplayed();
		System.out.println("GPPUSearch Edit Displayed :"+GPPUSearchEdit);
		Thread.sleep(3000);

		boolean GPPUSchemeUsersButton = GPPUSchemeUsersBtn.isDisplayed();
		System.out.println("GPPUScheme Users Button Displayed :"+GPPUSchemeUsersButton);
		Thread.sleep(3000);

		boolean GPPUInfoButtoon = GPPUInfoBtn.isDisplayed();
		System.out.println("GPPUInfo Buttoon Displayed :"+GPPUInfoButtoon);
		Thread.sleep(3000);
		
	}
	
	public void MyGoldPlanUsers() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SchemesMyGoldPlanUsers = SchemesMyGoldPlanUsersLnk.isDisplayed();
		System.out.println("Schemes My Gold Plan Users Displayed :"+SchemesMyGoldPlanUsers);
		Thread.sleep(3000);
		SchemesMyGoldPlanUsersLnk.click();
		Thread.sleep(3000);

		boolean MYGoldPlanUsers = MYGoldPlanUsersText.isDisplayed();
		System.out.println("MY Gold Plan Users Displayed :"+MYGoldPlanUsers);
		Thread.sleep(3000);

		boolean MGPUSearchEdit = MGPUSearchEdt.isDisplayed();
		System.out.println("MGPUSearch Edit Displayed :"+MGPUSearchEdit);
		Thread.sleep(3000);

		boolean AllUsersButton = AllUsersBtn.isDisplayed();
		System.out.println("All Users Button Displayed :"+AllUsersButton);
		Thread.sleep(3000);

		boolean DailyUsersButton = DailyUsersBtn.isDisplayed();
		System.out.println("Daily Users Button Displayed :"+DailyUsersButton);
		Thread.sleep(3000);
         
		boolean WeeklyUsersButton = WeeklyUsersBtn.isDisplayed();
		System.out.println("Weekly Users Button Displayed :"+WeeklyUsersButton);
		Thread.sleep(3000);

		boolean MonthlyUsersButton = MonthlyUsersBtn.isDisplayed();
		System.out.println("Monthly Users Button Displayed :"+MonthlyUsersButton);
		Thread.sleep(3000);

		boolean MGPUInfoButton = MGPUInfoBtn.isDisplayed();
		System.out.println("MGPUInfo Button Displayed :"+MGPUInfoButton);
		Thread.sleep(3000);
		
		
	}

	public void PhysicalGoldUsers() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean SchemesPhysicalGoldUsers = SchemesPhysicalGoldUsersLnk.isDisplayed();
		System.out.println("Schemes Physical Gold Users Displayed :"+SchemesPhysicalGoldUsers);
		Thread.sleep(3000);
		SchemesPhysicalGoldUsersLnk.click();
		Thread.sleep(3000);
		
		boolean PhysicalGoldUsers = PhysicalGoldUsersText.isDisplayed();
		System.out.println("Physical Gold Users Displayed :"+PhysicalGoldUsers);
		Thread.sleep(3000);

		boolean PhysicalGoldUsersCount = PhysicalGoldUsersCountLnk.isDisplayed();
		System.out.println("Physical Gold Users Count Displayed :"+PhysicalGoldUsersCount);
		Thread.sleep(3000);

		boolean PGUSearchEdit = PGUSearchEdt.isDisplayed();
		System.out.println("PGUSearch Edit Displayed :"+PGUSearchEdit);
		Thread.sleep(3000);

		
	}
	
	public void Content() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean Content = ContentLnk.isDisplayed();
		System.out.println("Content is Displayed : "+Content);
		Thread.sleep(3000);
		ContentLnk.click();
		Thread.sleep(3000);
		
		
	}
	
	public void GoldPlusPlanContent() throws Exception
	{
		
		Thread.sleep(3000);
		boolean GoldPlusPlanContent = GoldPlusPlanContentLnk.isDisplayed();
		System.out.println("Gold Plus Plan Content is Displayed : "+GoldPlusPlanContent);
		Thread.sleep(3000);
		GoldPlusPlanContentLnk.click();
		Thread.sleep(3000);
		
		boolean GPPCSchemeInfoText = GPPCSchemeInfoTextLnk.isDisplayed();
		System.out.println("GPPCScheme Info Text is Displayed : "+GPPCSchemeInfoText);
		Thread.sleep(4000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);

		Thread.sleep(4000);
		boolean GPPCUpdateButton = GPPCUpdateBtn.isDisplayed();
		System.out.println("GPPCUpdate Button is Displayed : "+GPPCUpdateButton);
		Thread.sleep(4000);
		/*
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(7);

		Thread.sleep(4000);
		boolean GPPCAddFeatureButton = GPPCAddFeatureBtn.isDisplayed();
		System.out.println("GPPCAdd Feature Button is Displayed : "+GPPCAddFeatureButton);
		Thread.sleep(4000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(4);

		Thread.sleep(4000);
		boolean GPPCEditButton = GPPCEditBtn.isDisplayed();
		System.out.println("GPPCEdit Button is Displayed : "+GPPCEditButton);
		Thread.sleep(4000);

		boolean GPPCDeleteButton = GPPCDeleteBtn.isDisplayed();
		System.out.println("GPPCDelete Button is Displayed : "+GPPCDeleteButton);
		Thread.sleep(4000);

	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(4);
		
		Thread.sleep(4000);
		boolean GPPCAddFaqButton = GPPCAddFaqBtn.isDisplayed();
		System.out.println("GPPCAdd Faq Button is Displayed : "+GPPCAddFaqButton);
		Thread.sleep(4000);
		
		*/

	}
	
	public void MyGoldPlanContent() throws Exception
	{
		
		Thread.sleep(3000);
		boolean MyGoldPlanContent = MyGoldPlanContentLnk.isDisplayed();
		System.out.println("My Gold Plan Content is Displayed : "+MyGoldPlanContent);
		Thread.sleep(3000);
		MyGoldPlanContentLnk.click();
		Thread.sleep(3000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);

		boolean MGPCSchemeInfoText = MGPCSchemeInfoTextLnk.isDisplayed();
		System.out.println("MGPCScheme Info Text is Displayed : "+MGPCSchemeInfoText);
		Thread.sleep(3000);

		boolean MGPCUpdateButton = MGPCUpdateBtn.isDisplayed();
		System.out.println("MGPCUpdate Button is Displayed : "+MGPCUpdateButton);
		Thread.sleep(3000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);

		/*
		
		boolean MGPCAddFeatureButton = MGPCAddFeatureBtn.isDisplayed();
		System.out.println("MGPCAdd Feature Button is Displayed : "+MGPCAddFeatureButton);
		Thread.sleep(3000);
		
	    wUtility = new WebDriverUtility();
		wUtility.scrollPageDown(3);

		boolean MGPCEditButton = MGPCEditBtn.isDisplayed();
		System.out.println("MGPCEdit Button is Displayed : "+MGPCEditButton);
		Thread.sleep(3000);

		boolean MFPCDeleteButton = MFPCDeleteBtn.isDisplayed();
		System.out.println("MFPCDelete Button is Displayed : "+MFPCDeleteButton);
		Thread.sleep(3000);

		*/
		
	}
	
	public void BuyGoldContent() throws InterruptedException
	{
		
		Thread.sleep(3000);
		boolean BuyGoldContent = BuyGoldContentLnk.isDisplayed();
		System.out.println("Buy Gold Content Displayed :"+BuyGoldContent);
		Thread.sleep(3000);
		BuyGoldContentLnk.click();
		Thread.sleep(3000);
		
		boolean BuyGoldContentText = BuyGoldContenttext.isDisplayed();
		System.out.println("Buy Gold Content Text Displayed :"+BuyGoldContentText);
		Thread.sleep(3000);

		boolean BGCSearchEdit = BGCSearchEdt.isDisplayed();
		System.out.println("BGCSearch Edit Displayed :"+BGCSearchEdit);
		Thread.sleep(3000);

		boolean BGCAddContentButton = BGCAddContentBtn.isDisplayed();
		System.out.println("BGCAdd Content Button Displayed :"+BGCAddContentButton);
		Thread.sleep(3000);

		boolean ContentButton = ContentBtn.isDisplayed();
		System.out.println("Content Button Displayed :"+ContentButton);
		Thread.sleep(3000);
         
		boolean ExplanationButton = ExplanationBtn.isDisplayed();
		System.out.println("Explanation Button Displayed :"+ExplanationButton);
		Thread.sleep(3000);

		boolean BGCEditButton = BGCEditBtn.isDisplayed();
		System.out.println("BGCEdit Button Displayed :"+BGCEditButton);
		Thread.sleep(3000);

		boolean BGCBootStrapButton = BGCBootStrapBtn.isDisplayed();
		System.out.println("BGCBootStrap Button Displayed :"+BGCBootStrapButton);
		Thread.sleep(3000);

	}
	
}