package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD One", "Category 1", "Director 1", 120, 10.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD Two", "Category 2", "Director 2", 90, 15.5f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("DVD Three", "Category 3", "Director 3", 100, 20.0f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost is: " + anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd2);

        System.out.println("Total cost after remove: " + anOrder.totalCost());
    }
}