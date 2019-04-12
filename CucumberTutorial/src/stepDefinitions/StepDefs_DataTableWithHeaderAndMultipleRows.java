package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.Assert;

import common.Page_BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class StepDefs_DataTableWithHeaderAndMultipleRows extends Page_BasePage {

	Integer i;

	@Dado("^que eu abro o site Mercury Tours on-line$")
	public void que_eu_abro_o_site_Mercury_Tours_on_line() throws Throwable {

		abrirSite();

	}

	@Dado("^clico na opção REGISTER\\.$")
	public void clico_na_opção_REGISTER() throws Throwable {

		driver.findElement(By.cssSelector("td.mouseOut:nth-child(2) > a:nth-child(1)")).click();

	}

	@Dado("^preencho os campo para criação de novas contas$")
	public void preencho_os_campo_para_criação_de_novas_contas(DataTable dt) throws Throwable {

		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for (i = 0; i < list.size(); i++) {

			driver.findElement(By.name("firstName")).sendKeys(list.get(i).get("First Name"));
			driver.findElement(By.name("lastName")).sendKeys(list.get(i).get("Last Name"));
			driver.findElement(By.name("phone")).sendKeys(list.get(i).get("Phone"));
			driver.findElement(By.name("userName")).sendKeys(list.get(i).get("Email"));
			driver.findElement(By.name("address1")).sendKeys(list.get(i).get("Address"));
			driver.findElement(By.name("city")).sendKeys(list.get(i).get("City"));
			driver.findElement(By.name("email")).sendKeys(list.get(i).get("User Name"));
			driver.findElement(By.name("password")).sendKeys(list.get(i).get("Password"));
			driver.findElement(By.name("confirmPassword")).sendKeys(list.get(i).get("Confirm Password"));
			driver.findElement(By.name("register")).click();
			Assert.assertTrue(true, "Thank you for registering.");
			driver.findElement(
					By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))
					.click();
		}

	}

	@Então("^o sistema exibe em cada execução a confirmação da inclusão da conta$")
	public void o_sistema_exibe_em_cada_execução_a_confirmação_da_inclusão_da_conta() throws Throwable {

	}
	
	@Então("^fecha o navegador ao término do cadastro dos usuários$")
	public void fechaONavegadorAoTérminoDoCadastroDosUsuários() throws Throwable {
	    
		fecharBrowser();
	}
}
