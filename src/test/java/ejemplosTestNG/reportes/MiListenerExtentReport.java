package ejemplosTestNG.reportes;

import java.io.UnsupportedEncodingException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MiListenerExtentReport implements ITestListener {

	// Ver funcionamiento de Listener en ejemplosTestNG.listeners

	public ExtentSparkReporter sparkReporter; // Interfaz de usuario del reporte
	public ExtentReports extent; // Contiene informacion comun del reporte
	public ExtentTest test; // Contiene los datos de los casos de prueba en el informe y actualiza el estado
							// de los metodos

	public void onStart(ITestContext context) {

		// Especifica la ruta donde se guarda el reporte
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/miReporte.html");
		// Crear el folder dentro del proyecto
		sparkReporter.config().setDocumentTitle("Reporte de Automatizacion"); // Titulo del reporte
		sparkReporter.config().setReportName("Pruebas funcionales"); // Nombre del reporte
		sparkReporter.config().setTheme(Theme.DARK); // Tema oscuro o standard

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		// Se puede enviar cualquier informacion en forma de Par/valor
		extent.setSystemInfo("Nombre Computadora", "LocalHost");
		extent.setSystemInfo("Ambiente", "QA");
		extent.setSystemInfo("Nombre Tester", "Juan Carlos");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Navegadores", "Chrome, Edge");
		try {
			extent.setGherkinDialect("WHEN");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // Una nueva entrada al reporte
		// Consultar los metodos del objeto result para saber que se puede poner
		test.log(Status.PASS, "La prueba: " + result.getName() + "PASA"); // Actualoiza el status

	}

	public void onTestFailure(ITestResult result) {

		test = extent.createTest(result.getName()); // Una nueva entrada al reporte
		// Consultar los metodos del objeto result para saber que se puede poner
		test.log(Status.FAIL, "La prueba: " + result.getName() + "FALLA");
		test.log(Status.FAIL, "La causa es : " + result.getThrowable());

	}

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "La prueba que fue SKIPPED es:" + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
