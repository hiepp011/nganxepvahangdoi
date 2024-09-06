package dequy;

public class NhiPhanvaThapHN {
	public static void main(String[] args) {
		int n = 20;
		System.out.println("Số " + n + " trong hệ nhị phân là: " + np(n));
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static int np(int n) {
		if (n == 0) {
			return 0;

		}
		return n % 2 + 10 * np(n / 2);
	}

	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}
}
