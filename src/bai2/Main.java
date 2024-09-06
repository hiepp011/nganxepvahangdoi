package bai2;
import bai2.Cacbaitoandequy;
public class Main {
    public static void main(String[] args) {
        int number = 5;
        int result = Cacbaitoandequy.giaithua(number);
        System.out.println("Giai thừa của " + number + " là: " + result);
        int coSo = 2;
        int soMu = 5;
        int ketQua = Cacbaitoandequy.luythua(coSo, soMu);
        System.out.println(coSo + " lũy thừa " + soMu + " là: " + ketQua);
    }
    }

