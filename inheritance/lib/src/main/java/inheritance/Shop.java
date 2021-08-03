package inheritance;

import java.util.ArrayList;

public class Shop{
    private String name;
    private String description;
    private int dollarSignsNum;
    private double starsNum;
    private double counter=0;
    private ArrayList<Review> reviews= new ArrayList<Review>();
    public Shop(String name , String description , int dollarSignsNum) {
        this.name=name;
        this.description=description;
        this.dollarSignsNum=dollarSignsNum;

    }
    public void shopReview(String author  , String body ,  double starsNum){
        Review newReview = new Review(author  , body , starsNum);
        this.reviews.add(newReview);
        this.counter+= newReview.getStars();
        this.starsNum= this.counter/ this.reviews.size();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getNumberOfDollarSigns() {
        return String.valueOf(dollarSignsNum);
    }

    public void setNumberOfDollarSigns(int dollarSignsNum) {
        this.dollarSignsNum = dollarSignsNum;
    }
    @Override
    public String toString() {
        return "Shop" +""+
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", starsNum=" + starsNum +
                ", dollarSignsNum=" + dollarSignsNum +
                ", Reviews=" + reviews +
                " ";
    }
}