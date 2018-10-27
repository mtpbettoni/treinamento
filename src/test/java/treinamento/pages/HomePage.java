package treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "SIGN-OFF")
	private WebElement linkSignOff;
	
	public boolean checkPage() {
		return linkSignOff.isDisplayed();
	}
}
