package vn.DungVipPro.testSelenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTesting {
  @Parameters({"BrowserName"})
  @Test(priority = 1)
  public void OpenBrowser(String browserName) {
	  System.out.println("Browser passed as :- " + browserName);
  }
  
  @Parameters({"Username", "Passcode"})
  @Test(priority = 2)
  public void FillLoginForm(String username, String passcode) {
	  System.out.println("Parameter for username passed as :- " + username);
	  System.out.println("Parameter for passcode passed as :- " + passcode);
  }
}
