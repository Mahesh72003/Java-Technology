package com.xworkz.trainee.runner;

import com.xworkz.trainee.dto.TraineeDto;
import com.xworkz.trainee.exception.TraineeAddressNotFoundException;
import com.xworkz.trainee.exception.TraineeNameNotFoundException;

public class TraineeRunner {
    public static void main(String[] args) {

        GetTraineeName(3);
        GetTraineeAddress("JPNager");

    }

    static String GetTraineeName(int id){
        String traineeName=null;

        TraineeDto dto = new TraineeDto();
        dto.setTraineeId(1);
        dto.setTraineeName("Mahesh");
        dto.setTraineeAddress("Bangalore");

        try {
            if (dto.getTraineeId() == id)
            {
                System.out.println("the name of the Trainee is "+dto.getTraineeName());
            }
            else
            {
                TraineeNameNotFoundException traineeNameNotFoundException = new TraineeNameNotFoundException("Trainee Id "+id+" did not found");
                throw  traineeNameNotFoundException;
            }
        }
        catch (TraineeNameNotFoundException tnne)
        {
            tnne.printStackTrace();
        }

        return traineeName;
    }
    static String GetTraineeAddress(String Address){
        String address = null;
        TraineeDto dto = new TraineeDto();
        dto.setTraineeId(1);
        dto.setTraineeName("Mahesh");
        dto.setTraineeAddress("Bangalore");
        try {
            if (dto.getTraineeAddress().equals(Address))
            {
                System.out.println("the Trainee Name is "+dto.getTraineeName());
            }
            else
            {
                TraineeAddressNotFoundException traineeAddressNotFoundException = new TraineeAddressNotFoundException("Trainee Address "+Address+" did not found");
                throw traineeAddressNotFoundException;
            }
        }
        catch (TraineeAddressNotFoundException tane)
        {
            tane.printStackTrace();
        }

        return address;
    }

}
