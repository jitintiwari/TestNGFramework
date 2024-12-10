package Utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name="sum")
    public Object[][] testDataForSum(){

        return new Object[][]{
                new Object[] { 5, 6 },
                new Object[] {22, 45 }
        };
    }

    @DataProvider(name="multiply")
    public Object[][] testDataForSubtraction(){

        return new Object[][]{
                new Object[] { 23, 6 },
                new Object[] {22, 0 }
        };
    }
}
