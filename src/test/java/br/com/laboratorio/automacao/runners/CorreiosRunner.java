package br.com.laboratorio.automacao.runners;

import br.com.laboratorio.automacao.steps.Base;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		plugin = { "pretty", "html:target/cucumber-report",
		"json:target/reports/CucumberReport.json"},
		features = {
				"src/test/java/br/com/laboratorio/automacao/features/correios.feature"},
		glue = { "br.com.laboratorio.automacao.steps", 
				"br.com.laboratorio.automacao.utils" }
		/*tags = {
				//"@Correios_autenticacao_invalida"
				}*/	
		)
	
public class CorreiosRunner extends Base {

	@AfterClass
	public static void tearDown() {
		try {
			WebDriver driver = Base.getDriver();
			if (driver != null) {
				driver.quit(); // or driver.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
