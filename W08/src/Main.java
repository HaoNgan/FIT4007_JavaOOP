import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void mai(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student id:");
            String id = scanner.nextLine();
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student gpa:");
            String gpa = scanner.nextDouble();
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            Student std = new Student(id, name, gpa);
            students.add(std);
        }
        for (Student std : students) {
            std.display();
        }
    }
}