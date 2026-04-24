package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        correctSwap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
    }

    // Java là "Pass by Value". Truyền object vào hàm thực chất là truyền bản sao của tham chiếu.
    // Để tráo đổi, ta không tráo đổi tham chiếu mà tráo đổi giá trị nội bộ (thuộc tính) của object.
    public static void correctSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmpTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmpTitle);
        // Lưu ý: Để swap hoàn toàn một DVD, bạn cần hoán đổi thêm cả category, cost, length...
    }
}