package test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	RemoteWebDriver driver;
	String browser = "chrome";
	String gridUrl = "http://localhost:4444";
	String appUrl = "https://www.facebook.com";
	public void setupGrid() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browser);
		try {
			driver = new RemoteWebDriver(new URI(gridUrl).toURL(), cap);
		} catch (MalformedURLException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		driver.get(appUrl);
	}
	
	public void getCurrentPageTitle() {
		System.out.println("title = " + driver.getTitle());
	}

	public static void main(String[] args) {
		GridExample obj = new GridExample();
		obj.setupGrid();
		obj.getCurrentPageTitle();
	}
	
}
