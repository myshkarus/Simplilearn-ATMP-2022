package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,  TimeUnit.MILLISECONDS);

		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAccount.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Mykhailo");
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Shpilienko");
		WebElement MobileOrEmail = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
		MobileOrEmail.sendKeys("12345678");
		WebElement ReenterMobileOrEmail = driver.findElement(By.xpath("//input[@aria-label='Re-enter email']"));
		ReenterMobileOrEmail.sendKeys("12345678");		
		
	
		
		
	}

}
