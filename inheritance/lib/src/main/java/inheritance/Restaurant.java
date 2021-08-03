package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Restaurant{
    private String name;

    private double starsNum;
    private double priceCategory;
    private ArrayList<Review> reviews= new ArrayList<Review>();
    private double counter=0;
    public Restaurant(String name, double priceCategory ){
        this.name=name;
        this.priceCategory=priceCategory;
    }
        public void addReview(String author ,String body, double starsNum){
            Review newReview = new Review(author ,body, starsNum);
            this.reviews.add (newReview);
            this.counter = this.counter+newReview.getStars();
            this.starsNum=this.counter/this.reviews.size();

    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getStars() {
        return starsNum;
    }

    public void setStars(double stars) {
        this.starsNum = starsNum;
    }
    public double getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(double priceCategory) {
        this.priceCategory = priceCategory;
    }
    @Override
    public String toString() {
        return "Restaurant" +" "+
                "name='" + name + '\'' +
                ", priceCategory=" + priceCategory +"$" +
                ", stars=" + starsNum +
                ", reviews=" + reviews
                ;
    }


}
