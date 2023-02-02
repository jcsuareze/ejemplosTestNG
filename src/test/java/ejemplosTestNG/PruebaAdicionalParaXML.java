package ejemplosTestNG;

import org.testng.annotations.Test;

public class PruebaAdicionalParaXML {
	@Test
	void test1() {
		
		System.out.println("testing 1 en Prueba Adicional Para ser usada por POM.XML");
	}

	@Test
	void test2() {
		System.out.println("testing 2 en Prueba Adicional Para ser usada por POM.XML\"");
	}

	@Test
	void test3() {
		System.out.println("testing 3 en Prueba Adicional Para ser usada por POM.XML\"");

}}
