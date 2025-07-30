package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExample extends BaseTest {
	
	public void iframeDemo() {
		//index
//		driver.switchTo().frame(0);
		
		//id or name
//		driver.switchTo().frame("mce_0_ifr");
		
		//webelement
		WebElement elem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(elem);
		
		WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'Your')]"));
		System.out.println("message = " + msg.getText());
		
		
		//switch back to the base page
		driver.switchTo().defaultContent();
		
		WebElement basePageText = driver.findElement(By.xpath("//h3[contains(text(), 'Editor')]"));
		System.out.println("base text msg = " + basePageText.getText());
		
	}

	public static void main(String[] args) {
		IframeExample obj = new IframeExample();
		obj.setupBrowser("chrome", "https://the-internet.herokuapp.com/iframe");
		obj.iframeDemo();
	}

}
