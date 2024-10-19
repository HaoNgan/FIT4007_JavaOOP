import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList<Student>();
        Scanner scanner=new Scanner((System.in));
        for(int i =0;i<3;i++){
            System.out.println("id");
            String id= scanner.nextLine();
            System.out.println("gpa");
            double gpa=scanner.nextDouble();
            scanner.nextLine();
            Student std= new Student(id,gpa);
            students.add(std);
        }
        System.out.println("danh sách sinh viên ");
        for(Student std:students)
        {
            std.display();
        }
//      //  double[]=new double[45];
//        Scanner scanner=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            System.out.println("nhap danh sach diem"+(i+1)+":");
//        dsDiem.add(scanner.nextDouble());
//        }
//        System.out.println("danh sach sinh vien");
//        for(int i=0;i<5;i++){
//            System.out.println("dadiem sv "+(i+1)+":"+dsDiem.get(i));
//        }
//
//         // Nhập danh sách điểm
//
//        // Hiển thị danh sách
    }
}