package ejemplosTestNG.anotaciones;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClasePrueba2ParaTest {

	// Clase para demostrar anotacion @BeforeTest y @AfterTest
	// Ejecutado desde PruebaAnotacionTEST.XML
	@Test
	void abc() {
		System.out.println("Metodo xyz desde Clase Prueba2 ");
	}

	// Este metodo se ejecuta antes que se inicie la ejecucion del Test (
	// archivo XML)
	@AfterTest
	void metodoAfterTest() {

		System.out.println("Metodo After Test desde Clase Prueba2");
	}

	
	//Este metodo se ejecuta una vez antes que se inicie el Test Suite
	@BeforeSuite
	void metodoBeforeSuite() {

		System.out.println("Metodo Before Suite desde Clase Prueba2");
	}

}
