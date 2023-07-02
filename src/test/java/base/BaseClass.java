package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;


public class BaseClass {

    @BeforeSuite
    public void setup() {
        RestAssured.baseURI = "https://thetestingworldapi.com";

    }



}
