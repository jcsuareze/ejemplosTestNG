package ejemplosTestNG.validaciones;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	@Test
	void pruebaHard() {

		// La ejecucion de la prueba no se completara en el metodo
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		assertEquals(1, 1);
		System.out.println("Prueba... Si Assertion falla, no se vera este mensaje");
		assertEquals(1, 1);

	}

	@Test
	void pruebaSoft() {
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		System.out.println("Prueba...");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);
		
		System.out.println("Prueba... Si Assertion falla, se vera este mensaje");
		
		/**Siempre que se use un soft assertion, se debe de usar el metodo assertAll***/
		sa.assertAll();
		
	}

}
