package treinamento.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetUp {
	
	
	public WebDriver driver;
	
	public WebDriver createBrowser(String browser, String url) {
		
		switch (browser.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
			break;
			
			case "IE":
				System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			break;
		
			case "FIREFOX":
				System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			break;
			
			default:
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}

}
