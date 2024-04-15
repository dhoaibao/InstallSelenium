package Bookings;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFlight {
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
