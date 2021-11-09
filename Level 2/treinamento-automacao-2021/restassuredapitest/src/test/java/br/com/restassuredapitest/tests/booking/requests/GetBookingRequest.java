package br.com.restassuredapitest.tests.booking.requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetBookingRequest {

    public Response bookingReturnIds() {
        return given()
                .when()
                .get("booking");
    }

    public Response aBookingIdReturn(int id) {
        return given()
                .header("Accept","application/json")
                .when()
                .get("booking/" + id);
    }

    public Response returnFiltroFirstname() {
        return given()
                .when()
                .get("booking?firstname=Jim");
    }

    public Response returnFiltroLastname() {
        return given()
                .when()
                .get("booking?lastname=Brown");
    }

    public Response returnFiltroCheckin() {
        return given()
                .when()
                .get("booking?bookingdates.checkin=2018-01-01");
    }

    public Response returnFiltroCheckout() {
        return given()
                .when()
                .get("booking?bookingdates.checkout=2019-01-01");
    }

    public Response returnFiltroCheckoutECheckout() {
        return given()
                .when()
                .get("booking?checkout=2018-01-01&checkout=2019-01-01");
    }

    public Response returnFiltroNameECheckinECheckout() {
        return given()
                .when()
                .get("booking?name=Jim&checkin=2018-01-01&checkout=2019-01-01");
    }

}
