package br.com.laboratorio.automacao.steps;

import org.openqa.selenium.WebDriver;

import br.com.laboratorio.automacao.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest extends Base {
	
	private static WebDriver driver;
	
	@Before
	public static void before() throws Throwable {
		driver = DriverFactory.getDriver();
		Base.setDriver(driver);
	}
	
	@After
	public static void after() throws Throwable {
		Base.setDriver(null);
		DriverFactory.closeDriver();
	}
	
	public static WebDriver getDriver() {
		return Base.getDriver();
	}
	
}
