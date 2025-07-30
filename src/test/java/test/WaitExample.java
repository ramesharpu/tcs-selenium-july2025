package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample extends BaseTest {
	
	public void explicitWaitDemo() {
//		WebElement email = driver.findElement(By.id("email"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("dan@gmail.com");
		
		//hidden element
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("dan@gmail.com");
	}
	
	public void fluentWaitDemo() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
//		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
//		email.sendKeys("dan@gmail.com");
		
		//hidden element
		WebElement hiddenElem = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("jazoest"))));
		hiddenElem.sendKeys("dan@gmail.com");
	}

	public static void main(String[] args) {
		WaitExample obj = new WaitExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
//		obj.explicitWaitDemo();
		obj.fluentWaitDemo();
	}

}
