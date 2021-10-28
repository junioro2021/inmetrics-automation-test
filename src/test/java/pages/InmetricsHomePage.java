package pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.CommonMethods;

/**
 * class to interact with page
 *
 * This class has web elements of homepage which are used by InmetricsHomeStepDefinitions
 */
public class InmetricsHomePage extends CommonMethods {

	public InmetricsHomePage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By inputSearch = By.name("q"); //google
	public By buttonSearch = By.name("btnK"); //google
	public By clickLinkInmetrics = By.xpath("//a[@href='https://inmetrics.com.br/']"); //inmetrics
}
