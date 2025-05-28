package br.com.laboratorio.automacao.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.laboratorio.automacao.utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends Base {
	
	WebDriver driver = Base.getDriver();
	Utils utils = new Utils(Base.getDriver());

		
	@Given("acesso a pagina do google")
	public void acesso_a_pagina_do_google() {
		driver.get("http://www.google.com");
	}

	@When("^realizo uma pesquisa \"([^\"]*)\"$")
	public void realizao_uma_pesquisa(String valorPesquisa) throws Throwable {
		WebElement barra_pesquisa = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		barra_pesquisa.sendKeys(valorPesquisa);
		utils.waitPageLoad(2);
		barra_pesquisa.sendKeys(Keys.ENTER);
		utils.waitPageLoad(2);
	}

	@Then("^valido o resultado da pesquisa$")
	public void valido_o_resultado_da_pesquisa() {
		WebElement txtResultadoPesquisa = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
		assertTrue(txtResultadoPesquisa.getText().contains("Aproximadamente"));
	}

}
