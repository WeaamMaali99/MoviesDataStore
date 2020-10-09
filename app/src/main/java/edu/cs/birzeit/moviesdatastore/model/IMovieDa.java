package edu.cs.birzeit.moviesdatastore.model;

import java.util.List;

public interface IMovieDa {
    List<Movies> getMovies(String titleMovies);
    String[] getTitleMovies();
}
