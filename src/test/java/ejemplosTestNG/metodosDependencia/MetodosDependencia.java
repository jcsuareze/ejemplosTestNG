package ejemplosTestNG.metodosDependencia;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MetodosDependencia {

	/***Las anotaciones de dependencia, evitaran que un metodo se ejecute si algun metodo
	 * anterior necesita pasar la prueba antes 
	 * DependsOnMethods = {"Metodo_que_debe_pasar"} ****/
	
	
	@Test(priority = 1)
	void abrirApp() {
		
		System.out.println("Metodo abrirApp");
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = {"abrirApp"})
	void login() {
		System.out.println("Metodo login, depende de abrirApp");
		Assert.assertTrue(false);
	}

	@Test(priority = 3,dependsOnMethods = {"login","abrirApp"})
	void busqueda() {
		
		System.out.println("Metodo busqueda, depende de Login y abrirApp");
		Assert.assertTrue(true);
	}

	@Test(priority = 4)
	void busquedaAvanzada() {
		
		System.out.println("Metodo busquedaAvanzada, No depende de ningun metodo");
		Assert.assertTrue(true);
	}

	@Test(priority = 5,dependsOnMethods = {"busquedaAvanzada"})
	void cierraApp() {
		
		System.out.println("Metodo cierraApp, depende de busquedaAvanzada");
		Assert.assertTrue(true);
	}
}
