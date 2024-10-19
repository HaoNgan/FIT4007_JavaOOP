public class Main {
    public static void main(String[] args) {
        class TuoiKhongHopLeException extends Exception {
            public TuoiKhongHopLeException(String message) {
                super(message);
            }
        }

        public class Main {

            public static void kiemTraTuoi(int tuoi) throws TuoiKhongHopLeException {
                if (tuoi < 18) {
                    throw new TuoiKhongHopLeException("Tuổi phải lớn hơn hoặc bằng 18");
                }
            }

            public static void main(String[] args) {
                try {
                    // Lấy đầu vào từ người dùng
                    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    System.out.print("Vui lòng nhập tuổi của bạn: ");
                    int tuoi = scanner.nextInt();

                    // Kiểm tra tuổi
                    kiemTraTuoi(tuoi);
                    System.out.println("Tuổi hợp lệ!");
                } catch (TuoiKhongHopLeException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
            }
        }
        System.out.println("Hello world!");
    }
}