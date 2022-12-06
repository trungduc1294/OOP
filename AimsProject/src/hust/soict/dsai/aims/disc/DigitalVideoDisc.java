package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Media;

public class DigitalVideoDisc extends Disc {



    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost,director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost,director,length);

    }
}