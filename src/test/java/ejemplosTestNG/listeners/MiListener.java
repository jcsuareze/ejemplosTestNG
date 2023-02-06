package ejemplosTestNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener es el mas popular
public class MiListener implements ITestListener {

	/**** Todos los metodos abstractos de la Interface ITestListener **
	 * Se debe especificar el LISTENER en el archivo XML   ***/

	public void onTestStart(ITestResult result) {

		System.out.println("Prueba comienza");
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Prueba pasa");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Prueba falla");
	}

	public void onTestSkipped(ITestResult result) {

	}

	// Este metodo recibe diferentes argumentos
	public void onFinish(ITestContext context) {

		System.out.println("Prueba finaliza");
		System.out.println("Direccion user.dir: "+ System.getProperty("user.dir"));
	}

}
