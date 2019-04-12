package common;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_BasePage {

	public static WebDriver driver;

	@BeforeClass
	public static void abrirSite() {

		System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver_2.40.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void fecharBrowser() {

		driver.quit();

	}

}
