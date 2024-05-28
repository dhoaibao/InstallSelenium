package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestFacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Install Selenium\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		driver.get("https://vi-vn.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Tạo tài khoản mới")).click();
		driver.findElement(By.name("lastname")).sendKeys("Duong");
		driver.findElement(By.name("firstname")).sendKeys("Bao");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		List <WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		Select sel1 = new Select(driver.findElement(By.id("day")));
		sel1.selectByValue("25");
		Select sel2 = new Select(driver.findElement(By.id("month")));
		sel2.selectByIndex(3);
		Select sel3 = new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("2000");
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.linkText("Tìm hiểu thêm")).click();
//		driver.navigate().back();
//		ArrayList<String> switchTabs= new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(switchTabs.get(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.close();
//		driver.switchTo().window(switchTabs.get(0));
//		driver.quit();
	}

}
