package inheritance;
public class Review{
    private String author;
    private String body;
    double starsNum ;
    public Review( String author ,  double starsNum){
        this.author=author;
        setStars(starsNum);

    }
    public double getStars() {
        return starsNum;
    }

    public void setStars(double stars) {
        if (stars > 5) {
            this.starsNum=5;
        } else if (stars < 0) {
            this.starsNum= 0;
        } else {
            this.starsNum= stars;
        }

    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return "author='" + author + '\'' +
                ", stars=" + starsNum +
                " ";
    }
}