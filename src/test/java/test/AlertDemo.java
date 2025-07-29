package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertDemo extends BaseTest{
	
	public void alertExample() {
		WebElement promptAlertBtn = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		//click on the alert button
		promptAlertBtn.click();
		
		//error demo
//		promptAlertBtn.click();
		
		//accepting or ok or submit
//		driver.switchTo().alert().accept();
		
		//dismiss or cancel or close window
//		driver.switchTo().alert().dismiss();
		
		//get the text message
		String msg = driver.switchTo().alert().getText();
		System.out.println("alert msg = " + msg);
		
		//type
		driver.switchTo().alert().sendKeys("dan@gmail.com");
		
	}

	public static void main(String[] args) {
		AlertDemo obj = new AlertDemo();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertExample();

	}

}
