package TestNGdemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void login() {
		System.out.println("login the application");
	}
	@Test(dependsOnMethods= {"login"})
	public void search() {
		System.out.println("Searching the application");
		assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logout() {
		System.out.println("logout the application");
	}
	
	

}
