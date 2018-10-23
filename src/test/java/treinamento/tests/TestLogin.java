package treinamento.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import treinamento.config.SetUp;
import treinamento.pages.HomePage;
import treinamento.pages.LoginPage;


public class TestLogin {

	private WebDriver driver;

	@Before
	public void startTest() {
		
		SetUp setUp = new SetUp();
		driver = setUp.createBrowser("IE", "http://newtours.demoaut.com/");
	}

	@Test
	public void realizarlogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.realizarLogin("mercury", "mercury");
		 
		HomePage homePage = new HomePage(driver);
		
		Assert.assertTrue("Login NÃO foi realizado com sucesso.", homePage.checkPage());
	}

	@After
	public void tearDown() {
		driver.close();
	}
}
