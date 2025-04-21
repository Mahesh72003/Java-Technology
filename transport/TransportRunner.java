package com.xworkz.transport;

import com.xworkz.transport.train.Train;
import com.xworkz.transport.transport.Transport;

public class TransportRunner {
    public static void main(String[] args) {


        Transport transport = new Transport();
        transport.validateTransportDetails();
        transport.transportType();
        transport.fuelType();
        transport.capacity();
        transport.speed();


        Train train = new Train();
        train.validateTransportDetails();
        train.trainType();
        train.numberOfCarriages();
        train.trackType();
        train.ticketBooking();


        Transport polymorphicTransport = new Train();
        polymorphicTransport.validateTransportDetails();
        polymorphicTransport.transportType();
        polymorphicTransport.fuelType();
        polymorphicTransport.capacity();
        polymorphicTransport.speed();
    }
}
