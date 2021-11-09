package br.com.restassuredapitest.tests.booking.requests;

import br.com.restassuredapitest.tests.booking.requests.payloads.BookingPayloads;
import io.restassured.response.Response;
import org.json.JSONException;

import static io.restassured.RestAssured.given;

public class PostBookingRequest {

BookingPayloads bookingPayloads = new BookingPayloads();

    public Response createBooking(String token) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", token)
                .when()

                .body(bookingPayloads.payloadCreateBooking().toString())
                .post("booking/");

    }

    public Response createBookingWhitoutAccept(String token) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Cookie", token)
                .when()

                .body(bookingPayloads.payloadCreateBooking().toString())
                .post("booking/");

    }



}
