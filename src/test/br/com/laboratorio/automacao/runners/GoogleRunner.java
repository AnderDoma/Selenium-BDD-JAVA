package br.com.laboratorio.automacao.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		plugin = { "pretty", "html:target/cucumber-report",
				"json:target/reports/CucumberReport.json"},
		features = {
				"src/test/br/com/laboratorio/automacao/features/google.feature"},
		glue = { "br.com.laboratorio.automacao.steps", "br.com.laboratorio.automacao.utils" },
		tags = {"~@ignore"}	
		)
	
public class GoogleRunner {

}
