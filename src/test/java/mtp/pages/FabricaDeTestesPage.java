package mtp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import treinamento.utils.Helper;

public class FabricaDeTestesPage {
	WebDriver driver_;
	Helper helper;
	public FabricaDeTestesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver_ = driver;
		helper = new Helper(driver_);
	}
	
	@FindBy(xpath = "//div[contains(text(), 'Eu concordo.')]")
	private WebElement botaoEuConcordo;
	
	@FindBy(xpath = "//a[contains(text(),'Setores')]")
	private WebElement linkSetores;
	
	@FindBy(xpath = "//a[contains(text(),'Ind�stria e Varejo')]")
	private WebElement linkIndustriaEVarejo;
	
	@FindBy(xpath = "//span[contains(text(), 'O setor industrial n�o pode permanecer alheio ao ambiente digital. A nova realidade afeta especialmente �s empresas deste setor em aspectos relacionados com a otimiza��o de processos e a ado��o de ferramentas que facilitem a tomada de decis�es em tempo real.')]")
	private WebElement mensagemIndustriaEVarejo;
	
	public boolean checkPage() {
		
		return helper.aguardarElementoClicavel(botaoEuConcordo, 15);
	}
	
	public void clickMenu() {
		Actions action = new Actions(driver_);
		
		helper.aguardarElementoClicavel(linkSetores, 10);
		action.moveToElement(linkSetores).perform();
		
		helper.aguardarElementoClicavel(linkIndustriaEVarejo, 10);
		action.moveToElement(linkIndustriaEVarejo).click().perform();
		
	}
	
	public boolean checkMensagem() {
		return mensagemIndustriaEVarejo.isDisplayed();
	}
	
	public void clickButtonEuConcordoPorImagem() throws FindFailed {
		
		Screen screen = new Screen();
		Pattern botaoEuConcordo = new Pattern("C:\\qa\\workspace\\treinamento-develop\\src\\test\\resources\\botaoEuConcordo.png");
	
		screen.click(botaoEuConcordo);
	}
}
