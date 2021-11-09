package br.com.restassuredapitest.tests.booking.tests;

import br.com.restassuredapitest.base.BaseTest;
import br.com.restassuredapitest.runners.AcceptanceTests;
import br.com.restassuredapitest.runners.AllTests;
import br.com.restassuredapitest.runners.SecurityTests;
import br.com.restassuredapitest.tests.auth.requests.PostAuthRequest;
import br.com.restassuredapitest.tests.booking.requests.DeleteBookingRequest;
import br.com.restassuredapitest.tests.booking.requests.GetBookingRequest;
import org.json.JSONException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DeleteBookingTest extends BaseTest {
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    DeleteBookingRequest deleteBookingRequest = new DeleteBookingRequest();
    PostAuthRequest postAuthRequest = new PostAuthRequest();


    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validarExclusaoDeUmaReservaUtilizandoToken() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        deleteBookingRequest.deleteBooking(primeiroId, postAuthRequest.getToken())
                .then()
                .statusCode(201);
    }

    @Test
    @Category({AllTests.class})
    public void validarExclusaoDeUmaReservaInexistente() throws JSONException {

        deleteBookingRequest.delete999999Booking(postAuthRequest.getToken())
                .then()
                .statusCode(201);
    }

    @Test
    @Category({AllTests.class, SecurityTests.class})
    public void validarExclusaoDeUmaReservaSemToken() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        deleteBookingRequest.deleteBookingWithoutToken(primeiroId)
                .then()
                .statusCode(201);
    }

}
