package com.xworkz.transport.train;

import com.xworkz.transport.transport.Transport;

public class Train extends Transport {

    @Override
    public void validateTransportDetails() {
        System.out.println("Train: A land-based transport system that runs on tracks, used to move passengers and goods.");
    }

    public void trainType() {
        System.out.println("This is a high-speed train designed for long-distance travel.");
    }

    public void numberOfCarriages() {
        System.out.println("This train has 10 carriages, including sleeper and dining compartments.");
    }

    public void trackType() {
        System.out.println("Trains run on either standard or high-speed rail tracks.");
    }

    public void ticketBooking() {
        System.out.println("Tickets for trains can be booked online or at the station.");
    }
}
