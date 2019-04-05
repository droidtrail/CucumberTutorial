package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_GoogleHomepage {

	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

	@Dado("^eu inicio o Google Chrome$")
	public void euInicioOGoogleChrome() throws Throwable {
		googleHomepage.lauchBrowser();
	}

	@Quando("^eu abro a pagina inicial do Google$")
	public void euAbroAPaginaInicialDoGoogle() throws Throwable {
		googleHomepage.lauchBrowser();
	}

	@Então("^eu verifico que a pagina mostra a caixa de pesquisa de texto$")
	public void euVerificoQueAPaginaMostraACaixaDePesquisaDeTexto() throws Throwable {
		googleHomepage.checkGoogleSearchButtonIsDisplayed();
	}

	@Então("^a pagina mostra o botao de pesquisa do Google$")
	public void aPaginaMostraOBotaoDePesquisaDoGoogle() throws Throwable {
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
	}

	@Então("^a pagina mostra o botao eu estou com sorte$")
	public void aPaginaMostraOBotaoEuEstouComSorte() throws Throwable {
		googleHomepage.checkSearchBoxIsDisplayed();
	}

}
