package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

		WebDriver driver;//Declaring the driver
		
		public HomePage(WebDriver basedriver) {//Parametrized constructor [To initialise the driver]
			this.driver=basedriver;
		}

}
