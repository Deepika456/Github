package framework_testNG;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;

public class DeleteEmp_Testng {
	@Test 
	public void deleteemp() throws Exception{
		DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.waitStmt();
	obj.verifyHRMSTitle();
	obj.login();
    obj.mouseOver_PIM();
    obj.dropDown();
    obj.searchEmpid();
    obj.delEmp();
    obj.logout();
    obj.closeApplication();
	
	
	
}


}



