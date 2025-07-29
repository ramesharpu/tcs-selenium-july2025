package test;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowManagement extends BaseTest {
	
	public void windowMgtDemo() {
		/*
		//window mgt
		driver.getWindowHandle();//current window id
		driver.getWindowHandles();//all the window id's which has been opened by the current driver instance in a set
		driver.switchTo().window("<window-id>");//to switch the control to any window
		
		//browser commands
		driver.close();//close the tab
		driver.quit();//quit the browser instance
		*/
		
		System.out.println("\n*****************Before opening the insta page*****************");
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		
		//opening insta link
		driver.findElement(By.partialLinkText("Instagram")).click();
		System.out.println("\n*****************After opening the insta page*****************");
		System.out.println("page title - " + driver.getTitle());
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		
		//to switch to the insta page
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("\n*****************After switching to the insta page*****************");
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		System.out.println("page title - " + driver.getTitle());
		
		//Thread.sleep is used only for demo purpose
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close the insta page
		driver.close();
		System.out.println("\n*****************After closing insta page and switching to facebook page*****************");
		//switch the window control to facebook page
		driver.switchTo().window(tabs.get(0));
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		System.out.println("page title - " + driver.getTitle());
		
		//Thread.sleep is used only for demo purpose
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closing the browser instance
		driver.quit();
		System.out.println("\n*****************After closing insta page and switching to facebook page*****************");
		//none of the below operations can be performed, because the driver is null after driver.quit() is called
//		System.out.println("page title - " + driver.getTitle());
//		System.out.println("current window id = " + driver.getWindowHandle());
//		System.out.println("total number of windows = " + driver.getWindowHandles());
		
	}

	public static void main(String[] args) {
		WindowManagement obj = new WindowManagement();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.windowMgtDemo();
		
	}

}
