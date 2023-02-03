package ejemplosTestNG.validaciones;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	/* Los Hard assertions son usados cuando se quiere detener la ejecucion de la prueba**/
	/** Solo las validaciones ( assertions) haran que la prueba falle o pase
	 * Y pueden ser mostradas en el reporte  ***/
	@Test
	void test() {

		int x = 10;
		int y = 15;
		int z = 20;

		/*  Este metodo aunque tenga una falla, la prueba pasaria 
		 * if (x == y) { System.out.println("Test Pasa"); } else {
		 * System.out.println("Test Falla"); }
		 */
		
		//Assert.asserEquals(actual, esperado, mensaje)
		Assert.assertEquals(z>y, true, "Mensaje si falla");
		
		String s1 = "abc";
		String s2 = "abc";
		
		Assert.assertEquals(s1,s2, "Strings no son iguales");
		
	}

}
