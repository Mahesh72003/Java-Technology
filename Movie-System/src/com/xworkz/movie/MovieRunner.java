package com.xworkz.movie;
import com.xworkz.movie.movie.Movie;
import com.xworkz.movie.productionhouse.ProductionHouse;
import com.xworkz.movie.director.Director;
public class MovieRunner
{
    public static void main(String[] args)
    {

        Movie movie = new Movie();
        movie.movieId = 1;
        movie.movieName = "Epic Saga";
        ProductionHouse productionHouses[] = new ProductionHouse[2];
        ProductionHouse productionHouse1 = new ProductionHouse();
        productionHouse1.productionHouseId = 101;
        productionHouse1.productionHouseName = "DreamWorks";

        Director directors1[] = new Director[2];
        Director director1 = new Director();
        director1.directorId = 1;
        director1.directorName = "Steven";
        String actors1[] = {"Tom Cruise", "Julia Roberts", "Brad Pitt"};
        director1.actors = actors1;

        Director director2 = new Director();
        director2.directorId = 2;
        director2.directorName = "Christopher";
        String actors2[] = {"Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"};
        director2.actors = actors2;
        directors1[0] = director1;
        directors1[1] = director2;
        productionHouse1.directors = directors1;


        productionHouses[0] = productionHouse1;
        movie.productionHouses = productionHouses;
        movie.displayMovieInfo();
    }
}