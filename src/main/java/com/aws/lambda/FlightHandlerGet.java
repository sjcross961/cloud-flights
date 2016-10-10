package com.aws.lambda;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;

/**
 * @author Sam Cross u188166
 */
public class FlightHandlerGet {

    public Flight getFlight(String flightNumber, Context context) {
        Table table = FlightHandler.getTable("Flights");

        Item item = table.getItem("FlightNumber", flightNumber);

        return new Flight(item.get("FlightNumber").toString(),item.get("ArrivalLocation").toString(),item.get("DepartureLocation").toString());
    }
}
