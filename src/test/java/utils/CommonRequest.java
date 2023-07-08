package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utils.JsonParser.getJsonFormattedValue;

public class CommonRequest {

    public static String getAuthToken() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        String auth_payload = getJsonFormattedValue("auth_data", "auth1");
        Response auth_response = given().body(auth_payload)
                .header("Content-Type", "application/json")
                .when().post("/auth").then().extract().response();

        return auth_response.jsonPath().getString("token");
    }

}
