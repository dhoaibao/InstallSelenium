package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Install Selenium\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/");
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchCourse() {
		driver.findElement(By.className("open_search_overlay")).click();
		driver.findElement(By.id("search-input")).sendKeys("Java");
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1600)");
		driver.findElement(By.xpath("//*[@id=\'add-master-courses\']/a[12]/div[1]/div[2]/div[1]/div[1]/h3")).click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 myObj = new Day1();
		myObj.openBrowser();
	}

}
