import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on star here");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
		System.out.println("on successfull here");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on failure here");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on skiped here");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on Failed here");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("on Start here");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
