package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	// Variable
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="Admin";
	public String pw="admin";
	public String ln="Selenium";
	public String fn="Suresh";
	public String sr="0019";

	
	// Object
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String btn_add="//input[@value='Add']";
	public String txt_lastname="//input[@name='txtEmpLastName']";
	public String txt_firstname="//input[@name='txtEmpFirstName']";
	public String btn_save="//input[@value='Save']";
	public String dropdown_searchby="//select[@id='loc_code']";
	public String txt_search="//input[@name='loc_name']";
	public String btn_search="//input[@value='Search']";
	public String chckbox_empid="//input[@value='0019'][@name='chkLocID[]']";
	public String btn_delete="//input[@value='Delete']";
	public String link_logout="Logout";

}
