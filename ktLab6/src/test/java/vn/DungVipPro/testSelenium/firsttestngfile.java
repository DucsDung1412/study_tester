package vn.DungVipPro.testSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class firsttestngfile {
	String urlBase = "https://lms.poly.edu.vn/";
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.out.println("Lauching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(urlBase);
	}

	@Test
	public void f() {
		String title = "FPT Polytechnic";
		String browser_title = driver.getTitle();
		assertEquals(browser_title, title);
	}
  

	@AfterTest
  	public void afterTest() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

}
