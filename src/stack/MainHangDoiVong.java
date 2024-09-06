package stack;

public class MainHangDoiVong {
	public static void main(String[] args) {
		HangDoiVong q = new HangDoiVong(5);
        q.them(10);
        q.them(20);
        q.them(30);
        q.them(40);
        q.them(50);
        q.hienThiHangDoi();

        System.out.println("Phần tử đầu tiên: " + q.xemDau());
        System.out.println("Lấy ra: " + q.layRa());
        q.hienThiHangDoi();

        q.them(60);
        q.hienThiHangDoi();
    }
	}

