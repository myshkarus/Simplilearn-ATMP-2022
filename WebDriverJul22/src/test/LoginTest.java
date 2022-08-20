package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,  TimeUnit.MILLISECONDS);
		
		// Step1. Click on the Login Link
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
			
		//Step2: Enter Username
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@xyx.com"); 
		
		//Step3: Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234"); 
		
		//Step4: Click Remember Me checkbox
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		//Step5: Click Login Button
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click(); 
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActualError = Error.getText();
		String ExpectedError = "The email or password you have entered is invalid.";
		
		if(ActualError.equals(ExpectedError)) {
			System.out.println("Test case PASSED");
		} 
		else {
			System.out.println("Test case FAILED");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of links are " + Links.size());
		
		for(int index=0; index<Links.size(); index++) {
			System.out.println(Links.get(index).getAttribute("href"));
		}
		
		
		//Step7: Close the browser
		driver.close();	
	}

}
