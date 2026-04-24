import javax.swing.JOptionPane;;
public class ThinhNguyen {
    public static void main(String[]args){
            int VinhNam = Integer.parseInt(JOptionPane.showInputDialog("Nhập cạnh Vĩnh Nam:"));
            int ThaoNguyen = Integer.parseInt(JOptionPane.showInputDialog("Nhập cạnh Thảo Nguyên:"));
            int PhuongAnh = Integer.parseInt(JOptionPane.showInputDialog("Nhập cạnh Phương Anh:"));
            if(VinhNam+ThaoNguyen>PhuongAnh && VinhNam+PhuongAnh>ThaoNguyen && PhuongAnh+ThaoNguyen>VinhNam){
                double s=(VinhNam+ThaoNguyen+PhuongAnh)/2.0;
                double NgocMinh= Math.sqrt(s*(s-VinhNam)*(s-PhuongAnh)*(s-PhuongAnh));
            JOptionPane.showMessageDialog(null, "Diện tích tam giác Ngọc Minh là: " + String.format("%.2f", NgocMinh));
        }
    }
}
