package ejemplosTestNG.validaciones;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	/* Los Soft assertions son usados cuando se quiere seguir con la ejecucion de la prueba**/
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
