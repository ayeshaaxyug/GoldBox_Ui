package SprintOneUi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtility.WebDriverUtility;

public class AllOperationsUi {
	
	//All Operations for Sprint One
	
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
	
	@FindBy(xpath ="//button[.='Total Amount : ₹0.00']") private WebElement TotalAmountText; 
	
	@FindBy(xpath ="//button[.='Total Grams : 0g']") private WebElement TotalGramsText;
	
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
	
	/*
	
	@FindBy(xpath ="//button[.='PROFILE']") private WebElement ULInfoProfileBtn; 
	
	@FindBy(xpath ="") private WebElement ;
	
	@FindBy(xpath ="") private WebElement ;

    //@FindBy(xpath ="//span[.='Gold Prices']") private WebElement GoldPricesTextLnk;
      
	*/

	public AllOperationsUi(WebDriver driver) 
	{	
		PageFactory.initElements(driver, this);
	}	
	
	public void SignInPage() throws InterruptedException
	{
		
		boolean SignInLogo =SignInLogoLnk.isDisplayed();
		System.out.println("SignIn Logo Displayed :"+SignInLogo);
		Thread.sleep(2000);
		
		boolean SinginToAcc=SinginToAccText.isDisplayed();
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
		Thread.sleep(1000);
		
	}
	
	public void DashboardPage() throws InterruptedException
	{
		
		boolean DashboardPageLogo =DashboardPageLogoLnk.isDisplayed();
		System.out.println("Dashboard Page Logo Displayed :"+DashboardPageLogo);
		Thread.sleep(2000);
		
		boolean DashboardText =DashboardTextLnk.isDisplayed();
		System.out.println("Dashboard Text Displayed :"+DashboardText);
		Thread.sleep(2000);

		boolean EnterDate =EnterDateText.isDisplayed();
		System.out.println("Enter Date Text Displayed :"+EnterDate);
		Thread.sleep(2000);

		boolean CalendorIcon =CalendorIconLnk.isDisplayed();
		System.out.println("CalendorIcon Displayed :"+CalendorIcon);
		Thread.sleep(2000);

		boolean TotalAmount =TotalAmountText.isDisplayed();
		System.out.println("Total Amount Text Displayed :"+TotalAmount);
		Thread.sleep(2000);

		boolean TotalGrams =TotalGramsText.isDisplayed();
		System.out.println("Total Grams Text Displayed :"+TotalGrams);
		Thread.sleep(2000);

		boolean TFkGoldLiveRate =TFkGoldLiveRateText.isDisplayed();
		System.out.println("TFk Gold Live Rate Text Displayed :"+TFkGoldLiveRate);
		Thread.sleep(2000);

		boolean TTkGoldLiveRate =TTkGoldLiveRateText.isDisplayed();
		System.out.println("TTk Gold Live Rate Text Displayed :"+TTkGoldLiveRate);
		Thread.sleep(2000);

		boolean ToggleButton =ToggleBtn.isDisplayed();
		System.out.println("ToggleBtn Displayed :"+ToggleButton);
		Thread.sleep(2000);
		ToggleBtn.click();
		Thread.sleep(3000);
		ToggleBtn.click();
		Thread.sleep(3000);
		
		boolean DashboardPageUsers =DashboardPageUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Users Text Displayed :"+DashboardPageUsers);
		Thread.sleep(2000);
		
		boolean DashboardPageTransactions=DashboardPageTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Transactions Text Displayed :"+DashboardPageTransactions);
		Thread.sleep(2000);

		boolean DashboardPageGoldPlusPlanUsers=DashboardPageGoldPlusPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Users Text Displayed :"+DashboardPageGoldPlusPlanUsers);
		Thread.sleep(2000);

		boolean  DashboardPageGoldPlusPlanCompletedUsers=DashboardPageGoldPlusPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page Gold Plus Plan Completed Users Text Displayed :"+DashboardPageGoldPlusPlanCompletedUsers);
		Thread.sleep(2000);

		boolean DashboardPageMyGoldPlanUsers=DashboardPageMyGoldPlanUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Users Text Displayed :"+DashboardPageMyGoldPlanUsers);
		Thread.sleep(2000);

		boolean DashboardPageMyGoldPlanCompletedUsers=DashboardPageMyGoldPlanCompletedUsersLnk.isDisplayed();
		System.out.println("Dashboard Page My Gold Plan Completed Users Text Displayed :"+DashboardPageMyGoldPlanCompletedUsers);
		Thread.sleep(2000);

		boolean DashboardPageSellGoldTransactions=DashboardPageSellGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Sell Gold Transactions Text Displayed :"+DashboardPageSellGoldTransactions);
		Thread.sleep(2000);

		boolean DashboardPageRedeemGoldTransactions=DashboardPageRedeemGoldTransactionsLnk.isDisplayed();
		System.out.println("Dashboard Page Redeem Gold Transactions Text Displayed :"+DashboardPageRedeemGoldTransactions);
		Thread.sleep(2000);

		boolean DashboardPageCategories=DashboardPageCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Text Displayed :"+DashboardPageCategories);
		Thread.sleep(2000);

		boolean DashboardPageCategoriesCount=DashboardPageCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page Categories Count Text Displayed :"+DashboardPageCategoriesCount);
		Thread.sleep(2000);

		boolean DashboardPageSubCategories=DashboardPageSubCategoriesLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Text Displayed :"+DashboardPageSubCategories);
		Thread.sleep(2000);

		boolean DashboardPageSubCategoriesCount=DashboardPageSubCategoriesCountLnk.isDisplayed();
		System.out.println("Dashboard Page SubCategories Count Text Displayed :"+DashboardPageSubCategoriesCount);
		Thread.sleep(2000);

		boolean DashboardPageProducts=DashboardPageProductsLnk.isDisplayed();
		System.out.println("Dashboard Page Products Text Displayed :"+DashboardPageProducts);
		Thread.sleep(2000);

		boolean DashboardPageProductsCount=DashboardPageProductsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Products Count Text Displayed :"+DashboardPageProductsCount);
		Thread.sleep(2000);

		boolean DashboardPageBrands=DashboardPageBrandsLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Text Displayed :"+DashboardPageBrands);
		Thread.sleep(2000);

		boolean DashboardPageBrandsCount=DashboardPageBrandsCountLnk.isDisplayed();
		System.out.println("Dashboard Page Brands Count Text Displayed :"+DashboardPageBrandsCount);
		Thread.sleep(2000);

		
		 
		boolean DashboardPageUserProfileIocn=DashboardPageUserProfileIocnLnk.isDisplayed();
		System.out.println("Dashboard Page User Profile Iocn Text Displayed :"+DashboardPageUserProfileIocn);
		Thread.sleep(2000);

		boolean DashboardPageUserName=DashboardPageUserNameLnk.isDisplayed();
		System.out.println("Dashboard Page User Name Text Displayed :"+DashboardPageUserName);
		Thread.sleep(2000);
		DashboardPageUserNameLnk.click();
		Thread.sleep(3000);
		DashboardPageUserNameLnk.click();
		Thread.sleep(3000);

	}
	
	public void Users(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean Users =UsersLnk.isDisplayed();
		System.out.println("Users is Displayed :"+Users);
		Thread.sleep(2000);
		UsersLnk.click();
		Thread.sleep(2000);
		
		boolean UsersList =UsersListLnk.isDisplayed();
		System.out.println("UsersList is Displayed :"+UsersList);
		Thread.sleep(2000);
		UsersListLnk.click();
		Thread.sleep(2000);

		boolean UsersListAllUsersText=UsersListAllUsersTextLnk.isDisplayed();
		System.out.println("UsersList AllUsers Text Displayed :"+UsersListAllUsersText);
		Thread.sleep(2000);

		boolean UsersListHeaderText=UsersListHeaderTextLnk.isDisplayed();
		System.out.println("UsersList Header Text Displayed :"+UsersListHeaderText);
		Thread.sleep(2000);

		boolean UsersListFilterButton=UsersListFilterBtn.isDisplayed();
		System.out.println("UsersList Filter Button Displayed :"+UsersListFilterButton);
		Thread.sleep(2000);

		boolean UsersListSearchButton=UsersListSearchBtn.isDisplayed();
		System.out.println("UsersList Search Button Displayed :"+UsersListSearchButton);
		Thread.sleep(2000);

		boolean UsersListExportToExcelButton=UsersListExportToExcelBtn.isDisplayed();
		System.out.println("UsersList Export To Excel Button Displayed :"+UsersListExportToExcelButton);
		Thread.sleep(2000);
		UsersListExportToExcelBtn.click();
		Thread.sleep(2000);
		
		boolean UsersListViewButton=UsersListViewBtn.isDisplayed();
		System.out.println("UsersList View Button Displayed :"+UsersListViewButton);
		Thread.sleep(2000);
		UsersListViewBtn.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		boolean UsersListInfoButton=UsersListInfoBtn.isDisplayed();
		System.out.println("UsersList Info Button Displayed :"+UsersListInfoButton);
		Thread.sleep(4000);
		UsersListInfoBtn.click();
		Thread.sleep(4000);

		boolean ULInfoProfileButton=ULInfoProfileBtn.isDisplayed();
		System.out.println("ULInfo Profile Button Displayed :"+ULInfoProfileButton);
		Thread.sleep(2000);
		ULInfoProfileBtn.click();
		Thread.sleep(4000);
		
		boolean ULInfoTransactionsButton=ULInfoTransactionsBtn.isDisplayed();
		System.out.println("ULInfo Transactions Button Displayed :"+ULInfoTransactionsButton);
		Thread.sleep(2000);
		ULInfoTransactionsBtn.click();
		Thread.sleep(2000);
		
		boolean ULInfoLoginLogsButton=ULInfoLoginLogsBtn.isDisplayed();
		System.out.println("ULInfo LoginLogs Button Displayed :"+ULInfoLoginLogsButton);
		Thread.sleep(2000);
		ULInfoLoginLogsBtn.click();
		Thread.sleep(2000);
		
		boolean ULInfoAddGoldButton=ULInfoAddGoldBtn.isDisplayed();
		System.out.println("ULInfo AddGold Button Displayed :"+ULInfoAddGoldButton);
		Thread.sleep(2000);
		ULInfoAddGoldBtn.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		/*
		 * 
		 * 
		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		boolean  =.isDisplayed();
		System.out.println("   Displayed :"+);
		Thread.sleep(2000);

		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}