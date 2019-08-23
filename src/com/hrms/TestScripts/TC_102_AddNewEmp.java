package com.hrms.TestScripts;
import com.hrms.lib.General;
public class TC_102_AddNewEmp {
	public static void main(String args[]) throws Exception{
		General obj = new General();
		obj.openApplication();
		obj.waitStmt();
		obj.verifyHRMSTitle();
		obj.login();
		obj.verifyTitle();
		obj.verifyWelcomeText();
		obj.mouseOver_PIM();
		obj.frames_addEmp();
		obj.logout();
		obj.closeApplication();
		
	}

}
