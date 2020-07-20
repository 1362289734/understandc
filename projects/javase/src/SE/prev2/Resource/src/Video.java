import java.io.Serializable;

public class Video implements Serializable {
    String title;

    boolean isRent;

    double rating;
    int ratingTimes;

    public Video(String title){
        this.title = title;
    }



    void rating(int rate){
        double originRating = rating*ratingTimes;
        ratingTimes++;
        rating = (originRating+rate) / ratingTimes;

    }

    boolean setRentStatus(boolean status){
        if (status == isRent){
            return false;
        }
        isRent = status;
        return true;
    }


    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isRent=" + isRent +
                ", rating=" + rating +
                ", ratingTimes=" + ratingTimes +
                '}';
    }
}
