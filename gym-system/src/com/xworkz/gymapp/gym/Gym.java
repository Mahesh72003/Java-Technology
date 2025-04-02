package com.xworkz.gymapp.gym;
import com.xworkz.gymapp.trainer.Trainer;

public class Gym {
    public int gymId;
    public String gymName;
    public String gymLocation;
    public Trainer[] trainers;

    public void displayGymDetails()
    {
        System.out.println("the Gym ID is:  " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Gym Location: " + gymLocation);
        System.out.println("Trainers in the Gym: ");
        for (Trainer trainer : trainers) {
            trainer.displayTrainerDetails();
        }
    }
}
