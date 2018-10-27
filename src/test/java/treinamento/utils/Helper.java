package treinamento.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	WebDriver driver_;
	public Helper(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver_ = driver;
	}
	
	public boolean aguardarElementoClicavel(WebElement elemento, int time) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver_, time);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
			
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
