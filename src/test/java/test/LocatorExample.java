package test;

import org.openqa.selenium.By;

public class LocatorExample extends BaseTest {
	
	public void locatorDemo() {
		//id
//		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("from name attribute");
		
		//class
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from class attribute");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from class attribute-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class attribute-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class attribute-3");
		
		//link text
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link text
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("ord?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("swo")).click();
//		driver.findElement(By.partialLinkText("ten pas")).click();
//		driver.findElement(By.partialLinkText("pass")).click();
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute path
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs path");	
		
//		driver.findElement(By.xpath("//form/div/div[1]/input")).sendKeys("from relative xpath");
//		driver.findElement(By.xpath("//body//form/div[1]/div[1]/input")).sendKeys("from relative xpath");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from rel path");
		
		//only tagname
//		driver.findElement(By.xpath("//button")).click();
		
		//only attribute (not recommended)
//		$x("//*[@id='email']")
		
		//tagname+attribute
//		$x("//input[@id='email']")
//		$x("//input[@name='email']")
//		$x("//input[@class='inputtext _55r1 _6luy']")
//		$x("//input[@type='text']")
//		$x("//input[@data-testid='royal-email']")
//		$x("//input[@placeholder='Email address or phone number']")
//		$x("//input[@aria-label='Email address or phone number']")
//		$x("//input[@autofocus='1']")
//		driver.findElement(By.xpath("//input[@autofocus='1']")).sendKeys("from autofocus");
		
		//functions
		//starts-with
		$x("//input[starts-with(@id,'email')]")
		$x("//input[starts-with(@id,'emai')]")
		$x("//input[starts-with(@id,'ema')]")
		$x("//input[starts-with(@id,'em')]")
		$x("//input[starts-with(@id,'e')]")
		
		//contains
		$x("//input[contains(@id,'email')]")
		$x("//input[contains(@id,'emai')]")
		$x("//input[contains(@id,'ema')]")
		$x("//input[contains(@id,'em')]")
		$x("//input[contains(@id,'e')]")
		
		$x("//input[contains(@id,'mail')]")
		$x("//input[contains(@id,'ail')]")
		$x("//input[contains(@id,'il')]")
		$x("//input[contains(@id,'l')]")
		
		$x("//input[contains(@id,'mai')]")
		$x("//input[contains(@id,'ai')]")
		$x("//input[contains(@id,'ma')]")
		$x("//input[contains(@id,'i')]")
		$x("//input[contains(@id,'m')]")
		
		//text
		$x("//button[text()='Log in']")
		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
		
		//text + starts-with
		$x("//button[starts-with(text(),'Log in')]")
		$x("//button[starts-with(text(),'Log i')]")
		$x("//button[starts-with(text(),'Log ')]")
		$x("//button[starts-with(text(),'Log')]")
		$x("//button[starts-with(text(),'Lo')]")
		$x("//button[starts-with(text(),'L')]")
		
		//text +contains
		$x("//button[contains(text(),'Log in')]")
		$x("//button[contains(text(),'Log i')]")
		$x("//button[contains(text(),'Log ')]")
		$x("//button[contains(text(),'Log')]")
		$x("//button[contains(text(),'Lo')]")
		$x("//button[contains(text(),'L')]")
		
		$x("//button[contains(text(),'og in')]")
		$x("//button[contains(text(),'g in')]")
		$x("//button[contains(text(),' in')]")
		$x("//button[contains(text(),'in')]")
		$x("//button[contains(text(),'in')]")
		
		$x("//button[contains(text(),'og i')]")
		$x("//button[contains(text(),'g i')]")
		$x("//button[contains(text(),'og ')]")
		$x("//button[contains(text(),' i')]")
		$x("//button[contains(text(),'g')]")
		
		
		//Advanced
		//and
		$x("//input[@id='email' and @name='email']")
		$x("//input[@id='email' and @name='email' and @type='text']")
		
		//or
		$x("//input[@id='email' or @name='email' ]")
		$x("//button[text()='Log in' or text()='लॉग इन करें']")

		//index (starts from 1)
		$x("//select[2]")//month dropdown
		$x("//select[3]")//year dropdown
		
		//chained
		$x("//body//input[@id='email']")
		$x("//form[contains(@id,'u_0_')]//input[@id='email']")
		$x("//form[contains(@id,'u_0_')]//input[starts-with(@id,'email')]")
		
		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css selector");
		
		//css ==> id attribute
		$$("#email")
		
		//css ==> class attribute
		$$(".inputtext")
		$$("._55r1")
		$$("._6luy")
		$$(".inputtext._55r1")
		$$("._55r1._6luy")
		$$(".inputtext._6luy")
		
		//css ==> id and class attribute
		$$("#email.inputtext._55r1._6luy")
		$$("#email.inputtext")
		$$("#email._55r1")
		$$("#email._6luy")
		$$("#email.inputtext._55r1")
		$$("#email._55r1._6luy")
		$$("#email.inputtext._6luy")
		$$(".inputtext#email")
		$$("._55r1#email")
		$$("._6luy#email")
		$$("#email.inputtext._55r1._6luy")
		$$(".inputtext._55r1#email")
		$$("._55r1._6luy#email")
		$$(".inputtext._6luy#email")
		$$(".inputtext#email._55r1._6luy")
		$$(".inputtext._55r1#email._6luy")
		$$(".inputtext._55r1._6luy#email")
		
		//css ==> html tagname
		$$("button")
		
		//css ==> html attribute (not recommended)
		$$("[id='email']")
		$$("*[id='email']")
		
		//css ==> html (tagname + attribute)
		$$("input[name='email']")
		$$("input[id='email']")
		$$("input[type='text']")
		
		//css (id & attribute) + html (tagname + attribute)
		$$("input#email")
		$$("input[id='email'].inputtext")
		$$("input[id='email']._55r1")
		$$("input[id='email']._6luy")
		$$("input[id='email'].inputtext._55r1")
		$$("input[id='email'].inputtext._6luy")
		$$("input[id='email']._55r1._6luy")
		$$("input[id='email']#email.inputtext")
		$$("input[id='email']#email._55r1")
		$$("input[id='email']#email._6luy")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']#email._55r1._6luy")
		$$("input[id='email']#email.inputtext._6luy")
		$$("input[id='email']#email.inputtext._55r1._6luy")
		$$("input[id='email'].inputtext#email._55r1._6luy")
		$$("input[id='email'].inputtext._55r1#email._6luy")
		$$("input[id='email'].inputtext._55r1._6luy#email")
		
		//substring
		//starts-with ==> ^
		$$("input[id^='email']")
		$$("input[id^='emai']")
		$$("input[id^='ema']")
		$$("input[id^='em']")
		$$("input[id^='e']")
		
		//ends-with ==> $
		$$("input[id$='email']")
		$$("input[id$='mail']")
		$$("input[id$='ail']")
		$$("input[id$='il']")
		$$("input[id$='l']")
		
		//contains ==> *
		$$("input[id*='email']")
		$$("input[id*='emai']")
		$$("input[id*='ema']")
		$$("input[id*='em']")
		$$("input[id*='e']")
		
		$$("input[id*='mail']")
		$$("input[id*='ail']")
		$$("input[id*='il']")
		$$("input[id*='l']")
		
		$$("input[id*='mai']")
		$$("input[id*='ai']")
		$$("input[id*='ma']")
		$$("input[id*='i']")
		$$("input[id*='m']")
			
		
	}
	
	

	public static void main(String[] args) {
		LocatorExample obj = new LocatorExample();
		obj.setuBrowser("chrome", "https://www.facebook.com");
		obj.locatorDemo();
	}

}
