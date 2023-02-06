package ejemplosTestNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PostActions {
	
	/****Los PostActions se realizan dependiendo de los resultados ***
	 * Usa una clase Listener  que implementa ITestListener************
	 * Se debe especificar el listener en el archivo XML*/

	@Test(priority = 1)
	void prueba1() {

		Assert.assertEquals(1, 1);
	}

	@Test(priority = 2)
	void prueba2() {

		Assert.assertEquals("A", "s");
	}

	@Test(priority = 3, dependsOnMethods = { "prueba2" })
	void prueba3() {
		Assert.assertEquals(1, 1);
	}

}
