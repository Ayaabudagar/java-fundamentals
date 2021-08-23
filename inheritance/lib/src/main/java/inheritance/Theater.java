package inheritance;

import java.util.ArrayList;

public class Theater  implements Reviews {
    private String name;
    private ArrayList<String> movies=new ArrayList<String>();
    private ArrayList <Review> moviesReview=new ArrayList<>();
    private String movieName;


    public Theater(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public ArrayList<Review> getMoviesReview() {
        return moviesReview;
    }

    public void setMoviesReview(ArrayList<Review> moviesReview) {
        this.moviesReview = moviesReview;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", moviesReview=" + moviesReview +
                '}';
    }



    @Override
    public void addReview(Review review) {
        moviesReview.add(review);
    }
}

