package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public String getArtist() {
        return this.artist;
    }
    public CompactDisc() {

    }

    public CompactDisc(int id,String title,String category,float cost)  {
        super(id,title,category,cost);
    }
    public CompactDisc(int id,String title,String category,float cost,String artist) {
        super(id,title,category,cost);
        this.artist = artist;
    }
    public void addTrack(Track t) {
        if (tracks.contains(t)) {
            System.out.println("Track exists");
        } else {
            tracks.add(t);
        }
    }
    @Override
    public String toString() {
        return "{CompactDisc: " +
                "id= "+getId()+
                ", title= " + getTitle() +
                ", category= " + getCategory() +
                ", cost= " + getCost() +
                ", artist= " + this.artist +
                ", tracks= " + tracks +
                "}";
    }

    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc(1,"hi","hi",3.6f,"Thai");
        System.out.println(cd);
        Track t = new Track("Duc dan",5);
        cd.addTrack(t);
        System.out.println(cd);
    }
}
