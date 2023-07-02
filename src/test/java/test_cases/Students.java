package test_cases;

import base.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static utils.JsonParser.getJsonFormattedValue;
import static utils.JsonParser.getJsonValue;


public class Students extends BaseClass {
    // given() - all input details: header, body
    // when() - submit api: get, put, post, patch, delete
    // then() - validate the response

    Response create_response;

    @Test
    public void testCreateStudent() {
        String create_student_payload = getJsonFormattedValue("body_data", "create_student1");
        create_response = given().body(create_student_payload)
                .header("Content-Type", "application/json")
                .when().post("api/studentsDetails")
                .then().statusCode(201).body("first_name", equalTo("New"))
                .log().all().extract().response();

        Assert.assertEquals(create_response.getStatusCode(), 201);
        Assert.assertEquals(getJsonValue(create_response.getBody().asString(), "first_name"), "New");
    }


    @Test
    public void testGetAllStudent() {
        String student_id = getJsonValue(create_response.getBody().asString(), "id");
        when().get("api/studentsDetails/" + student_id).then().statusCode(200).log().all();
    }


}
