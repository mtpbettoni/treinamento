package treinamento.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import treinamento.config.SetUp;
import treinamento.pages.LoginPage;
import treinamento.pages.RegisterPage;


public class TestRegister {

	private WebDriver driver;

	@Before
	public void startTest() {
		
		SetUp setUp = new SetUp();
		driver = setUp.createBrowser("CHROME", "http://newtours.demoaut.com/");
	}

	@Test
	public void realizarRegistro() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLinkRegister();
		
		RegisterPage registerPage = new RegisterPage(driver);
		
		Assert.assertTrue("Página Register NÃO foi apresentada com sucesso.", registerPage.checkPage());
		
		registerPage.preencherMailingInformation("", "", "", "", "", "BRAZIL ");
		
		
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
