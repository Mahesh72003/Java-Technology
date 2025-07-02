package com.xworkz.trainee.exception;

public class TraineeAddressNotFoundException extends  RuntimeException {
    public TraineeAddressNotFoundException(String TraineeAddress) {
        super(TraineeAddress);
    }
}
