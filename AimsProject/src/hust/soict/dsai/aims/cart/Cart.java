package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int index = 0;
    private hust.soict.dsai.aims.disc.DigitalVideoDisc itemsOrdered[] = new hust.soict.dsai.aims.disc.DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc disc){
        if (this.index == MAX_NUMBERS_ORDERED - 1){
            System.out.println("The cart is almost full");
            return;
        } else {
            itemsOrdered[this.index] = disc;
            this.index++;
            System.out.println("The disc has been added");
        }
    }
    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc[] dvdList){
        if (itemsOrdered.length + dvdList.length >= MAX_NUMBERS_ORDERED){
            System.out.println("Cannot add because there's no space");
        } else {
            for (hust.soict.dsai.aims.disc.DigitalVideoDisc disc : dvdList){
                this.addDigitalVideoDisc(disc);
            }
        }
    }

    public void addDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc dvd1, hust.soict.dsai.aims.disc.DigitalVideoDisc dvd2) {
        if (itemsOrdered.length <= MAX_NUMBERS_ORDERED - 2) {
            System.out.println("Cannot add because there's no space");
        } else {
            this.addDigitalVideoDisc(dvd1);
            this.addDigitalVideoDisc(dvd2);
        }
    }

    public void removeDigitalVideoDisc(hust.soict.dsai.aims.disc.DigitalVideoDisc disc){
        if (itemsOrdered.length == 0){
            System.out.println("The cart is empty");
            return;
        } else {
            int i;
            for (i = 0; i < this.index; i++){
                if (itemsOrdered[i].equals(disc)){
                    break;
                }
            }
            for (int j = i; j < index-1; i++){
                itemsOrdered[i] = itemsOrdered[i+1];
            }
            this.index--;
        }
    }

    public float totalCost(){
        float sum = 0;
        for (int i = 0; i < this.index; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}