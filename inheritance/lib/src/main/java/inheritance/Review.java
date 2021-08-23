package inheritance;
public class Review{
    private String author;
    private String body;
    double starsNum ;
    private String movie;
    public Review( String author ,  double starsNum,String body){
        this.body=body;
        this.author=author;
        if (starsNum > 5) {
            this.starsNum=5;
        } else if (starsNum < 0) {
            this.starsNum= 0;
        } else {
            this.starsNum= starsNum;
        }


    }



    public Review(String author, double starsNum,String body,String movie) {
        if (starsNum > 5) {
            this.starsNum=5;
        } else if (starsNum < 0) {
            this.starsNum= 0;
        } else {
            this.starsNum= starsNum;
        }
        this.author=author;
        this.body=body;
        this.movie=movie;

    }



    public double getStarsNum() {
        return starsNum;
    }

    public void setStarsNum(double starsNum) {
        this.starsNum = starsNum;

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

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", starsNum=" + starsNum +
                ", movie='" + movie + '\'' +
                '}';
    }
}