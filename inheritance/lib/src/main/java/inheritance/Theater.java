package inheritance;

import java.util.ArrayList;

public class Theater {
    private String name;
    private double starsNum;
    private double counter=0;
    private ArrayList<String> reviews = new ArrayList<String>();
    private ArrayList<String> movies=new ArrayList<String>();
    public Theater(String name , String movies){
        this.name= name;
        this.movies.add(movies);
    }
    public void addReview(String author  , String body , double starsNum ){
        String newRevew="";
        Review newReview = new Review(author  , body , starsNum);
        newRevew= newReview + "";
        this.reviews.add(newRevew);
        this.counter+= newReview.getStars();
        this.starsNum= this.counter/ this.reviews.size();
    }
    public  void addReview(String author  ,String body ,double starsNum,String movieName){

        Review newReview = new Review (author  , body , starsNum , movieName);
        String movieReview = newReview+newReview.getMovieName();
        this.reviews.add(movieReview);
        this.counter = this.counter+newReview.getStars();
        this.starsNum=this.counter/this.reviews.size();

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