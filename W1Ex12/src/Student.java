import java.util.Scanner;

public class Student {
    private int id;
    private String fullName;
    private float theoryScore, practicalScore;

    public Student() {
        this.id = 0;
        this.fullName = "";
        this.theoryScore = 0.0f;
        this.practicalScore = 0.0f;
    }

    public Student(int studentId, String fullName, float theoryScore, float practicalScore) {
        this.id = studentId;
        this.fullName = fullName;
        this.theoryScore = theoryScore;
        this.practicalScore = practicalScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float  getPracticalScore() {
        return practicalScore;
    }

    public void setPracticalScore(float practicalScore) {
        this.practicalScore = practicalScore;
    }

    public float calculateAverageScore() {
        return (theoryScore + practicalScore) / 2.0f;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %5.2f %5.2f %5.2f", getId(), getFullName(), getTheoryScore(), getPracticalScore(), calculateAverageScore());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student sv1 = new Student(123, "Nguyễn Văn A", 8.0f, 9.0f);
        Student sv2 = new Student(456, "Trần Thị B", 7.5f, 8.5f);

        Student sv3 = new Student();
        System.out.print("Enter student ID: ");
        sv3.setId(scanner.nextInt());
        System.out.print("Enter full name: ");
        scanner.nextLine();
        sv3.setFullName(scanner.nextLine());
        System.out.print("Enter theory score: ");
        sv3.setTheoryScore(scanner.nextFloat());
        System.out.print("Enter practical score: ");
        sv3.setPracticalScore(scanner.nextFloat());

        System.out.printf("%-10s %-30s %5s %5s %5s\n", "Student ID", "Full Name", "Theory Score", "Practical Score", "Average Score");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
    }
}