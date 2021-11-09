package br.com.restassuredapitest.tests.booking.tests;

import br.com.restassuredapitest.base.BaseTest;
import br.com.restassuredapitest.runners.AcceptanceTests;
import br.com.restassuredapitest.runners.AllTests;
import br.com.restassuredapitest.tests.auth.requests.PostAuthRequest;
import br.com.restassuredapitest.tests.booking.requests.PostBookingRequest;
import org.json.JSONException;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class PostBookingTest extends BaseTest {

    PostBookingRequest postBookingRequest = new PostBookingRequest();
    PostAuthRequest postAuthRequest = new PostAuthRequest();

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validarCriacaoReserva() throws JSONException {
                postBookingRequest.createBooking(postAuthRequest.getToken())
                        .then()
                        .statusCode(200);
    }

    @Test
    @Category({AllTests.class})
    public void validarCriacaoReservaSemAccept() throws JSONException {
        postBookingRequest.createBookingWhitoutAccept(postAuthRequest.getToken())
                .then()
                .statusCode(418);
    }

}
