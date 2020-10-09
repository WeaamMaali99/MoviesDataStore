package edu.cs.birzeit.moviesdatastore.model;

public class Movies {
    private String title;
    private String year;
    private String Genre;

    public Movies(String title, String year, String genre) {
        this.title = title;
        this.year = year;
        Genre = genre;
    }
public Movies(){

}
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
       this.Genre = Genre;
    }
}
