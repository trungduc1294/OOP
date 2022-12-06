package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public Track() {

    }
    public Track(String title,int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
