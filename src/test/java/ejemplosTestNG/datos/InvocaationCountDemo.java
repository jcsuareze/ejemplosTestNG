package ejemplosTestNG.datos;

import org.testng.annotations.Test;

public class InvocaationCountDemo {
	
	@Test(invocationCount = 10)
	void test() {
		
		System.out.println("Testing...");
	}

}
