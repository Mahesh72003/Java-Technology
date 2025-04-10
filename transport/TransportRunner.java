package com.xworkz.transport;

import com.xworkz.transport.train.Train;
import com.xworkz.transport.transport.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.validateTransportDetails();
        Train train = new Train();
        train.validateTransportDetails();
    }
}
