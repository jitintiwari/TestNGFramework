package tests;

import Utils.DataProviderClass;
import calcConfig.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method - " + Thread.currentThread());
    }

    @Test(dataProvider = "sum", dataProviderClass = DataProviderClass.class)
    public void checkAdditionPositive(double x, double y){
        System.out.println("------check Addition Positive");
        double sum = calculator.sum(x, y);
        Assert.assertEquals(sum, Math.addExact((int) x, (int) y));
    }

    @Test
    public void checkAdditionNegative(){
        System.out.println("-----check Addition Negative");
        double difference = calculator.sum(11, -6);
        Assert.assertEquals(difference, Math.addExact(11, -6));
    }

    @Test
    public void checkDivision(){
        System.out.println("-----check Division");
        double division = calculator.div(333, 9);
        Assert.assertEquals(division, Math.floorDiv(333, 9));
    }

    @Test(expectedExceptions = {NumberFormatException.class})
    public void checkDivisionByZero(){
        System.out.println("-----check Division By Zero");
        double division = calculator.div(333, 0);
        Assert.assertEquals(division, Math.floorDiv(333, 0));
    }

    @Test(dataProvider = "multiply", dataProviderClass = DataProviderClass.class)
    public void checkMultiplication(long x, long y){
        System.out.println("-----check Multiplication");
        long multiplication = calculator.mult(x, y);
        Assert.assertEquals(multiplication, Math.multiplyExact(x, y));
    }

    @Test
    public void checkMultiplicationToZero(){
        System.out.println("-----check Multiplication To Zero");
        double multiplication = calculator.mult(56, 0);
        Assert.assertEquals(multiplication, 0);
    }

    @Test(groups = {"complexMaths"})
    public void checkPower(){
        System.out.println("-----check Power");
        double result = calculator.pow(8, 2);
        Assert.assertEquals(result, Math.pow(8, 2));
    }

    @Test(groups = {"complexMaths"})
    public void checkSquareRoot(){
        System.out.println("-----check Square Root");
        double sqrt = calculator.sqrt(64);
        Assert.assertEquals(sqrt, Math.sqrt(64));
    }

    @Test
    public void checkSinCos(){
        System.out.println("-----check Sin Cos");
        double sin45 = calculator.sin(45);
        double cos45 = calculator.cos(45);
        Assert.assertEquals(sin45, cos45);
    }

    @Test
    public void checkIsNegativeFunctionality(){
        System.out.println("-----check Is Negative Functionality");
        boolean isNegative = calculator.isNegative(-30);
        Assert.assertTrue(isNegative);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is after method");
    }


}
