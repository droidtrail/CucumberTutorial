package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;

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
		
		driver.findElement(By.linkText("mercuryregister.php?osCsid=69b366315106a8a3be9d95857b2bcb59")).click();
		
	}

	@Dado("^preencho os campo para criação de uma nova conta$")
	public void preencho_os_campo_para_criação_de_uma_nova_conta(DataTable dt) throws Throwable {
		// Como essa tabela de dados também contém um cabeçalho,
		// a melhor maneira de acessar seu conteúdo é usando List <Map <K, V>>
		// como mostrado abaixo
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		System.out.println(list.get(0).get("First Name"));
		System.out.println(list.get(0).get("Last Name"));
		System.out.println(list.get(0).get("Phone"));
		System.out.println(list.get(0).get("Email"));
		System.out.println(list.get(0).get("Address"));
		System.out.println(list.get(0).get("City"));
		System.out.println(list.get(0).get("User Name"));
		System.out.println(list.get(0).get("Password"));
	}

}
