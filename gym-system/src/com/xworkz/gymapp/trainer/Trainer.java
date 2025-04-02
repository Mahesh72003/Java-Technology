package com.xworkz.gymapp.trainer;
import com.xworkz.gymapp.member.Member;
public class Trainer
{
    public int trainerId;
    public String trainerName;
    public String specialization;
    public String[] classesTaught;
    public Member[] members;

    public void displayTrainerDetails()
    {
        System.out.println("Trainer ID: " + trainerId);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Specialization: " + specialization);
        System.out.print("Classes Taught: ");
            for (String gymClass : classesTaught)
            {
                System.out.print(gymClass + " ");
            }
        System.out.println("Members in the Gym: ");
            for (Member member : members)
            {
                member.displayMemberDetails();
            }
    }
}
