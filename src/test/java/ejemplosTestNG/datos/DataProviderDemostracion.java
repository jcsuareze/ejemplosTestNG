package ejemplosTestNG.datos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemostracion {

	/***
	 * Es recomendable usar una clase que procese los datos (dataProvider) se puede
	 * repetir la prueba sin un ciclo FOR************4 Los dataProviders pueden ser
	 * XLS o XML
	 ***/

	WebDriver driver;

	@BeforeClass
	void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	// Esta es la parte del TEST que quiero que se repita varias veces para eso
	// necesitamos un metodo( Una clase en caso de proyectos) que sea un
	// dataProvider y debe llevar el mismo nombre que el dataProvider
	@Test(dataProvider = "nombreDP")
	//Los argumentos del metodo son los que recibira del DataProvider
	void testLogin(String email, String pwd) {

		// Esta pagina necesita usuario, se puede hacer desde Register
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String get_title = driver.getTitle();

		Assert.assertEquals(exp_title, get_title);
	}

	@AfterClass
	void teadDown() {

		driver.quit();
	}

	// Se debe usar la anotacion DataProvider y un nombre que se usara en la
	// anotacion @Test
	//En caso de querer solo algunos elementos a probar se pueden seleccionar con indices (en español)
	@DataProvider(name = "nombreDP", indices= {0,4})
	String[][] loginData() {

		// Datos Hardcodeados, en proyecto se debe usar un XML o XLS

		String data[][] = { 
				{ "suarez.jcarlos@gmail.com", "Password2" },
				{ "suarezw.jcarlos@gmail.com", "Password1" },
				{ "suarez.jcarlos@gmail.com", "Password1" },
				{ "suarez.jcarlos@gmail.com", "Password1" },
				{ "suarez8.jcarlos@gmail.com", "Password1" }

		};

		return data;
	}

}
