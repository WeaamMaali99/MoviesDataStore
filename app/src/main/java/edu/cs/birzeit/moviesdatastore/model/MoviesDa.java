package edu.cs.birzeit.moviesdatastore.model;

import java.util.ArrayList;
import java.util.List;

class MoviesDa implements IMovieDa {
    private ArrayList<Movies> movies = new ArrayList<>();

     public MoviesDa() {

         movies.add(new Movies("The Lion King",1994,"Animation"));
         movies.add(new Movies("Wonder Woman",2017,"Action"));
        movies.add(new Movies("Halloween",1978,"Horror"));
        movies.add(new Movies("Some Like it Hot",1959,"Comedy"));

     }
     public List<Movies> getMovies(String titleMovies){
         ArrayList<Movies> data= new ArrayList<>();
         for (Movies mov: movies){
             if (mov.getTitle().equalsIgnoreCase(titleMovies))
             {
                 data.add(mov);
             }
         }
         return data;
     }
     @Override
         public String[] getTitleMovies(){
         String[] titles= new String[]{"The Lion King","Halloween","some Like it Hot","Wonder Woman"};
           return titles;
            }
 }
