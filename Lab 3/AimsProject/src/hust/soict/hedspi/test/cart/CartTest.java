package hust.soict.hedspi.test.cart;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        
        // Tạo dữ liệu mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Test các hàm thêm (add overload)
        cart.addDigitalVideoDisc(dvd1, dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Test in danh sách
        cart.print();

        // Test tính năng tìm kiếm
        System.out.println("\n--- Search Results ---");
        cart.searchById(1);
        cart.searchByTitle("Star");
    }
}