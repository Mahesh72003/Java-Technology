package com.xworkz.gymapp;

import com.xworkz.gymapp.trainer.Trainer;
import com.xworkz.gymapp.member.Member;
import com.xworkz.gymapp.gym.Gym;

public class GymRunner {
    public static void main(String[] args) {


        String classesTaughtbyArvind[] = {"Advanced Weight Training", "Bodybuilding"};
        String classesTaughtbyPriya[] = {"Morning Yoga", "Power Yoga"};


        String enrolledClassesbyAarti[] = {"Advanced Weight Training", "Morning Yoga"};
        String enrolledClassesbyRajesh[] = {"Bodybuilding"};

        // Create members
        Member[] members = new Member[2];

        Member member1 = new Member();
        member1.memberId = 1001;
        member1.memberName = "Aarti Reddy";
        member1.membershipType = "Premium";
        member1.enrolledClasses = enrolledClassesbyAarti;

        Member member2 = new Member();
        member2.memberId = 1002;
        member2.memberName = "Rajesh Kumar";
        member2.membershipType = "Regular";
        member2.enrolledClasses = enrolledClassesbyRajesh;

        members[0] = member1;
        members[1] = member2;

        // Create trainers and assign classes and members
        Trainer[] trainers = new Trainer[2];

        Trainer trainer1 = new Trainer();
        trainer1.trainerId = 101;
        trainer1.trainerName = "Arvind Kumar";
        trainer1.specialization = "Weight Training";
        trainer1.classesTaught = classesTaughtbyArvind;
        trainer1.members = members;

        Trainer trainer2 = new Trainer();
        trainer2.trainerId = 102;
        trainer2.trainerName = "Priya Sharma";
        trainer2.specialization = "Yoga";
        trainer2.classesTaught = classesTaughtbyPriya;
        trainer2.members = members;

        trainers[0] = trainer1;
        trainers[1] = trainer2;

        Gym gym = new Gym();
        gym.gymId = 1;
        gym.gymName = "Bangalore Fit Gym";
        gym.gymLocation = "Koramangala, Bengaluru";
        gym.trainers = trainers;
        gym.displayGymDetails();
    }
}
