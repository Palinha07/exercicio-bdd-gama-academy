package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class PesquisandoNoSiteSteps {
	public WebDriver browser;

	@Dado("que estou no site tornesse um programador")
	public void que_estou_no_site_tornesse_um_programador() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		browser = new ChromeDriver();
		browser.get("https://www.torneseumprogramador.com.br/");
	}

	@Dado("digito no campo de busca a palavra {string}")
	public void digito_no_campo_de_busca_a_palavra(String string) {
		WebElement input = browser.findElement( By.cssSelector("input[name='q']") );
		input.sendKeys(string);
	}

	@Entao("devo ver o resultado na busca")
	public void devo_ver_o_resultado_na_busca() {
		WebElement button = browser.findElement( By.cssSelector("ion-icon[name='search']"));
		button.click();
	}

	@Dado("que que estou novamente no site do tornese um programador")
	public void que_que_estou_novamente_no_site_do_tornese_um_programador() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		browser = new ChromeDriver();
		browser.get("https://www.torneseumprogramador.com.br/");
	}

	@Dado("digito mais uma vez no campo de busca a palavra {string}")
	public void digito_mais_uma_vez_no_campo_de_busca_a_palavra(String string) {
		WebElement input = browser.findElement( By.cssSelector("input[name='q']") );
		input.sendKeys(string);
	}

	@Entao("devo ver os resultados na busca")
	public void devo_ver_os_resultados_na_busca() {
		WebElement button = browser.findElement( By.cssSelector("ion-icon[name='search']"));
		button.click();
	}

}
