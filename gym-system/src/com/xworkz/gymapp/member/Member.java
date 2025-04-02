package com.xworkz.gymapp.member;
public class Member
{
    public int memberId;
    public String memberName;
    public String membershipType; // E.g., Regular, Premium, etc.
    public String[] enrolledClasses; // Gym classes the member is enrolled in

    public void displayMemberDetails()
    {
        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        for (String gymClass : enrolledClasses)
        {
                System.out.print(gymClass + " ");
        }
    }
}

