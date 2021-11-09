package br.com.restassuredapitest.runners;


import br.com.restassuredapitest.tests.auth.tests.PostAuthTest;
import br.com.restassuredapitest.tests.booking.tests.DeleteBookingTest;
import br.com.restassuredapitest.tests.booking.tests.GetBookingTest;
import br.com.restassuredapitest.tests.booking.tests.PutBookingTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.restassuredapitest.runners.AcceptanceTests.class)
@Suite.SuiteClasses(
        {
                PutBookingTest.class,
                DeleteBookingTest.class,
                GetBookingTest.class

        })
public class AcceptanceTests {
}
