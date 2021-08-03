package inheritance;
public class Review{
    private String author;
    private String body;
    double starsNum ;
    private String movieName;
    public Review( String author ,  String body , double starsNum){
        if (starsNum > 5) {
            this.starsNum=5;
        } else if (starsNum < 0) {
            this.starsNum= 0;
        } else {
            this.starsNum= starsNum;
        }
        this.author=author;
        setStars(starsNum);
        this.body=body;

    }
    public double getStars() {
        return starsNum;
    }

    public void setStars( double starsNum) {
        this.starsNum = starsNum;
    }


         public Review( String author , String body, double starsNum,String movieName){
            if (starsNum > 5) {
                this.starsNum=5;
            } else if (starsNum < 0) {
                this.starsNum= 0;
            } else {
                this.starsNum= starsNum;
            }
            this.author=author;
            setStars(starsNum);
            this.body=body;
            this.movieName=movieName;

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
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    @Override
    public String toString() {
        return "Review" +" "+
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + starsNum +
                " ";
    }
}