package Bookings;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFlight {
//	@BeforeMethod
//	public void BeforeMethodTestcase1() {
//		System.out.println("This code will run before every testcase");
//	}
//	
//	@AfterMethod
//	public void AfterMethodTestcase1() {
//		System.out.println("This code will run after every testcase");
//	}
//	
//	@BeforeTest
//	public void Beforetesttestcase1() {
//		System.out.println("This should be first");
//	}
//	
//	@Test
//	public void BookFlight_RoundTrip_TestCase1() {
//		System.out.println("Testcase1");
//	}
//	
//	@Test(dependsOnMethods={"BookFlight_RoundTrip_TestCase1"})
//	public void BookFlight_RoundTrip_TestCase2() {
//		System.out.println("Testcase2");
//	}
//	
//	@Test
//	public void BookFlight_OneWay_TestCase3() {
//		System.out.println("Testcase3");
//	}
//	
//	@AfterTest
//	public void Aftertesttestcase1() {
//		System.out.println("This should be last");
//	}
//	
//	@Test
//	public void BookFlight_OneWay_TestCase4() {
//		System.out.println("Testcase4");
//	}
	
	@Test
	public void BookFlight_RoundTrip_TestCase1() {
		System.out.println("BookFlight RoundTrip TestCase1");
	}
	
	@Test
	public void BookFlight_RoundTrip_TestCase2() {
		System.out.println("BookFlight RoundTrip TestCase2");
	}
	
	@Test
	public void BookFlight_OneWay_TestCase3() {
		System.out.println("BookFlight OneWay TestCase3");
	}
	
	@Test
	public void BookFlight_OneWay_TestCase4() {
		System.out.println("BookFlight OneWay TestCase4");
	}
	
}
