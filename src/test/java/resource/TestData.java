package resource;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "login_data")
    public static Object[][] loginData(){
        Object [][] data = {
                {"user1", "!@124"},
                {"user1", ""},
                {"", "!@124"},
                {"", ""},
        };
        return data;
    }

}
