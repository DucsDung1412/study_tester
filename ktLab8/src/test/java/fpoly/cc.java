package fpoly;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class cc {
	WebDriver driver;
	String urlBase = "https://www.saucedemo.com/";
	String username = "standard_user";
	String password = "secret_sauce";
	
	Map<String, Object[]> testNGResuilt;
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	
  @Test(priority = 1)
  public void launchLogin() {
	try {
		driver.get(urlBase);
		driver.manage().window().maximize();
		testNGResuilt.put("2", new Object[] {1d, "Navigate to demo website", "Site gets openned", "Pass"});
	} catch (Exception e) {
		testNGResuilt.put("2", new Object[] {1d, "Navigate to demo website", "Site gets openned", "Fail"});
		Assert.assertTrue(false);
	}
  }
  
  @Test(priority = 2)
  public void fillLoginDetails() {
	  try {
		  WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		  username.sendKeys(this.username);
		  
		  WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  password.sendKeys(this.password);
		  
		  Thread.sleep(1000);
		  
		  testNGResuilt.put("3", new Object[] {2d, "Fill Login form data(Username/Password)", "Login details gets fillted", "Pass"});
	  } catch (Exception e) {
		  testNGResuilt.put("3", new Object[] {2d, "Fill Login form data(Username/Password)", "Login details gets fillted", "Fail"});
		  Assert.assertTrue(false);
	  }
  }
  
  @Test(priority = 3)
  public void doLogin() {
	  try {
		  WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		  loginbtn.click();
		  testNGResuilt.put("4", new Object[] {3d, "Click Login and verify welcome message", "Login success", "Pass"});
	  } catch (Exception e) {
		  testNGResuilt.put("4", new Object[] {3d, "Click Login and verify welcome message", "Login success", "Fail"});
		  Assert.assertTrue(false);
	  }
  }
  
  @BeforeClass
  public void beforeClass() {
	  testNGResuilt = new LinkedHashMap<>();
	  testNGResuilt.put("1", new Object[] {"Test Step No.", "Action", "Expected Output", "Actual Output"});
	  workbook = new HSSFWorkbook();
	  sheet = workbook.createSheet("TestNG");
	  try {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	      driver = new ChromeDriver();
	} catch (Exception e) {
		Assert.assertTrue(false);
	}
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Set<String> keyset = testNGResuilt.keySet();
	  int rownum = 0;
	  for (String string : keyset) {
		  Row row = sheet.createRow(rownum++);
		  int colnum = 0;
		  Object[] objArr = testNGResuilt.get(string);
		  for (Object obj : objArr) {
			  Cell cell = row.createCell(colnum++);
			  if(obj instanceof Date) {
				  cell.setCellValue((Date)obj);
			  } else if(obj instanceof Boolean) {
				  cell.setCellValue((Boolean)obj);
			  } else if(obj instanceof String) {
				  cell.setCellValue((String)obj);
			  } else if(obj instanceof Double) {
				  cell.setCellValue((Double)obj);
			  }
		  } 
	  }
	  
	  try {
		  FileOutputStream fos = new FileOutputStream(new File("SaveTestNG.xls"));
		  workbook.write(fos);
		  fos.close();
	  } catch (Exception e) {
		  e.printStackTrace();
		  Assert.assertTrue(false);
	  } finally {
		  
		  Thread.sleep(5000);
		  driver.close();
		  driver.quit();
	  }
  }

}
