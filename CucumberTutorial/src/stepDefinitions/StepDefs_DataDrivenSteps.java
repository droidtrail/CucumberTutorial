package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_DataDrivenSteps extends Page_BasePage {

	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

	@Dado("^que eu inicio o Chrome browser$")
	public void que_eu_inicio_o_Chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver_2.40.exe");
		driver = new ChromeDriver();

	}

	@Quando("^eu abro a página do Google$")
	public void eu_abro_a_página_do_Google() throws Throwable {

		driver.get("http://www.google.com");
		driver.manage().window().maximize();

	}

	@Então("^eu procuro por \"([^\"]*)\" no Google$")
	public void eu_procuro_por_no_Google(String searchkeyword) throws Throwable {

		googleHomepage.searchOnGoogleHomepage(searchkeyword);
		Thread.sleep(2000);
		driver.quit();

	}

}
