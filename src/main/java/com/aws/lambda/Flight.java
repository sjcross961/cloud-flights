package com.aws.lambda;

/**
 * @author Sam Cross u188166
 */
public class Flight {

    public Flight(String flightNumber, String arrLocation, String depLocation) {
        this.flightNumber = flightNumber;
        this.depLocation = depLocation;
        this.arrLocation = arrLocation;
    }

    public Flight() {
    }

    private String flightNumber;
    private String depLocation;
    private String arrLocation;

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getArrLocation() {
        return arrLocation;
    }

    public void setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
