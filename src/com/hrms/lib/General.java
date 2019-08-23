package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.utility.Log;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertTrue;

public class General extends Global{
     // Reusable Functions
	public void openApplication() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.Info("Application Opened");
	}
	public void waitStmt() throws Exception{
		Thread.sleep(3000);
		Reporter.log("Waitstmt Completed");
		Log.Info("Waitstmt Completed");
	}
    public void verifyHRMSTitle( ) {
	 driver.getTitle().equals("OrangeHRM - New Level of HR Management");
		 System.out.println("Title Matched");
		 Reporter.log("Title Matched");
		 Log.Info("Title Matched");
	}
	 public void login() throws Exception {
		 driver.findElement(By.name(txt_loginname)).sendKeys(un);
		 driver.findElement(By.name(txt_password)).sendKeys(pw);
		 driver.findElement(By.name(btn_login)).click();
		 System.out.println("Login Completed");
		 Reporter.log("Login Completed");
		 Log.Info("Login Completed");
	 }
	 public void verifyTitle() {
		 driver.getTitle().equals("OrangeHRM");
		 System.out.println("Title Matched");
		 Reporter.log("Title Matched");
		 Log.Info("Title Matched");
	 }
	 public void verifyWelcomeText() {
		 assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		 System.out.println("Welcome Text Matched");
		 Reporter.log("welcome Text Matched");
		 Log.Info("Welcome Text Matched");
	 }
	public void mouseOver_PIM( ) throws Exception{
		  WebElement pimmenu= driver.findElement(By.linkText("PIM"));
		 Actions action = new Actions(driver);
		 action.moveToElement(pimmenu).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Add Employee")).click();
		 System.out.println("Mouse Over Completed");
		  Reporter.log("Mouse Over Completed");
		  Log.Info("Mouse Over Completed");
	}
   public void frames_addEmp() throws Exception{
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(txt_lastname)).sendKeys(ln);
	driver.findElement(By.xpath(txt_firstname)).sendKeys(fn);
	driver.findElement(By.xpath(btn_save)).click();
	System.out.println("New Employee Added");
	driver.switchTo().defaultContent();
	Reporter.log("New Employee Added");
	Log.Info("New Employee Added");
    Thread.sleep(4000);
    
   }
   public void empList() throws Exception{
	   WebElement pimmenu= driver.findElement(By.linkText("PIM"));
		 Actions action = new Actions(driver);
		 action.moveToElement(pimmenu).perform();
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(3000);
		System.out.println("Employee List Clicked");
		Reporter.log("Employee List Clicked");
		Log.Info("Employee List Clicked");
	   
   }
   public void dropDown() throws Exception{
	   driver.switchTo().frame("rightMenu");
	   Select st = new Select(driver.findElement(By.xpath(dropdown_searchby)));
	   st.selectByVisibleText("Emp. ID");
	   System.out.println("DropDown Completed");
	   driver.switchTo().defaultContent();
	   Reporter.log("DropDown Completed");
	   Log.Info("DropDown Completed");
	   Thread.sleep(3000);
   }
   public void searchEmpid() {
	   driver.switchTo().frame("rightMenu");
	   driver.findElement(By.xpath(txt_search)).sendKeys(sr);
	   driver.findElement(By.xpath(btn_search)).click();
	   System.out.println("Searching EmpID Completed");
	   driver.switchTo().defaultContent();
	   Reporter.log("Searching EmpID Completed");
	   Log.Info("Searching EmpID Completed");
  }
   public void delEmp() {
	   driver.switchTo().frame("rightMenu");
   		 driver.findElement(By.xpath(chckbox_empid)).click();
   		 driver.findElement(By.xpath(btn_delete)).click();
   		 System.out.println("Delete An Employee"); 
   		driver.switchTo().defaultContent();
   		Reporter.log("Delete An Employee");
   		Log.Info("Delete An Employee");
   	
   }
	 public void logout() {
		 driver.findElement(By.linkText(link_logout)).click();
		 System.out.println("Logout Completed");
		 Reporter.log("Logout Completed");
		 Log.Info("Logout Completed");
	 }
	 public void closeApplication() {
		 driver.quit();
		 System.out.println("Application Closed");
		 Reporter.log("Application Closed");
		 Log.Info("Application Closed");
	 }
	 
	}

