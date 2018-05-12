package model;

import java.util.Objects;

public class YouTubeVideo {
    String title;
    String url;
    String publisher;
    String length;

    public YouTubeVideo() {
    }

    public YouTubeVideo(String title, String url, String publisher, String length) {
        this.title = title;
        this.url = url;
        this.publisher = publisher;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YouTubeVideo that = (YouTubeVideo) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(url, that.url) &&
                Objects.equals(publisher, that.publisher) &&
                Objects.equals(length, that.length);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, url, publisher, length);
    }

    @Override
    public String toString() {
        return title + "(" +
                ", url='" + url + '\'' +
                ", publisher='" + publisher + '\'' +
                ", length='" + length + '\'' +
                ')';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
