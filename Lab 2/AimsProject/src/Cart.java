public class Cart {
    // Thuộc tính hằng số chỉ định số lượng đĩa tối đa
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    // Mảng để lưu trữ các đĩa DVD
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    // Biến để theo dõi số lượng đĩa hiện có trong giỏ
    private int qtyOrdered = 0;

    // Hàm thêm đĩa vào giỏ
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full"); 
        }
    }

    // Hàm xóa đĩa khỏi giỏ
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart");
        }
    }

    // Hàm tính tổng tiền
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}