package TestNGdemo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sampletestcase {
  @Test
  public void testcase1() {
	  System.out.println("Test case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Test case 2");
  }
  @Test
  public void testcase3() {
	  System.out.println("Test case 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class:Prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class:Clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test:Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test:Close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite:Smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite:generate report");
  }

}
