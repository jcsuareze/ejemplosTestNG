package ejemplosTestNG.anotaciones;

import org.testng.annotations.Test;

public class Agrupamiento {

	
	/***El agrupamiento se ejecuta con archivo XML****/
	
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println(" Este es login por  email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println(" Este es login por  facebook");
			
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println(" Este es login por  twitter");
	}
	
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupbyemail()
	{
		System.out.println("Este es login por  email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("Este es login por  facebook");
	}
	
	@Test(priority=6,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("Este es login por  twitter");
	}
	
	@Test(priority=7, groups= {"sanity"})
	void pagoEnDolares()
	{
		System.out.println("Metodo pago En Dolares");
	}
	
	@Test(priority=8,groups= {"sanity","regression"})
	void pagoEnPesos()
	{
		System.out.println("Metodo pago en Pesos");
	}
	
	@Test(priority=9,groups= {"regression"})
	void DevolucionBanco()
	{
		System.out.println("Devolucion Banco");
	}
	
	
	
}
