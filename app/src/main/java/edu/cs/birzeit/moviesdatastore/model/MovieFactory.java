package edu.cs.birzeit.moviesdatastore.model;

public class MovieFactory {
    public IMovieDa getModel(){
        return new MoviesDa();
    }
}
