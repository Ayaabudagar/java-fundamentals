package inheritance;

import java.util.ArrayList;

public class Shop implements Reviews {
    private String name;
    private String description;
    private int dollarSignsNum;
    private ArrayList<Review> shopReviews= new ArrayList<Review>();

    public Shop(String name, String description, int dollarSignsNum) {
        this.name = name;
        this.description = description;
        this.dollarSignsNum = dollarSignsNum;
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

    public int getDollarSignsNum() {
        return dollarSignsNum;
    }

    public void setDollarSignsNum(int dollarSignsNum) {
        this.dollarSignsNum = dollarSignsNum;
    }

    public ArrayList<Review> getShopReviews() {
        return shopReviews;
    }

    public void setShopReviews(ArrayList<Review> shopReviews) {
        this.shopReviews = shopReviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSignsNum=" + dollarSignsNum +
                ", shopReviews=" + shopReviews +
                '}';
    }

    @Override
    public void addReview(Review review) {
        shopReviews.add(review);
    }
}
