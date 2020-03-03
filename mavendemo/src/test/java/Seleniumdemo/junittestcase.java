package Seleniumdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class junittestcase {
	
	@Test
	public void testcase()
	{
		System.out.println("test case 1");
	}
	@Test
	public void testcase1()
	{
		System.out.println("test case 2");
	}
	@Test
	public void testcase2()
	{
		System.out.println("test case 3");
	}
	@Before
	public void beforemethod()
	{
		System.out.println("before method");
	}
	@After
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@BeforeClass
	public static void setupbeforeclass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public static void setupafterclass()
	{
		System.out.println("after class");
	}


}
