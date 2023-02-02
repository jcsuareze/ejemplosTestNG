package ejemplosTestNG.anotaciones;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClasePrueba1ParaTest {

	// Clase para demostrar anotacion @BeforeTest y @AfterTest
	// Ejecutado desde PruebaAnotacionTEST.XML
	@Test
	void abc() {
		System.out.println("Metodo abc desde Clase Prueba1 ");
	}
	
	
	//Este metodo se ejecuta una vez antes que se inicie el Test Suite
	@AfterSuite
	void metodoAfterSuite() {

		System.out.println("Metodo After Suite desde Clase Prueba1");
	}

	
	//Este metodo se ejecuta antes que se inicie la ejecucion del TestSuite ( archivo XML)
	@BeforeTest
	void metodoBeforeTest() {
		
		System.out.println("Metodo Before Test desde Clase Prueba 1");
	}
}
