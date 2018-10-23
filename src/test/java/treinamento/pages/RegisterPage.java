package treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstName")
	private WebElement campoFirstName;
	
	@FindBy(name = "lastName")
	private WebElement campoLastName;
	
	@FindBy(name = "phone")
	private WebElement campoPhone;
	
	@FindBy(id = "userName")
	private WebElement campoEmail;
	
	@FindBy(name = "address1")
	private WebElement campoAddress;

	@FindBy(name = "address2")
	private WebElement campoAddress2;
	
	@FindBy(name = "city")
	private WebElement campoCity;
	
	@FindBy(name = "state")
	private WebElement campoStateProvince;
	
	@FindBy(name = "postalCode")
	private WebElement campoPostalCode;
	
	@FindBy(name = "country")
	private WebElement comboBoxContry;
	
	@FindBy(id = "email")
	private WebElement campoUserName;
	
	@FindBy(id = "password")
	private WebElement campoPassword;
	
	@FindBy(id = "confirmPassword")
	private WebElement campoConfirmPassword;
	
	@FindBy(name = "register")
	private WebElement botaoSubmit;

	
	public boolean checkPage() {
		return campoFirstName.isDisplayed();
	}
	
	
	public void preencherContactInformation(String firstName, String lastName, String phone, String email) {
		
		
	}
	
	public void preencherMailingInformation(String address, String address2, String city, String stateProvince, String postalCode, String country) {
		
		
		new Select(comboBoxContry).selectByVisibleText(country);
		
		
	}

	
	
}
