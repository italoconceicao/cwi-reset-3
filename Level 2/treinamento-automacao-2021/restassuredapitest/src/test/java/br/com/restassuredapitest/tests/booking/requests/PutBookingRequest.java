package br.com.restassuredapitest.tests.booking.requests;

import br.com.restassuredapitest.tests.booking.requests.payloads.BookingPayloads;
import io.restassured.response.Response;
import org.json.JSONException;

import static io.restassured.RestAssured.given;

public class PutBookingRequest {

    BookingPayloads bookingPayloads = new BookingPayloads();

    public Response updateBookingToken(int id, String token) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", token)
                .when()

                .body(bookingPayloads.payloadValidBooking().toString())
                .put("booking/" + id);
    }

    public Response updateBookingBasic(int id) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .when()

                .body(bookingPayloads.payloadCreateBooking().toString())
                .put("booking/" + id);
    }

    public Response updateBookingWithoutToken(int id) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()

                .body(bookingPayloads.payloadValidBooking().toString())
                .put("booking/" + id);
    }

    public Response updateBookingInvalidToken(int id) throws JSONException {

        return  given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "aaaaaaaaaaaaaaa")
                .when()

                .body(bookingPayloads.payloadValidBooking().toString())
                .put("booking/" + id);
    }

    public Response update888888Booking(String token) throws JSONException {

        return given()
                .header("Content-Type", "application/json")
                .header("Cookie", token)
                .when()
                .put("booking/888888");

    }
}
