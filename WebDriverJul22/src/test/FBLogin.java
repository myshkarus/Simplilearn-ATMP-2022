package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,  TimeUnit.MILLISECONDS);

		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserName.sendKeys("abc@xyz.com");
		Password.sendKeys("abc@xyz");
		LoginButton.click();
		
		driver.close();	
	}

}
