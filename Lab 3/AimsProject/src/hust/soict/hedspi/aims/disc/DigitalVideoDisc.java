package hust.soict.hedspi.aims.disc;


public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    // Biến static (cấp lớp) dùng chung để đếm tổng số đĩa đã tạo
    private static int nbDigitalVideoDiscs = 0;
    // Biến instance (cấp thực thể) lưu ID riêng của từng đĩa
    private int id;

    // Sử dụng Constructor chaining (gọi constructor này từ constructor khác) để tránh lặp code
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; // Tự động gán ID tăng dần
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    // --- Getters & Setters ---
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + (category != null ? category : "N/A") + " - " 
                + (director != null ? director : "N/A") + " - " + length + ": " + cost + " $";
    }

    // Kiểm tra chuỗi con, không phân biệt hoa thường
    public boolean isMatch(String title) {
        if (this.title == null || title == null) return false;
        return this.title.toLowerCase().contains(title.toLowerCase());
    }
}