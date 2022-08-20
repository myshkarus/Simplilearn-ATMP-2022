package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAndTabsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,  TimeUnit.MILLISECONDS);

		String ParentWin = driver.getWindowHandle();
		System.out.println("Before clicking Tab button the win is " + ParentWin);
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		System.out.println("After clicking Tab button");
		
		Set<String> allWins = driver.getWindowHandles();
		for(String win: allWins) {
			System.out.println(win);
			if(!win.equals(ParentWin)) {
				driver.switchTo().window(win);
			}
		}
		
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());
		
		driver.close();
		driver.switchTo().window(ParentWin);
		
		WebElement WinBtn = driver.findElement(By.id("windowButton"));
		WinBtn.click();
		
		// close all windows
		driver.quit();
		
	}

}
