package Utils;

import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Annotations {

    ExtentManager extent;

    @BeforeTest
    public void beforeTest() {
        extent.setupExtent();
        System.out.println("This is before test");
    }



    @AfterTest
    public void afterTest(){
        System.out.println("This is after test");
    }
}
