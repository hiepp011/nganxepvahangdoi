package stack;
import java.util.Stack;

public class MainBieuThucHauTo {
    public static void main(String[] args) {
        // Biểu thức hậu tố từ ví dụ: 5 3 + 8 2 - *
    	TinhToanBieuThucHauTo obj = new TinhToanBieuThucHauTo();
        String bieuThucHauTo = "5 3 + 8 2 - *";
        int ketQua = obj.tinhHauTo(bieuThucHauTo);
        System.out.println("Kết quả của biểu thức hậu tố là: " + ketQua); // Kết quả là 48
        
    }
}
