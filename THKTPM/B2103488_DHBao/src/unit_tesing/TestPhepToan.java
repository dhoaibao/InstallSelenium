package unit_tesing;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import thuvien.tinhtoan.PhepTinh;

public class TestPhepToan {
//	@BeforeTest
//	public void BeforeTestTestcase0() {
//		System.out.println("Before testcase");
//	}
	
	@Test(dataProvider="testdata")
	public void TestCong(double value1, double value2, double value3) {
		Assert.assertEquals(PhepTinh.Op('+',(float) value1, (float) value2), (float) value3);
	}
	
//	@AfterTest
//	public void AfterTestTestcase0() {
//		System.out.println("After testcase");
//	}
	
//	@BeforeTest
//	public void BeforeTestTestcase1() {
//		System.out.println("Before testcase");
//	}
	
	@Test(dataProvider="testdata1")
	public void TestTru(double value1, double value2, double value3) {
		Assert.assertEquals(PhepTinh.Op('-',(float) value1, (float) value2), (float) value3);
	}
	
//	@AfterTest
//	public void AfterTestTestcase1() {
//		System.out.println("After testcase");
//	}
//	
//	@BeforeTest
//	public void BeforeTestTestcase2() {
//		System.out.println("Before testcase");
//	}
	
	@Test(dataProvider="testdata2")
	public void TestNhan(double value1, double value2, double value3) {
		Assert.assertEquals(PhepTinh.Op('*',(float) value1, (float) value2), (float) value3);
	}
	
//	@AfterTest
//	public void AfterTestTestcase2() {
//		System.out.println("After testcase");
//	}
	
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed()
	{
     ReadExcelFile config = new     
          ReadExcelFile("D:\\Install Selenium\\Thu vien va Du lieu kiem thu\\TestData.xlsx");
		
				
		int rows = config.getRowCount(0);
		
		Object[][] credentials = new Object[rows][3];
		
		for(int i=0; i<rows; i++)
		{
			credentials[i][0] = config.getData(0, i, 0);
			credentials[i][1] = config.getData(0, i, 1);
			credentials[i][2] = config.getData(0, i, 2);
		}
		return credentials;
	}
	
	@DataProvider(name="testdata1")
	public Object[][] TestDataFeed1()
	{
     ReadExcelFile config = new     
          ReadExcelFile("D:\\Install Selenium\\Thu vien va Du lieu kiem thu\\TestData.xlsx");
		
				
		int rows = config.getRowCount(1);
		
		Object[][] credentials = new Object[rows][3];
		
		for(int i=0; i<rows; i++)
		{
			credentials[i][0] = config.getData(1, i, 0);
			credentials[i][1] = config.getData(1, i, 1);
			credentials[i][2] = config.getData(1, i, 2);
		}
		return credentials;
	}
	
	@DataProvider(name="testdata2")
	public Object[][] TestDataFeed2()
	{
     ReadExcelFile config = new     
          ReadExcelFile("D:\\Install Selenium\\Thu vien va Du lieu kiem thu\\TestData.xlsx");
		
				
		int rows = config.getRowCount(2);
		
		Object[][] credentials = new Object[rows][3];
		
		for(int i=0; i<rows; i++)
		{
			credentials[i][0] = config.getData(2, i, 0);
			credentials[i][1] = config.getData(2, i, 1);
			credentials[i][2] = config.getData(2, i, 2);
		}
		return credentials;
	}
}
