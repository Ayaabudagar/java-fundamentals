/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args){
        Restaurant newRestaurant = new Restaurant("aya",3);
        newRestaurant.addReview("heneen" ,"amazing", 7);

        System.out.println(newRestaurant);

        Shop shop = new Shop("aya","great",5);
        shop.shopReview("ahmad" , "test" , 3);
        System.out.println(shop);

        Theater theater =new Theater("haneen","dark");
        theater.addMovie("aya");
        theater.addReview("rana", "fantastic movie",5, "moon" );
        System.out.println(theater);
    }
}
