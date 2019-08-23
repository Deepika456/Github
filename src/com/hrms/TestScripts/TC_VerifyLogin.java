package com.hrms.TestScripts;
import com.hrms.lib.General;
public class TC_VerifyLogin {
	public static void main(String args[])throws Exception {
		General obj = new General();
		obj.openApplication();
		obj.waitStmt();
		obj.verifyHRMSTitle();
		obj.login();
		obj.verifyTitle();
		obj.verifyWelcomeText();
		obj.logout();
		obj.closeApplication();
	}

}


