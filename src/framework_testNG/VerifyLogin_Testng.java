package framework_testNG;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class VerifyLogin_Testng {
//public static void main(String args[])throws Exception {
	@Test
	public void verifylogin() throws Exception{
		DOMConfigurator.configure("log4j.xml");
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
