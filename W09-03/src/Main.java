import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int so1 = scanner.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int so2 = scanner.nextInt();

            System.out.print("Nhập toán tử (+, -, *, /): ");
            char toanTu = scanner.next().charAt(0);

            int ketQua;
            switch (toanTu) {
                case '+':
                    ketQua = so1 + so2;
                    break;
                case '-':
                    ketQua = so1 - so2;
                    break;
                case '*':
                    ketQua = so1 * so2;
                    break;
                case '/':
                    if (so2 == 0) {
                        throw new ArithmeticException("Lỗi: Không thể chia cho 0");
                    }
                    ketQua = so1 / so2;
                    break;
                default:
                    throw new IllegalArgumentException("Lỗi: Toán tử không hợp lệ");
            }

            System.out.println("Kết quả: " + ketQua);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}