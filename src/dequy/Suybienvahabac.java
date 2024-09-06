package dequy;

import java.util.Scanner;

public class Suybienvahabac {
	public static void main(String[] args) {
		int n = 10;
        int nhiphan = np(n);
        System.out.println("Số " + n + " trong hệ nhị phân là: " + nhiphan);
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap so n");
//		n = sc.nextInt();
//		System.out.println(fibonacci(n));
//		int a, b;
//		System.out.println("Nhap a b");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(" uoc chung lon nhat la: "+ucln(a, b));
	}
	public static int fibonacci(int n) {
		
		if(n <= 0) {
			return 0;
		}else if(n == 1){
			return 1;
			
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static int ucln(int a, int b) {
		if(a == b) return a;
		else if(a > b) return ucln(a -b, b);
		else return ucln(a, b-a);
	}
	public static int tongS(int s) {
		if(s == 1) return 1;
		else return (s+tongS(s - 1));
	}
	public static int np(int n) {
		if(n == 0) {
			return 0;
			
		}
		return n %2 + 10 * np(n/2);
	}
}
