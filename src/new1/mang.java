package new1;

import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		
		nhapMang();
	}

	public static void nhapMang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap mang");
        int n = scanner.nextInt();  // Nhập kích thước mảng
        int[] arr = new int[n];
       int  sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Nhập từng phần tử mảng
            sum += arr[i]; 
        }
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
	}
	
}
