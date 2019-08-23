package com.hrms.TestScripts;
import com.hrms.lib.General;
public class TC_103 {
	public static void main(String args[]) throws Exception{
		General obj = new General() ;
		obj.openApplication();
		obj.login();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
		
		}

}
