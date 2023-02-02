package ejemplosTestNG;

import org.testng.annotations.Test;//Esta clase es importada por TestNG

public class PrimeraPrueba {
	/*
	 * 1) Abrir aplicacion 2)Login 3)cerrar aplicacion
	 * Como no tiene main, se ejecuta en eclipse como TestNG
	 */

	// Para especificar que se realiza una prueba, es necesaria la anotacion @Test
	// para cada
	// metodo que sea una prueba

	@Test
	void test1() {
		
		System.out.println("testing 1");
	}

	@Test
	void test2() {
		System.out.println("testing 2");
	}

	@Test
	void test3() {
		System.out.println("testing 3");
	}
}
