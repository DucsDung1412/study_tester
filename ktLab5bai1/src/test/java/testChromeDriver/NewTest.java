package testChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  String url = "http://lms.poly.edu.vn";
	  String title_website = "He thong VipPro";
	  String title_expected = "";
	  
	  driver.get(url);
	  title_expected = driver.getTitle();
	  if(title_expected.contentEquals(title_website)) {
		  System.out.println("test pass");
	  } else {
		  System.out.println("test fail");
	  }
	  
	  driver.close();
  }
}
