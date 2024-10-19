public class Main {
    public static void main(String[] args) {
        int m = 10;
        int n = 0;
        try {
            int result = m / n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Mot ngoai le nao do da xay ra");
            System.out.println(e.getMessage());
        }
    }
}