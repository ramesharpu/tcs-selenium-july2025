package test;

public class BrowserCommandsExample extends BaseTest{

	public void demo() {
		//get command
//		driver.get("https://www.amazon.in");
		
		//get the title
//		String title = driver.getTitle();
//		System.out.println("page title = " + title);
		
		//basic level test case
//		String expectedResult = "Facebook – log in or sign up-ramesh";
//		String actualResult = driver.getTitle();
//		if(actualResult.equals(expectedResult))
//			System.out.println("test case - passed");
//		else
//			System.out.println("test case - failed");
		
		// to get the url
//		String url = driver.getCurrentUrl();
//		System.out.println("url = " + url);
		
		//get the page source
//		String pageSource = driver.getPageSource();
//		System.out.println("page source = " + pageSource);
		
		
		//Thread.sleep is used only for demo purpose
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//close tab
//		driver.close();
		
		//quit browser
//		driver.quit();
	}
	
	
	public static void main(String[] args) {
		BrowserCommandsExample obj = new BrowserCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}
}
