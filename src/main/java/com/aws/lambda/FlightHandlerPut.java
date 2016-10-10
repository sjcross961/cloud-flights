package com.aws.lambda;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * @author Sam Cross u188166
 */
public class FlightHandlerPut {

    public void putFlight(Flight flight, Context context) {
        Table table = FlightHandler.getTable("Flights");

        Item item = new Item()
                .withPrimaryKey("FlightNumber", flight.getFlightNumber())
                .with("ArrivalLocation", flight.getArrLocation())
                .with("DepartureLocation", flight.getDepLocation());

        PutItemOutcome outcome = table.putItem(item);
    }
}
