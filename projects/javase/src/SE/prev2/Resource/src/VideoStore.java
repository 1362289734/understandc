import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    List<Video> videos = new ArrayList<>();
    public static final String PATH = PropUtil.getPath();
//    private static final String PATH=;


//    Video[] videos = new Video[10];
//    int videoCount = 0;

    void store() {
        File file = new File(PATH);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()){
                parentFile.mkdirs();
            }
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(videos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Video addVideo(String title) {
        Video video = new Video(title);
        videos.add(video);
        store();
        return video;
    }

    boolean checkOut(String title) {
        Video one = findVideo(title);
        if (one == null) {
            return false;
        }

        return one.setRentStatus(true);
    }

    boolean returnVideo(String title) {
        Video one = findVideo(title);
        if (one == null) {
            return false;
        }

        return one.setRentStatus(false);
    }

    boolean receiveRating(String title, int rating) {
        if (rating < 0 || rating > 5) {
            return false;
        }
        Video one = findVideo(title);
        if (one == null) {
            return false;
        }

        one.rating(rating);
        return true;
    }

    private Video findVideo(String title) {
        for (Video video : videos) {
            if (video.title.equals(title)) {
                return video;
            }
        }
        return null;
    }

    void listInventory() {
        for (int i = 0; i < videos.size(); i++) {
            Video video = videos.get(i);
            System.out.printf("片名:%s\t\t评分:%.1f\t是否借出:%s\n", video.title, video.rating, video.isRent ? "是" : "否");
        }
    }


    public void load() {
        File file = new File(PATH);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH));) {
            Object o = objectInputStream.readObject();
            videos = (List<Video>) o;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
