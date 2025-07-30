package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser is not provided, hence quitting the automation run");
			System.exit(0);
		}
				
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//page load timeout ==> usually defined in POM
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//script load timeout ==> either in setup method (for project level) or POM (for page/module level)
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		if(url!="")		
			driver.get(url);
		else
			driver.get("about:blank");

	}
}
