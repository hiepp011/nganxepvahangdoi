package baitap;

public class bt1 {
	public static void main(String[] args) {
		
		System.out.println(giaithua(5));
		System.out.println(luythua(2, 3));
		System.out.println(nhiphan(10));
		System.out.println(fibonacci(4));
		System.out.println(uscln(9, 4));
	}
    public static int giaithua(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int luythua(int x, int n) {
        int result = 1;
        while (n > 0) {
            if (n % 2 == 1) {  // Nếu n lẻ
                result *= x;
            }
            x *= x;  // Bình phương x
            n /= 2;  // Chia đôi n
        }
        return result;
    }
    public static String nhiphan(int n) {
        StringBuilder binary = new StringBuilder();
        
        while (n > 0) {
            int remainder = n % 2;  // Lấy phần dư khi chia n cho 2
            binary.insert(0, remainder);  // Chèn phần dư vào đầu chuỗi
            n /= 2;  // Chia n cho 2
        }

        return binary.toString();  // Trả về chuỗi nhị phân
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1; // F(1)
        int b = 1; // F(2)
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static int uscln(int a, int b) {
        // Sử dụng thuật toán Euclid
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    

	  
}
