package ejemplosTestNG.anotaciones;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotacionMetodo {
	
	/*
	 * Estas anotaciones solo funcionan a nivel METODO
	 * 1) Login... 2 ) Busqueda... 3) Logout... 1) Login... 4) Busqueda Avanzada... 3)Logout...
	 * 
	 */

	// Se ejecuta multiples veces antes de cada metodo, no cuenta como prueba
	@BeforeMethod
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

	// Se ejecuta multiples veces despues de cada metodo, no cuenta como prueba
	@AfterMethod
	void logout() {
		System.out.println("Logout...");
	}
}
