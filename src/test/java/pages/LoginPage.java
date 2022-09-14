package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;//Declaring the driver
	
	//--------------------Objects--------------
	@FindBy(linkText="Log in")//Initializing only corresponding method calls
	WebElement LoginLink;//Declaring
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(className="rememberMe")
	WebElement Checkbox;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	//--------------------Constructor--------------
	
	public LoginPage(WebDriver basedriver) {//Parametrized constructor [To initialise the driver]
		this.driver=basedriver;
		PageFactory.initElements(basedriver, this);//It is a class which initalise object on webdriver
	}
	//----------------Methods------------------
	
	public void Login(String UserNameValue, String PasswordValue) {
	
		// STEP 1: Login Link
		LoginLink.click();
		
		// STEP 2: Enter Mail Id
		UserName.sendKeys(UserNameValue);
		
		// STEP 3: Enter Password
		Password.sendKeys(PasswordValue);
		
		// STEP 4: Click Remember Me Check box
		Checkbox.click();
		
		// STEP 5: Click on Login Button
		LoginBtn.click();
	}

}
