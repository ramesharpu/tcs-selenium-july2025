package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownExample extends BaseTest {
	
	public void dropDownDemo() {
		Select month = new Select(driver.findElement(By.id("month")));
		
		//multi select
//		System.out.println("is the month dropdown multiselect = " + month.isMultiple());
		
		//select by index
//		month.selectByIndex(3);
		
		//select by value
//		month.selectByValue("5");
		
		//select by visible text
//		month.selectByVisibleText("Aug");
		
		//select by contains visible text
//		month.selectByContainsVisibleText("Oct");
//		month.selectByContainsVisibleText("O");
//		month.selectByContainsVisibleText("c");
//		month.selectByContainsVisibleText("t");
//		month.selectByContainsVisibleText("Oc");
//		month.selectByContainsVisibleText("ct");
		
//		month.selectByContainsVisibleText("J");
//		month.selectByContainsVisibleText("Ju");
		
		
		//first selected value
//		String firstSelectedValue = month.getFirstSelectedOption().getText();
//		System.out.println("first selected value = " + firstSelectedValue);
		
		//all selected values
//		List<WebElement> allSelectedOptions = month.getAllSelectedOptions();
//		for (WebElement elem : allSelectedOptions) {
//			System.out.println(elem.getText());
//		}
		
		//all options
		List<WebElement> allOptions = month.getOptions();
		for (WebElement elem : allOptions) {
			System.out.println(elem.getText());
		}
		
	}

	public static void main(String[] args) {
		SelectDropDownExample obj = new SelectDropDownExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropDownDemo();
	}

}
