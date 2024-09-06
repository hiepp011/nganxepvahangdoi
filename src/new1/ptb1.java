package new1;

import java.util.Scanner;

public class ptb1 {
	public static void main(String[] args) {
		c1();
		c2();
	}
	public static void c1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao a: ");
		int a, b, x;
		a = sc.nextInt();
		System.out.println("nhap vao b: ");
		b = sc.nextInt();
		x = (-b)/a;
		System.out.println("pt"+ a +"x + "+ b+"= 0" );
		System.out.println("co nghiem la: "+ x);
	}
	public static void c2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so Nguyen n : ");
		int n, s = 0, h = 0;
		n = sc.nextInt();
		System.out.println("hien thi cac so chia het cho 3 va 5 : ");
		for(int i = 1; i<=n; i++) {
			if(i %2 == 0) {
				s +=i;
			}if(i %2 != 0) {
			h= h+1;
			}if (i % 3 == 0 && i%5==0) {
				System.out.println(i);
			}
		}
	
		
		System.out.println("tong cac so chan: "+ s);
		System.out.println("so luong so le: "+ h);
		
		
		
	}
}
