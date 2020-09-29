package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayQ4 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://in.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='s0-14-11-0-1-2-6-0-6[3]-0-textrange']/div/div[1]/div/input")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@class='x-textrange__input x-textrange__input--to']")).sendKeys("1000000");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='svg-icon-arrow-right']/path")).click();
	}

}

