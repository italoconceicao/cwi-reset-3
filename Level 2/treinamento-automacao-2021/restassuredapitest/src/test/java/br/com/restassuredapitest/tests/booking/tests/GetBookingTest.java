package br.com.restassuredapitest.tests.booking.tests;

import br.com.restassuredapitest.base.BaseTest;
import br.com.restassuredapitest.runners.AcceptanceTests;
import br.com.restassuredapitest.runners.AllTests;
import br.com.restassuredapitest.suites.ContractTests;
import br.com.restassuredapitest.tests.booking.requests.GetBookingRequest;
import br.com.restassuredapitest.utils.Utils;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;

public class GetBookingTest extends BaseTest {

    GetBookingRequest getBookingRequest = new GetBookingRequest();

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaListagemDeIdsDasReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaIdDaReserva(){
        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");
        getBookingRequest.aBookingIdReturn(primeiroId)
                .then()
                .statusCode(200);

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroFirstname() {
        getBookingRequest.returnFiltroFirstname()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroLastname() {
        getBookingRequest.returnFiltroLastname()
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroCheckin() {
        getBookingRequest.returnFiltroCheckin()
                .then()
                .statusCode(200);
    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroCheckout() {
        getBookingRequest.returnFiltroCheckout()
                .then()
                .statusCode(200);

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroCheckoutECheckout() {
        getBookingRequest.returnFiltroCheckoutECheckout()
                .then()
                .statusCode(200);

    }

    @Test
    @Category({AllTests.class, AcceptanceTests.class})
    public void validaFiltroNameECheckinECheckout() {
        getBookingRequest.returnFiltroNameECheckinECheckout()
                .then()
                .log().all()
                .statusCode(200);

    }

    @Test
    @Category({AllTests.class, ContractTests.class})
    public void validaSchemaDaListagemDeReservas(){
        getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "bookings"))));

    }

    @Test
    @Category({AllTests.class, ContractTests.class})
    public void validaSchemaDeIdDeReserva() {

        int primeiroId = getBookingRequest.bookingReturnIds()
                .then()
                .statusCode(200)
                .extract()
                .path("[0].bookingid");

        getBookingRequest.aBookingIdReturn(primeiroId)
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("booking", "bookingId"))));

    }
}
