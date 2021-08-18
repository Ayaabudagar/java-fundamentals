package inheritance;

import java.util.ArrayList;

public class Theater extends Review {
    private String name;
    private ArrayList<String> reviews = new ArrayList<String>();
    private ArrayList<String> movies= new ArrayList<String>();
    public Theater(String haneen, String name){
        super(name);


    }

    public Theater(String grand) {
        super(grand);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addMovie(String name) {
        this.movies.add(name);
    }

    public void removeMovie(String name) {
        this.movies.remove(name);
    }
    public ArrayList<String> getReview() {
        return reviews;
    }

    public void setReview(ArrayList<Review> theaterReview) {
        reviews = reviews;
    }
    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + starsNum +
                ", movies="+ movies+
                ", reviews=" + reviews +
                '}';
    }
}