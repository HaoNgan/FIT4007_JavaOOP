import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/data/vtb.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}