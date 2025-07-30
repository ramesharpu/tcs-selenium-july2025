package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo extends BaseTest {
	
	public void dragDropDemo() {
		setupBrowser("chrome", "https://the-internet.herokuapp.com/drag_and_drop");
		WebElement src = driver.findElement(By.id("column-a"));
		WebElement dest = driver.findElement(By.id("column-b"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
	}
	
	public void amazonDemo() {
		setupBrowser("chrome", "https://www.amazon.in");
		driver.manage().window().maximize();
		
		//this is required if continue shopping page gets displayed(optional)
		driver.findElement(By.tagName("button")).click();

		WebElement navIcon = driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(navIcon).build().perform();
		
		driver.findElement(By.partialLinkText("Create a Wish List")).click();
		
	}
	

	public static void main(String[] args) {
		ActionsDemo obj = new ActionsDemo();
//		obj.dragDropDemo();
		obj.amazonDemo();

	}

}
