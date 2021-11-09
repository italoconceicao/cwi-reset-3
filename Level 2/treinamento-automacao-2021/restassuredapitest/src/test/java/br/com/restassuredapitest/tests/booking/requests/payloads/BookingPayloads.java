package br.com.restassuredapitest.tests.booking.requests.payloads;

import org.json.JSONException;
import org.json.JSONObject;

public class BookingPayloads {

    public JSONObject payloadValidBooking() throws JSONException {
        JSONObject payload = new JSONObject();
        JSONObject bookingDates = new JSONObject();

            bookingDates.put("checkin","2018-01-01");
            bookingDates.put("checkout","2020-01-01");

            payload.put("firstname", "James");
            payload.put("lastname", "Red");
            payload.put("totalprice", 8713);
            payload.put("depositpaid", true);
            payload.put("bookingdates", bookingDates);
            payload.put("additionalneeds", "Lunch");

            return payload;
    }

    public JSONObject payloadCreateBooking() throws JSONException {
        JSONObject payload = new JSONObject();
        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin","2019-02-03");
        bookingDates.put("checkout","2020-07-06");

        payload.put("firstname", "Jim");
        payload.put("lastname", "Beluschi");
        payload.put("totalprice", 1999);
        payload.put("depositpaid", false);
        payload.put("bookingdates", bookingDates);
        payload.put("additionalneeds", "Brunch");

        return payload;
    }
}
