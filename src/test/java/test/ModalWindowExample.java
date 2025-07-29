package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModalWindowExample extends BaseTest {
	
	public void modalDemo() {
		driver.manage().window().maximize();
		
		//click on login button
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//type email id
		WebElement email = driver.findElement(By.id("loginFormEmail"));
		email.sendKeys("hello@gmail.com");
	}
	

	public static void main(String[] args) {
		ModalWindowExample obj = new ModalWindowExample();
		obj.setupBrowser("chrome", "https://www.edureka.co/");
		obj.modalDemo();
	}

}
