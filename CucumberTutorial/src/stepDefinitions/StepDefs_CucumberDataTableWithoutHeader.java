package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;

public class StepDefs_CucumberDataTableWithoutHeader extends Page_BasePage {

	@Dado("^que eu abro a aplicação$")
	public void queEuAbroAAplicação() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver_2.40.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	@Dado("^eu logo com as seguintes credenciais$")
	public void euLogoComAsSeguintesCredenciais(DataTable dt) throws Throwable {
//Also, since the data table parameters that we have are of type String, hence we will use List< String > to fetch the data
 
		List<String> list = dt.asList(String.class);
		System.out.println("Username - " + list.get(0));
		System.out.println("Password - " + list.get(1));

		driver.findElement(By.name("userName")).sendKeys(list.get(0));
		driver.findElement(By.name("password")).sendKeys(list.get(1));
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("findFlights")).isDisplayed();

	}

}
