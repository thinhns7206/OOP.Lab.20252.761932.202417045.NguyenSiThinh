package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore++] = disc;
            System.out.println("Added to store.");
        } else {
            System.out.println("Store is full.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                // Thuật toán dồn mảng tương tự như trong Cart
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j+1];
                }
                itemsInStore[--qtyInStore] = null;
                System.out.println("Removed from store.");
                return;
            }
        }
        System.out.println("DVD not found in store.");
    }

    public void printStore() {
        System.out.println("***STORE***");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }
    }
}