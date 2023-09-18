package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonActions {
	
	public void clickElement(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException |NullPointerException e) {
			e.printStackTrace();
		}
	}
}
