package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import framework.CreateSession;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InmetricsHomePage;

import java.io.IOException;

public class InmetricsHomeStepDefinitions {

	InmetricsHomePage HOMEPAGE;
	WebDriver DRIVER;

	public InmetricsHomeStepDefinitions() throws IOException{
		DRIVER = CreateSession.getWebDriver();
		HOMEPAGE = new InmetricsHomePage(DRIVER);
	}

	@Dado("^que acesso a pagina da google \"([^\"]*)\"$")
	public void que_acesso_a_pagina_da_google(String url) throws Throwable {
		HOMEPAGE.get(url);
	}

	@Quando("^faco uma pesquisa por \"([^\"]*)\"$")
	public void faco_uma_pesquisa_por(String Inmetrics) throws Throwable {
		HOMEPAGE.waitForVisibility(HOMEPAGE.inputSearch);
		HOMEPAGE.findElement(HOMEPAGE.inputSearch).sendKeys(Inmetrics);
		HOMEPAGE.clickOnElementUsingJs(HOMEPAGE.buttonSearch);
	}

	@Entao("^clico no link$")
	public void clico_no_link() throws Throwable {
		HOMEPAGE.clickOnElementUsingJs(HOMEPAGE.clickLinkInmetrics);
	}

	@Entao("^sou redirecionado para tela inicial da Inmetrics$")
	public void sou_redirecionado_para_tela_inicial_da_Inmetrics() throws Throwable {

		String Actualtext = HOMEPAGE.findElement(HOMEPAGE.clickLinkInmetrics).getText();
		Assert.assertEquals(Actualtext, "Home" );
		System.out.println("Home matching --> Part executed");

	}

}