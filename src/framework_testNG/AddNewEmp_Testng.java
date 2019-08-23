package framework_testNG;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;
public class AddNewEmp_Testng {
	public class TC_102_AddNewEmp {
		//public static void main(String args[]) throws Exception{
		@Test
		public void addnewemp() throws Exception{
			DOMConfigurator.configure("log4j.xml");
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

}
