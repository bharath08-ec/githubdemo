
public class  ExtentReports  { 
ExtentReports extent; 
ExtentTest test; 
@BeforeTest
public void startReport() 
{ 
extent = new ExtentReport(System.getProperty("")+"/",true);
extent.addSystemInfo("HostName","franklin") 
.addSystemInfo("Environment","QA") 
.addSystemInfo("User Name","franklin");
extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
} 
@Test
public void demoReportPass() 
{ 
=extent.startTest("demoReportPass");
Assert.assertTrue(true);
test.log(LogStatus.PASS,"Assert pass as condition is True");
} 
@Test
public void demoReportfail() 
{ 
=extent.startTest("demoReportFail");
Assert.assertTrue(false);
test.log(LogStatus.FAIL,"Assert fail as condition is false");
} 
@AfterMethod
public void getResult(ITestResult result) 
 { 
if(result.getStatus()==ITestResult.FAILURE) 
{ 
test.log(LogStatus.FAIL,result.getThrowable()); 
} 
extent.endTest(test);
} 
@AfterTest
public void endReport() 
{ 
extent.flush(); 
extent.close(); 
} 
}
