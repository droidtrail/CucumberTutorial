package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;

public class Page_GoogleHomepage extends Page_BasePage {

	public void lauchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver_2.40.exe");
		driver = new ChromeDriver();
	}

	public void openGooleURL() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	public void checkSearchBoxIsDisplayed() {

		if (driver.findElement(By.name("q")).isDisplayed()) {

			System.out.println("A caixa de pesquisa foi exibida");

		} else {
			System.out.println("A caixa de pesquisa não foi exibida");
		}

	}

	public void checkGoogleSearchButtonIsDisplayed() {

		if (driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("O botão de pesquisa do Google está visível");
		} else {
			System.out.println("O botão de pesquisa do Google está visível");
		}

	}

	public void checkImFeelingLuckyButtonIsDisplayed() {
		if (driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("O botão Eu estou com sorte está visível");
		} else {
			System.out.println("O botão Eu estou com sorte está visível");
		}
	}
}
