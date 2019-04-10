package common;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class Page_BasePage {

	public static WebDriver driver;

	@AfterClass
	public static void fecharBrowser() {

		driver.quit();

	}

}
