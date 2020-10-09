package edu.cs.birzeit.moviesdatastore.model;

import java.util.List;

public interface IMovieDa {
    public List<Movies> getMovies(String titleMovies,String yearMov,String  generMove);
    String[] getTitleMovies();
     String[] getYearovies();
    String[] getGenreovies();
}
