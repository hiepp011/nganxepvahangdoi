package bai2;

public class Cacbaitoandequy {
	public static int giaithua(int n) {
		if (n == 0)
			return 1;
		else
			return n * giaithua(n - 1);

	}

	public static int luythua(int a, int n) {
		if (n == 0) { // Đây là suy biến
			return 1;
		} else {
			return a * luythua(a, n - 1);
		}
	}
	public static int tonglt(int n) {
		if(n==1) return 1;
		else return tonglt(n-1) + luythua(n, n);
	}
}