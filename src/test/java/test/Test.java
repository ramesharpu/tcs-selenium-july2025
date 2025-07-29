package test;

public class Test extends BaseTest{
	
	public void testMethod() {
		System.out.println("Page Title = " + driver.getTitle());
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.setupBrowser("chrome", "https://www.github.com");
		obj.testMethod();

	}

}
