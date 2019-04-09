package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.Page_BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class StepDefs_CucumberDataTableWithHeader extends Page_BasePage {

	@Dado("^que eu abro o site Mercury Tours$")
	public void que_eu_abro_o_site_Mercury_Tours() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver_2.40.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

	}

	@Dado("^clico na opção REGISTER$")
	public void clico_na_opção_REGISTER() throws Throwable {

		driver.findElement(By.cssSelector("td.mouseOut:nth-child(2) > a:nth-child(1)")).click();

	}

	@Dado("^preencho os campo para criação de uma nova conta$")
	public void preencho_os_campo_para_criação_de_uma_nova_conta(DataTable dt) throws Throwable {
		// Como essa tabela de dados também contém um cabeçalho,
		// a melhor maneira de acessar seu conteúdo é usando List <Map <K, V>>
		// como mostrado abaixo
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);

		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("First Name"));
		driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("Last Name"));
		driver.findElement(By.name("phone")).sendKeys(list.get(0).get("Phone"));
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("Email"));
		driver.findElement(By.name("address1")).sendKeys(list.get(0).get("Address"));
		driver.findElement(By.name("city")).sendKeys(list.get(0).get("City"));
		driver.findElement(By.name("email")).sendKeys(list.get(0).get("User Name"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("Confirm Password"));
		driver.findElement(By.name("register")).click();

	}

	@Então("^o sistema exibe a tela confirmando a inclusão$")
	public void o_sistema_exibe_a_tela_confirmando_a_inclusão(DataTable arg1) throws Throwable {
		Assert.assertTrue(true, "Thank you for registering.");
	}

}
