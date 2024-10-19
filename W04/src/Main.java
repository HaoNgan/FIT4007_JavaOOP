import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle xe1 = null, xe2 = null, xe3 = null;

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn công việc: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập thông tin xe 1
                    System.out.println("Nhập thông tin xe 1:");
                    xe1 = createVehicle(scanner);

                    // Nhập thông tin xe 2
                    System.out.println("Nhập thông tin xe 2:");
                    xe2 = createVehicle(scanner);

                    // Nhập thông tin xe 3
                    System.out.println("Nhập thông tin xe 3:");
                    xe3 = createVehicle(scanner);
                    break;

                case 2:
                    // Xuất bảng kê khai tiền thuế trước bạ của các xe
                    if (xe1 == null && xe2 == null && xe3 == null) {
                        System.out.println("Vui lòng nhập thông tin xe trước.");
                    } else {
                        if (xe1 != null) xe1.printTaxDeclaration();
                        if (xe2 != null) xe2.printTaxDeclaration();
                        if (xe3 != null) xe3.printTaxDeclaration();
                    }
                    break;

                case 3:
                    // Thoát
                    System.out.println("Chương trình kết thúc.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    // Hàm nhập thông tin xe từ người dùng
    public static Vehicle createVehicle(Scanner scanner) {
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhập tên chủ xe: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập trị giá xe (VND): ");
        double value = scanner.nextDouble();
        System.out.print("Nhập dung tích xy lanh (cc): ");
        int engineCapacity = scanner.nextInt();
        return new Vehicle(owner, value, engineCapacity);
    }
}
