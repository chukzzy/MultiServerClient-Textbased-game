package networkingTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestThreePlayersTestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestThreePlayersTestSuite.class);
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
			System.out.println("Was it a successful test: " + result.wasSuccessful());
	   }

}
