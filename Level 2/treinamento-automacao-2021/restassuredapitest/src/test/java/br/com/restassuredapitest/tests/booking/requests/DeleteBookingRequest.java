package br.com.restassuredapitest.tests.booking.requests;

import io.restassured.response.Response;
import org.json.JSONException;


import static io.restassured.RestAssured.given;

public class DeleteBookingRequest {

    public Response deleteBooking(int id, String token) throws JSONException {

        return given()
                .header("Content-Type", "application/json")
                .header("Cookie", token)
                .when()
                .delete("booking/" + id);
    }
    public Response delete999999Booking(String token) throws JSONException {

        return given()
                .header("Content-Type", "application/json")
                .header("Cookie", token)
                .when()
                .delete("booking/999999");
    }

    public Response deleteBookingWithoutToken(int id) throws JSONException {

        return given()
                .header("Content-Type", "application/json")
                .when()
                .delete("booking/" + id);
    }

}
