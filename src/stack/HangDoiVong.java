package stack;

public class HangDoiVong {
	  private int[] hangDoi;
	    private int dau, cuoi, kichThuoc, sucChua;

	    // Constructor khởi tạo hàng đợi với kích thước cho trước
	    public HangDoiVong(int sucChua) {
	        this.sucChua = sucChua;
	        hangDoi = new int[sucChua];
	        dau = 0;
	        cuoi = -1;
	        kichThuoc = 0;
	    }

	    // Kiểm tra xem hàng đợi có rỗng không
	    public boolean laRong() {
	        return kichThuoc == 0;
	    }

	    // Kiểm tra xem hàng đợi có đầy không
	    public boolean laDay() {
	        return kichThuoc == sucChua;
	    }

	    // Thêm phần tử vào hàng đợi
	    public void them(int phanTu) {
	        if (laDay()) {
	            System.out.println("Hàng đợi đã đầy!");
	            return;
	        }
	        // Tăng chỉ số cuoi theo kiểu xoay vòng
	        cuoi = (cuoi + 1) % sucChua;
	        hangDoi[cuoi] = phanTu;
	        kichThuoc++;
	        System.out.println("Đã thêm phần tử: " + phanTu);
	    }

	    // Lấy và loại bỏ phần tử ở đầu hàng đợi
	    public int layRa() {
	        if (laRong()) {
	            System.out.println("Hàng đợi rỗng!");
	            return -1;
	        }
	        int phanTu = hangDoi[dau];
	        // Tăng chỉ số dau theo kiểu xoay vòng
	        dau = (dau + 1) % sucChua;
	        kichThuoc--;
	        return phanTu;
	    }

	    // Xem phần tử ở đầu hàng đợi
	    public int xemDau() {
	        if (laRong()) {
	            System.out.println("Hàng đợi rỗng!");
	            return -1;
	        }
	        return hangDoi[dau];
	    }

	    // Hiển thị hàng đợi
	    public void hienThiHangDoi() {
	        if (laRong()) {
	            System.out.println("Hàng đợi rỗng!");
	            return;
	        }
	        System.out.print("Hàng đợi: ");
	        for (int i = 0; i < kichThuoc; i++) {
	            System.out.print(hangDoi[(dau + i) % sucChua] + " ");
	        }
	        System.out.println();
	    }

}
