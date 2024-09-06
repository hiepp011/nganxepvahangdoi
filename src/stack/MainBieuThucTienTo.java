package stack;

public class MainBieuThucTienTo {
	  public static void main(String[] args) {
		  TinhToanBieuThucTienTo obj = new TinhToanBieuThucTienTo();
	        // Biểu thức tiền tố từ ví dụ: * + 5 3 - 8 2
	        String bieuThucTienTo = "* + 5 3 - 8 2";
	        int ketQua = obj.tinhTienTo(bieuThucTienTo);
	        System.out.println("Kết quả của biểu thức tiền tố là: " + ketQua); // Kết quả là 48
	    }
}
