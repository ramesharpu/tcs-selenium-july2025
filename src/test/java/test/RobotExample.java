package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class RobotExample extends BaseTest {
	
	
	
	public void fileUploadExample() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//section[@id='upload-dropbox-zone']")).click();
		
		//file path
		String file = "d:\\selenium\\wallpaper.jpg";
		
		//invoking the robot class
		Robot robot = new Robot();
		
		//string selection
		StringSelection strSel = new StringSelection(file);
		
		//control + c ==> copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel, strSel);
		
		//Thread.sleep is used for demo purpose, as the operation will happen very fast
		
		//control + v ==> paste operation
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//press tab twice
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		//press enter key
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		RobotExample obj = new RobotExample();
		obj.setupBrowser("chrome", "https://tinypng.com/");
		try {
			obj.fileUploadExample();
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
