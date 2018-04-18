package testnglisterners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testng implements ITestListener, IInvokedMethodListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		
	}

	
	
	
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation");
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
		System.out.println("afterInvocation");
	}

	
	
}
