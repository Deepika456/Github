package com.hrms.TestScripts;
import com.hrms.lib.General;

public class TC_103_DeleteEmp {
	public static void main(String args[]) throws Exception{
		General obj = new General();
		obj.openApplication();
		obj.waitStmt();
		obj.verifyHRMSTitle();
		obj.login();
	    obj.empList();
	    obj.dropDown();
	    obj.searchEmpid();
	    obj.delEmp();
	    obj.logout();
	    obj.closeApplication();
		
		
		
	}
	

}
