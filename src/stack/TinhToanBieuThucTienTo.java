package stack;

import java.util.Stack;

public class TinhToanBieuThucTienTo {
    // Phương thức để kiểm tra xem một ký tự có phải là toán tử không
    public static boolean laToanTu(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    // Phương thức tính toán hai toán hạng dựa trên toán tử
    public static int tinhToan(int a, int b, char toanTu) {
        switch (toanTu) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    // Phương thức để tính toán biểu thức tiền tố
    public static int tinhTienTo(String bieuThuc) {
        Stack<Integer> stack = new Stack<>();
        // Duyệt từ phải sang trái vì là biểu thức tiền tố
        for (int i = bieuThuc.length() - 1; i >= 0; i--) {
            char c = bieuThuc.charAt(i);

            // Bỏ qua khoảng trắng
            if (c == ' ') {
                continue;
            }

            // Nếu là số, đưa vào stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert từ ký tự sang số nguyên
            }
            // Nếu là toán tử, lấy hai toán hạng và tính toán
            else if (laToanTu(c)) {
                int a = stack.pop();
                int b = stack.pop();
                int ketQua = tinhToan(a, b, c);
                stack.push(ketQua);
            }
        }
        // Kết quả cuối cùng là phần tử duy nhất còn lại trong stack
        return stack.pop();
    }
    
}
