package testcases;




import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class SimplilearnLogin extends BaseClass{//Baseclass extended to run Before and after method
	
	
	@Test(description="Test with Hard code values")
	public void Test1() {
	
		LoginPage Lp= new LoginPage(driver);//calling Login page[class]using object and Loginpage not test case it is just reusable method
		Lp.Login("abc@xyz","123456");
	
	// STEP 6: Validating error on screen
	
	WebElement Error = driver.findElement(By.id("error_box"));
	String ActError = Error.getText();
	String ExpError = "Please enter a valid email address";
	Assert.assertTrue(Error.isDisplayed());
	Assert.assertEquals(ActError,ExpError);
	
	}
	
	@Test(description="Test using parameters")
	@Parameters({"uname","psword"})
	public void Test2(String Username2, String Password2) { 
		LoginPage Lp= new LoginPage(driver);//calling Login page[class]using object and Loginpage not test case it is just reusable method
		Lp.Login(Username2,Password2);
		
}	

	@Test(description="Test using xl file")
	public void Test3() { 
		String Username3=sheet.getRow(1).getCell(0).getStringCellValue();
		String Password3=sheet.getRow(1).getCell(1).getRawValue();//getRawValue because it contains numbers
		LoginPage Lp= new LoginPage(driver);//calling Login page[class]using object and Loginpage not test case it is just reusable method
		Lp.Login(Username3,Password3);
		
}	
}
