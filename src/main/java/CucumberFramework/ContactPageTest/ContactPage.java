package CucumberFramework.ContactPageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CucumberFramework.Util.TestUtil;

public class ContactPage extends BaseTest {
private static final String page = null;
LoginPage  loginPage;
HomePage   HomePage;
TestUtil   testutil;
ContactPage contactPage;
String sheetName = "contacts";


public ContactPage(){
super();	
}
@BeforeMethod
public void setup(){
initialization();
testutil = new TestUtil();
contactPage = new ContactPage();
loginPage = new LoginPage();
// HomePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
//testutil.switchToFrame();
//contactPage = HomePage.clickonContactslink();
}
@Test(priority=1)
public boolean  verifyContactsPagelabel(){
Assert.assertTrue(contactPage.verifyContactsPagelabel(),"contacts label is missing on a page");
return false;	
}
@Test(priority=2)
public void selectSingleContactsTest()
{
	contactPage.selectByContactsName("test2  test2");
}




private void selectByContactsName(String string) {
	// TODO Auto-generated method stub
	
}
private void on(String page2) {
	// TODO Auto-generated method stub
	
}
private Object homePage() {
	// TODO Auto-generated method stub
	return null;
}
private void initialization() {
	// TODO Auto-generated method stub
	
}


}
