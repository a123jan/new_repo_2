package org.TestNG.practices;

import org.testng.annotations.Test;

public class TestNGClassPractice1Test {
	@Test
	public void Test1() {
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String userName=System.getProperty("userName");
		String password=System.getProperty("password");
		System.out.println("Test1 -> class1");
		System.out.println("url---->"+url);
		System.out.println("browser---->"+browser);
		System.out.println("userName---->"+userName);
		System.out.println("password---->"+password);
		
	}
	@Test
	public void Test2() {
		System.out.println("Test2 -> class1");
		
	}
	@Test
	public void Test3() {
		System.out.println("Test3 -> class1");
		System.out.println("Test4 -> class1");
	}

}
