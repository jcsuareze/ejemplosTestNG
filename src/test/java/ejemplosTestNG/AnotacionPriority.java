package ejemplosTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnotacionPriority {

	/*
	 * La ejecucion de los metodos se realiza de forma alfabetica entonces Abrir y
	 * Cerrar se ejecutan antes que Login Para ejecutarlos en el orden deseado se
	 * usa la anotacion @Test(priority = 1)
	 * 
	 * PARA EJECUTAR LOS REPORTES ES NECESARIO EJECUTAR LA PRUEBA DESDE TESTNG.XML
	 * Este se puede crear manualmente o generar automaticamente
	 * XML se considera un Suite Case porque contiene varios testcases 
	 * Al ejecutarse se creara o actualizara una nueva carpeta llamada test-output
	 * que contiene los reportes de la ejecicion de la prueba (emailable-report.html e index.html)
	 * 
	 * 1)automaticamente en eclipse  a)boton derecho sobre la clase -> b)TestNg -> c) ConvertTo TestNg
	 * 1.1) Seleccionar varias clases -> TestNg -> Convert to TestNg
	 * (tratar de usar el mismo nombre que el SUITE) y en la misma carpeta
	 ***/

	WebDriver driver; // Necesita ser variable de clase

	@Test(priority = 1)
	void abrirApp() {

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	void login() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Test(priority = 3)
	// void cerrarApp() {
	void logout() {

		driver.quit();
	}
}
