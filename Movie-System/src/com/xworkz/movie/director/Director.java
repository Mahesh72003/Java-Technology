package com.xworkz.movie.director;
public class Director
{
    public int directorId;
    public String directorName;
    public String actors[];
    public void displayDirectorInfo()
    {
        System.out.println("Director ID: " + directorId);
        System.out.println("Director Name: " + directorName);
        System.out.println("Actors:");
        for (String actor : actors)
        {
            System.out.println(actor);
        }
    }
}