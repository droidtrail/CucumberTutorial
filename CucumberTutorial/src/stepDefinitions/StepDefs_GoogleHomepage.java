package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepDefs_GoogleHomepage {
	
	@Dado("^eu inicio o Google Chrome$")
	public void euInicioOGoogleChrome() throws Throwable {
	    System.out.println("1");
	}

	@Quando("^eu abro a pagina inicial do Google$")
	public void euAbroAPaginaInicialDoGoogle() throws Throwable {
		System.out.println("2");
	}

	@Então("^eu verifico que a pagina mostra a caixa de pesquisa de texto$")
	public void euVerificoQueAPaginaMostraACaixaDePesquisaDeTexto() throws Throwable {
		System.out.println("3");
	}

	@Então("^a pagina mostra o botao de pesquisa do Google$")
	public void aPaginaMostraOBotaoDePesquisaDoGoogle() throws Throwable {
		System.out.println("4");
	}

	@Então("^a pagina mostra o botao eu estou com sorte$")
	public void aPaginaMostraOBotaoEuEstouComSorte() throws Throwable {
		System.out.println("5");
	}

}
