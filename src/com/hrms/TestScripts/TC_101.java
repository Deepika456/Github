package com.hrms.TestScripts;
import com.hrms.lib.*;
public class TC_101 {
	public static void main(String args[]) throws Exception{
		//Test Case steps
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		
	}
	

}
