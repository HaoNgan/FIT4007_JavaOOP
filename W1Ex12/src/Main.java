public class Main {
    public static void main(String[] args) {
        int Sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                Sum += i;
            }
        }
        System.out.println(Sum);
    }
}