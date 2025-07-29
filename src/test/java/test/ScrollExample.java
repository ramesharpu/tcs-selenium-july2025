package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends BaseTest {
	
	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com/results?search_query=nature+videos");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");
	}
	
	public void githubExample(){
		setupBrowser("chrome", "https://github.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void amazonExample() {
		String url = "https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_5?sr=8-5";
		setupBrowser("chrome", url);
		driver.findElement(By.xpath("//button[contains(text(), 'Continue shopping')]")).click();
		WebElement techDetails = driver.findElement(By.xpath("//h1[contains(text(),'Technical Details')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", techDetails);
	}

	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.amazonExample();
	}

}
