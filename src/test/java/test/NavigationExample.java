package test;

public class NavigationExample extends BaseTest{
	
	public void navigationDemo() throws InterruptedException {
		//Thread.sleep is used only for demo purpose
		
		//navigate to youtube
		System.out.println("Navigating to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		//navigate to back to google page
		System.out.println("Navigating back to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		//navigate to forward to youtube page
		System.out.println("Navigating forward to youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		//Refreshing the youtube page
		System.out.println("Refreshing the youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		NavigationExample obj = new NavigationExample();
		obj.setupBrowser("chrome", "https://www.google.com");
		try {
			obj.navigationDemo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
