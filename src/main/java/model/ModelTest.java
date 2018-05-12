package model;

public class ModelTest {
    public static void main(String[] args) {
        YouTubeVideo video = new YouTubeVideo();
        video.setPublisher("GoOgLe");

        System.out.println(video);

        YouTubeVideo video1 = new YouTubeVideo("a","b","c","d");
        System.out.println(video1);
    }
}
