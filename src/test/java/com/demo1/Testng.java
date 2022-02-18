package com.demo1;

import org.testng.annotations.*;

public class Testng {
	@BeforeSuite
	private void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	private void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	private void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	private void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeClass
	private void Beforeclass()
	{
		System.out.println("Beforeclass");
	}
	
	@AfterClass
	private void Afterclass()
	{
		System.out.println("Afterclass");
	}
	
	@BeforeMethod
	private void BeforeMethod()
	{
	
System.out.println("BeforeMethod");
}
	
	@AfterMethod
	private void AfterMethod()
	{
	
		System.out.println("AfterMethod");
}
	
	@Test
	private void test1()
	{
		System.out.println("Test1");
}
	@Test
	private void test2()
	{
		System.out.println("Test2");
}
	

}
