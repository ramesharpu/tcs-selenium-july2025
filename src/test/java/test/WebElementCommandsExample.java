package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementCommandsExample extends BaseTest{
	
	public void demo() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		WebElement welcomeMsg = driver.findElement(By.className("_8eso"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		
		
		//fetching the details
		//get attribute
//		String placeholder = email.getAttribute("placeholder");
//		System.out.println("email placeholder - " + placeholder);
		
		//tool tip using get attribute
//		String toolTip = instaLink.getAttribute("title");
//		System.out.println("tool tip of insta link - " + toolTip);
		
		//get text
//		System.out.println("Login button text = " + loginBtn.getText());
//		System.out.println("Welcome message = " + welcomeMsg.getText());
		
		//get tagname
//		System.out.println("tagname of email id - " + email.getTagName());
		
		//get css value
//		String fontSize = welcomeMsg.getCssValue("font-size");
//		System.out.println("Font size of the welcome message = " + fontSize);
		
		//get location
//		driver.manage().window().maximize();//to maximize the window
//		System.out.println("login button location(Point) = " + loginBtn.getLocation());
//		System.out.println("login button location(Point - X) = " + loginBtn.getLocation().x);
//		System.out.println("login button location(Point - Y) = " + loginBtn.getLocation().y);
		
		//get size
//		System.out.println("login button size (Dimension) = " + loginBtn.getSize());
//		System.out.println("login button size (Dimension - Width) = " + loginBtn.getSize().width);
//		System.out.println("login button size (Dimension - height) = " + loginBtn.getSize().height);
		
		//Actions
		//click operation
//		loginBtn.click();
		
		//type action
//		email.sendKeys("john@gmail.com");
		
		//clear action
//		email.clear();
//		email.sendKeys("dan@gmail.com");
		
		
		//status
		//is displayed
//		System.out.println("is the email element displayed - " + email.isDisplayed());
//		System.out.println("is the hidden element displayed - " + hiddenElem.isDisplayed());
		
		//is enabled
//		System.out.println("is email element enabled - " + email.isEnabled());
		
		//is selected
		driver.findElement(By.partialLinkText("Sign Up")).click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value=2]"));
		System.out.println("Before selecting, is the male radio button selected - " + maleRadioButton.isSelected());
		
		//select the male radio button
		maleRadioButton.click();
		System.out.println("After selecting, is the male radio button selected - " + maleRadioButton.isSelected());
	}
	
	
	public static void main(String[] args) {
		WebElementCommandsExample obj = new WebElementCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}

}
