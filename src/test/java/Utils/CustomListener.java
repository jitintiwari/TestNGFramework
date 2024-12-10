package Utils;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends ExtentManager implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("on Test Start - " + iTestResult.getName());
        extentReports.createTest(iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("on Test Success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("on Test Failure");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("on Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("on Test Failed But With in Success Percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("on Start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("on Finish");
        extentReports.flush();
    }
}
