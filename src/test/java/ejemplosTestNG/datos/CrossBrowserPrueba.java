package ejemplosTestNG.datos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserPrueba {

	/*****
	 * Para recibir parametros desde testng.xml hay que especificar la
	 * anotacion @Parameters* con el mismo nombre que se establecio en el archivo
	 *******/

	/**
	 * para realizar EJECUCION SERIAL hay que realizar una nueva prueba en
	 * testNG.xml con diferente nombre en el parametro y en test Para realizar
	 * EJECUCION PARALELA hay que especificar parallel ="test" en el tag SUITE del
	 * XML
	 ****/

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	void setup(String bro, String url) {

		if (bro.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (bro.equals("edge")) {
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		} else {

			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	void testLogo() {

		try {
			boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']/child::img"))
					.isDisplayed();
			Assert.assertEquals(status, false);
		} catch (NoSuchElementException e) {
			Assert.fail();
		}
	}

	@Test(priority = 2)
	void testHomePageTitulo() {

		String titulo = driver.getTitle();
		Assert.assertEquals(titulo, "OrangeHRM", "Titulo de la pagina no concuerda");
	}

	@AfterClass
	void closeApp() {

		driver.quit();
	}

}
