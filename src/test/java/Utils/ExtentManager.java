package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports extentReports;
    public static void setupExtent() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("target/ExtentReport.html");
        extentReports = new ExtentReports();
        reporter.config().setReportName("calcConfig.Calculator Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Name", "TestNG Task");
        extentReports.setSystemInfo("Author", "Jitin");

    }
}
