package com.xworkz.trainee.exception;

public class TraineeNameNotFoundException extends RuntimeException{

    public TraineeNameNotFoundException(String traineeNameNotFound) {
        super(traineeNameNotFound);
    }
}
