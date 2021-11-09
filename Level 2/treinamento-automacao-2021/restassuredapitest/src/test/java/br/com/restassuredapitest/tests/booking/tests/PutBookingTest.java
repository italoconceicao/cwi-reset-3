package br.com.restassuredapitest.tests.booking.tests;

import br.com.restassuredapitest.base.BaseTest;
import br.com.restassuredapitest.runners.AcceptanceTests;
import br.com.restassuredapitest.runners.AllTests;
import br.com.restassuredapitest.runners.SecurityTests;
import br.com.restassuredapitest.tests.auth.requests.PostAuthRequest;
import br.com.restassuredapitest.tests.booking.requests.GetBookingRequest;
import br.com.restassuredapitest.tests.booking.requests.PutBookingRequest;
import org.json.JSONException;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class PutBookingTest extends BaseTest {
    PutBookingRequest putBookingRequest = new PutBookingRequest();
    GetBookingRequest getBookingRequest = new GetBookingRequest();
    PostAuthRequest postAuthRequest = new PostAuthRequest();


    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validarAlteracaoDeUmaReservaUtilizandoToken() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        putBookingRequest.updateBookingToken(primeiroId, postAuthRequest.getToken())
                .then()
                .statusCode(200);
    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validarAlteracaoDeUmaReservaUtilizandoBasic() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        putBookingRequest.updateBookingBasic(primeiroId)
                .then()
                .statusCode(200);
    }

    @Test
    @Category({AllTests.class, SecurityTests.class})
    public void validarAlteracaoDeUmaReservaSemToken() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        putBookingRequest.updateBookingWithoutToken(primeiroId)
                .then()
                .statusCode(200); //deve retornar (403)
    }

    @Test
    @Category({AllTests.class, SecurityTests.class})
    public void validarAlteracaoDeUmaReservaComTokenInvalido() throws JSONException {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        putBookingRequest.updateBookingInvalidToken(primeiroId)
                .then()
                .statusCode(200); //deve retornar (403)
    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validarAlteracaoDeUmaReservaInexistente() throws JSONException {

        putBookingRequest.update888888Booking(postAuthRequest.getToken())
                .then()
                .statusCode(200);

    }
}