package br.com.restassuredapitest.tests.ping.tests;

import br.com.restassuredapitest.base.BaseTest;
import br.com.restassuredapitest.runners.AllTests;
import br.com.restassuredapitest.tests.ping.requests.GetPingRequest;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class GetPingTest extends BaseTest {

    GetPingRequest getpingrequest = new GetPingRequest();


    @Test
    @Category(AllTests.class)
    public void validaApiOnline() {

        getpingrequest.pingReturnApi()
                .then()
                .statusCode(201);

    }


}

