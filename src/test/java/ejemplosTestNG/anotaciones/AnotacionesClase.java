package ejemplosTestNG.anotaciones;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotacionesClase {

	
	
	
	

	// Se ejecuta UNA VEZ al inicio de la clase, no cuenta como prueba
	@BeforeClass
	void login() {
		System.out.println("Login... ");
	}

	@Test(priority = 1)
	void busqueda() {
		System.out.println("Busqueda...");
	}

	@Test(priority = 2)
	void busquedaAvanzada() {
		System.out.println("Busqueda Avanzada...");
	}

	// Se ejecuta UNA VEZ al final  de la clase, no cuenta como prueba
	@AfterClass
	void logout() {
		System.out.println("Logout...");
	}
}

