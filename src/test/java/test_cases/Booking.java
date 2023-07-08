package test_cases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static utils.CommonRequest.getAuthToken;
import static utils.JsonParser.getJsonFormattedValue;

public class Booking {

    String booking_id;


    @Test
    public void createBooking() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        String create_booking_payload = getJsonFormattedValue("booking_data", "create_booking_payload");
        Response create_booking_response = given().body(create_booking_payload)
                .header("Content-Type", "application/json")
                .when().post("/booking").then().log().all()
                .extract().response();

        booking_id = create_booking_response.jsonPath().getString("bookingid");
    }

    @Test
    public void updateBooking() {
        String update_booking_payload = getJsonFormattedValue("booking_data", "update_booking_payload");
        String cookie_value = "token=" + getAuthToken();

        Response update_booking_response = given().body(update_booking_payload)
                .header("Content-Type", "application/json").header("Cookie", cookie_value)
                .when().put("/booking/" + booking_id).then().log().all()
                .extract().response();
    }


}
